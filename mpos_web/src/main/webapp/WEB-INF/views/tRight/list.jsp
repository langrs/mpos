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
		<button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
			onclick="delete_check('${contextPath}/tRight/delete.do','listTable');">删除</button>
		<a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
			href="${contextPath}/tRight/add.do" target="mainIframe">新增</a>
	</ol>

	<form:form id="listForm" name="listForm" modelAttribute="tRight"
		action="${contextPath}/tRight/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
				<form:input class="query-input" path="parentId" placeholder="父节点" />
				<form:input class="query-input" path="nodeId" placeholder="节点编码" />
				<form:input class="query-input" path="name" placeholder="节点名称" />
				<form:input class="query-input" path="isLastNote" placeholder="末级节点" />
				<form:input class="query-input" path="nodeAttr" placeholder="节点属性" />
				<form:input class="query-input" path="nodeTxt" placeholder="节点内容" />
				<form:input class="query-input" path="createBy" placeholder="创建人" />
				<form:input class="query-input" path="updateBy" placeholder="最后修改人" />
				<form:input class="query-input" path="isFlag" placeholder="是否有效" />
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					<th><input id="allSelect" type="checkbox"></th>   
					<th>ID</th>
					<th>父节点</th>
					<th>节点编码</th>
					<th>节点名称</th>
					<th>节点级别</th>
					<th>末级节点</th>
					<th>节点属性</th>
					<th>节点内容</th>
					<th>创建人</th>
					<th>创建日期</th>
					<th>最后修改人</th>
					<th>最后修改日期</th>
					<th>是否有效</th>
					<th>操作</th>
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr onclick="setBox(this);">
							<td><input name="singleCkb" type="checkbox"
									data-ckb-id="${entity.id}"></td>
									 <td>${entity.id}</td>
									 <td>${entity.parentId}</td>
									 <td>${entity.nodeId}</td>
									 <td>${entity.name}</td>
									 <td>${entity.nodeLevel}</td>
									 <td>${entity.isLastNote}</td>
									 <td>${entity.nodeAttr}</td>
									 <td>${entity.nodeTxt}</td>
									 <td>${entity.createBy}</td>
									 <td><fmt:formatDate value="${entity.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.updateBy}</td>
									 <td><fmt:formatDate value="${entity.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.isFlag}</td>
                                                       <td><a href="${contextPath }/tRight/view.do?id=${entity.id}"
								style="margin-left: 0px;">查看</a><a
								href="${contextPath }/tRight/edit.do?id=${entity.id}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
