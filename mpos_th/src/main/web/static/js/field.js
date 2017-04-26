var attributeName = ""; //修改字段
var initialValue = ""; // 原始值
var updateValue = ""; // 修改值
var path = "";

$(document).ready(function() {
	$(".updField").focus(function() {
		initialValue = $(this).val();
	});
});

$(document).ready(function() {
	$(".updField").blur(function() {
		updateValue = $(this).val();
		if (initialValue != updateValue) {
			var jsonObj = {attributeName:attributeName, initialValue:initialValue, updateValue:updateValue};
			get(jsonObj);
		} else {
			return;
		}
	});
});

function setField(field,event,pathname){
	path = pathname;
	attributeName = field;
	$(this).initialValue(event);
}

$.fn.initialValue =(function(event) {
	var obj = getUpdateValue(attributeName);
	var initialValue = obj.intentModifies.initialValue;
	var updateBy = obj.intentModifies.updateBy;
	var updateTime = obj.updateTime;
	var str = "原始值："+initialValue+"<br/>修改人："+updateBy+"<br/>修改时间："+updateTime;
	$("#div_allFun").html(str);
	var div = $("#div_allFun");
	div.show();
	div.css("left", document.body.scrollLeft + event.clientX + 10);
	div.css("top", document.body.scrollLeft + event.clientY + 8);
	div.css("background-color", "#EFF7FE");
});

$(document).ready(function(){
	$(".updField").mouseout(function(event) {
		var div = $("#div_allFun");
		div.hide();
	});
});

function getUpdateValue(attributeName) {
	var obj=null;
	$.ajax({
		type : "GET",
		async : false,// 同步
		url : path+"/biz/fieldRecord/fieldmanager/get?attributeName="+attributeName,
		context : document.body,
		success : function(result) {
			obj = result;
		}
	});
	return obj;
}

function get(jsonObj) {
	var obj=null;
	$.ajax({
		type : "POST",
		async : false,// 同步
		url : path+"/biz/fieldRecord/fieldmanager/create",
		context : document.body,
		data : jsonObj,
		success : function(result) {
			obj = result;
		}
	});
	return obj;
}

function post(URL, PARAMS) {        	//post提交
    var temp = document.createElement("form");        
    temp.action = URL;        
    temp.method = "post";        
    temp.style.display = "none";        
    for (var x in PARAMS) {        
        var opt = document.createElement("textarea");        
        opt.name = x;        
        opt.value = PARAMS[x];        
        temp.appendChild(opt);        
    }        
    document.body.appendChild(temp);        
    temp.submit();        
    return temp;        
} 

window.onload = function(){
	$(document.body).append("<div id=\"div_allFun\" class=\"rTBotr\" style=\"display: none; z-index: 210000; position: absolute;\"></div>");
}