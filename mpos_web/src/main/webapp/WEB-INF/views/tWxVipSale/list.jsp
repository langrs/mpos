<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="${staticPath}/js/list.js"></script>
<script type="text/javascript">


</script>
<title>联合智云商业平台</title>
</head>
<body>

    <ol class="breadcrumb">
        <!-- <li>首页</li> -->
        <li>组织管理</li>
        <li>test</li>
        <li>test2</li>
        <button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
            onclick="delete_check('${contextPath}/tWxVipSale/delete.do','listTable');">删除</button>
        <a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
            href="${contextPath}/tWxVipSale/add.do" target="mainIframe">新增</a>
    </ol>
    <form:form id="listForm" name="listForm" modelAttribute="tWxVipSale"
        action="${contextPath}/tWxVipSale/list.do" method="get" class="form-inline">
        <div class="row">
            <form:input class="query-input" path="id" placeholder="" />
            <form:input class="query-input" path="openId" placeholder="" />
            <form:input class="query-input" path="saleId" placeholder="" />
            <form:input class="query-input" path="saleDate" placeholder="" />
            <form:input class="query-input" path="payAmt" placeholder="" />
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
    </form:form>

    <section class="row">
        <div class="col-sm-12">
            <table class="table table-striped  mgtop10" id="listTable">
                <thead>
                    <th><input id="allSelect" type="checkbox"></th> 
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th>操作</th>
                </thead>
                <tbody>                    
                    <c:forEach items="${list}" var="entity">
                        <tr onclick="setBox(this);">
                            <td><input name="singleCkb" type="checkbox" data-ckb-id="${entity.id}"></td>
                            <td>${entity.id}</td>                            
                            <td>${entity.openId}</td>                            
                            <td>${entity.saleId}</td>                            
                            <td><fmt:formatDate value="${entity.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td>${entity.payAmt}</td>                            
                            <td>
                            <a href="${contextPath}/tWxVipSale/view.do?id=${entity.id}" style="margin-left: 0px;">查看</a>
                            <a href="${contextPath}/tWxVipSale/edit.do?id=${entity.id}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </section>
</body>
</html>                    


