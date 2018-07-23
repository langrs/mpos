<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
		top.createDialogHtml("product","${contextPath}/product/list.do?dialog=true");
	top.createDialogHtml("order","${contextPath}/order/list.do?dialog=true");
</script>
</head>
<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
	</ol>
	<form:form id="dataForm" modelAttribute="orderProduct"
		action="${contextPath}/orderProduct/save.do" method="post" role="form">
		<form:hidden path="id"/>
		<section class="row">
		<div class="col-xs-8 col-md-8 pull-right">
			<div class="btn-box">
				<button type="submit"
					class="btn btn-success btn-sm bing-btn-sm submit">保存</button>
				<a class="btn btn-warning btn-sm bing-btn-sm"
					href="${sessionScope.lastUrl }">取消</a>
			</div>
		</div>
		</section>

		<section class="row">
		<div class="col-sm-12 col-md-12">
			<table cellspacing="0" cellpadding="0" class="maoye-table mgtop10">
				<tbody>
							<form:hidden path="id"/>
						<tr>
							<td>商品的信息明细:</td>
							<td>
								
								<form:input id="productinfo" path="productinfo"
											class="input-text-lg " />
								
							</td>
						</tr>
								<tr>
								<td>订单id:</td>
								<form:hidden path="orderId"/>
								<td><input value="${orderProduct.orderIdObj.name}" id="orderId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#orderId').modal('show');" value="选择"></td>
							</tr>
								<tr>
								<td>产品id:</td>
								<form:hidden path="productId"/>
								<td><input value="${orderProduct.productIdObj.name}" id="productId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#productId').modal('show');" value="选择"></td>
							</tr>
						<tr>
							<td>商品状态:</td>
							<td>
								
								<form:input id="status" path="status"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>订单商品说明:</td>
							<td>
								
								<form:input id="remark" path="remark"
											class="input-text-lg " />
								
							</td>
						</tr>
				</tbody>
			</table>
		</div>
		</section>

	</form:form>


</body>
</html>
