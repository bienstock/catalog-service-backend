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
function StanbolService(editor,host) {

    var graph;

    var stanbolExtension = new StanbolExtension();

    var _stanbolPusher = new StanbolPusher();

    var _template = Template();

    return stanbolExtension;

    function StanbolExtension() {
        var _stanbol_push = editor.menu.createMenuItem("Extensions","Push to Stanbol",function(){_stanbolPusher.open()});
        _stanbol_push.addClass("disabled");

        //bindings
        editor.event.bind(editor.EventCode.GRAPH.LOAD,function(event){
            _stanbol_push.removeClass("disabled");
            graph = event.data.uri;
        });
    }

    function StanbolPusher() {
        var popup;
        this.open = function(){
            popup = editor.popup.custom("Export to Stanbol");
            popup.setContent($(_template.pusher));

            $("#popup_cancel").click(function(){
                popup.close();
            });
            $("#popup_import").click(function(){
                push();
            });
            popup.open();
        }

        function push() {
            $("#popup_loader").show();
            $("#popup_import").attr("disabled", "disabled");
            $.ajax({
                type: 'POST',
                url: host+ "stanbol/publish?context="+encodeURIComponent(graph),
                success: function() {
                    $("#popup_loader").hide();
                    $("#popup_import").hide();
                    $("#popup_info").text("Push was successful!");
                },
                failure: function() {
                    $("#popup_loader").hide();
                    $("#popup_info").text("An error occurred while pushing to Stanbol!");
                },
                complete: function() {
                    $("#popup_import").removeAttr("disabled");
                }
            });
        }
    }

    function Template() {
        var x = {
            pusher:"<span style='margin-bottom:10px;margin-top:10px' id='popup_info'>Do you want to push the Thesaurus to Stanbol Instance?</span>"+
                    "<div id='popup_loader' style='display:none'><img src='skosjs/img/loader-small.gif'></div>" +
                    '<div>' +
                    '   <button id="popup_cancel">Close</button>' +
                    '   <button id="popup_import">Push</button>' +
                    '</div>'
        }
        return x;
    }

}