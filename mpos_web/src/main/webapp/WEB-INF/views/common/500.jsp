<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory"%>
<%@ page import="java.io.PrintWriter"%><html>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%
	response.setStatus(200);
%>
<%
	Throwable ex = null;
	if (request.getAttribute("javax.servlet.error.exception") != null) {
		ex = (Throwable) request
				.getAttribute("javax.servlet.error.exception");
	}
	if (ex != null) {
		Logger logger = LoggerFactory.getLogger("500.jsp");
		logger.error(ex.getMessage(), ex);
	}
%>
<!DOCTYPE html >
<html>
<head>
<title>500 - 您访问的页面出现错误</title>
<link href="${staticPath}/css/layout.css" type="text/css"
	rel="stylesheet" />
<script type="text/javascript">
	function custom_close() {
		window.opener = null;
		window.open('', '_self');
		window.close()
	}
	$(document).ready(function() {
		$("#chevronDownBtn").click(function() {
			if (!$("#errorMessage").is(":hidden")) {
				$("#glyphiconspan").removeClass('glyphicon glyphicon-chevron-up').addClass('glyphicon glyphicon-chevron-down');
			} else {
				$("#glyphiconspan").removeClass('glyphicon glyphicon-chevron-down').addClass('glyphicon glyphicon-chevron-up');
			}
		});
	});
</script>
</head>
<body>
	<header>
		<div class="top_bg">
			<div class="container top_bg_2">
				<a class="navbar-brand" href="${contextPath}/index"
					style="padding-bottom: 10px;"><img alt=""
					src="${staticPath}/images/logo.png">&nbsp;&nbsp;</a>
			</div>
		</div>
		<div class="container">
			<div class="bg_404">
				<div class="title_7">
					<b class="icon_16 icon"></b>对不起，您访问的页面出现内部错误！
				</div>
				<div class="l_8 o-l-chevron-down" style="text-align: left;">
					错误信息： <a href="#" class="btn btn-default" data-toggle="collapse"
						data-target="#errorMessage" id="chevronDownBtn" role="button"><span
						id="glyphiconspan" class="glyphicon glyphicon-chevron-down"></span></a>
				</div>

				<div class="btn_8">
					<button type="button" class="btn btn-default btn_3"
						onclick="history.go(-1)">返&nbsp;&nbsp;回</button>
					<button type="button" class="btn btn-danger btn_3"
						onclick="custom_close();">关&nbsp;&nbsp;闭</button>
				</div>

				<div class="l_9 collapse" id="errorMessage" style="height: auto;">
					<p>
						<%
							if (ex != null) {
								PrintWriter pout = new PrintWriter(out);
								ex.printStackTrace(pout);
							}
						%>
					</p>
				</div>
			</div>
		</div>
	</header>
</body>
</html>
