<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
		top.createDialogHtml("tShop","${contextPath}/tShop/list.do?dialog=true");
</script>
</head>
<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
	</ol>
	<form:form id="dataForm" modelAttribute="tCouponType"
		action="${contextPath}/tCouponType/save.do" method="post" role="form">
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
								<td>分店ID:</td>
								<form:hidden path="shopId" id="tShopId"/>
								<td><input value="${tCouponType.shopIdObj.name}" id="tShopId_name"
								class="input-text-md required" readonly="readonly" />
								<input type="button"
								class="btn btn-success btn-sm bing-btn-sm"
								onclick="top.$('#tShopId').modal('show');" value="选择"></td>
							</tr>
						<tr>
							<td>类别编号:</td>
							<td>
								
								<form:input id="typeNo" path="typeNo"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>类别名称:</td>
							<td>
								
								<form:input id="name" path="name"
											class="input-text-lg required" />
								
							</td>
						</tr>
						<tr>
							<td>券面值:</td>
							<td>
								
								<form:input id="value" path="value"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>允许找零:</td>
							<td>
								
								<form:input id="isChange" path="isChange"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>有效期值:</td>
							<td>
								
								<form:input id="validNum" path="validNum"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>日期单位:</td>
							<td>
								
								<form:input id="validUnit" path="validUnit"
											class="input-text-lg " />
								
							</td>
						</tr>
						<tr>
							<td>限用买满金额:</td>
							<td>
								
								<form:input id="limitAmount" path="limitAmount"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>限用张数:</td>
							<td>
								
								<form:input id="limitNum" path="limitNum"
											class="input-text-lg number" />
								
							</td>
						</tr>
						<tr>
							<td>特价不参与:</td>
							<td>
								
								<form:input id="isProm" path="isProm"
											class="input-text-lg " />
								
							</td>
						</tr>
                                                       <form:hidden path="createBy"/>
							
                                                     <input name="createTime" class="hidden" value="<fmt:formatDate value="${tCouponType.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/>
							
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
