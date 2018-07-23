<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	top.createDialogHtml("tShop","${contextPath}/tShop/list.do?dialog=true");	
</script>
</head>
<body>
	<ol class="breadcrumb">
		<li>基本资料</li>
		<li>商铺管理</li>
	</ol>
	<form:form id="dataForm" modelAttribute="tStore"
		action="${contextPath}/tStore/save.do" method="post" role="form">
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
						<td>商铺编码</td>					
						<td><form:input id="storeNo" path="storeNo" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>商铺名称</td>					
						<td><form:input id="name" path="name" class="input-text-lg required" /></td>
						</tr>
						<tr>
						<td>所属分店</td>					
							<form:hidden path="shopId" id="tShopId"/>
								<td><input value="${tStore.shopIdObj.name}" id="tShopId_name"
								class="input-text-md " readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tShopId').modal('show');" value="选择"></td>							
						</tr>					
						<tr>
						<td>面积</td>					
						<td><form:input id="area" path="area" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>楼层</td>					
						<td><form:input id="floor" path="floor" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>收银方式</td>					
						<td><form:input id="collectType" path="collectType" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>商铺类型</td>					
						<td><form:input id="storeType" path="storeType" class="input-text-lg " /></td>
						</tr>					
						<tr>
						<td>品牌ID</td>					
						<td><form:input id="brandId" path="brandId" class="input-text-lg " /></td>
						</tr>					
						<form:hidden path="createBy"/>
						<input name="createTime" class="hidden" value="<fmt:formatDate value="${tStore.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/>
						<tr>
						<td>是否有效</td>					
						<td><form:input id="isFlag" path="isFlag" class="input-text-lg required" /></td>
						</tr>					
				</tbody>
			</table>
		</div>
		</section>

	</form:form>


</body>
</html>					