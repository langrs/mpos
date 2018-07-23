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
	<form:form id="dataForm" modelAttribute="tSalePay"
		action="${contextPath}/tSalePay/save.do" method="post" role="form">
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
							<td>主表ID:</td>
							<td>
								
								<form:input id="saleId" path="saleId"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>销售流水号:</td>
							<td>
								
								<form:input id="saleNo" path="saleNo"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>序号:</td>
							<td>
								
								<form:input id="rowNo" path="rowNo"
											class="input-text-lg requirednumber" />
								
							</td>
						</tr>
						<tr>
							<td>销售日期:</td>
							<td>
								<div class="date-div-width input-group date o-a-form-date">
								<input class="input-text-lg" name="saleDate" value="<fmt:formatDate value="${tSalePay.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />">
								<span class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td>分店:</td>
							<td>
								
								<form:input id="shopId" path="shopId"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>支付方式:</td>
							<td>
								
								<form:input id="paymodeId" path="paymodeId"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>溢收金额:</td>
							<td>
								
								<form:input id="excessAmt" path="excessAmt"
											class="input-text-lg requirednumber" />
								
							</td>
						</tr>
						<tr>
							<td>支付金额:</td>
							<td>
								
								<form:input id="payAmt" path="payAmt"
											class="input-text-lg requirednumber" />
								
							</td>
						</tr>
						<tr>
							<td>找零金额:</td>
							<td>
								
								<form:input id="changeAmt" path="changeAmt"
											class="input-text-lg requirednumber" />
								
							</td>
						</tr>
						<tr>
							<td>票据号码:</td>
							<td>
								
								<form:input id="billNo" path="billNo"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>收单行:</td>
							<td>
								
								<form:input id="collectBank" path="collectBank"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>发卡行:</td>
							<td>
								
								<form:input id="issueBank" path="issueBank"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>刷卡方式:</td>
							<td>
								
								<form:input id="skType" path="skType"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>币种:</td>
							<td>
								
								<form:input id="currencyId" path="currencyId"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>币种汇率:</td>
							<td>
								
								<form:input id="exchangeRate" path="exchangeRate"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>现金含量:</td>
							<td>
								
								<form:input id="cashRate" path="cashRate"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>储值发卡机构:</td>
							<td>
								
								<form:input id="cardIssue" path="cardIssue"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>上传标志:</td>
							<td>
								
								<form:input id="upFlag" path="upFlag"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>上传日期:</td>
							<td>
								<div class="date-div-width input-group date o-a-form-date">
								<input class="input-text-lg" name="upDate" value="<fmt:formatDate value="${tSalePay.upDate}" pattern="yyyy-MM-dd HH:mm:ss" />">
								<span class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span></span>
								</div>
							</td>
						</tr>
				</tbody>
			</table>
		</div>
		</section>

	</form:form>


</body>
</html>
