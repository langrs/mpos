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
					href="${contextPath}/tParm/edit.do?id=${tParm.id}">修改 </a> <a
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
						<td>参数编码：</td>
						<td><input class="input-text-lg2" name="parmNo"  value="${tParm.parmNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>参数名称：</td>
						<td><input class="input-text-lg2" name="name"  value="${tParm.name}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>参数值：</td>
						<td><input class="input-text-lg2" name="parmVal"  value="${tParm.parmVal}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否系统参数：</td>
						<td><input class="input-text-lg2" name="isSys"  value="${tParm.isSys}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>分店ID：</td>
						<td><input class="input-text-lg2" name="shopId"  value="${tParm.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tParm.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tParm.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tParm.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tParm.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tParm.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
