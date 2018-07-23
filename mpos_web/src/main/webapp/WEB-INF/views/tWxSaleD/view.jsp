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
				<a type="button" class="btn btn-success btn-sm bing-btn-sm" href="${contextPath}/tWxSaleD/edit.do?id=${tWxSaleD.id}">修改 </a>
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
					<td><input class="input-text-lg2" name="id"  value="${tWxSaleD.id}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>主表ID</td>
					<td><input class="input-text-lg2" name="saleId"  value="${tWxSaleD.saleId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售流水号</td>
					<td><input class="input-text-lg2" name="saleNo"  value="${tWxSaleD.saleNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售日期</td>
					<td><input class="input-text-lg2" name="saleDate"  value="<fmt:formatDate value="${tWxSaleD.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>序号</td>
					<td><input class="input-text-lg2" name="rowNo"  value="${tWxSaleD.rowNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>分店</td>
					<td><input class="input-text-lg2" name="shopId"  value="${tWxSaleD.shopId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>商铺</td>
					<td><input class="input-text-lg2" name="storeId"  value="${tWxSaleD.storeId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>商品</td>
					<td><input class="input-text-lg2" name="itemId"  value="${tWxSaleD.itemId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>商品编码</td>
					<td><input class="input-text-lg2" name="itemNo"  value="${tWxSaleD.itemNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>商品名称</td>
					<td><input class="input-text-lg2" name="itemName"  value="${tWxSaleD.itemName}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售数量</td>
					<td><input class="input-text-lg2" name="saleNum"  value="${tWxSaleD.saleNum}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>商品单价</td>
					<td><input class="input-text-lg2" name="salePrice"  value="${tWxSaleD.salePrice}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>商品折后单价</td>
					<td><input class="input-text-lg2" name="salePriceReal"  value="${tWxSaleD.salePriceReal}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>单品打折率</td>
					<td><input class="input-text-lg2" name="itemDisc"  value="${tWxSaleD.itemDisc}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>单品打折金额</td>
					<td><input class="input-text-lg2" name="itemDiscAmt"  value="${tWxSaleD.itemDiscAmt}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>会员价优惠金额</td>
					<td><input class="input-text-lg2" name="vipPriceAmt"  value="${tWxSaleD.vipPriceAmt}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>优惠总金额</td>
					<td><input class="input-text-lg2" name="allDistAmt"  value="${tWxSaleD.allDistAmt}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售总价</td>
					<td><input class="input-text-lg2" name="itemSaleAmt"  value="${tWxSaleD.itemSaleAmt}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售积分</td>
					<td><input class="input-text-lg2" name="points"  value="${tWxSaleD.points}"  disabled="disabled"></td>
				</tr>	
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>				
