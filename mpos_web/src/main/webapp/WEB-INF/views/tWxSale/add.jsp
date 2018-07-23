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
	<form:form id="dataForm" modelAttribute="tWxSale"
		action="${contextPath}/tWxSale/save.do" method="post" role="form">
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
						<td>销售流水号</td>					
						<td><form:input id="saleNo" path="saleNo" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>销售日期</td>					
						<td><input name="saleDate" value="<fmt:formatDate value="${tWxSale.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />"/></td>
						</tr>					
						<tr>
						<td>收银员ID</td>					
						<td><form:input id="userId" path="userId" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>交易序号</td>					
						<td><form:input id="saleNoShort" path="saleNoShort" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>交易类型</td>					
						<td><form:input id="dealType" path="dealType" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>销售来源</td>					
						<td><form:input id="saleSource" path="saleSource" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>销售单类型</td>					
						<td><form:input id="saleType" path="saleType" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>公司ID</td>					
						<td><form:input id="companyId" path="companyId" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>分店</td>					
						<td><form:input id="shopId" path="shopId" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>终端</td>					
						<td><form:input id="posId" path="posId" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>商铺</td>					
						<td><form:input id="storeId" path="storeId" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>会员卡号</td>					
						<td><form:input id="vipNo" path="vipNo" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>期初积分</td>					
						<td><form:input id="originalPoints" path="originalPoints" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>销售积分</td>					
						<td><form:input id="salePoints" path="salePoints" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>原价金额</td>					
						<td><form:input id="originalAmt" path="originalAmt" class="input-text-lg requirednumber" /></td>
						</tr>					
						<tr>
						<td>应收金额</td>					
						<td><form:input id="saleAmt" path="saleAmt" class="input-text-lg requirednumber" /></td>
						</tr>					
						<tr>
						<td>实收金额</td>					
						<td><form:input id="payAmt" path="payAmt" class="input-text-lg requirednumber" /></td>
						</tr>					
						<tr>
						<td>折扣金额</td>					
						<td><form:input id="discAmt" path="discAmt" class="input-text-lg requirednumber" /></td>
						</tr>					
						<tr>
						<td>培训模式</td>					
						<td><form:input id="isTrain" path="isTrain" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>退货理由</td>					
						<td><form:input id="reason" path="reason" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>退货金额</td>					
						<td><form:input id="retAmt" path="retAmt" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>领取电子小票</td>					
						<td><form:input id="ebillType" path="ebillType" class="input-text-lg " /></td>
						</tr>					
				</tbody>
			</table>
		</div>
		</section>

	</form:form>


</body>
</html>					