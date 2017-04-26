$(function() {
	$(".st_tree").SimpleTree({
		click : function(e) {
			if (!$(e).attr("hasChild"))
				alert($(e).attr("ref"));
		}
	});

	var _this = $(".t-one .t-h3");
	_this.parent().siblings().find(".t-content").hide();
	$(".t-one:first").children(".t-content").slideDown();
	_this.click(function() {
		$(this).next().slideToggle();
		$(".t-content").not($(this).siblings()).slideUp();
	});

	// 去掉没有url的链接
	$("a").each(function(i, o) {
		var projectName = "${pageContext.request.contextPath}";
		if ($(o).attr("href") == projectName) {
			$(o).attr("href", "javascript:void(0);");
		}
	});

	// 叶子节点选中事件
	$(document).click(function(e) {
		if ($(e.target).parent().find("li").length == 0) {
			$("li").removeClass("hover");
			$(e.target).parent().addClass("hover");
		}
	});
});

function iframeUrl(url) {
	top.$("#mainIframe").attr("src", url);
}