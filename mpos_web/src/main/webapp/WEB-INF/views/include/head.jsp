<%@ page contentType="text/html;charset=UTF-8"%>
<meta charset="utf-8"></meta>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!--[if lt IE 9]>
<script type="text/javascript" src="${staticPath}/js/ie-fixes.js"></script>
<script type="text/javascript" src="${staticPath}/js/_excanvas.compiled.js"></script>
<link rel="stylesheet" href="${staticPath}/css/ie-fixes.css">
<![endif]-->

<!-- jquery -->
<script src="${staticPath}/lib/jquery/1.9.1/jquery-1.9.1.min.js"
	type="text/javascript"></script>
<!-- jquery.validate -->
<link
	href="${staticPath}/lib/jquery-validation/1.11.0/jquery.validate.css"
	type="text/css" rel="stylesheet" />
<script
	src="${staticPath}/lib/jquery-validation/1.11.0/jquery.validate.js"
	type="text/javascript"></script>
<script
	src="${staticPath}/lib/jquery-validation/1.11.0/localization/messages_zh.js"
	type="text/javascript"></script>
<!-- modify by xiaohan 解决jquery1.9和jBox不兼容问题 (可下载本地) -->
<script src="${staticPath}/js/jquery-migrate-1.1.1.js"></script>
<!-- bootstrap -->
<link href="${staticPath}/lib/bootstrap/3.0.2/css/bootstrap.min.css"
	type="text/css" rel="stylesheet" />
<script src="${staticPath}/lib/bootstrap/3.0.2/js/bootstrap.min.js"
	type="text/javascript"></script>
<!-- jbox -->
<link href="${staticPath}/lib/jquery-jbox/2.3/Skins/Red/jbox.css"
	type="text/css" rel="stylesheet" />
<script src="${staticPath}/lib/jquery-jbox/2.3/jquery.jBox-2.3.min.js"
	type="text/javascript"></script>
<!-- 时间控件 -->
<link
	href="${staticPath}/lib/datetimepicker/0.0.11/css/bootstrap-datetimepicker.min.css"
	type="text/css" rel="stylesheet" />
<script
	src="${staticPath}/lib/datetimepicker/0.0.11/js/bootstrap-datetimepicker.js"
	type="text/javascript"></script>
<script type="text/javascript"
	src="${staticPath}/lib/datetimepicker/0.0.11/js/locales/bootstrap-datetimepicker.zh-CN.js"
	charset="UTF-8"></script>
<!-- 加载系统js -->
<script src="${staticPath}/js/sys.js" type="text/javascript"></script>

<!--[if lt IE 9]>
        <script type="text/javascript" src="${staticPath}/js/respond.js"></script>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

<!-- 项目 -->
<link href="${staticPath}/css/public.css" rel="stylesheet"
	type="text/css">
<script type="text/javascript">
	var Com_Parameter = {
		ContextPath : "${contextPath}",
		StaticPath : "${staticPath}",
	};

	$(document).ready(function() {
		$("#key").focus();
		$("#dataForm").validate({
			submitHandler : function(form) {
				Oosp_Loading('正在提交，请稍等...');
				form.submit();
			},
			errorContainer : "#messageBox",
			errorPlacement : function(error, element) {
				$("#messageBox").text("输入有误，请先更正。");
				if (element.is(":checkbox") || element.is(":radio") || element.parent().is(".input-append")) {
					error.appendTo(element.parent().parent());
				} else {
					error.insertAfter(element);
				}
			}
		});
	});
</script>