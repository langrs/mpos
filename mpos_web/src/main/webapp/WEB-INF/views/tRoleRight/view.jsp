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
					href="${contextPath}/tRoleRight/edit.do?id=${tRoleRight.id}">修改 </a> <a
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
						<td>角色：</td>
						<td><input class="input-text-lg2" name="roleId"  value="${tRoleRight.roleId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>权限：</td>
						<td><input class="input-text-lg2" name="rightId"  value="${tRoleRight.rightId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>分店：</td>
						<td><input class="input-text-lg2" name="shopId"  value="${tRoleRight.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tRoleRight.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tRoleRight.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tRoleRight.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tRoleRight.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tRoleRight.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
