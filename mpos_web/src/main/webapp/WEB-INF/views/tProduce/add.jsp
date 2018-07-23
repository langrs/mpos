<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
		top.createDialogHtml("tCategory","${contextPath}/tCategory/list.do?dialog=true");
	top.createDialogHtml("tCompany","${contextPath}/tCompany/list.do?dialog=true");
	top.createDialogHtml("tShop","${contextPath}/tShop/list.do?dialog=true");
	top.createDialogHtml("tStore","${contextPath}/tStore/list.do?dialog=true");
	top.createDialogHtml("tBrand","${contextPath}/tBrand/list.do?dialog=true");
</script>
</head>
<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
	</ol>
	<form:form id="dataForm" modelAttribute="tProduce"
		action="${contextPath}/tProduce/save.do" method="post" role="form">
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
							<td>商品编码:</td>
							<td>
								
								<form:input id="itemNo" path="itemNo"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>英文名称:</td>
							<td>
								
								<form:input id="itemEname" path="itemEname"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>商品名称:</td>
							<td>
								
								<form:input id="name" path="name"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>商品内码:</td>
							<td>
								
								<form:input id="itemSubno" path="itemSubno"
											class="input-text-lg " />
								
							</td>
						</tr>
								<tr>
								<td>商铺:</td>
								<form:hidden path="storeId" id="tStoreId"/>
								<td><input value="${tProduce.storeIdObj.name}" id="tStoreId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tStoreId').modal('show');" value="选择"></td>
							</tr>
								<tr>
								<td>公司ID:</td>
								<form:hidden path="companyId" id="tCompanyId"/>
								<td><input value="${tProduce.companyIdObj.name}" id="tCompanyId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tCompanyId').modal('show');" value="选择"></td>
							</tr>
								<tr>
								<td>分店:</td>
								<form:hidden path="shopId" id="tShopId"/>
								<td><input value="${tProduce.shopIdObj.name}" id="tShopId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tShopId').modal('show');" value="选择"></td>
							</tr>
								<tr>
								<td>类别:</td>
								<form:hidden path="categoryId" id="tCategoryId"/>
								<td><input value="${tProduce.categoryIdObj.name}" id="tCategoryId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tCategoryId').modal('show');" value="选择"></td>
							</tr>
								<tr>
								<td>品牌:</td>
								<form:hidden path="brandId" id="tBrandId"/>
								<td><input value="${tProduce.brandIdObj.name}" id="tBrandId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tBrandId').modal('show');" value="选择"></td>
							</tr>
						<tr>
							<td>型号:</td>
							<td>
								
								<form:input id="model" path="model"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>颜色码:</td>
							<td>
								
								<form:input id="itemColor" path="itemColor"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>尺码:</td>
							<td>
								
								<form:input id="itemSize" path="itemSize"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>产地:</td>
							<td>
								
								<form:input id="produceArea" path="produceArea"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>单位:</td>
							<td>
								
								<form:input id="itemUnit" path="itemUnit"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>售价:</td>
							<td>
								
								<form:input id="salePrice" path="salePrice"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>定价商品:</td>
							<td>
								
								<form:input id="isPrice" path="isPrice"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>商品属性:</td>
							<td>
								
								<form:input id="itemAttr" path="itemAttr"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>商品状态:</td>
							<td>
								
								<form:input id="state" path="state"
											class="input-text-lg " />
								
							</td>
						</tr>
                                                       <form:hidden path="createBy"/>
							
                                                     <input name="createTime" class="hidden" value="<fmt:formatDate value="${tProduce.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/>
							
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
