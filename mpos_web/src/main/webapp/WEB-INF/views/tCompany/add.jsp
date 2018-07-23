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
		<li>基本资料</li>
		<li>公司维护</li>
	</ol>
	<form:form id="dataForm" modelAttribute="tCompany"
		action="${contextPath}/tCompany/save.do" method="post" role="form">
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
					<td>公司编码:</td>
					<td><form:input id="comanyNo" path="comanyNo"	class="input-text-lg required" /></td>
				</tr>
				<tr>
					<td>公司名称:</td>
					<td><form:input id="name" path="name"	class="input-text-lg " /></td>
				</tr>
				<tr>
					<td>公司描述:</td>
					<td><form:input id="companyDesc" path="companyDesc" class="input-text-lg " /></td>
				</tr>
                 <form:hidden path="createBy"/>
				 <input name="createTime" class="hidden" value="<fmt:formatDate value="${tCompany.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/>
				<tr>
					<td>是否有效:</td>
					<!-- <td><form:input id="isFlag" path="isFlag" class="input-text-lg required" /></td> -->
					<td>
						<form:select id="isFlag" path="isFlag" class="input-text-lg required" >
							<form:option value="1">有效</form:option>
							<form:option value="0">无效</form:option>
						</form:select>
					</td>
				</tr>
				</tbody>
			</table>
		</div>
		</section>
	</form:form>
</body>
</html>
