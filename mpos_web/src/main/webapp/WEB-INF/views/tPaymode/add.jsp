<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	top.createDialogHtml("tPaymodeType","${contextPath}/tPaymodeType/list.do?dialog=true");	
	top.createDialogHtml("tShop","${contextPath}/tShop/list.do?dialog=true");	
	top.createDialogHtml("tCurrency","${contextPath}/tCurrency/list.do?dialog=true");	
</script>
</head>
<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
	</ol>
	<form:form id="dataForm" modelAttribute="tPaymode"
		action="${contextPath}/tPaymode/save.do" method="post" role="form">
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
						<td>支付编码</td>					
						<td><form:input id="paymodeNo" path="paymodeNo" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>支付名称</td>					
						<td><form:input id="name" path="name" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>企业支付编码</td>					
						<td><form:input id="paymodeQy" path="paymodeQy" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>支付类别ID</td>					
							<form:hidden path="paymodeTypeId" id="tPaymodeTypeId"/>
								<td><input value="${tPaymode.paymodeTypeIdObj.name}" id="tPaymodeTypeId_name"
								class="input-text-md " readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tPaymodeTypeId').modal('show');" value="选择"></td>							
						</tr>					
						<tr>
						<td>分店ID</td>					
							<form:hidden path="shopId" id="tShopId"/>
								<td><input value="${tPaymode.shopIdObj.name}" id="tShopId_name"
								class="input-text-md " readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tShopId').modal('show');" value="选择"></td>							
						</tr>					
						<tr>
						<td>是否找零</td>					
						<td><form:input id="isChange" path="isChange" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>是否积分</td>					
						<td><form:input id="isPoint" path="isPoint" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>是否开票</td>					
						<td><form:input id="isInvoice" path="isInvoice" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>是否兑券</td>					
						<td><form:input id="isCoupon" path="isCoupon" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>是否退货</td>					
						<td><form:input id="isRet" path="isRet" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>币种ID</td>					
							<form:hidden path="currencyId" id="tCurrencyId"/>
								<td><input value="${tPaymode.currencyIdObj.name}" id="tCurrencyId_name"
								class="input-text-md " readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tCurrencyId').modal('show');" value="选择"></td>							
						</tr>					
						<form:hidden path="createBy"/>
						<input name="createTime" class="hidden" value="<fmt:formatDate value="${tPaymode.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/>
						<tr>
						<td>是否有效</td>					
						<td><form:input id="isFlag" path="isFlag" class="input-text-lg required" /></td>
						</tr>					
				</tbody>
			</table>
		</div>
		</section>

	</form:form>


</body>
</html>					