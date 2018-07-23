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
				<a type="button" class="btn btn-success btn-sm bing-btn-sm" href="${contextPath}/tWxSalePay/edit.do?id=${tWxSalePay.id}">修改 </a>
				<a type="button" href="${sessionScope.lastUrl }" class="btn btn-warning btn-sm bing-btn-sm">返回 </a>
			</div>
		</div>
	</section>	
	<section class="row">
		<div class="col-sm-12 col-md-12">
			<table cellspacing="0" cellpadding="0" class="maoye-table mgtop10">
				<tbody>
				<tr>
					<td>ID</td>
					<td><input class="input-text-lg2" name="id"  value="${tWxSalePay.id}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>主表ID</td>
					<td><input class="input-text-lg2" name="saleId"  value="${tWxSalePay.saleId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售流水号</td>
					<td><input class="input-text-lg2" name="saleNo"  value="${tWxSalePay.saleNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>序号</td>
					<td><input class="input-text-lg2" name="rowNo"  value="${tWxSalePay.rowNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售日期</td>
					<td><input class="input-text-lg2" name="saleDate"  value="<fmt:formatDate value="${tWxSalePay.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>分店</td>
					<td><input class="input-text-lg2" name="shopId"  value="${tWxSalePay.shopId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>支付方式</td>
					<td><input class="input-text-lg2" name="paymodeId"  value="${tWxSalePay.paymodeId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>支付金额</td>
					<td><input class="input-text-lg2" name="payAmt"  value="${tWxSalePay.payAmt}"  disabled="disabled"></td>
				</tr>	
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>				
