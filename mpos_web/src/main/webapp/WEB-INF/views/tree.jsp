<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>茂业国际控股有限公司</title>
<!-- jquery -->
<script src="${staticPath}/lib/jquery/1.9.1/jquery-1.9.1.min.js"
	type="text/javascript"></script>
<!-- 其他 -->
<script src="${staticPath}/lib/Tree/js/SimpleTree.js"
	type="text/javascript"></script>
<link href="${staticPath}/css/public.css" rel="stylesheet"
	type="text/css">
<link href="${staticPath}/css/tree.css" rel="stylesheet" type="text/css">
<script src="${staticPath}/js/tree.js" type="text/javascript"></script>

</script>
</head>

<body>

	<div class="t-one">
		<c:forEach items="${navList }" var="nav">
			<h3 class="t-h3">
				<span></span>${nav.name }
			</h3>
			<div class="t-content">
				<div class="st_tree">
					<ul>
						<c:forEach items="${nav.chirldList }" var="chirld">
							<li><a
								onclick="iframeUrl('${contextPath}${chirld.url }');">${chirld.name }</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</c:forEach>

	</div>
</body>
</html>
