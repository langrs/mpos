<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
		top.createDialogHtml("customer","${contextPath}/customer/list.do?dialog=true");
	top.createDialogHtml("user","${contextPath}/user/list.do?dialog=true");
</script>
</head>
<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
	</ol>
	<form:form id="dataForm" modelAttribute="order"
		action="${contextPath}/order/save.do" method="post" role="form">
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
							<td>订单号:</td>
							<td>
								
								<form:input id="orderNo" path="orderNo"
											class="input-text-lg " />
								
							</td>
						</tr>
								<tr>
								<td>创建用户:</td>
								<form:hidden path="userId"/>
								<td><input value="${order.userIdObj.name}" id="userId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#userId').modal('show');" value="选择"></td>
							</tr>
						<tr>
							<td>订单状态:</td>
							<td>
								
								<form:input id="status" path="status"
											class="input-text-lg " />
								
							</td>
						</tr>
								<tr>
								<td>customer_id_:</td>
								<form:hidden path="customerId"/>
								<td><input value="${order.customerIdObj.name}" id="customerId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#customerId').modal('show');" value="选择"></td>
							</tr>
						<tr>
							<td>name:</td>
							<td>
								
								<form:input id="name" path="name"
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
