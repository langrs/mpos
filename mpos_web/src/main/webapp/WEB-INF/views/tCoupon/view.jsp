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
					href="${contextPath}/tCoupon/edit.do?id=${tCoupon.id}">修改 </a> <a
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
						<td>券号：</td>
						<td><input class="input-text-lg2" name="couponNo"  value="${tCoupon.couponNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>发放渠道：</td>
						<td><input class="input-text-lg2" name="issueType"  value="${tCoupon.issueType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>发放流水：</td>
						<td><input class="input-text-lg2" name="issueNo"  value="${tCoupon.issueNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>发放时间：</td>
						<td><input class="input-text-lg2" name="issueTime"  value="<fmt:formatDate value="${tCoupon.issueTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>发放人：</td>
						<td><input class="input-text-lg2" name="issueMan"  value="${tCoupon.issueMan}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>发放组织ID：</td>
						<td><input class="input-text-lg2" name="issueOrg"  value="${tCoupon.issueOrg}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>券状态：</td>
						<td><input class="input-text-lg2" name="state"  value="${tCoupon.state}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>核销流水：</td>
						<td><input class="input-text-lg2" name="checkNo"  value="${tCoupon.checkNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>核销组织ID：</td>
						<td><input class="input-text-lg2" name="checkOrg"  value="${tCoupon.checkOrg}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>核销渠道：</td>
						<td><input class="input-text-lg2" name="checkType"  value="${tCoupon.checkType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>券类型：</td>
						<td><input class="input-text-lg2" name="couponType"  value="${tCoupon.couponType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>券有效期始：</td>
						<td><input class="input-text-lg2" name="startDate"  value="<fmt:formatDate value="${tCoupon.startDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>券有效期止：</td>
						<td><input class="input-text-lg2" name="endDate"  value="<fmt:formatDate value="${tCoupon.endDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tCoupon.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tCoupon.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tCoupon.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tCoupon.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tCoupon.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
