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
				<a type="button" class="btn btn-success btn-sm bing-btn-sm" href="${contextPath}/tPaymode/edit.do?id=${tPaymode.id}">修改 </a>
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
					<td><input class="input-text-lg2" name="id"  value="${tPaymode.id}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>支付编码</td>
					<td><input class="input-text-lg2" name="paymodeNo"  value="${tPaymode.paymodeNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>支付名称</td>
					<td><input class="input-text-lg2" name="name"  value="${tPaymode.name}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>企业支付编码</td>
					<td><input class="input-text-lg2" name="paymodeQy"  value="${tPaymode.paymodeQy}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>支付类别ID</td>
					<td><input class="input-text-lg2" name="paymodeTypeId"  value="${tPaymode.paymodeTypeId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>分店ID</td>
					<td><input class="input-text-lg2" name="shopId"  value="${tPaymode.shopId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>是否找零</td>
					<td><input class="input-text-lg2" name="isChange"  value="${tPaymode.isChange}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>是否积分</td>
					<td><input class="input-text-lg2" name="isPoint"  value="${tPaymode.isPoint}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>是否开票</td>
					<td><input class="input-text-lg2" name="isInvoice"  value="${tPaymode.isInvoice}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>是否兑券</td>
					<td><input class="input-text-lg2" name="isCoupon"  value="${tPaymode.isCoupon}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>是否退货</td>
					<td><input class="input-text-lg2" name="isRet"  value="${tPaymode.isRet}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>币种ID</td>
					<td><input class="input-text-lg2" name="currencyId"  value="${tPaymode.currencyId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>创建人</td>
					<td><input class="input-text-lg2" name="createBy"  value="${tPaymode.createBy}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>创建日期</td>
					<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tPaymode.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>最后修改人</td>
					<td><input class="input-text-lg2" name="updateBy"  value="${tPaymode.updateBy}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>最后修改日期</td>
					<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tPaymode.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>是否有效</td>
					<td><input class="input-text-lg2" name="isFlag"  value="${tPaymode.isFlag}"  disabled="disabled"></td>
				</tr>	
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>				
