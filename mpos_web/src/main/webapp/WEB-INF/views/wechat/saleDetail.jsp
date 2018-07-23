<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
<link href="http://libs.baidu.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/bootstrap/2.3.2/js/bootstrap.min.js"></script>
</head>
<body>

<table class="table">
<tr>
<th>销售单号</th><th>销售日期</th><th>销售门店</th><th>销售金额</th>
</tr>
<tr> 
<td>${tWxSale.saleNo}</td><td><fmt:formatDate value="${tWxSale.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td><td> </td><td>${tWxSale.saleAmt }</td>
</tr>
</table>
<c:forEach items="${tWxSalePay}" var="entity">
	this is:${entity.saleNo}
	
</c:forEach>

</body>
</html>