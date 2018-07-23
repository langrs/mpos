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
					href="${contextPath}/tVipDisc/edit.do?id=${tVipDisc.id}">修改 </a> <a
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
						<td>会员等级：</td>
						<td><input class="input-text-lg2" name="vipClass"  value="${tVipDisc.vipClass}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>分店ID：</td>
						<td><input class="input-text-lg2" name="shopId"  value="${tVipDisc.shopId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>策略类型：</td>
						<td><input class="input-text-lg2" name="policyType"  value="${tVipDisc.policyType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>策略编码：</td>
						<td><input class="input-text-lg2" name="policyNo"  value="${tVipDisc.policyNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>策略ID：</td>
						<td><input class="input-text-lg2" name="policyId"  value="${tVipDisc.policyId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>打折率：</td>
						<td><input class="input-text-lg2" name="disccount"  value="${tVipDisc.disccount}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tVipDisc.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tVipDisc.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tVipDisc.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tVipDisc.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tVipDisc.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
