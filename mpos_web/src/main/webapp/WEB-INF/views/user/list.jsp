<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="${staticPath}/js/list.js"></script>
<script type="text/javascript">

	function saveData(data){
		top.$('#mainIframe').contents().find("#userId").val(data);
		top.$("#userId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	<ol class="breadcrumb">
		<!-- <li>首页</li> -->
		<li>组织管理</li>
		<li>test</li>
		<li>test2</li>
		<button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
			onclick="delete_check('${contextPath}/user/delete.do','listTable');">删除</button>
		<a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
			href="${contextPath}/user/add.do" target="mainIframe">新增</a>
	</ol>

	<form:form id="listForm" name="listForm" modelAttribute="user"
		action="${contextPath}/user/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="name" placeholder="name_" />
				<form:input class="query-input" path="userNo" placeholder="用户登录名" />
				<form:input class="query-input" path="passWd" placeholder="pass_wd_" />
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					<th><input id="allSelect" type="checkbox"></th>   
					<th>id_</th>
					<th>name_</th>
					<th>用户登录名</th>
					<th>pass_wd_</th>
					<th>create_date_</th>
					<th>操作</th>
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr>
							<td><input name="singleCkb" type="checkbox"
									data-ckb-id="${entity.id}"></td>
									 <td>${entity.id}</td>
									 <td>${entity.name}</td>
									 <td>${entity.userNo}</td>
									 <td>${entity.passWd}</td>
									 <td><fmt:formatDate value="${entity.createDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                                                       <td><a href="${contextPath }/user/view.do?id=${entity.id}"
								style="margin-left: 0px;">查看</a><a
								href="${contextPath }/user/edit.do?id=${entity.id}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
	<pager:pager url="${contextPath }/user/list.do"/>
</body>
</html>
