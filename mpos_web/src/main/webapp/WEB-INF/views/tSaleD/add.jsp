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
	<form:form id="dataForm" modelAttribute="tSaleD"
		action="${contextPath}/tSaleD/save.do" method="post" role="form">
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
							<td>销售日期:</td>
							<td>
								<div class="date-div-width input-group date o-a-form-date">
								<input class="input-text-lg" name="saleDate" value="<fmt:formatDate value="${tSaleD.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />">
								<span class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span></span>
								</div>
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
							<td>公司ID:</td>
							<td>
								
								<form:input id="companyId" path="companyId"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>分店:</td>
							<td>
								
								<form:input id="shopId" path="shopId"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>商铺:</td>
							<td>
								
								<form:input id="storeId" path="storeId"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>商品:</td>
							<td>
								
								<form:input id="itemId" path="itemId"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>商品编码:</td>
							<td>
								
								<form:input id="itemNo" path="itemNo"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>销售数量:</td>
							<td>
								
								<form:input id="saleNum" path="saleNum"
											class="input-text-lg requirednumber" />
								
							</td>
						</tr>
						<tr>
							<td>商品单价:</td>
							<td>
								
								<form:input id="salePrice" path="salePrice"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>商品折后单价:</td>
							<td>
								
								<form:input id="salePriceReal" path="salePriceReal"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>税率:</td>
							<td>
								
								<form:input id="taxRate" path="taxRate"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>税金:</td>
							<td>
								
								<form:input id="taxAmt" path="taxAmt"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>单品打折率:</td>
							<td>
								
								<form:input id="itemDisc" path="itemDisc"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>单品打折金额:</td>
							<td>
								
								<form:input id="itemDiscAmt" path="itemDiscAmt"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>整单打折率:</td>
							<td>
								
								<form:input id="billDist" path="billDist"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>整单打折金额:</td>
							<td>
								
								<form:input id="billDiscAmt" path="billDiscAmt"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>会员打折率:</td>
							<td>
								
								<form:input id="vipDisc" path="vipDisc"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>会员打折金额:</td>
							<td>
								
								<form:input id="vipDiscAmt" path="vipDiscAmt"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>促销打折率:</td>
							<td>
								
								<form:input id="promDisc" path="promDisc"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>促销打折金额:</td>
							<td>
								
								<form:input id="promDiscAmt" path="promDiscAmt"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>其他打折率:</td>
							<td>
								
								<form:input id="otherDisc" path="otherDisc"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>其他打折金额:</td>
							<td>
								
								<form:input id="otherDiscAmt" path="otherDiscAmt"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>满减优惠金额:</td>
							<td>
								
								<form:input id="reduceAmt" path="reduceAmt"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>会员价优惠金额:</td>
							<td>
								
								<form:input id="vipPriceAmt" path="vipPriceAmt"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>优惠总金额:</td>
							<td>
								
								<form:input id="allDistAmt" path="allDistAmt"
											class="input-text-lg requirednumber" />
								
							</td>
						</tr>
						<tr>
							<td>销售总价:</td>
							<td>
								
								<form:input id="itemSaleAmt" path="itemSaleAmt"
											class="input-text-lg requirednumber" />
								
							</td>
						</tr>
						<tr>
							<td>销售积分:</td>
							<td>
								
								<form:input id="points" path="points"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>退货标志:</td>
							<td>
								
								<form:input id="retFlag" path="retFlag"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>已退金额:</td>
							<td>
								
								<form:input id="retAmt" path="retAmt"
											class="input-text-lg requirednumber" />
								
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
								<input class="input-text-lg" name="upDate" value="<fmt:formatDate value="${tSaleD.upDate}" pattern="yyyy-MM-dd HH:mm:ss" />">
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
