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
				<a type="button" class="btn btn-success btn-sm bing-btn-sm" href="${contextPath}/tWxVip/edit.do?id=${tWxVip.id}">修改 </a>
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
					<td><input class="input-text-lg2" name="id"  value="${tWxVip.id}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="openId"  value="${tWxVip.openId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="userName"  value="${tWxVip.userName}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="registerDate"  value="<fmt:formatDate value="${tWxVip.registerDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="shoppingDateFirst"  value="<fmt:formatDate value="${tWxVip.shoppingDateFirst}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="shoppingDateLast"  value="<fmt:formatDate value="${tWxVip.shoppingDateLast}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="cardNo"  value="${tWxVip.cardNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="phoneNo"  value="${tWxVip.phoneNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="birthday"  value="<fmt:formatDate value="${tWxVip.birthday}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="sex"  value="${tWxVip.sex}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="localation"  value="${tWxVip.localation}"  disabled="disabled"></td>
				</tr>	
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>				
