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
					href="${contextPath}/tCurrency/edit.do?id=${tCurrency.id}">修改 </a> <a
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
						<td>币种编码：</td>
						<td><input class="input-text-lg2" name="currencyNo"  value="${tCurrency.currencyNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>币种名称：</td>
						<td><input class="input-text-lg2" name="name"  value="${tCurrency.name}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>币种符号：</td>
						<td><input class="input-text-lg2" name="currencyMark"  value="${tCurrency.currencyMark}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否本币：</td>
						<td><input class="input-text-lg2" name="isLocalCurrency"  value="${tCurrency.isLocalCurrency}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>汇率：</td>
						<td><input class="input-text-lg2" name="exchangeRate"  value="${tCurrency.exchangeRate}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tCurrency.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tCurrency.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tCurrency.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tCurrency.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tCurrency.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
