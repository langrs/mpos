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
					href="${contextPath}/tSaleD/edit.do?id=${tSaleD.id}">修改 </a> <a
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
						<td><input class="input-text-lg2" name="saleId"  value="${tSaleD.saleId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>销售流水号：</td>
						<td><input class="input-text-lg2" name="saleNo"  value="${tSaleD.saleNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>销售日期：</td>
						<td><input class="input-text-lg2" name="saleDate"  value="<fmt:formatDate value="${tSaleD.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>序号：</td>
						<td><input class="input-text-lg2" name="rowNo"  value="${tSaleD.rowNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>公司ID：</td>
						<td><input class="input-text-lg2" name="companyId"  value="${tSaleD.companyId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>分店：</td>
						<td><input class="input-text-lg2" name="shopId"  value="${tSaleD.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商铺：</td>
						<td><input class="input-text-lg2" name="storeId"  value="${tSaleD.storeId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商品：</td>
						<td><input class="input-text-lg2" name="itemId"  value="${tSaleD.itemId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商品编码：</td>
						<td><input class="input-text-lg2" name="itemNo"  value="${tSaleD.itemNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>销售数量：</td>
						<td><input class="input-text-lg2" name="saleNum"  value="${tSaleD.saleNum}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商品单价：</td>
						<td><input class="input-text-lg2" name="salePrice"  value="${tSaleD.salePrice}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商品折后单价：</td>
						<td><input class="input-text-lg2" name="salePriceReal"  value="${tSaleD.salePriceReal}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>税率：</td>
						<td><input class="input-text-lg2" name="taxRate"  value="${tSaleD.taxRate}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>税金：</td>
						<td><input class="input-text-lg2" name="taxAmt"  value="${tSaleD.taxAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>单品打折率：</td>
						<td><input class="input-text-lg2" name="itemDisc"  value="${tSaleD.itemDisc}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>单品打折金额：</td>
						<td><input class="input-text-lg2" name="itemDiscAmt"  value="${tSaleD.itemDiscAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>整单打折率：</td>
						<td><input class="input-text-lg2" name="billDist"  value="${tSaleD.billDist}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>整单打折金额：</td>
						<td><input class="input-text-lg2" name="billDiscAmt"  value="${tSaleD.billDiscAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>会员打折率：</td>
						<td><input class="input-text-lg2" name="vipDisc"  value="${tSaleD.vipDisc}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>会员打折金额：</td>
						<td><input class="input-text-lg2" name="vipDiscAmt"  value="${tSaleD.vipDiscAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>促销打折率：</td>
						<td><input class="input-text-lg2" name="promDisc"  value="${tSaleD.promDisc}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>促销打折金额：</td>
						<td><input class="input-text-lg2" name="promDiscAmt"  value="${tSaleD.promDiscAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>其他打折率：</td>
						<td><input class="input-text-lg2" name="otherDisc"  value="${tSaleD.otherDisc}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>其他打折金额：</td>
						<td><input class="input-text-lg2" name="otherDiscAmt"  value="${tSaleD.otherDiscAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>满减优惠金额：</td>
						<td><input class="input-text-lg2" name="reduceAmt"  value="${tSaleD.reduceAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>会员价优惠金额：</td>
						<td><input class="input-text-lg2" name="vipPriceAmt"  value="${tSaleD.vipPriceAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>优惠总金额：</td>
						<td><input class="input-text-lg2" name="allDistAmt"  value="${tSaleD.allDistAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>销售总价：</td>
						<td><input class="input-text-lg2" name="itemSaleAmt"  value="${tSaleD.itemSaleAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>销售积分：</td>
						<td><input class="input-text-lg2" name="points"  value="${tSaleD.points}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>退货标志：</td>
						<td><input class="input-text-lg2" name="retFlag"  value="${tSaleD.retFlag}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>已退金额：</td>
						<td><input class="input-text-lg2" name="retAmt"  value="${tSaleD.retAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>上传标志：</td>
						<td><input class="input-text-lg2" name="upFlag"  value="${tSaleD.upFlag}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>上传日期：</td>
						<td><input class="input-text-lg2" name="upDate"  value="<fmt:formatDate value="${tSaleD.upDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
