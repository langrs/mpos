<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html >
<html>
<head>
<title>您的操作已成功！</title>
<%@include file="/WEB-INF/views/include/head.jsp"%>
<link href="${staticPath}/css/layout.css" type="text/css" rel="stylesheet" />
<script type="text/javascript">
	function custom_close() {
		window.opener = null;
		window.open('', '_self');
		window.close();
	}
</script>
</head>
<body>
	<header class="navbar-fixed-top">
		<div class="top_bg">
			<div class="container top_bg_2">
				<a class="navbar-brand" href="${contextPath}/index" style="padding-bottom: 10px;"><img
					alt="" src="${staticPath}/images/logo.png">&nbsp;&nbsp;</a>
			</div>
		</div>
		<div class="container">
			<div class="bg_404_1">
                 <div class="title_7"><b class="icon_17 icon"></b>恭喜，您的操作已成功！</div>
                 <div class="l_9">
                      <ul>
                         <li class="l_10"><a href="index.html"><b class="icon_18 icon"></b>点击这里返回首页</a></li>
                      </ul>
                 </div>
                 <div class="btn_8">
					<button type="button" class="btn btn-danger btn_3"
						onclick="custom_close();">关&nbsp;&nbsp;闭</button>
                 </div>
            </div>
		</div>
	</header>
</body>
</html>
