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
					href="${contextPath}/tCouponType/edit.do?id=${tCouponType.id}">修改 </a> <a
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
						<td>分店ID：</td>
						<td><input class="input-text-lg2" name="shopId"  value="${tCouponType.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>类别编号：</td>
						<td><input class="input-text-lg2" name="typeNo"  value="${tCouponType.typeNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>类别名称：</td>
						<td><input class="input-text-lg2" name="name"  value="${tCouponType.name}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>券面值：</td>
						<td><input class="input-text-lg2" name="value"  value="${tCouponType.value}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>允许找零：</td>
						<td><input class="input-text-lg2" name="isChange"  value="${tCouponType.isChange}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>有效期值：</td>
						<td><input class="input-text-lg2" name="validNum"  value="${tCouponType.validNum}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>日期单位：</td>
						<td><input class="input-text-lg2" name="validUnit"  value="${tCouponType.validUnit}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>限用买满金额：</td>
						<td><input class="input-text-lg2" name="limitAmount"  value="${tCouponType.limitAmount}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>限用张数：</td>
						<td><input class="input-text-lg2" name="limitNum"  value="${tCouponType.limitNum}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>特价不参与：</td>
						<td><input class="input-text-lg2" name="isProm"  value="${tCouponType.isProm}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tCouponType.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tCouponType.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tCouponType.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tCouponType.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tCouponType.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
