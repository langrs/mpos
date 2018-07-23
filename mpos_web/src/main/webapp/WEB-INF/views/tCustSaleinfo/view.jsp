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
					href="${contextPath}/tCustSaleinfo/edit.do?id=${tCustSaleinfo.id}">修改 </a> <a
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
						<td>分店ID：</td>
						<td><input class="input-text-lg2" name="shopId"  value="${tCustSaleinfo.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>顾客ID：</td>
						<td><input class="input-text-lg2" name="custId"  value="${tCustSaleinfo.custId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>小票ID：</td>
						<td><input class="input-text-lg2" name="saleId"  value="${tCustSaleinfo.saleId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>小票流水：</td>
						<td><input class="input-text-lg2" name="saleNo"  value="${tCustSaleinfo.saleNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>电子小票类型：</td>
						<td><input class="input-text-lg2" name="ebillType"  value="${tCustSaleinfo.ebillType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>发送日期：</td>
						<td><input class="input-text-lg2" name="sendDate"  value="<fmt:formatDate value="${tCustSaleinfo.sendDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>消费日期：</td>
						<td><input class="input-text-lg2" name="saleDate"  value="<fmt:formatDate value="${tCustSaleinfo.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
