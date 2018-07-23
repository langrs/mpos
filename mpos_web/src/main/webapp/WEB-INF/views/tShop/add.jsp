<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	top.createDialogHtml("tCompany","${contextPath}/tCompany/list.do?dialog=true");	
	top.createDialogHtml("tRegion","${contextPath}/tRegion/list.do?dialog=true");	
</script>
</head>
<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
	</ol>
	<form:form id="dataForm" modelAttribute="tShop"
		action="${contextPath}/tShop/save.do" method="post" role="form">
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
						<td>公司ID</td>					
							<form:hidden path="companyId" id="tCompanyId"/>
								<td><input value="${tShop.companyIdObj.name}" id="tCompanyId_name"
								class="input-text-md " readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tCompanyId').modal('show');" value="选择"></td>							
						</tr>					
						<tr>
						<td>分店编码</td>					
						<td><form:input id="shopNo" path="shopNo" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>分店名称</td>					
						<td><form:input id="name" path="name" class="input-text-lg required" /></td>
						</tr>					
						<tr>
						<td>区域</td>					
							<form:hidden path="regionId" id="tRegionId"/>
								<td><input value="${tShop.regionIdObj.name}" id="tRegionId_name"
								class="input-text-md " readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tRegionId').modal('show');" value="选择"></td>							
						</tr>					
						<tr>
						<td>分店描述</td>					
						<td><form:input id="descr" path="descr" class="input-text-lg " /></td>
						</tr>					
						<form:hidden path="createBy"/>
						<input name="createTime" class="hidden" value="<fmt:formatDate value="${tShop.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/>
						<tr>
						<td>是否有效</td>					
						<td><form:input id="isFlag" path="isFlag" class="input-text-lg required" /></td>
						</tr>					
				</tbody>
			</table>
		</div>
		</section>

	</form:form>


</body>
</html>					