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
			onclick="delete_check('${contextPath}/tCoupon/delete.do','listTable');">删除</button>
		<a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
			href="${contextPath}/tCoupon/add.do" target="mainIframe">新增</a>
	</ol>

	<form:form id="listForm" name="listForm" modelAttribute="tCoupon"
		action="${contextPath}/tCoupon/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
				<form:input class="query-input" path="couponNo" placeholder="券号" />
				<form:input class="query-input" path="issueType" placeholder="发放渠道" />
				<form:input class="query-input" path="issueNo" placeholder="发放流水" />
				<form:input class="query-input" path="issueMan" placeholder="发放人" />
				<form:input class="query-input" path="issueOrg" placeholder="发放组织ID" />
				<form:input class="query-input" path="state" placeholder="券状态" />
				<form:input class="query-input" path="checkNo" placeholder="核销流水" />
				<form:input class="query-input" path="checkOrg" placeholder="核销组织ID" />
				<form:input class="query-input" path="checkType" placeholder="核销渠道" />
				<form:input class="query-input" path="couponType" placeholder="券类型" />
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
					<th>券号</th>
					<th>发放渠道</th>
					<th>发放流水</th>
					<th>发放时间</th>
					<th>发放人</th>
					<th>发放组织ID</th>
					<th>券状态</th>
					<th>核销流水</th>
					<th>核销组织ID</th>
					<th>核销渠道</th>
					<th>券类型</th>
					<th>券有效期始</th>
					<th>券有效期止</th>
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
									 <td>${entity.couponNo}</td>
									 <td>${entity.issueType}</td>
									 <td>${entity.issueNo}</td>
									 <td><fmt:formatDate value="${entity.issueTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.issueMan}</td>
									 <td>${entity.issueOrg}</td>
									 <td>${entity.state}</td>
									 <td>${entity.checkNo}</td>
									 <td>${entity.checkOrg}</td>
									 <td>${entity.checkType}</td>
									 <td>${entity.couponType}</td>
									 <td><fmt:formatDate value="${entity.startDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td><fmt:formatDate value="${entity.endDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.createBy}</td>
									 <td><fmt:formatDate value="${entity.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.updateBy}</td>
									 <td><fmt:formatDate value="${entity.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.isFlag}</td>
                                                       <td><a href="${contextPath }/tCoupon/view.do?id=${entity.id}"
								style="margin-left: 0px;">查看</a><a
								href="${contextPath }/tCoupon/edit.do?id=${entity.id}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
