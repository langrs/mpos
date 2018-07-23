<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
</script>
</head>
<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
	</ol>
	<form:form id="dataForm" modelAttribute="tWxSalePay"
		action="${contextPath}/tWxSalePay/save.do" method="post" role="form">
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
						<td>主表ID</td>					
						<td><form:input id="saleId" path="saleId" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>销售流水号</td>					
						<td><form:input id="saleNo" path="saleNo" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>序号</td>					
						<td><form:input id="rowNo" path="rowNo" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>销售日期</td>					
						<td><input name="saleDate" value="<fmt:formatDate value="${tWxSalePay.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />"/></td>
						</tr>					
						<tr>
						<td>分店</td>					
						<td><form:input id="shopId" path="shopId" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>支付方式</td>					
						<td><form:input id="paymodeId" path="paymodeId" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>支付金额</td>					
						<td><form:input id="payAmt" path="payAmt" class="input-text-lg requirednumber" /></td>
						</tr>					
				</tbody>
			</table>
		</div>
		</section>

	</form:form>


</body>
</html>					