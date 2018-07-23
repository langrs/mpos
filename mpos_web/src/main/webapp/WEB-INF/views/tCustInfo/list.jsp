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
			onclick="delete_check('${contextPath}/tCustInfo/delete.do','listTable');">删除</button>
		<a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
			href="${contextPath}/tCustInfo/add.do" target="mainIframe">新增</a>
	</ol>

	<form:form id="listForm" name="listForm" modelAttribute="tCustInfo"
		action="${contextPath}/tCustInfo/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
				<form:input class="query-input" path="openId" placeholder="微信号" />
				<form:input class="query-input" path="cardNo" placeholder="实体卡号" />
				<form:input class="query-input" path="custName" placeholder="顾客名称" />
				<form:input class="query-input" path="custPhone" placeholder="顾客电话" />
				<form:input class="query-input" path="custAddr" placeholder="顾客地址" />
				<form:input class="query-input" path="custEmail" placeholder="顾客邮箱" />
				<form:input class="query-input" path="custSex" placeholder="顾客性别" />
				<form:input class="query-input" path="custSrc" placeholder="顾客来源" />
				<form:input class="query-input" path="custRegion" placeholder="顾客区域" />
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					<th><input id="allSelect" type="checkbox"></th>   
					<th>ID</th>
					<th>微信号</th>
					<th>实体卡号</th>
					<th>顾客名称</th>
					<th>顾客电话</th>
					<th>顾客地址</th>
					<th>顾客邮箱</th>
					<th>顾客性别</th>
					<th>顾客来源</th>
					<th>顾客区域</th>
					<th>最后消费日期</th>
					<th>最后消费金额</th>
					<th>总消费金额</th>
					<th>顾客积分</th>
					<th>顾客生日</th>
					<th>操作</th>
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr onclick="setBox(this);">
							<td><input name="singleCkb" type="checkbox"
									data-ckb-id="${entity.id}"></td>
									 <td>${entity.id}</td>
									 <td>${entity.openId}</td>
									 <td>${entity.cardNo}</td>
									 <td>${entity.custName}</td>
									 <td>${entity.custPhone}</td>
									 <td>${entity.custAddr}</td>
									 <td>${entity.custEmail}</td>
									 <td>${entity.custSex}</td>
									 <td>${entity.custSrc}</td>
									 <td>${entity.custRegion}</td>
									 <td><fmt:formatDate value="${entity.lastDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.lastAmt}</td>
									 <td>${entity.allAmt}</td>
									 <td>${entity.custPoints}</td>
									 <td><fmt:formatDate value="${entity.custBirth}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                                                       <td><a href="${contextPath }/tCustInfo/view.do?id=${entity.id}"
								style="margin-left: 0px;">查看</a><a
								href="${contextPath }/tCustInfo/edit.do?id=${entity.id}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
