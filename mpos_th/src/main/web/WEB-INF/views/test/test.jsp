<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试页面</title>
    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
    <c:set var="staticPath" value="${contextPath}/static"/>
    <link href="${staticPath}/lib/bootstrap/3.0.2/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
</head>
<body>
<h1>w测试数据</h1>
<table class="table">
    <tr>
        <th>商品编码</th>
        <th>单位名称</th>
    </tr>
    <c:forEach items="${unit}" var="entity">
    <tr>
    <td>${entity.item_no}"</td>
    <td>${entity.item_unit_no}</td>
     </tr>
    </c:forEach>
</table>
</body>
</html>
