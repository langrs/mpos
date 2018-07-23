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
			onclick="delete_check('${contextPath}/tCustSaleinfo/delete.do','listTable');">删除</button>
		<a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
			href="${contextPath}/tCustSaleinfo/add.do" target="mainIframe">新增</a>
	</ol>

	<form:form id="listForm" name="listForm" modelAttribute="tCustSaleinfo"
		action="${contextPath}/tCustSaleinfo/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
				<form:input class="query-input" path="shopId" placeholder="分店ID" />
				<form:input class="query-input" path="custId" placeholder="顾客ID" />
				<form:input class="query-input" path="saleId" placeholder="小票ID" />
				<form:input class="query-input" path="saleNo" placeholder="小票流水" />
				<form:input class="query-input" path="ebillType" placeholder="电子小票类型" />
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
					<th>顾客ID</th>
					<th>小票ID</th>
					<th>小票流水</th>
					<th>电子小票类型</th>
					<th>发送日期</th>
					<th>消费日期</th>
					<th>操作</th>
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr onclick="setBox(this);">
							<td><input name="singleCkb" type="checkbox"
									data-ckb-id="${entity.id}"></td>
									 <td>${entity.id}</td>
									 <td>${entity.shopId}</td>
									 <td>${entity.custId}</td>
									 <td>${entity.saleId}</td>
									 <td>${entity.saleNo}</td>
									 <td>${entity.ebillType}</td>
									 <td><fmt:formatDate value="${entity.sendDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td><fmt:formatDate value="${entity.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                                                       <td><a href="${contextPath }/tCustSaleinfo/view.do?id=${entity.id}"
								style="margin-left: 0px;">查看</a><a
								href="${contextPath }/tCustSaleinfo/edit.do?id=${entity.id}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
