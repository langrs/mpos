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
					href="${contextPath}/tUser/edit.do?id=${tUser.id}">修改 </a> <a
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
						<td>用户编码：</td>
						<td><input class="input-text-lg2" name="userNo"  value="${tUser.userNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>用户名称：</td>
						<td><input class="input-text-lg2" name="name"  value="${tUser.name}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>分店：</td>
						<td><input class="input-text-lg2" name="shopId"  value="${tUser.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商铺ID：</td>
						<td><input class="input-text-lg2" name="storeId"  value="${tUser.storeId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>登录密码：</td>
						<td><input class="input-text-lg2" name="passwd"  value="${tUser.passwd}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>部门：</td>
						<td><input class="input-text-lg2" name="deptId"  value="${tUser.deptId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>收银员类别：</td>
						<td><input class="input-text-lg2" name="userType"  value="${tUser.userType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>证件号码：</td>
						<td><input class="input-text-lg2" name="idCard"  value="${tUser.idCard}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>联系电话：</td>
						<td><input class="input-text-lg2" name="mobile"  value="${tUser.mobile}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>性别：</td>
						<td><input class="input-text-lg2" name="sex"  value="${tUser.sex}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>状态：</td>
						<td><input class="input-text-lg2" name="state"  value="${tUser.state}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否修改密码：</td>
						<td><input class="input-text-lg2" name="isChangepw"  value="${tUser.isChangepw}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>权限级别：</td>
						<td><input class="input-text-lg2" name="rightLevel"  value="${tUser.rightLevel}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tUser.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tUser.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tUser.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tUser.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tUser.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
