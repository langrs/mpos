// 显示加载框
function Oosp_Loading(mess) {
	top.$.jBox.tip.mess = null;
	top.$.jBox.tip(mess, 'loading', {
		opacity : 0
	});
}

// 确认对话框
function Oosp_Confirm(msg, href) {
	$.jBox.confirm(msg, '系统提示', function(v, h, f) {
		if (v == 'ok') {
			Oosp_Loading('正在提交，请稍等...');
			location = href;
		}
	}, {
		buttonsFocus : 1
	});
	return false;
}

function checkNum(t, totalNum) {
	t.value = t.value.replace(/\D/g, '');
	if (t.value > totalNum) {
		t.value = totalNum;
	}
}

// 加载日历控件
$(function() {
	$(".o-a-form-onlydate").datetimepicker({
		language : 'zh-CN',
		autoclose : true, // 选择日期后自动关闭
		todayBtn : 1,
		format : 'yyyy-mm-dd',
		minView : "month", // 选择日期后，不会再跳转去选择时分秒
	});
	$(".o-a-form-date").datetimepicker({
		language : 'zh-CN',
		autoclose : true,
		todayBtn : 1,
		format : 'yyyy-mm-dd hh:ii:ss',
		minuteStep : 1
	});
	$(".o-a-form-time").datetimepicker({
		minuteStep : 1,
		startView : 0,
		language : 'zh-CN',
		autoclose : true,
		format : 'hh:ii:ss'
	});

})
