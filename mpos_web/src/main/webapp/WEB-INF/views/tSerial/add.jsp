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
	<form:form id="dataForm" modelAttribute="tSerial"
		action="${contextPath}/tSerial/save.do" method="post" role="form">
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
							<td>编码名称:</td>
							<td>
								
								<form:input id="name" path="name"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>系统代号:</td>
							<td>
								
								<form:input id="serialType" path="serialType"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>流水位数:</td>
							<td>
								
								<form:input id="serialLength" path="serialLength"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>编号长度:</td>
							<td>
								
								<form:input id="serialLong" path="serialLong"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>机构代码:</td>
							<td>
								
								<form:input id="isOrg" path="isOrg"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>日期格式:</td>
							<td>
								
								<form:input id="dateFormate" path="dateFormate"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>当前流水:</td>
							<td>
								
								<form:input id="serialNum" path="serialNum"
											class="input-text-lg number" />
								
							</td>
						</tr>
                                                       <form:hidden path="createBy"/>
							
                                                     <input name="createTime" class="hidden" value="<fmt:formatDate value="${tSerial.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/>
							
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
