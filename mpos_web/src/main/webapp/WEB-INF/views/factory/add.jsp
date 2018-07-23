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
	<form:form id="dataForm" modelAttribute="factory"
		action="${contextPath}/factory/save.do" method="post" role="form">
		<form:hidden path="id"/>
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
							<td>厂家名字:</td>
							<td>
								
								<form:input id="name" path="name"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>厂家详细地址:</td>
							<td>
								
								<form:input id="address" path="address"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>电话号码:</td>
							<td>
								
								<form:input id="tel" path="tel"
											class="input-text-lg " />
								
							</td>
						</tr>
				</tbody>
			</table>
		</div>
		</section>

	</form:form>


</body>
</html>
