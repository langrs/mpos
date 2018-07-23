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
					href="${contextPath}/tSalePay/edit.do?id=${tSalePay.id}">修改 </a> <a
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
						<td>主表ID：</td>
						<td><input class="input-text-lg2" name="saleId"  value="${tSalePay.saleId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>销售流水号：</td>
						<td><input class="input-text-lg2" name="saleNo"  value="${tSalePay.saleNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>序号：</td>
						<td><input class="input-text-lg2" name="rowNo"  value="${tSalePay.rowNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>销售日期：</td>
						<td><input class="input-text-lg2" name="saleDate"  value="<fmt:formatDate value="${tSalePay.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>分店：</td>
						<td><input class="input-text-lg2" name="shopId"  value="${tSalePay.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>支付方式：</td>
						<td><input class="input-text-lg2" name="paymodeId"  value="${tSalePay.paymodeId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>溢收金额：</td>
						<td><input class="input-text-lg2" name="excessAmt"  value="${tSalePay.excessAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>支付金额：</td>
						<td><input class="input-text-lg2" name="payAmt"  value="${tSalePay.payAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>找零金额：</td>
						<td><input class="input-text-lg2" name="changeAmt"  value="${tSalePay.changeAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>票据号码：</td>
						<td><input class="input-text-lg2" name="billNo"  value="${tSalePay.billNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>收单行：</td>
						<td><input class="input-text-lg2" name="collectBank"  value="${tSalePay.collectBank}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>发卡行：</td>
						<td><input class="input-text-lg2" name="issueBank"  value="${tSalePay.issueBank}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>刷卡方式：</td>
						<td><input class="input-text-lg2" name="skType"  value="${tSalePay.skType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>币种：</td>
						<td><input class="input-text-lg2" name="currencyId"  value="${tSalePay.currencyId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>币种汇率：</td>
						<td><input class="input-text-lg2" name="exchangeRate"  value="${tSalePay.exchangeRate}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>现金含量：</td>
						<td><input class="input-text-lg2" name="cashRate"  value="${tSalePay.cashRate}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>储值发卡机构：</td>
						<td><input class="input-text-lg2" name="cardIssue"  value="${tSalePay.cardIssue}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>上传标志：</td>
						<td><input class="input-text-lg2" name="upFlag"  value="${tSalePay.upFlag}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>上传日期：</td>
						<td><input class="input-text-lg2" name="upDate"  value="<fmt:formatDate value="${tSalePay.upDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
