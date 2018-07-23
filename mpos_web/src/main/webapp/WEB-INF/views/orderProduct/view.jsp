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
					href="${contextPath}/orderProduct/edit.do?id=${orderProduct.id}">修改 </a> <a
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
						<td>商品的信息明细：</td>
						<td><input class="input-text-lg2" name="productinfo"  value="${orderProduct.productinfo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>订单id：</td>
						<td><input class="input-text-lg2" name="orderId"  value="${orderProduct.orderId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>产品id：</td>
						<td><input class="input-text-lg2" name="productId"  value="${orderProduct.productId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商品状态：</td>
						<td><input class="input-text-lg2" name="status"  value="${orderProduct.status}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>订单商品说明：</td>
						<td><input class="input-text-lg2" name="remark"  value="${orderProduct.remark}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
