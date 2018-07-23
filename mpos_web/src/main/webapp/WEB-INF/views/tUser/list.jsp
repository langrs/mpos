<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="${staticPath}/js/list.js"></script>
<script type="text/javascript">


</script>

<title>运营服务支撑平台</title>
</head>
<body>

	<ol class="breadcrumb">
		<!-- <li>首页</li> -->
		<li>权限管理</li>
		<li>用户资料</li>
		<li>查看</li>
		<button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
			onclick="delete_check('${contextPath}/tUser/delete.do','listTable');">删除</button>
		<a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
			href="${contextPath}/tUser/add.do" target="mainIframe">新增</a>
	</ol>

	<form:form id="listForm" name="listForm" modelAttribute="tUser"
		action="${contextPath}/tUser/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="userNo" placeholder="用户编码" />
				<form:input class="query-input" path="name" placeholder="用户名称" />
				<form:input class="query-input" path="shopId" placeholder="分店" />
				<form:input class="query-input" path="storeId" placeholder="商铺ID" />
				<form:input class="query-input" path="userType" placeholder="收银员类别" />
				<form:input class="query-input" path="state" placeholder="状态" />
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					<th><input id="allSelect" type="checkbox"></th>   
					<th>用户编码</th>
					<th>用户名称</th>
					<th>分店</th>
					<th>商铺ID</th>
					<th>收银员类别</th>
					<th>状态</th>
					<th>是否有效</th>
					<th>操作</th>
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr onclick="setBox(this);">
							<td><input name="singleCkb" type="checkbox"
									data-ckb-id="${entity.id}"></td>
									 <td>${entity.userNo}</td>
									 <td>${entity.name}</td>
									 <td>${entity.shopId}</td>
									 <td>${entity.storeId}</td>
									 <td>${entity.userType}</td>
									 <td>${entity.state}</td>
									 <td>${entity.isFlag}</td>
                                                       <td><a href="${contextPath }/tUser/view.do?id=${entity.id}"
								style="margin-left: 0px;">查看</a><a
								href="${contextPath }/tUser/edit.do?id=${entity.id}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
