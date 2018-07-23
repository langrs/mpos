<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html >
<html>
<head>
<title>404 - 您要访问的页面不存</title>
<link href="${staticPath}/css/layout.css" type="text/css" rel="stylesheet" />
<script type="text/javascript">
	function custom_close() {
		window.opener = null;
		window.open('', '_self');
		window.close()
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
			<div class="bg_404">
				<div class="title_7">
					<b class="icon_16 icon"></b>对不起，您要访问的页面不存在或已经被删除
				</div>
				<div class="l_8">您好&nbsp;&nbsp;请尝试一下操作：</div>
				<div class="l_9">
					<ul>
						<li>您好！请检查输入的网址是否正确</li>
						<li class="l_10"><a href="${contextPath}/index"><b
								class="icon_18 icon"></b>点击这里返回首页</a></li>
					</ul>
				</div>
				<div class="btn_8">
					<button type="button" class="btn btn-default btn_3"
						onclick="history.go(-1)">返&nbsp;&nbsp;回</button>
					<button type="button" class="btn btn-danger btn_3"
						onclick="custom_close();">关&nbsp;&nbsp;闭</button>
				</div>
			</div>
		</div>
	</header>
</body>
</html>
