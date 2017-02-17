/*
 * Copyright (C) 2013 Salzburg Research.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Created by IntelliJ IDEA.
 * User: tkurz
 * Date: 20.03.12
 * Time: 11:12
 * To change this template use File | Settings | File Templates.
 */

function IOService(editor,host) {

    //formats
    var import_formats = [];
    import_formats.push(new RDFFormat("XML","application/rdf+xml",".rdf"));
    import_formats.push(new RDFFormat("N3","text/rdf+n3",".n3"));
    import_formats.push(new RDFFormat("Turtle","text/turtle",".ttl"));

    var export_formats = [];
    export_formats.push(new RDFFormat("XML","application/rdf+xml",".rdf"));
    export_formats.push(new RDFFormat("N3","text/rdf+n3",".n3"));
    export_formats.push(new RDFFormat("Turtle","text/turtle",".ttl"));

    var ioservice = new IOService();

    var _importer = new Importer();
    var _exporter = new Exporter();

    var template = TEMPLATE();

    var graph;
    var graphtitle;

    return ioservice;

    function IOService() {
        editor.menu.createSeperator("Project");
        var _import = editor.menu.createMenuItem("Project","Import",function(){_importer.open()});
        var _export = editor.menu.createMenuItem("Project","Export",function(){_exporter.open()});
        _import.addClass("disabled");
        _export.addClass("disabled");

        //bindings
        editor.event.bind(editor.EventCode.GRAPH.LOAD,function(event){
            _import.removeClass("disabled");
            _export.removeClass("disabled");
            graph = event.data.uri;
            graphtitle = event.data.title;
        });
    }

    function Importer() {
        var popup;
        this.open = function(){
            popup = editor.popup.custom("Import Thesaurus");
            popup.setContent($(template.importer));
            $("#popup_cancel").click(function(){
                popup.close();
            });
            $("#popup_import").click(function(){
                run();
            });
            $("#popup_file").change(function(){
                $("#popup_info").text("File selected");
                var filename = $("#popup_file").val();
                for(var i=0; i<import_formats.length;i++) {
                    if (filename.match(new RegExp(import_formats[i].extension+"$"))) $('#popup_type').val(import_formats[i].mime);
                }
            })
            for(var i=0; i<import_formats.length;i++) {
                $("#popup_type").append("<option value='"+import_formats[i].mime+"'>"+import_formats[i].name+"</option>");
            }
            popup.open();
        }
        function run() {
            var fd = document.getElementById('popup_file').files[0];
            if(!fd) {
                $("#popup_info").text("Select a file first!");
                return false;
            }
            var xhr = new XMLHttpRequest();
            xhr.upload.addEventListener("progress", uploadProgress, false);
            xhr.addEventListener("load", uploadComplete, false);
            xhr.addEventListener("error", uploadFailed, false);
            xhr.addEventListener("abort", uploadCanceled, false);
            xhr.open("POST", host+"skos/import"+"?context="+encodeURIComponent(graph));
            xhr.setRequestHeader('Content-Type', $("#popup_type").val());
            xhr.send(fd);
        }
        function uploadProgress(evt) {
            if (evt.lengthComputable) {
                var percentComplete = Math.round(evt.loaded * 100 / evt.total);
                if(percentComplete==100) $("#popup_info").text('Import data ...');
                else $("#popup_info").text('Upload: '+percentComplete.toString() + '%');
            } else {
                $("#popup_info").text('Import data ...');
            }
        }

        function uploadComplete(evt) {
            if(evt.target.status==200) {
                $("#popup_info").text("Import complete");
                setTimeout(function(){
                   editor.event.fire(editor.EventCode.GRAPH.SELECTED,{uri:graph});
                   popup.close();
                },1000);
            } else {
                popup.close();
                editor.popup.alert("Import failed","There was an error attempting to import the file.");
            }
        }

        function uploadFailed(evt) {
            popup.close();
            editor.popup.alert("Import failed","There was an error attempting to upload the file.");
        }

        function uploadCanceled(evt) {
            popup.close();
            editor.popup.alert("Import failed","The upload has been canceled by the user or the browser dropped the connection.");
        }
    }

    function Exporter() {
        var popup;
        this.open = function(){
            popup = editor.popup.custom("Export Thesaurus");
            popup.setContent($(template.exporter));
            $("#popup_cancel").click(function(){
                popup.close();
            });
            $("#popup_export").click(function(){
                run();
            });
            var name = (graphtitle&& graphtitle.indexOf("http://")!=0)?graphtitle:graph.substring(graph.lastIndexOf("/")+1);
            $("#popup_name").val(name);

            for(var i=0; i<export_formats.length;i++) {
                $("#popup_type").append("<option value='"+export_formats[i].mime+"'>"+export_formats[i].name+"</option>");
            }

            popup.open();
        }
        function run() {
            var type = $("#popup_type").val();
            var name = $("#popup_name").val();
            for(var i=0; i<export_formats.length;i++) {
                if(type==export_formats[i].mime) name+=export_formats[i].extension;
            }
            window.open(host+"skos/export/"+name+"?context="+encodeURIComponent(graph)+"&type="+encodeURIComponent(type));
            popup.close();
        }
    }

    function TEMPLATE() {
        var t = {
             importer : '<span style="font-size:12px;padding-right:5px">File:</span><input type="file" id="popup_file"/>' +
                        '<span style="font-size:12px;padding:0 5px 0 20px">Type:</span>' +
                        '<select id="popup_type">' +
                        '</select>' +
                        '<div id="popup_info" style="font-size: 12px; height: 20px; padding-top: 10px;">&nbsp;</div>' +
                        '<div>' +
                        '   <button id="popup_cancel">Cancel</button>' +
                        '   <button id="popup_import">Import</button>' +
                        '</div>',
             exporter : '<span style="font-size:12px;padding-right:5px">Name:</span><input style="width:300px" type="text" id="popup_name"/>' +
                        '<span style="font-size:12px;padding:0 5px 0 20px">Type:</span>' +
                        '<select id="popup_type">' +
                        '</select>' +
                        '<div id="popup_info" style="font-size: 12px; height: 20px; padding-top: 10px;">&nbsp;</div>' +
                        '<div>' +
                        '   <button id="popup_cancel">Cancel</button>' +
                        '   <button id="popup_export">Export</button>' +
                        '</div>'
        }
        return t;
    }

    function RDFFormat(name,mime,extension) {
        this.name = name;
        this.mime = mime;
        this.extension = extension;
    }

}