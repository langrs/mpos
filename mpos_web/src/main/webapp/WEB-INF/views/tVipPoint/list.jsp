<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="${staticPath}/js/list.js"></script>
<script type="text/javascript">


</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	<ol class="breadcrumb">
		<!-- <li>首页</li> -->
		<li>组织管理</li>
		<li>test</li>
		<li>test2</li>
		<button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
			onclick="delete_check('${contextPath}/tVipPoint/delete.do','listTable');">删除</button>
		<a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
			href="${contextPath}/tVipPoint/add.do" target="mainIframe">新增</a>
	</ol>

	<form:form id="listForm" name="listForm" modelAttribute="tVipPoint"
		action="${contextPath}/tVipPoint/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
				<form:input class="query-input" path="shopId" placeholder="分店ID" />
				<form:input class="query-input" path="vipClass" placeholder="会员等级" />
				<form:input class="query-input" path="policyType" placeholder="策略类型" />
				<form:input class="query-input" path="policyNo" placeholder="策略编码" />
				<form:input class="query-input" path="policyId" placeholder="策略ID" />
				<form:input class="query-input" path="name" placeholder="策略名称" />
				<form:input class="query-input" path="createBy" placeholder="创建人" />
				<form:input class="query-input" path="updateBy" placeholder="最后修改人" />
				<form:input class="query-input" path="isFlag" placeholder="是否有效" />
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					<th><input id="allSelect" type="checkbox"></th>   
					<th>ID</th>
					<th>分店ID</th>
					<th>会员等级</th>
					<th>策略类型</th>
					<th>策略编码</th>
					<th>策略ID</th>
					<th>策略名称</th>
					<th>积分系数</th>
					<th>积分倍数</th>
					<th>多倍积分开始时间</th>
					<th>多倍积分结束时间</th>
					<th>创建人</th>
					<th>创建日期</th>
					<th>最后修改人</th>
					<th>最后修改日期</th>
					<th>是否有效</th>
					<th>操作</th>
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr onclick="setBox(this);">
							<td><input name="singleCkb" type="checkbox"
									data-ckb-id="${entity.id}"></td>
									 <td>${entity.id}</td>
									 <td>${entity.shopId}</td>
									 <td>${entity.vipClass}</td>
									 <td>${entity.policyType}</td>
									 <td>${entity.policyNo}</td>
									 <td>${entity.policyId}</td>
									 <td>${entity.name}</td>
									 <td>${entity.pointXs}</td>
									 <td>${entity.pointBs}</td>
									 <td><fmt:formatDate value="${entity.startdate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td><fmt:formatDate value="${entity.enddate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.createBy}</td>
									 <td><fmt:formatDate value="${entity.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.updateBy}</td>
									 <td><fmt:formatDate value="${entity.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.isFlag}</td>
                                                       <td><a href="${contextPath }/tVipPoint/view.do?id=${entity.id}"
								style="margin-left: 0px;">查看</a><a
								href="${contextPath }/tVipPoint/edit.do?id=${entity.id}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
