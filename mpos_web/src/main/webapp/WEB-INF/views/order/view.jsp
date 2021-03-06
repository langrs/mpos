<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>

<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
		<li class="active">人员类型详情</li>
	</ol>
	
	<section class="row">
		<div class="col-xs-8 col-md-8 pull-right">
			<div class="btn-box">
				<a type="button" class="btn btn-success btn-sm bing-btn-sm"
					href="${contextPath}/order/edit.do?id=${order.id}">修改 </a> <a
					type="button" href="${sessionScope.lastUrl }"
					class="btn btn-warning btn-sm bing-btn-sm">返回 </a>
			</div>
		</div>
	</section>

	<section class="row">
		<div class="col-sm-12 col-md-12">
			<table cellspacing="0" cellpadding="0" class="maoye-table mgtop10">
				<tbody>
				
					<tr>
						<td>订单号：</td>
						<td><input class="input-text-lg2" name="orderNo"  value="${order.orderNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建用户：</td>
						<td><input class="input-text-lg2" name="userId"  value="${order.userId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>订单状态：</td>
						<td><input class="input-text-lg2" name="status"  value="${order.status}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>customer_id_：</td>
						<td><input class="input-text-lg2" name="customerId"  value="${order.customerId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>name：</td>
						<td><input class="input-text-lg2" name="name"  value="${order.name}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
