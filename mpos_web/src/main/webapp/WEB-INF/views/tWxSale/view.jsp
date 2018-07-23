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
				<a type="button" class="btn btn-success btn-sm bing-btn-sm" href="${contextPath}/tWxSale/edit.do?id=${tWxSale.id}">修改 </a>
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
					<td><input class="input-text-lg2" name="id"  value="${tWxSale.id}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售流水号</td>
					<td><input class="input-text-lg2" name="saleNo"  value="${tWxSale.saleNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售日期</td>
					<td><input class="input-text-lg2" name="saleDate"  value="<fmt:formatDate value="${tWxSale.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>收银员ID</td>
					<td><input class="input-text-lg2" name="userId"  value="${tWxSale.userId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>交易序号</td>
					<td><input class="input-text-lg2" name="saleNoShort"  value="${tWxSale.saleNoShort}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>交易类型</td>
					<td><input class="input-text-lg2" name="dealType"  value="${tWxSale.dealType}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售来源</td>
					<td><input class="input-text-lg2" name="saleSource"  value="${tWxSale.saleSource}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售单类型</td>
					<td><input class="input-text-lg2" name="saleType"  value="${tWxSale.saleType}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>公司ID</td>
					<td><input class="input-text-lg2" name="companyId"  value="${tWxSale.companyId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>分店</td>
					<td><input class="input-text-lg2" name="shopId"  value="${tWxSale.shopId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>终端</td>
					<td><input class="input-text-lg2" name="posId"  value="${tWxSale.posId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>商铺</td>
					<td><input class="input-text-lg2" name="storeId"  value="${tWxSale.storeId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>会员卡号</td>
					<td><input class="input-text-lg2" name="vipNo"  value="${tWxSale.vipNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>期初积分</td>
					<td><input class="input-text-lg2" name="originalPoints"  value="${tWxSale.originalPoints}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>销售积分</td>
					<td><input class="input-text-lg2" name="salePoints"  value="${tWxSale.salePoints}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>原价金额</td>
					<td><input class="input-text-lg2" name="originalAmt"  value="${tWxSale.originalAmt}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>应收金额</td>
					<td><input class="input-text-lg2" name="saleAmt"  value="${tWxSale.saleAmt}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>实收金额</td>
					<td><input class="input-text-lg2" name="payAmt"  value="${tWxSale.payAmt}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>折扣金额</td>
					<td><input class="input-text-lg2" name="discAmt"  value="${tWxSale.discAmt}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>培训模式</td>
					<td><input class="input-text-lg2" name="isTrain"  value="${tWxSale.isTrain}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>退货理由</td>
					<td><input class="input-text-lg2" name="reason"  value="${tWxSale.reason}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>退货金额</td>
					<td><input class="input-text-lg2" name="retAmt"  value="${tWxSale.retAmt}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>领取电子小票</td>
					<td><input class="input-text-lg2" name="ebillType"  value="${tWxSale.ebillType}"  disabled="disabled"></td>
				</tr>	
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>				
