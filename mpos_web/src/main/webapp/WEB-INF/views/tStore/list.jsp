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
        <li>商铺管理</li>
        <li>查看</li>
        <button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
            onclick="delete_check('${contextPath}/tStore/delete.do','listTable');">删除</button>
        <a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
            href="${contextPath}/tStore/add.do" target="mainIframe">新增</a>
    </ol>
    <form:form id="listForm" name="listForm" modelAttribute="tStore"
        action="${contextPath}/tStore/list.do" method="get" class="form-inline">
        <div class="row">
            <form:input class="query-input" path="storeNo" placeholder="商铺编码" />
            <form:input class="query-input" path="name" placeholder="商铺名称" />
            <form:input class="query-input" path="shopId" placeholder="所属分店" />
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
    </form:form>

    <section class="row">
        <div class="col-sm-12">
            <table class="table table-striped  mgtop10" id="listTable">
                <thead>
                    <th><input id="allSelect" type="checkbox"></th> 
                    <th>商铺编码</th>
                    <th>商铺名称</th>
                    <th>所属分店</th>
                    <th>面积</th>
                    <th>楼层</th>
                    <th>收银方式</th>
                    <th>商铺类型</th>
                    <th>品牌ID</th>
                    <th>是否有效</th>
                    <th>操作</th>
                </thead>
                <tbody>                    
                    <c:forEach items="${list}" var="entity">
                        <tr onclick="setBox(this);">
                            <td><input name="singleCkb" type="checkbox" data-ckb-id="${entity.id}"></td>
                            <td>${entity.storeNo}</td>
                            <td>${entity.name}</td>                            
                            <td>${entity.shopId}</td>                            
                            <td>${entity.area}</td>                            
                            <td>${entity.floor}</td>                            
                            <td>${entity.collectType}</td>                            
                            <td>${entity.storeType}</td>                            
                            <td>${entity.brandId}</td>                            
                            <td>${entity.isFlag}</td>
                            <td>
                            <a href="${contextPath}/tStore/view.do?id=${entity.id}" style="margin-left: 0px;">查看</a>
                            <a href="${contextPath}/tStore/edit.do?id=${entity.id}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </section>
</body>
</html>                    


