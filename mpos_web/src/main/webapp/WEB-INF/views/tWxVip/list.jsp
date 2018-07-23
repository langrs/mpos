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
            onclick="delete_check('${contextPath}/tWxVip/delete.do','listTable');">删除</button>
        <a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
            href="${contextPath}/tWxVip/add.do" target="mainIframe">新增</a>
    </ol>
    <form:form id="listForm" name="listForm" modelAttribute="tWxVip"
        action="${contextPath}/tWxVip/list.do" method="get" class="form-inline">
        <div class="row">
            <form:input class="query-input" path="id" placeholder="" />
            <form:input class="query-input" path="openId" placeholder="" />
            <form:input class="query-input" path="userName" placeholder="" />
            <form:input class="query-input" path="registerDate" placeholder="" />
            <form:input class="query-input" path="shoppingDateFirst" placeholder="" />
            <form:input class="query-input" path="shoppingDateLast" placeholder="" />
            <form:input class="query-input" path="cardNo" placeholder="" />
            <form:input class="query-input" path="phoneNo" placeholder="" />
            <form:input class="query-input" path="birthday" placeholder="" />
            <form:input class="query-input" path="sex" placeholder="" />
            <form:input class="query-input" path="localation" placeholder="" />
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
                    <th></th>
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
                            <td>${entity.userName}</td>                            
                            <td><fmt:formatDate value="${entity.registerDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td><fmt:formatDate value="${entity.shoppingDateFirst}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td><fmt:formatDate value="${entity.shoppingDateLast}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td>${entity.cardNo}</td>                            
                            <td>${entity.phoneNo}</td>                            
                            <td><fmt:formatDate value="${entity.birthday}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td>${entity.sex}</td>                            
                            <td>${entity.localation}</td>                            
                            <td>
                            <a href="${contextPath}/tWxVip/view.do?id=${entity.id}" style="margin-left: 0px;">查看</a>
                            <a href="${contextPath}/tWxVip/edit.do?id=${entity.id}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </section>
</body>
</html>                    


