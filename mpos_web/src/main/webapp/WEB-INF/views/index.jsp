<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<%@ taglib prefix='security'
	uri='http://www.springframework.org/security/tags'%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="Description" content="深圳联合智云科技">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>深圳联合智云科技有限公司</title>
<style type="text/css">
.container {
	width: 1010px !important;
}
</style>
<script type="text/javascript">
	//各模块高级查询按钮标识
	var accountEgisFlag = false;
	var noUserAccountFlag = false;
	var roleMgtFlag = false;
	var orgStuFlag = false;
	var orgPostFlag = false;
	var orgUserFlag = false;
	var bizStuFlag = false;
	var bizPostFlag = false;
	var bizUserFlag = false;

	function dyniframesize(down) {
		var pTar = null;
		if (document.getElementById) {
			pTar = document.getElementById(down);
		} else {
			eval('pTar = ' + down + ';');
		}
		if (pTar && !window.opera) {
			//begin resizing iframe
			pTar.style.display = "block"
			if (pTar.contentDocument && pTar.contentDocument.body.offsetHeight) {
				//ns6 syntax
				pTar.height = pTar.contentDocument.body.offsetHeight + 0;
				document.getElementById("menuIframe").height = pTar.height;
			} else if (pTar.Document && pTar.Document.body.scrollHeight) {
				//ie5+ syntax
				pTar.height = pTar.Document.body.scrollHeight;
				// pTar.width = pTar.Document.body.scrollWidth;
				document.getElementById("menuIframe").height = pTar.height;
			}
		}
	}

	//同用关联选择器,这个地方有点坑爹呀，add窗口初始化的时候，就已经调用这里，并且动态生成了model，model的id值改为:id + "Id"
	function createDialogHtml(id, src) {
		if ($("#" + id + "Id").length > 0) {
			$("#" + id + "Id").remove();
		}
		var baseDialog = $("#baseDialog").clone();
		baseDialog.attr("id", id + "Id");
		baseDialog.find("iframe").attr("src", src);
		$("body").append(baseDialog);
	}
	//创建人员选择器
	function createUserDialog(ids) {
		$("#userSelect").remove();
		var baseDialog = $("#baseDialog").clone();
		baseDialog.attr("id", "userSelect");
		baseDialog.find("iframe").attr("src", "${contextPath}/user/userSelect.do?ids=" + ids);
		$("body").append(baseDialog);
	}
</script>
</head>

<body>
	<div role="navigation" class="navbar navbar-default navbar-fixed-top">
		<div class="container warp">
			<div class="navbar-header">
				<button data-target=".navbar-collapse" data-toggle="collapse"
					class="navbar-toggle" type="button">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="#" class="navbar-brand"><img
					src="${staticPath}/images/logo.png"></a>
			</div>
			<div class="navbar-collapse collapse">
				<div class="nav-search">
					<span class="glyphicon glyphicon-cog"></span> <strong><a
						href="${contextPath}/j_spring_security_logout">注销</a></strong>
				</div>
				<div class="nav-search">
					<span class="glyphicon glyphicon-pencil"></span> <strong><a
						href="${contextPath}/accountMgt/accountPWupdate">修改密码</a></strong>&nbsp;&nbsp;&nbsp;&nbsp;
				</div>
				<div class="nav-search">
					<B>欢迎您：<security:authentication property="principal.username"></security:authentication>
						&nbsp;&nbsp;
					</B>
				</div>
			</div>
		</div>
	</div> 
	<!--/navigation-->

	<div id="wrapper">
		<section class="container main-box">
			<section class="row">
				<section class="col-xs-3 col-md-3 aside-box" id="aside">
					<div class="tree-box" style="margin-left: 0">
						<iframe src="${contextPath}/auth/tree.do" frameBorder="0"
							scrolling="yes" width="223px;" id="menuIframe" name="menuIframe"
							style="border: 1px solid #DADADA; border-top: none; min-height: 600px;"></iframe>
					</div>
					<!--/tree-box-->
				</section>
				<!--/aside-box-->

				<section class="col-xs-9 col-md-9 content-box" id="content">
					<iframe src="${contextPath}/auth/right.do" frameBorder="0"
						scrolling="no" width="100%" id="mainIframe" name="mainIframe"
						onload="javascript:dyniframesize('mainIframe');"
						style="min-height: 800px;"></iframe>
				</section>
				<!--/content-box-->
			</section>

			<section class="row">
				<div class="col-sm-12 col-md-12">
					<footer class="footer">
						<a href="#" target="_blank">微博帮助</a> <a href="#" target="_blank">意见反馈</a>
						<a href="#" target="_blank">开放平台</a> <a href="#" target="_blank">微博照片</a>
						<p>
							<small>TAG标签: </small><a href="#" target="_blank">官方网站</a> <a
								href="#" target="_blank">联合智云</a>
						</p>
						<p class="copyright">Copyright © 深圳联合智云科技有限公司. All Rights
							Reserved</p>
					</footer>
				</div>
			</section>
		</section>
	</div>

	<div id="baseDialog" class="modal fade">
		<div class="modal-dialog" style="top: 20px;">
			<div class="modal-content">
				<div class="modal-body" style="padding: 0px;">
					<iframe width="600px" height="380px;"
						style="padding-left: 5px; padding-right: 5px; border-width: 0px;"></iframe>
				</div>
			</div>
		</div>
	</div>



</body>
</html>


