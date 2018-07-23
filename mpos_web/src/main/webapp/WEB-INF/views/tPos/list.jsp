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
        <li>设备维护</li>
        <li>终端维护</li>
        <li>查看</li>
        <button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
            onclick="delete_check('${contextPath}/tPos/delete.do','listTable');">删除</button>
        <a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
            href="${contextPath}/tPos/add.do" target="mainIframe">新增</a>
    </ol>
    <form:form id="listForm" name="listForm" modelAttribute="tPos"
        action="${contextPath}/tPos/list.do" method="get" class="form-inline">
        <div class="row">
            <form:input class="query-input" path="posNo" placeholder="终端编码" />
            <form:input class="query-input" path="name" placeholder="终端名称" />
            <form:input class="query-input" path="mac" placeholder="MAC地址" />
            <form:input class="query-input" path="shopId" placeholder="分店ID" />
            <form:input class="query-input" path="posType" placeholder="终端类型" />
            <form:input class="query-input" path="posAttr" placeholder="终端属性" />
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
    </form:form>

    <section class="row">
        <div class="col-sm-12">
            <table class="table table-striped  mgtop10" id="listTable">
                <thead>
                    <th><input id="allSelect" type="checkbox"></th> 
                    <th>终端编码</th>
                    <th>终端名称</th>
                    <th>MAC地址</th>
                    <th>终端类型</th>
                    <th>终端属性</th>
                    <th>操作</th>
                </thead>
                <tbody>                    
                    <c:forEach items="${list}" var="entity">
                        <tr onclick="setBox(this);">
                            <td><input name="singleCkb" type="checkbox" data-ckb-id="${entity.id}"></td>
                            <td>${entity.posNo}</td>
                            <td>${entity.name}</td>                            
                            <td>${entity.mac}</td>
                            <td>${entity.posType}</td>
                            <td>${entity.posAttr}</td>
                            <td>
                            <a href="${contextPath}/tPos/view.do?id=${entity.id}" style="margin-left: 0px;">查看</a>
                            <a href="${contextPath}/tPos/edit.do?id=${entity.id}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </section>
</body>
</html>                    


