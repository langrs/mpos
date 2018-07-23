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
					href="${contextPath}/tVipPoint/edit.do?id=${tVipPoint.id}">修改 </a> <a
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
						<td><input class="input-text-lg2" name="shopId"  value="${tVipPoint.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>会员等级：</td>
						<td><input class="input-text-lg2" name="vipClass"  value="${tVipPoint.vipClass}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>策略类型：</td>
						<td><input class="input-text-lg2" name="policyType"  value="${tVipPoint.policyType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>策略编码：</td>
						<td><input class="input-text-lg2" name="policyNo"  value="${tVipPoint.policyNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>策略ID：</td>
						<td><input class="input-text-lg2" name="policyId"  value="${tVipPoint.policyId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>策略名称：</td>
						<td><input class="input-text-lg2" name="name"  value="${tVipPoint.name}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>积分系数：</td>
						<td><input class="input-text-lg2" name="pointXs"  value="${tVipPoint.pointXs}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>积分倍数：</td>
						<td><input class="input-text-lg2" name="pointBs"  value="${tVipPoint.pointBs}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>多倍积分开始时间：</td>
						<td><input class="input-text-lg2" name="startdate"  value="<fmt:formatDate value="${tVipPoint.startdate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>多倍积分结束时间：</td>
						<td><input class="input-text-lg2" name="enddate"  value="<fmt:formatDate value="${tVipPoint.enddate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tVipPoint.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tVipPoint.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tVipPoint.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tVipPoint.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tVipPoint.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
