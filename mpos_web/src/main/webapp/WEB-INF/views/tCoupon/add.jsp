<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	</script>
</head>
<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
	</ol>
	<form:form id="dataForm" modelAttribute="tCoupon"
		action="${contextPath}/tCoupon/save.do" method="post" role="form">
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
							<td>券号:</td>
							<td>
								
								<form:input id="couponNo" path="couponNo"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>发放渠道:</td>
							<td>
								
								<form:input id="issueType" path="issueType"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>发放流水:</td>
							<td>
								
								<form:input id="issueNo" path="issueNo"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>发放时间:</td>
							<td>
								<div class="date-div-width input-group date o-a-form-date">
								<input class="input-text-lg" name="issueTime" value="<fmt:formatDate value="${tCoupon.issueTime}" pattern="yyyy-MM-dd HH:mm:ss" />">
								<span class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td>发放人:</td>
							<td>
								
								<form:input id="issueMan" path="issueMan"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>发放组织ID:</td>
							<td>
								
								<form:input id="issueOrg" path="issueOrg"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>券状态:</td>
							<td>
								
								<form:input id="state" path="state"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>核销流水:</td>
							<td>
								
								<form:input id="checkNo" path="checkNo"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>核销组织ID:</td>
							<td>
								
								<form:input id="checkOrg" path="checkOrg"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>核销渠道:</td>
							<td>
								
								<form:input id="checkType" path="checkType"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>券类型:</td>
							<td>
								
								<form:input id="couponType" path="couponType"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>券有效期始:</td>
							<td>
								<div class="date-div-width input-group date o-a-form-date">
								<input class="input-text-lg" name="startDate" value="<fmt:formatDate value="${tCoupon.startDate}" pattern="yyyy-MM-dd HH:mm:ss" />">
								<span class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td>券有效期止:</td>
							<td>
								<div class="date-div-width input-group date o-a-form-date">
								<input class="input-text-lg" name="endDate" value="<fmt:formatDate value="${tCoupon.endDate}" pattern="yyyy-MM-dd HH:mm:ss" />">
								<span class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span></span>
								</div>
							</td>
						</tr>
                                                       <form:hidden path="createBy"/>
							
                                                     <input name="createTime" class="hidden" value="<fmt:formatDate value="${tCoupon.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/>
							
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
