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
				<a type="button" class="btn btn-success btn-sm bing-btn-sm" href="${contextPath}/tWxVipSale/edit.do?id=${tWxVipSale.id}">修改 </a>
				<a type="button" href="${sessionScope.lastUrl }" class="btn btn-warning btn-sm bing-btn-sm">返回 </a>
			</div>
		</div>
	</section>	
	<section class="row">
		<div class="col-sm-12 col-md-12">
			<table cellspacing="0" cellpadding="0" class="maoye-table mgtop10">
				<tbody>
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="id"  value="${tWxVipSale.id}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="openId"  value="${tWxVipSale.openId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="saleId"  value="${tWxVipSale.saleId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="saleDate"  value="<fmt:formatDate value="${tWxVipSale.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="payAmt"  value="${tWxVipSale.payAmt}"  disabled="disabled"></td>
				</tr>	
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>				
