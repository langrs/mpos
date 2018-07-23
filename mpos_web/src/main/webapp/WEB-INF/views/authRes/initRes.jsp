<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="${staticPath}/js/list.js"></script>
<script type="text/javascript">
	
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	<ol class="breadcrumb">
		<!-- <li>首页</li> -->
		<li>数据初始化</li>
		<button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
			onclick="funform('${contextPath}/authRes/saveInitData.do','_self');">初始化</button>
	</ol>

	<div class="alert alert-info alert-dismissible" role="alert">
		<button type="button" class="close" data-dismiss="alert"
			aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
		<strong>提示!</strong>
		系统会自动获得所有spring管理的controller，将requestMap作为“连接地址”，将方法名作为“权限标识”，如果controller有加入MyAnnotation注解，会自动加载为“名称”。初始化不会删除原来的系统资源，只会新增原来没有的key。
	</div>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					<th>连接地址</th>
					<th>权限标识</th>
					<th>资源名称</th>

				</thead>
				<tbody>
					<c:forEach items="${resList}" var="entity">
						<tr onclick="setBox(this);">
							<td>${entity.path}</td>
							<td>${entity.key}</td>
							<td>${entity.name}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</section>
</body>
</html>
