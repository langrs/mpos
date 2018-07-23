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
					href="${contextPath}/tProduce/edit.do?id=${tProduce.id}">修改 </a> <a
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
						<td>商品编码：</td>
						<td><input class="input-text-lg2" name="itemNo"  value="${tProduce.itemNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>英文名称：</td>
						<td><input class="input-text-lg2" name="itemEname"  value="${tProduce.itemEname}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商品名称：</td>
						<td><input class="input-text-lg2" name="name"  value="${tProduce.name}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商品内码：</td>
						<td><input class="input-text-lg2" name="itemSubno"  value="${tProduce.itemSubno}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商铺：</td>
						<td><input class="input-text-lg2" name="storeId"  value="${tProduce.storeId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>公司ID：</td>
						<td><input class="input-text-lg2" name="companyId"  value="${tProduce.companyId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>分店：</td>
						<td><input class="input-text-lg2" name="shopId"  value="${tProduce.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>类别：</td>
						<td><input class="input-text-lg2" name="categoryId"  value="${tProduce.categoryId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>品牌：</td>
						<td><input class="input-text-lg2" name="brandId"  value="${tProduce.brandId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>型号：</td>
						<td><input class="input-text-lg2" name="model"  value="${tProduce.model}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>颜色码：</td>
						<td><input class="input-text-lg2" name="itemColor"  value="${tProduce.itemColor}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>尺码：</td>
						<td><input class="input-text-lg2" name="itemSize"  value="${tProduce.itemSize}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>产地：</td>
						<td><input class="input-text-lg2" name="produceArea"  value="${tProduce.produceArea}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>单位：</td>
						<td><input class="input-text-lg2" name="itemUnit"  value="${tProduce.itemUnit}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>售价：</td>
						<td><input class="input-text-lg2" name="salePrice"  value="${tProduce.salePrice}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>定价商品：</td>
						<td><input class="input-text-lg2" name="isPrice"  value="${tProduce.isPrice}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商品属性：</td>
						<td><input class="input-text-lg2" name="itemAttr"  value="${tProduce.itemAttr}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>商品状态：</td>
						<td><input class="input-text-lg2" name="state"  value="${tProduce.state}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tProduce.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tProduce.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tProduce.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tProduce.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tProduce.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
