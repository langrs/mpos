<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="${staticPath}/js/list.js"></script>

<title>联合智云商业平台</title>
</head>
<body>

    <ol class="breadcrumb">
        <!-- <li>首页</li> -->
		<li>"待定"</li>
		<li>"待定"</li>
        <li>查看</li>
        <button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
            onclick="delete_check('${contextPath}/tNotice/delete.do','listTable');">删除</button>
        <a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
            href="${contextPath}/tNotice/add.do" target="mainIframe">新增</a>
    </ol>
    <form:form id="listForm" name="listForm" modelAttribute="tNotice"
        action="${contextPath}/tNotice/list.do" method="get" class="form-inline">
        <div class="row">
            <form:input class="query-input" path="id" placeholder="" />
            <form:input class="query-input" path="noticeNo" placeholder="" />
            <form:input class="query-input" path="title" placeholder="" />
            <form:input class="query-input" path="memo" placeholder="" />
            <form:input class="query-input" path="validDate" placeholder="" />
            <form:input class="query-input" path="createBy" placeholder="创建人" />
            <form:input class="query-input" path="createTime" placeholder="创建日期" />
            <form:input class="query-input" path="updateBy" placeholder="最后修改人" />
            <form:input class="query-input" path="updateTime" placeholder="最后修改日期" />
            <form:input class="query-input" path="isFlag" placeholder="是否有效" />
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
                            <td><input name="singleCkb" type="checkbox" data-ckb-id="${entity.id}"></td>
                            <td>${entity.id}</td>                            
                            <td>${entity.noticeNo}</td>                            
                            <td>${entity.title}</td>                            
                            <td>${entity.memo}</td>                            
                            <td><fmt:formatDate value="${entity.validDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td>${entity.createBy}</td>                            
                            <td><fmt:formatDate value="${entity.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td>${entity.updateBy}</td>                            
                            <td><fmt:formatDate value="${entity.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td>${entity.isFlag}</td>                            
                            <td>
                            <a href="${contextPath}/tNotice/view.do?id=${entity.id}" style="margin-left: 0px;">查看</a>
                            <a href="${contextPath}/tNotice/edit.do?id=${entity.id}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </section>
</body>
</html>                    


