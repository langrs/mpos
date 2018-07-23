<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
		top.createDialogHtml("tStore","${contextPath}/tStore/list.do?dialog=true");
	top.createDialogHtml("tShop","${contextPath}/tShop/list.do?dialog=true");
</script>
</head>
<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
	</ol>
	<form:form id="dataForm" modelAttribute="tUser"
		action="${contextPath}/tUser/save.do" method="post" role="form">
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
							<td>用户编码:</td>
							<td>
								
								<form:input id="userNo" path="userNo"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>用户名称:</td>
							<td>
								
								<form:input id="name" path="name"
											class="input-text-lg required" />
								
							</td>
						</tr>
								<tr>
								<td>分店:</td>
								<form:hidden path="shopId" id="tShopId"/>
								<td><input value="${tUser.shopIdObj.name}" id="tShopId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tShopId').modal('show');" value="选择"></td>
							</tr>
								<tr>
								<td>商铺ID:</td>
								<form:hidden path="storeId" id="tStoreId"/>
								<td><input value="${tUser.storeIdObj.name}" id="tStoreId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tStoreId').modal('show');" value="选择"></td>
							</tr>
						<tr>
							<td>登录密码:</td>
							<td>
								
								<form:input id="passwd" path="passwd"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>部门:</td>
							<td>
								
								<form:input id="deptId" path="deptId"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>收银员类别:</td>
							<td>
								
								<form:input id="userType" path="userType"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>证件号码:</td>
							<td>
								
								<form:input id="idCard" path="idCard"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>联系电话:</td>
							<td>
								
								<form:input id="mobile" path="mobile"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>性别:</td>
							<td>
								
								<form:input id="sex" path="sex"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>状态:</td>
							<td>
								
								<form:input id="state" path="state"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>是否修改密码:</td>
							<td>
								
								<form:input id="isChangepw" path="isChangepw"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>权限级别:</td>
							<td>
								
								<form:input id="rightLevel" path="rightLevel"
											class="input-text-lg " />
								
							</td>
						</tr>
                                                       <form:hidden path="createBy"/>
							
                                                     <input name="createTime" class="hidden" value="<fmt:formatDate value="${tUser.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/>
							
						<tr>
							<td>是否有效:</td>
							<td>
								
								<form:input id="isFlag" path="isFlag"
											class="input-text-lg required" />
								
							</td>
						</tr>
				</tbody>
			</table>
		</div>
		</section>

	</form:form>


</body>
</html>
