<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
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
		<li>系统维护</li>
		<li>数据字典</li>
		<li>维护</li>
	</ol>
	<form:form id="dataForm" modelAttribute="tCode"
		action="${contextPath}/tCode/save.do" method="post" role="form">
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
					<td>参数类别:</td>
					<td><form:input id="codeType" path="codeType" class="input-text-lg required" /></td>
				</tr>
				<tr>
					<td>参数描述:</td>
					<td><form:input id="codeDesc" path="codeDesc" class="input-text-lg required" /></td>
				</tr>
				<tr>
					<td>代码编码:</td>
					<td><form:input id="codeNo" path="codeNo" class="input-text-lg required" /></td>
				</tr>
				<tr>
					<td>代码名称:</td>
					<td><form:input id="name" path="name" class="input-text-lg required" /></td>
				</tr>
				<tr>
					<td>代码值:</td>
					<td><form:input id="codeValue" path="codeValue" class="input-text-lg number" /></td>
				</tr>
				<tr>
					<td>是否系统代码:</td>
					<%--<td><form:input id="isSys" path="isSys" class="input-text-lg required" /></td>--%>
					<td>
						<form:select id="isSys" path="isSys" class="input-text-lg required" >
							<c:forEach items="${listTCode}" var="listTCode">
								<form:option value="${listTCode.codeNo}">${listTCode.name}</form:option>
							</c:forEach>
						</form:select>
					</td>
				</tr>
				<tr>
					<td>参数属性:</td>
					<td><form:input id="codeAttr" path="codeAttr" class="input-text-lg " /> </td>
				</tr>
                <form:hidden path="createBy"/>
				<input name="createTime" class="hidden" value="<fmt:formatDate value="${tCode.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/>
				<tr>
					<td>是否有效:</td>
					<%--<td><form:input id="isFlag" path="isFlag" class="input-text-lg required" /></td>--%>
					<td>
						<form:select id="isFlag" path="isFlag" class="input-text-lg required" >
							<c:forEach items="${listTCode}" var="listTCode">
								<form:option value="${listTCode.codeNo}">${listTCode.name}</form:option>
							</c:forEach>
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
