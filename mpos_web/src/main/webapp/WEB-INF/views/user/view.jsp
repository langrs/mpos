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
					href="${contextPath}/user/edit.do?id=${user.id}">修改 </a> <a
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
						<td>name_：</td>
						<td><input class="input-text-lg2" name="name"  value="${user.name}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>用户登录名：</td>
						<td><input class="input-text-lg2" name="userNo"  value="${user.userNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>pass_wd_：</td>
						<td><input class="input-text-lg2" name="passWd"  value="${user.passWd}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>create_date_：</td>
						<td><input class="input-text-lg2" name="createDate"  value="<fmt:formatDate value="${user.createDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
