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
	<form:form id="dataForm" modelAttribute="tCustInfo"
		action="${contextPath}/tCustInfo/save.do" method="post" role="form">
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
							<td>微信号:</td>
							<td>
								
								<form:input id="openId" path="openId"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>实体卡号:</td>
							<td>
								
								<form:input id="cardNo" path="cardNo"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>顾客名称:</td>
							<td>
								
								<form:input id="custName" path="custName"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>顾客电话:</td>
							<td>
								
								<form:input id="custPhone" path="custPhone"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>顾客地址:</td>
							<td>
								
								<form:input id="custAddr" path="custAddr"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>顾客邮箱:</td>
							<td>
								
								<form:input id="custEmail" path="custEmail"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>顾客性别:</td>
							<td>
								
								<form:input id="custSex" path="custSex"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>顾客来源:</td>
							<td>
								
								<form:input id="custSrc" path="custSrc"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>顾客区域:</td>
							<td>
								
								<form:input id="custRegion" path="custRegion"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>最后消费日期:</td>
							<td>
								<div class="date-div-width input-group date o-a-form-date">
								<input class="input-text-lg" name="lastDate" value="<fmt:formatDate value="${tCustInfo.lastDate}" pattern="yyyy-MM-dd HH:mm:ss" />">
								<span class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td>最后消费金额:</td>
							<td>
								
								<form:input id="lastAmt" path="lastAmt"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>总消费金额:</td>
							<td>
								
								<form:input id="allAmt" path="allAmt"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>顾客积分:</td>
							<td>
								
								<form:input id="custPoints" path="custPoints"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>顾客生日:</td>
							<td>
								<div class="date-div-width input-group date o-a-form-date">
								<input class="input-text-lg" name="custBirth" value="<fmt:formatDate value="${tCustInfo.custBirth}" pattern="yyyy-MM-dd HH:mm:ss" />">
								<span class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span></span>
								</div>
							</td>
						</tr>
				</tbody>
			</table>
		</div>
		</section>

	</form:form>


</body>
</html>
