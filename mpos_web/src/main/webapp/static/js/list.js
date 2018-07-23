$(document).ready(function() {
	//关闭加载窗
	top.$.jBox.closeTip();
	
	//模拟placeholder效果。兼容ie8等浏览器不显示问题。---start
	if (!('placeholder' in document.createElement('input'))) {
		$('input[placeholder],textarea[placeholder]').each(function() {
			var that = $(this), text = that.attr('placeholder');
			if (that.val() === "") {
				that.val(text).addClass('placeholder');
			}
			that.focus(function() {
				if (that.val() === text) {
					that.val("").removeClass('placeholder');
				}
			}).blur(function() {
				if (that.val() === "") {
					that.val(text).addClass('placeholder');
				}
			}).closest('form').submit(function() {
				if (that.val() === text) {
					that.val('');
				}
			});
		});
	}
	//模拟placeholder效果。兼容ie8等浏览器不显示问题。---end
	
	$(".o-l-table tbody tr td[class!='o-l-tab-ckb']").click(function() {
		var $this = $(this).parent();
		window.open($this.attr('data-herf'), $this.attr('data-target'));
	});
	$("input[type='checkbox'][data-ckb='all']").click(function() {
		var $this = $(this);
		var $tab = $this.closest("table.o-l-table");
		$tab.find("input[type='checkbox'][data-ckb-id]").prop("checked", $this.prop('checked'));
	});
	$("input[type='checkbox'][data-ckb-id]").click(function() {
		var $this = $(this);
		var $tab = $this.closest("table.o-l-table");
		if ($this.prop('checked')) {
			$tab.find("input[type='checkbox'][data-ckb='all']").each(function() {
				// this.checked = true;
				$(this).prop("checked", true);
			});
		} else {
			var len = $tab.find("input[type='checkbox'][data-ckb-id]:checked").length;
			if (len == 0) {
				$tab.find("input[type='checkbox'][data-ckb='all']").prop("checked", false);
			}
		}
	});
});
function funform(url, target) {
	// alert(url+" "+target);
	window.open(url, target);
}

/**
 * modify by hujie 删除选中的项
 * 
 * @param href
 *            URL
 * @param tabId
 *            搜索范围
 * @param urlParam
 *            要替换为具体ID的字符
 */
function delete_check(href, tabId) {
	var ids = new Array();
	$('#' + tabId).find("input[type='checkbox'][name='singleCkb']:checked").each(function() {
		ids.push($(this).attr("data-ckb-id"));
	});
	if (ids.length == 0) {
		top.$.jBox.tip("请先勾选需要删除的数据！");
	} else {
		top.$.jBox.confirm('确认要删除该条数据吗？', '系统提示', function(v, h, f) {
			if (v == 'ok') {
				Oosp_Loading('正在提交，请稍等...');
				href += "?ids=" + ids;
				funform(href, '_self');
			}
		}, {
			buttonsFocus : 1
		});
	}
}

function setBox(t){
//	$(t).find("input[name='singleCkb']").click();
}
