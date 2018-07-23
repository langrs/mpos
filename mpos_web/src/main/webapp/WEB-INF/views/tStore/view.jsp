<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>

<body>
	<ol class="breadcrumb">
		<li>基本资料</li>
		<li>商铺管理</li>
		<li class="active">详情</li>
	</ol>
	<section class="row">
		<div class="col-xs-8 col-md-8 pull-right">
			<div class="btn-box">
				<a type="button" class="btn btn-success btn-sm bing-btn-sm" href="${contextPath}/tStore/edit.do?id=${tStore.id}">修改 </a>
				<a type="button" href="${sessionScope.lastUrl }" class="btn btn-warning btn-sm bing-btn-sm">返回 </a>
			</div>
		</div>
	</section>	
	<section class="row">
		<div class="col-sm-12 col-md-12">
			<table cellspacing="0" cellpadding="0" class="maoye-table mgtop10">
				<tbody>
				<tr>
					<td>ID</td>
					<td><input class="input-text-lg2" name="id"  value="${tStore.id}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>商铺编码</td>
					<td><input class="input-text-lg2" name="storeNo"  value="${tStore.storeNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>商铺名称</td>
					<td><input class="input-text-lg2" name="name"  value="${tStore.name}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>所属分店</td>
					<td><input class="input-text-lg2" name="shopId"  value="${tStore.shopId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>面积</td>
					<td><input class="input-text-lg2" name="area"  value="${tStore.area}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>楼层</td>
					<td><input class="input-text-lg2" name="floor"  value="${tStore.floor}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>收银方式</td>
					<td><input class="input-text-lg2" name="collectType"  value="${tStore.collectType}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>商铺类型</td>
					<td><input class="input-text-lg2" name="storeType"  value="${tStore.storeType}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>品牌ID</td>
					<td><input class="input-text-lg2" name="brandId"  value="${tStore.brandId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>创建人</td>
					<td><input class="input-text-lg2" name="createBy"  value="${tStore.createBy}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>创建日期</td>
					<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tStore.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>最后修改人</td>
					<td><input class="input-text-lg2" name="updateBy"  value="${tStore.updateBy}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>最后修改日期</td>
					<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tStore.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>是否有效</td>
					<td><input class="input-text-lg2" name="isFlag"  value="${tStore.isFlag}"  disabled="disabled"></td>
				</tr>	
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>				
