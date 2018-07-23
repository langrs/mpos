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
		<li>组织管理</li>
		<li>test</li>
		<li>test2</li>
	</ol>

	<form:form id="listForm" name="listForm" modelAttribute="authRes"
		action="${contextPath}/authRes/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="path" placeholder="连接地址" />
				<form:input class="query-input" path="key" placeholder="权限标识" />
				<form:input class="query-input" path="name" placeholder="资源名称" />
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					<th>id_</th>
					<th>连接地址</th>
					<th>权限标识</th>
					<th>资源名称</th>
					<th>所属菜单</th>
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr onclick="setBox(this);">
									 <td>${entity.id}</td>
									 <td>${entity.path}</td>
									 <td>${entity.key}</td>
									 <td>${entity.name}</td>
									 <td>${entity.navIdObj.name}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
