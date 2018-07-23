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
        <li>基本资料</li>
        <li>分店管理</li>
        <li>查看</li>
        <button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
            onclick="delete_check('${contextPath}/tShop/delete.do','listTable');">删除</button>
        <a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
            href="${contextPath}/tShop/add.do" target="mainIframe">新增</a>
    </ol>
    <form:form id="listForm" name="listForm" modelAttribute="tShop"
        action="${contextPath}/tShop/list.do" method="get" class="form-inline">
        <div class="row">
            <form:input class="query-input" path="companyId" placeholder="公司ID" />
            <form:input class="query-input" path="shopNo" placeholder="分店编码" />
            <form:input class="query-input" path="name" placeholder="分店名称" />
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
    </form:form>

    <section class="row">
        <div class="col-sm-12">
            <table class="table table-striped  mgtop10" id="listTable">
                <thead>
                    <th><input id="allSelect" type="checkbox"></th> 
                    <th>ID</th>
                    <th>公司ID</th>
                    <th>分店编码</th>
                    <th>分店名称</th>
                    <th>区域</th>
                    <th>分店描述</th>
                    <th>操作</th>
                </thead>
                <tbody>                    
                    <c:forEach items="${list}" var="entity">
                        <tr onclick="setBox(this);">
                            <td><input name="singleCkb" type="checkbox" data-ckb-id="${entity.id}"></td>
                            <td>${entity.id}</td>                            
                            <td>${entity.companyId}</td>                            
                            <td>${entity.shopNo}</td>                            
                            <td>${entity.name}</td>                            
                            <td>${entity.regionId}</td>                            
                            <td>${entity.descr}</td>                            
                            <td>
                            <a href="${contextPath}/tShop/view.do?id=${entity.id}" style="margin-left: 0px;">查看</a>
                            <a href="${contextPath}/tShop/edit.do?id=${entity.id}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </section>
</body>
</html>                    


