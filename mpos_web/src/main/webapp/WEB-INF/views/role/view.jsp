<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<head>
<script src="${staticPath}/js/roleAdd.js"></script> 
</head>
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
					href="${contextPath}/role/edit.do?id=${role.id}">修改 </a> <a
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
						<td>角色名：</td>
						<td><input class="input-text-lg2" name="name"
							value="${role.name}" disabled="disabled"></td>
					</tr>
					<tr>
						<td>状态：</td>
						<td><input class="input-text-lg2" name="status"
							value="${role.status}" disabled="disabled"></td>
					</tr>
				</tbody>
			</table>


			<p style="margin-bottom: 0; margin-top: 20px;">权限分配：</p>
			<div class="maoye-nav" style="overflow: auto;">
				<c:forEach items="${list }" var="nav">
					<div class="media-body maoye-mbody">
						<h4 class="media-heading">
							<div class="checkbox m-checkbox mgtop0">
								<div class="pull-left">
									<i class="fl"><input type="checkbox"
										onclick="checkAll(this,1);"
										<c:if test="${nav.isCheck==1 }">checked="checked"</c:if>></i>
									<span class="fl" onclick="openDiv(this,1);">${nav.name }</span>
								</div>
							</div>
						</h4>
						<c:forEach items="${nav.chirldList }" var="chNav">
							<div class="media maoye-media"
								style="display: none; margin-left: 20px;">

								<div class="media-body">
									<h4 class="media-heading">
										<div class="checkbox m-checkbox mgtop0">
											<div class="pull-left">
												<i class="fl"><input type="checkbox"
													onclick="checkAll(this,2);"
													<c:if test="${chNav.isCheck==1 }">checked="checked"</c:if>></i>
												<span class="fl" onclick="openDiv(this,2);">${chNav.name }</span>
											</div>
										</div>
									</h4>
									<section class="maoye-checkbox" style="display: none;">
										<c:forEach items="${chNav.authResList }" var="res">
											<label style="width: 20%;"> <input type="checkbox"
												value="${res.id }" name="permIds"
												<c:if test="${res.isCheck==1 }">checked="checked"</c:if>>
												${res.name }
											</label>
										&nbsp; 
									</c:forEach>
										<label style="width: 20%;"> </label>
									</section>
								</div>
							</div>
						</c:forEach>
					</div>
				</c:forEach>
			</div>
		</div>




		</div>
	</section>

</body>
</html>
