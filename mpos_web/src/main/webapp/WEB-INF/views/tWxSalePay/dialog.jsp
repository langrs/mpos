<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="r${staticPath}/js/list.js"></script>
<script type="text/javascript">

	function saveData(t){
        //改变选中的颜色为红色
		$("#listTable  tr").removeAttr("style");
		$(t).attr("style", "color:red");

        var id = $(t).attr("data-id");
		var name = $(t).attr("data-name");
		top.$('#mainIframe').contents().find("#tWxSalePayId").val(id);
		top.$('#mainIframe').contents().find("#tWxSalePayId_name").val(name);
		top.$("#tWxSalePayId").modal('hide');
	}
</script>

<title>联合智云管理平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tWxSalePay"
		action="${contextPath}/tWxSalePay/list.do" method="get" class="form-inline">
		<div class="row">
            <form:input class="query-input" path="id" placeholder="ID" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="saleId" placeholder="主表ID" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="saleNo" placeholder="销售流水号" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="rowNo" placeholder="序号" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="saleDate" placeholder="销售日期" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="shopId" placeholder="分店" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="paymodeId" placeholder="支付方式" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="payAmt" placeholder="支付金额" />
<input class="hide" name="dialog" value="true">            
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>					
                    <th>ID</th>
                    <th>主表ID</th>
                    <th>销售流水号</th>
                    <th>序号</th>
                    <th>销售日期</th>
                    <th>分店</th>
                    <th>支付方式</th>
                    <th>支付金额</th>
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id}" data-name="${entity.name}"  onclick="saveData(this)">
                            <td>${entity.id}</td>                            
                            <td>${entity.saleId}</td>                            
                            <td>${entity.saleNo}</td>                            
                            <td>${entity.rowNo}</td>                            
                        	<td><fmt:formatDate value="${entity.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td>${entity.shopId}</td>                            
                            <td>${entity.paymodeId}</td>                            
                            <td>${entity.payAmt}</td>                            
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
