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
		<li>销售查询</li>
		<li>销售单</li>
		<li>查看</li>
	</ol>

<form:form id="listForm" name="listForm" modelAttribute="tSale"
action="${contextPath}/tSale/list.do" method="get" class="form-inline">
<div class="row">
    <form:input class="query-input" path="saleNo" placeholder="销售流水号" />
    <form:input class="query-input" path="userId" placeholder="收银员ID" />
    <form:input class="query-input" path="sSaleNo" placeholder="原流水号" />
    <form:input class="query-input" path="dealType" placeholder="交易类型" />
    <form:input class="query-input" path="saleSource" placeholder="销售来源" />
    <form:input class="query-input" path="saleType" placeholder="销售单类型" />
    <form:input class="query-input" path="shopId" placeholder="分店" />
    <form:input class="query-input" path="posId" placeholder="终端" />
<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
</div>
</form:form>

<section class="row">
<div class="col-sm-12">
<table class="table table-striped  mgtop10" id="listTable">
    <thead>
        <th><input id="allSelect" type="checkbox"></th>
        <th>销售流水号</th>
        <th>销售日期</th>
        <th>收银员ID</th>
        <%--<th>原流水号</th>--%>
        <th>交易类型</th>
        <th>销售单类型</th>
        <th>分店</th>
        <th>终端</th>
        <th>应收金额</th>
        <th>实收金额</th>
        <th>折扣金额</th>
        <th>操作</th>

    </thead>
    <tbody>
        <c:forEach items="${list}" var="entity">
            <tr onclick="setBox(this);">
                <td><input name="singleCkb" type="checkbox"
                        data-ckb-id="${entity.id}"></td>
                         <td>${entity.saleNo}</td>
                         <td><fmt:formatDate value="${entity.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                         <td>${entity.userId}</td>
                         <%--<td>${entity.sSaleNo}</td>--%>
                         <td>${entity.dealType}</td>
                         <td>${entity.saleType}</td>
                         <td>${entity.shopId}</td>
                         <td>${entity.posId}</td>
                         <td>${entity.saleAmt}</td>
                         <td>${entity.payAmt}</td>
                         <td>${entity.discAmt}</td>
                                           <td><a href="${contextPath }/tSale/view.do?id=${entity.id}"
                    style="margin-left: 0px;">查看</a><a
                    href="${contextPath }/tSale/edit.do?id=${entity.id}">修改</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</div>
</section>
</body>
</html>
