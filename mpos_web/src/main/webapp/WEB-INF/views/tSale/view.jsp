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
					href="${contextPath}/tSale/edit.do?id=${tSale.id}">修改 </a> <a
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
						<td>销售流水号：</td>
						<td><input class="input-text-lg2" name="saleNo"  value="${tSale.saleNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>销售日期：</td>
						<td><input class="input-text-lg2" name="saleDate"  value="<fmt:formatDate value="${tSale.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>收银员ID：</td>
						<td><input class="input-text-lg2" name="userId"  value="${tSale.userId}"  disabled="disabled"></td>
					</tr>
					<%--<tr>--%>
						<%--<td>原流水号：</td>--%>
						<%--<td><input class="input-text-lg2" name="sSaleNo"  value="${tSale.sSaleNo}"  disabled="disabled"></td>--%>
					<%--</tr>--%>
					<tr>
						<td>交易序号：</td>
						<td><input class="input-text-lg2" name="saleNoShort"  value="${tSale.saleNoShort}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>收据号：</td>
						<td><input class="input-text-lg2" name="billNo"  value="${tSale.billNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>交易类型：</td>
						<td><input class="input-text-lg2" name="dealType"  value="${tSale.dealType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>销售来源：</td>
						<td><input class="input-text-lg2" name="saleSource"  value="${tSale.saleSource}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>销售单类型：</td>
						<td><input class="input-text-lg2" name="saleType"  value="${tSale.saleType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>公司ID：</td>
						<td><input class="input-text-lg2" name="companyId"  value="${tSale.companyId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>分店：</td>
						<td><input class="input-text-lg2" name="shopId"  value="${tSale.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>区域：</td>
						<td><input class="input-text-lg2" name="regionId"  value="${tSale.regionId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>终端：</td>
						<td><input class="input-text-lg2" name="posId"  value="${tSale.posId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商铺：</td>
						<td><input class="input-text-lg2" name="storeId"  value="${tSale.storeId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>业务员：</td>
						<td><input class="input-text-lg2" name="salesId"  value="${tSale.salesId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>会员卡号：</td>
						<td><input class="input-text-lg2" name="vipNo"  value="${tSale.vipNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>期初积分：</td>
						<td><input class="input-text-lg2" name="originalPoints"  value="${tSale.originalPoints}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>销售积分：</td>
						<td><input class="input-text-lg2" name="salePoints"  value="${tSale.salePoints}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>原价金额：</td>
						<td><input class="input-text-lg2" name="originalAmt"  value="${tSale.originalAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>应收金额：</td>
						<td><input class="input-text-lg2" name="saleAmt"  value="${tSale.saleAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>实收金额：</td>
						<td><input class="input-text-lg2" name="payAmt"  value="${tSale.payAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>折扣金额：</td>
						<td><input class="input-text-lg2" name="discAmt"  value="${tSale.discAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>抹零金额：</td>
						<td><input class="input-text-lg2" name="changeAmt"  value="${tSale.changeAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>溢收金额：</td>
						<td><input class="input-text-lg2" name="excessAmt"  value="${tSale.excessAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>税金金额：</td>
						<td><input class="input-text-lg2" name="saleTaxAmt"  value="${tSale.saleTaxAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>会员折扣金额：</td>
						<td><input class="input-text-lg2" name="vipDiscAmt"  value="${tSale.vipDiscAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>培训模式：</td>
						<td><input class="input-text-lg2" name="isTrain"  value="${tSale.isTrain}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>退货理由：</td>
						<td><input class="input-text-lg2" name="reason"  value="${tSale.reason}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>退货金额：</td>
						<td><input class="input-text-lg2" name="retAmt"  value="${tSale.retAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>领取电子小票：</td>
						<td><input class="input-text-lg2" name="ebillType"  value="${tSale.ebillType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>上传标志：</td>
						<td><input class="input-text-lg2" name="upFlag"  value="${tSale.upFlag}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>上传日期：</td>
						<td><input class="input-text-lg2" name="upDate"  value="<fmt:formatDate value="${tSale.upDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
