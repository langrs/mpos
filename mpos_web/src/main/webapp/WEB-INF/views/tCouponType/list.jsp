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
			onclick="delete_check('${contextPath}/tCouponType/delete.do','listTable');">删除</button>
		<a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
			href="${contextPath}/tCouponType/add.do" target="mainIframe">新增</a>
	</ol>

	<form:form id="listForm" name="listForm" modelAttribute="tCouponType"
		action="${contextPath}/tCouponType/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
				<form:input class="query-input" path="shopId" placeholder="分店ID" />
				<form:input class="query-input" path="typeNo" placeholder="类别编号" />
				<form:input class="query-input" path="name" placeholder="类别名称" />
				<form:input class="query-input" path="isChange" placeholder="允许找零" />
				<form:input class="query-input" path="validUnit" placeholder="日期单位" />
				<form:input class="query-input" path="isProm" placeholder="特价不参与" />
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
					<th>分店ID</th>
					<th>类别编号</th>
					<th>类别名称</th>
					<th>券面值</th>
					<th>允许找零</th>
					<th>有效期值</th>
					<th>日期单位</th>
					<th>限用买满金额</th>
					<th>限用张数</th>
					<th>特价不参与</th>
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
									 <td>${entity.shopId}</td>
									 <td>${entity.typeNo}</td>
									 <td>${entity.name}</td>
									 <td>${entity.value}</td>
									 <td>${entity.isChange}</td>
									 <td>${entity.validNum}</td>
									 <td>${entity.validUnit}</td>
									 <td>${entity.limitAmount}</td>
									 <td>${entity.limitNum}</td>
									 <td>${entity.isProm}</td>
									 <td>${entity.createBy}</td>
									 <td><fmt:formatDate value="${entity.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.updateBy}</td>
									 <td><fmt:formatDate value="${entity.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.isFlag}</td>
                                                       <td><a href="${contextPath }/tCouponType/view.do?id=${entity.id}"
								style="margin-left: 0px;">查看</a><a
								href="${contextPath }/tCouponType/edit.do?id=${entity.id}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
