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
	<form:form id="dataForm" modelAttribute="tVipDisc"
		action="${contextPath}/tVipDisc/save.do" method="post" role="form">
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
							<td>会员等级:</td>
							<td>
								
								<form:input id="vipClass" path="vipClass"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>分店ID:</td>
							<td>
								
								<form:input id="shopId" path="shopId"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>策略类型:</td>
							<td>
								
								<form:input id="policyType" path="policyType"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>策略编码:</td>
							<td>
								
								<form:input id="policyNo" path="policyNo"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>策略ID:</td>
							<td>
								
								<form:input id="policyId" path="policyId"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>打折率:</td>
							<td>
								
								<form:input id="disccount" path="disccount"
											class="input-text-lg number" />
								
							</td>
						</tr>
                                                       <form:hidden path="createBy"/>
							
                                                     <input name="createTime" class="hidden" value="<fmt:formatDate value="${tVipDisc.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/>
							
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
