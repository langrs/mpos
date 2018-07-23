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
					href="${contextPath}/tCategory/edit.do?id=${tCategory.id}">修改 </a> <a
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
						<td>类别编码：</td>
						<td><input class="input-text-lg2" name="cateNo"  value="${tCategory.cateNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>类别名称：</td>
						<td><input class="input-text-lg2" name="name"  value="${tCategory.name}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>类别级别：</td>
						<td><input class="input-text-lg2" name="cateLevel"  value="${tCategory.cateLevel}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>父类ID：</td>
						<td><input class="input-text-lg2" name="parentId"  value="${tCategory.parentId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>分店：</td>
						<td><input class="input-text-lg2" name="shopId"  value="${tCategory.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>类别属性：</td>
						<td><input class="input-text-lg2" name="cateType"  value="${tCategory.cateType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tCategory.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tCategory.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tCategory.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tCategory.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tCategory.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
