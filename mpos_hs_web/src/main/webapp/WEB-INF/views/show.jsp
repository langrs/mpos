<%--
  Created by IntelliJ IDEA.
  User: langrs
  Date: 2016-07-01
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
    <title>Show</title>
</head>
<body>
<h1>show is now !</h1>
<table>
    <c:forEach items="${list}" var="entity">
        <tr>
            <td>name</td><td>${entity.custName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
