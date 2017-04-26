

$(function(){
	var checkboxName = "singleCkb";   //复选框列表的name
	var allCheckId = "allSelect";     //全选的复选框的id
	$("#"+allCheckId).click(function(){
		checkEvent(checkboxName,allCheckId);
	});
	$("input[name='"+checkboxName+"']").bind("click",function(){
		checkSelect(checkboxName,allCheckId);
	});
});

/**
 * 全选/全不选事件
 * @param name	     复选框列表的name
 * @param allCheckId 全选id
 */
function checkEvent(name, allCheckId) {
	var allCk = document.getElementById(allCheckId);
	if (allCk.checked == true)
		checkSet(name,true);
	else
		checkSet(name,false);
}

/**
 * 全选/全不选设置函数
 * @param name
 * @param checkFlag true:全选   false:全不选
 */
function checkSet(name,checkFlag) {
	var names = document.getElementsByName(name);
	var len = names.length;
	if (len > 0) {
		var i = 0;
		for (i = 0; i < len; i++)
			names[i].checked = checkFlag;
	}
}
/**
 * 复选框列表单个的点击事件
 * @param name	     复选框列表的name
 * @param allCheckId 全选id
 */
function checkSelect(name, allCheckId){
	var totalNum = $("input[name='"+name+"']").length;
	var selectedNum = $("input[name='"+name+"']:checked").length;
	if(totalNum != selectedNum){
		$("#"+allCheckId).prop("checked",false);
	}else{
		$("#"+allCheckId).prop("checked",true);
	}
}