<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="${staticPath}/js/list.js"></script>
<title>运营服务支撑平台</title>
</head>
<body>

	<ol class="breadcrumb">
		<!-- <li>首页</li> -->
		<li>系统维护</li>
		<li>数据字典</li>
		<li>查看</li>
		<button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
			onclick="delete_check('${contextPath}/tCode/delete.do','listTable');">删除</button>
		<a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
			href="${contextPath}/tCode/add.do" target="mainIframe">新增</a>
	</ol>

	<form:form id="listForm" name="listForm" modelAttribute="tCode"
		action="${contextPath}/tCode/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="codeType" placeholder="参数类别" />
				<form:input class="query-input" path="codeDesc" placeholder="参数描述" />
				<form:input class="query-input" path="name" placeholder="代码名称" />
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					<th><input id="allSelect" type="checkbox"></th>   
					<th>参数类别</th>
					<th>参数描述</th>
					<th>代码编码</th>
					<th>代码名称</th>
					<th>代码值</th>
					<th>是否系统代码</th>
					<th>参数属性</th>
					<th>是否有效</th>
					<th>操作</th>
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr onclick="setBox(this);">
							<td><input name="singleCkb" type="checkbox"
									data-ckb-id="${entity.id}"></td>
									 <td>${entity.codeType}</td>
									 <td>${entity.codeDesc}</td>
									 <td>${entity.codeNo}</td>
									 <td>${entity.name}</td>
									 <td>${entity.codeValue}</td>
									<%--<td>${entity.isSys}</td>--%>
									<td>
											<c:forEach items="${listTCode}" var="listTCode">
												<c:if test="${listTCode.codeType == '0002' and listTCode.codeNo == entity.isSys}">
													${listTCode.name}
												</c:if>
											</c:forEach>
									</td>
							<td>${entity.codeAttr}</td>
							<%--<td>${entity.isFlag}</td>--%>
							<td>
								<c:forEach items="${listTCode}" var="listTCode">
									<c:if test="${listTCode.codeType == '0002' and listTCode.codeNo == entity.isFlag}">
										${listTCode.name}
									</c:if>
								</c:forEach>
							</td>
							<td><a href="${contextPath }/tCode/view.do?id=${entity.id}"
								style="margin-left: 0px;">查看</a><a
								href="${contextPath }/tCode/edit.do?id=${entity.id}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
