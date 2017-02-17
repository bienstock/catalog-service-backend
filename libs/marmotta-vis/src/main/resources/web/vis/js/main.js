var rest_endpoint = "https://iotsrv1.salzburgresearch.at/rest";

var currentFlow = null;
var unsavedChanges = false;
var types = {};
var BORDERCOLOR = "#555";
var font = {
    color: BORDERCOLOR,
    strokeColor: "white",
    strokeWidth: 5
};
var user,passwd = "";

$(window).resize(function() {
    setSize();
});

window.onbeforeunload = function()	{
	if (unsavedChanges)
		return "There are unsaved changes in the current workflow.\nDo you want to leave without saving?";
};

function focus() {
	$("#username").val("");
	setTimeout(function(){
		$("#username").focus();
	},50);
}

function login() {
	user = $("#username").val();
	passwd = $("#password").val();
	$.ajax({
		method: "GET",
		url: rest_endpoint+"?collection=workflow_tool&tag=workflow",
		dataType: "json",
		headers: {
			"Authorization": "Basic " + btoa(user+":"+passwd)
		},
		success: function(res) {
			var html = "";
			html += "<option></option>";
			for (var i=0; i<res.length; i++) {
				if (currentFlow && currentFlow.flow_id == res[i].flow_id)
					html += "<option selected value='"+res[i].flow_id+"'>"+res[i].title+"</option>";
				else
					html += "<option value='"+res[i].flow_id+"'>"+res[i].title+"</option>";
			}
			$("#flow-select").html(html);
			$("#wrapper-login").hide();
			$("#wrapper-tool").show();
			init();
		},
		error: function(res) {
			var html = "";
			html += "<div class='col-md-12'>";
			html += "<div class='alert alert-danger alert-dismissible' role='alert'>";
			html += "<button type='button' class='close' data-dismiss='alert' aria-label='Close'>";
			html += "<span aria-hidden='true'>&times;</span>";
			html += "</button>";
			html += "<div>"
			html += "Login Error - Please try again";
			html += "</div></div></div>";
			$("#error-outer").html(html);
		}
	});
}

function init() {
	setSize();
	loadTypes();
	initNetwork();
	$("#flow-select").on("change",function() {
		if (unsavedChanges) {
			last_sel = $("#flow-select").val();
			createNew = false;
			loadFlows();
			$("#changeFlow").modal();
		}
		else
			loadFlow($("#flow-select").val());
	});
}

function loadTypes() {
	$.ajax({
		method: "GET",
		url: "data/type_definition.json",
		cache: false,
		dataType: "json",
		success: function(res) {
			types = res;
			fillNodeModals();
			fillEdgeModals();
		}
	});
}

function fillNodeModals() {
	var html = "";
	html += "<div class='input-group space'>";
	html += "<label class='input-group-addon'>Node Type *</label>";
	html += "<select class='form-control' id='nodeType' onchange='nodeTypeToggle(this.value)'>"
	html += "<option value=''></option>";
	for (var i=0; i<types.nodeTypes.length; i++) {
		html += "<option value='"+types.nodeTypes[i].type+"'>"+types.nodeTypes[i].label+"</option>";
	}
	html += "</select>";
	html += "</div>";
	html += "<div id='addNodeBodyProperties'></div>";
	$("#addNodeBody").html(html);
}

function nodeTypeToggle(type) {
	var html = "";
	for (var i=0; i<types.nodeTypes.length; i++) {
		if (types.nodeTypes[i].type == type) {
			for (var j=0; j<types.nodeTypes[i].properties.length; j++) {
				html += "<div class='input-group space'>";
				var add = "";
				if (types.nodeTypes[i].properties[j].required)
						add = " *";
				html += "<label class='input-group-addon'>"+types.nodeTypes[i].properties[j].label+""+add+"";
				if (types.nodeTypes[i].properties[j].tooltip)
					html += " <i class='glyphicon glyphicon-question-sign clickable' onclick='showTooltipNode(\""+type+"_"+types.nodeTypes[i].properties[j].label.replace(/ /g,"")+"\")'></i>";
				html += "</label>";
				if (types.nodeTypes[i].properties[j].type == "STRING") {
					var placeholder = "";
					if (types.nodeTypes[i].properties[j].placeholder)
						placeholder = types.nodeTypes[i].properties[j].placeholder;
					html += "<textarea class='form-control' id='"+type+"_"+types.nodeTypes[i].properties[j].label.replace(/ /g,"")+"' placeholder='"+placeholder+"'></textarea>";
				}
				else if (types.nodeTypes[i].properties[j].type == "SELECT") {
					html += "<select class='form-control' id='"+type+"_"+types.nodeTypes[i].properties[j].label.replace(/ /g,"")+"'>"
					html += "<option value=''></option>";
					for (var k=0; k<types.nodeTypes[i].properties[j].options.length; k++)
						html += "<option value='"+types.nodeTypes[i].properties[j].options[k]+"'>"+types.nodeTypes[i].properties[j].options[k]+"</option>";
					html += "</select>";
				}
				html += "</div>";
			}
		}
	}
	$("#addNodeBodyProperties").html(html);
}

function fillEdgeModals() {
	var html = "";
	html += "<div class='input-group space'>";
	html += "<label class='input-group-addon'>Edge Type *</label>";
	html += "<select class='form-control' id='edgeType' onchange='edgeTypeToggle(this.value)'>"
	html += "<option value=''></option>";
	for (var i=0; i<types.edgeTypes.length; i++) {
		html += "<option value='"+types.edgeTypes[i].type+"'>"+types.edgeTypes[i].label+"</option>";
	}
	html += "</select>";
	html += "</div>";
	html += "<div id='addEdgeBodyProperties'></div>";
	$("#addEdgeBody").html(html);
}

function edgeTypeToggle(type) {
	var html = "";
	for (var i=0; i<types.edgeTypes.length; i++) {
		if (types.edgeTypes[i].type == type) {
			for (var j=0; j<types.edgeTypes[i].properties.length; j++) {
				html += "<div class='input-group space'>";
				var add = "";
				if (types.edgeTypes[i].properties[j].required)
						add = " *";
				html += "<label class='input-group-addon'>"+types.edgeTypes[i].properties[j].label+""+add+"";
				if (types.edgeTypes[i].properties[j].tooltip)
					html += " <i class='glyphicon glyphicon-question-sign clickable' onclick='showTooltipEdge(\""+type+"_"+types.edgeTypes[i].properties[j].label.replace(/ /g,"")+"\")'></i>";
				html += "</label>";
				if (types.edgeTypes[i].properties[j].type == "STRING") {
					var placeholder = "";
					if (types.edgeTypes[i].properties[j].placeholder)
						placeholder = types.edgeTypes[i].properties[j].placeholder;
					html += "<textarea class='form-control' id='"+type+"_"+types.edgeTypes[i].properties[j].label.replace(/ /g,"")+"' placeholder='"+placeholder+"'></textarea>";
				}
				else if (types.edgeTypes[i].properties[j].type == "SELECT") {
					html += "<select class='form-control' id='"+type+"_"+types.edgeTypes[i].properties[j].label.replace(/ /g,"")+"'>"
					html += "<option value=''></option>";
					for (var k=0; k<types.edgeTypes[i].properties[j].options.length; k++)
						html += "<option value='"+types.edgeTypes[i].properties[j].options[k]+"'>"+types.edgeTypes[i].properties[j].options[k]+"</option>";
					html += "</select>";
				}
				html += "</div>";
			}
		}
	}
	$("#addEdgeBodyProperties").html(html);
}

function showTooltipNode(id) {
	var type = id.split("_")[0];
	var property = id.split("_")[1];
	for (var i=0; i<types.nodeTypes.length; i++) {
		if (types.nodeTypes[i].type == type) {
			for (var j=0; j<types.nodeTypes[i].properties.length; j++) {
				if (types.nodeTypes[i].properties[j].label.replace(/ /g,"") == property) {
					$("#toolTipBody").html(types.nodeTypes[i].properties[j].tooltip);
					$("#toolTip").modal();
				}
			}
		}
	}
}

function showTooltipEdge(id) {
	var type = id.split("_")[0];
	var property = id.split("_")[1];
	for (var i=0; i<types.edgeTypes.length; i++) {
		if (types.edgeTypes[i].type == type) {
			for (var j=0; j<types.edgeTypes[i].properties.length; j++) {
				if (types.edgeTypes[i].properties[j].label.replace(/ /g,"") == property) {
					$("#toolTipBody").html(types.edgeTypes[i].properties[j].tooltip);
					$("#toolTip").modal();
				}
			}
		}
	}
}

function setSize() {
	$("#network-container").height(window.innerHeight - $("#flow-select-outer").height() - 32);
}

function getUUID() {
	function s4() {
		return Math.floor((1 + Math.random()) * 0x10000).toString(16).substring(1);
	}
	return s4() + s4() + '-' + s4() + '-' + s4() + '-' + s4() + '-' + s4() + s4() + s4();
}

function changeFlowConfirm() {
	if (!createNew)
		loadFlow(last_sel,true);
	else
		clearFlow();
	$("#changeFlow").modal("hide");
}

var last_sel;
function loadFlows() {
	$("#flow-select").on("change",function() {
		if (unsavedChanges) {
			last_sel = $("#flow-select").val();
			createNew = false;
			loadFlows();
			$("#changeFlow").modal();
		}
		else
			loadFlow($("#flow-select").val());
	});
	$.ajax({
		method: "GET",
		url: rest_endpoint+"?collection=workflow_tool&tag=workflow",
		dataType: "json",
		headers: {
			"Authorization": "Basic " + btoa(user+":"+passwd)
		},
		success: function(res) {
			var html = "";
			html += "<option></option>";
			for (var i=0; i<res.length; i++) {
				if (currentFlow && currentFlow.flow_id == res[i].flow_id)
					html += "<option selected value='"+res[i].flow_id+"'>"+res[i].title+"</option>";
				else
					html += "<option value='"+res[i].flow_id+"'>"+res[i].title+"</option>";
			}
			$("#flow-select").html(html);
		}
	});
}

function loadFlow(id,cont) {
	$.ajax({
		method: "GET",
		url: rest_endpoint+"?collection=workflow_tool&tag=workflow",
		dataType: "json",
		headers: {
			"Authorization": "Basic " + btoa(user+":"+passwd)
		},
		success: function(res) {
			var found = false;
			for (var i=0; i<res.length; i++) {
				if (res[i].flow_id == id) {
					found = true;
					initNetwork(res[i].nodes,res[i].edges);
					currentFlow = res[i];
					if (cont)
						loadFlows();
				}
			}
			if (!found)
				clearFlow();
		}
	});
}

function clearFlow() {
	currentFlow = null;
	last_sel = null;
	loadFlows();
	initNetwork();
}

var createNew = false;
function reload() {
	if (unsavedChanges) {
		last_sel = $("#flow-select").val();
		createNew = true;
		loadFlows();
		$("#changeFlow").modal();
	}
	else {
		$.ajax({
			method: "GET",
			url: rest_endpoint + "graph"
		});
	}
}
function newFlow() {
	if (unsavedChanges) {
		last_sel = $("#flow-select").val();
		createNew = true;
		loadFlows();
		$("#changeFlow").modal();
	}
	else
		clearFlow();
}

function deleteFlow() {
	if (currentFlow) {
		$("#deleteFlow").modal();
	}
}

function deleteFlowConfirm() {
	$.ajax({
		method: "DELETE",
		url: rest_endpoint,
		dataType: "json",
		contentType: "application/json",
		data: JSON.stringify(currentFlow),
		headers: {
			"Authorization": "Basic " + btoa(user+":"+passwd)
		},
		success: function(res) {
			$("#deleteFlow").modal("hide");
			loadFlows();
			clearFlow();
		}
	});
}

function saveFlow() {
	if (currentFlow) {
		$("#updateFlowButton").show();
		$("#saveFlowTitle").val(currentFlow.title);
		$("#saveFlowComment").val(currentFlow.comment);
	}
	else {
		$("#updateFlowButton").hide();
		$("#saveFlowTitle").val("");
		$("#saveFlowComment").val("");
	}
	$("#saveFlow").modal();
}

function saveFlowConfirm(update) {
	var flow_id = getUUID();
	var id = getUUID();
	if (update) {
		flow_id = currentFlow.flow_id;
		id = currentFlow._id;
	}
	network.storePositions();
	$.ajax({
		method: "POST",
		url: rest_endpoint,
		dataType: "json",
		contentType: "application/json",
		data: JSON.stringify({
			"collection":"workflow_tool",
			"tag":"workflow",
			"flow_id":flow_id,
			"_id":id,
			"title":$("#saveFlowTitle").val(),
			"comment":$("#saveFlowComment").val(),
			"nodes":nodes.get(),
			"edges":edges.get()
		}),
		headers: {
			"Authorization": "Basic " + btoa(user+":"+passwd)
		},
		success: function(res) {
			$("#saveFlow").modal("hide");
			loadFlow(flow_id,true);
		}
	});
}

function setChanges() {
	unsavedChanges = true;
	$("#unsaved-indicator").show();
}

function setNew() {
	unsavedChanges = false;
	$("#unsaved-indicator").hide();
}

var network, nodes, edges;
function initNetwork(n,e) {
	setNew();
	if (n)
		nodes = new vis.DataSet(n);
	else {
		nodes = new vis.DataSet([]);
	}
	if (e)
		edges = new vis.DataSet(e);
	else {
		edges = new vis.DataSet([]);
	}
	nodes.on("*",setChanges);
    edges.on("*",setChanges);
    var container = document.getElementById('network-container');
    var data = {
        nodes: nodes,
        edges: edges
    };
    var options = {
		manipulation: {
			enabled: true,
			initiallyActive: true,
			addNode: function(data,callback) {
				$("#nodeType").val("");
				nodeTypeToggle("");
				$("#nodeOperation").html("Add Node");
				document.getElementById('saveNodeButton').onclick = saveNode.bind(this, data, callback);
                document.getElementById('cancelNodeButton').onclick = cancelNode.bind(this, callback);
				$('#addNode').modal('show');
			},
			editNode: function(data,callback) {
				$("#nodeType").val(data.type);
				nodeTypeToggle(data.type);
				for (var i=0; i<types.nodeTypes.length; i++) {
					if (types.nodeTypes[i].type == data.type) {
						for (var j=0; j<types.nodeTypes[i].properties.length; j++) {
							if ($.isArray(data.properties[types.nodeTypes[i].properties[j].label]))
								$("#"+data.type+"_"+types.nodeTypes[i].properties[j].label.replace(/ /g,"")).val(data.properties[types.nodeTypes[i].properties[j].label].join("\n"));
							else
								$("#"+data.type+"_"+types.nodeTypes[i].properties[j].label.replace(/ /g,"")).val(data.properties[types.nodeTypes[i].properties[j].label]);
						}
					}
				}
				$("#nodeOperation").html("Edit Node");
				document.getElementById('saveNodeButton').onclick = saveNode.bind(this, data, callback);
                document.getElementById('cancelNodeButton').onclick = cancelNode.bind(this, callback);
				$('#addNode').modal('show');
			},
			addEdge: function(data,callback) {
				$("#edgeType").val("");
				edgeTypeToggle("");
				$("#edgeOperation").html("Add Edge");
				document.getElementById('saveEdgeButton').onclick = saveEdge.bind(this, data, callback);
                document.getElementById('cancelEdgeButton').onclick = cancelEdge.bind(this, callback);
				$('#addEdge').modal('show');
			},
			editEdge: function(data,callback) {
				var from = data.from;
				var to = data.to;
				data = edges.get(data.id);
				data.from = from;
				data.to = to;
				$("#edgeType").val(data.type);
				edgeTypeToggle(data.type);
				for (var i=0; i<types.edgeTypes.length; i++) {
					if (types.edgeTypes[i].type == data.type) {
						for (var j=0; j<types.edgeTypes[i].properties.length; j++) {
							$("#"+data.type+"_"+types.edgeTypes[i].properties[j].label.replace(/ /g,"")).val(data.properties[types.edgeTypes[i].properties[j].label]);
						}
					}
				}
				$("#edgeOperation").html("Edit Edge");
				document.getElementById('saveEdgeButton').onclick = saveEdge.bind(this, data, callback);
                document.getElementById('cancelEdgeButton').onclick = cancelEdge.bind(this, callback);
				$('#addEdge').modal('show');
			}
		},
		physics: {
			enabled: false
		},
		edges: {
			arrows: "to",
			smooth: {
				enabled: true,
				type: "continuous"
			}
		}
	};
    network = new vis.Network(container, data, options);
	network.fit();
}

function saveNode(data,callback) {
	data.type = $("#nodeType").val();
	if (data.type != "") {
		var filled = true;
		for (var i=0; i<types.nodeTypes.length; i++) {
			if (types.nodeTypes[i].type == data.type) {
				data.properties = {};
				var label = "";
				for (var j=0; j<types.nodeTypes[i].properties.length; j++) {
					if ($("#"+data.type+"_"+types.nodeTypes[i].properties[j].label.replace(/ /g,"")).val().indexOf("\n") != -1)
						data.properties[types.nodeTypes[i].properties[j].label] = $("#"+data.type+"_"+types.nodeTypes[i].properties[j].label.replace(/ /g,"")).val().split("\n");
					else
						data.properties[types.nodeTypes[i].properties[j].label] = $("#"+data.type+"_"+types.nodeTypes[i].properties[j].label.replace(/ /g,"")).val();
					if (types.nodeTypes[i].properties[j].required && $("#"+data.type+"_"+types.nodeTypes[i].properties[j].label.replace(/ /g,"")).val() == "")
						filled = false;
					if (types.nodeTypes[i].display == types.nodeTypes[i].properties[j].label)
						label = $("#"+data.type+"_"+types.nodeTypes[i].properties[j].label.replace(/ /g,"")).val();
				}
				data.borderWidth = 3;
				data.borderWidthSelected = 5;
				data.color = {
					background: types.nodeTypes[i].color,
					border: types.nodeTypes[i].color,
					highlight: {
						background: types.nodeTypes[i].color,
						border: types.nodeTypes[i].color
					}
				};
				data.shape = "circularImage";
				data.image = types.nodeTypes[i].image;
				data.shadow = false;
				data.font = font;
				data.label = label;
			}
		}
		if (filled) {
			document.getElementById('saveNodeButton').onclick = null;
			document.getElementById('cancelNodeButton').onclick = null;
			$('#addNode').modal('hide');
			callback(data);
		}
		else {
			alert("Required fields missing");
		}
	}
	else {
		alert("No Node Type selected");
	}
}

function cancelNode(callback) {
	document.getElementById('saveNodeButton').onclick = null;
    document.getElementById('cancelNodeButton').onclick = null;
	$('#addNode').modal('hide');
	callback(null);
	network.disableEditMode();
	network.enableEditMode();
}

function saveEdge(data,callback) {
	data.type = $("#edgeType").val();
	if (data.type != "") {
		var filled = true;
		for (var i=0; i<types.edgeTypes.length; i++) {
			if (types.edgeTypes[i].type == data.type) {
				data.properties = {};
				var label = "";
				for (var j=0; j<types.edgeTypes[i].properties.length; j++) {
					data.properties[types.edgeTypes[i].properties[j].label] = $("#"+data.type+"_"+types.edgeTypes[i].properties[j].label.replace(/ /g,"")).val();
					if (types.edgeTypes[i].properties[j].required && $("#"+data.type+"_"+types.edgeTypes[i].properties[j].label.replace(/ /g,"")).val() == "")
						filled = false;
					if (types.edgeTypes[i].display == types.edgeTypes[i].properties[j].label)
						label = $("#"+data.type+"_"+types.edgeTypes[i].properties[j].label.replace(/ /g,"")).val();
				}
				data.color = types.edgeTypes[i].color;
				data.label = label;
			}
		}
		if (filled) {
			document.getElementById('saveEdgeButton').onclick = null;
			document.getElementById('cancelEdgeButton').onclick = null;
			$('#addEdge').modal('hide');
			callback(data);
		}
		else {
			alert("Required fields missing");
		}
	}
	else {
		alert("No Edge Type selected");
	}
}

function cancelEdge(callback) {
	document.getElementById('saveEdgeButton').onclick = null;
    document.getElementById('cancelEdgeButton').onclick = null;
	$('#addEdge').modal('hide');
	callback(null);
	network.disableEditMode();
	network.enableEditMode();
}