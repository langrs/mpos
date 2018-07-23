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
					href="${contextPath}/tCouponPush/edit.do?id=${tCouponPush.id}">修改 </a> <a
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
						<td>券类别：</td>
						<td><input class="input-text-lg2" name="couponType"  value="${tCouponPush.couponType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>推送分类：</td>
						<td><input class="input-text-lg2" name="pushLb"  value="${tCouponPush.pushLb}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>推送金额：</td>
						<td><input class="input-text-lg2" name="pushAmt"  value="${tCouponPush.pushAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>推送张数：</td>
						<td><input class="input-text-lg2" name="pushNum"  value="${tCouponPush.pushNum}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>推送类别：</td>
						<td><input class="input-text-lg2" name="pushType"  value="${tCouponPush.pushType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>推送内容：</td>
						<td><input class="input-text-lg2" name="pushContent"  value="${tCouponPush.pushContent}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tCouponPush.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tCouponPush.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tCouponPush.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tCouponPush.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tCouponPush.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
