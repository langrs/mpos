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
			onclick="delete_check('${contextPath}/tParm/delete.do','listTable');">删除</button>
		<a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
			href="${contextPath}/tParm/add.do" target="mainIframe">新增</a>
	</ol>

	<form:form id="listForm" name="listForm" modelAttribute="tParm"
		action="${contextPath}/tParm/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
				<form:input class="query-input" path="parmNo" placeholder="参数编码" />
				<form:input class="query-input" path="name" placeholder="参数名称" />
				<form:input class="query-input" path="parmVal" placeholder="参数值" />
				<form:input class="query-input" path="isSys" placeholder="是否系统参数" />
				<form:input class="query-input" path="shopId" placeholder="分店ID" />
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
					<th>参数编码</th>
					<th>参数名称</th>
					<th>参数值</th>
					<th>是否系统参数</th>
					<th>分店ID</th>
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
									 <td>${entity.parmNo}</td>
									 <td>${entity.name}</td>
									 <td>${entity.parmVal}</td>
									 <td>${entity.isSys}</td>
									 <td>${entity.shopId}</td>
									 <td>${entity.createBy}</td>
									 <td><fmt:formatDate value="${entity.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.updateBy}</td>
									 <td><fmt:formatDate value="${entity.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.isFlag}</td>
                                                       <td><a href="${contextPath }/tParm/view.do?id=${entity.id}"
								style="margin-left: 0px;">查看</a><a
								href="${contextPath }/tParm/edit.do?id=${entity.id}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
