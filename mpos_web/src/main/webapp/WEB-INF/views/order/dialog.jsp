<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="${staticPath}/js/list.js"></script>
<script type="text/javascript">

	function saveData(t){
                //改变选中的颜色为红色
		$("#listTable  tr").removeAttr("style");
		$(t).attr("style", "color:red");

                var id = $(t).attr("data-id");
		var name = $(t).attr("data-name");
		top.$('#mainIframe').contents().find("#orderId").val(id);
		top.$('#mainIframe').contents().find("#orderId_name").val(name);
		top.$("#orderId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="order"
		action="${contextPath}/order/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="orderNo" placeholder="订单号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="status" placeholder="订单状态" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="name" placeholder="name" />
<input class="hide" name="dialog" value="true">
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					
					<th>id_</th>
					<th>订单号</th>
					<th>创建用户</th>
					<th>订单状态</th>
					<th>customer_id_</th>
					<th>name</th>
				
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id }" data-name="${entity.name }"  onclick="saveData(this)">
							
									 <td>${entity.id}</td>
									 <td>${entity.orderNo}</td>
									 <td>${entity.userId}</td>
									 <td>${entity.status}</td>
									 <td>${entity.customerId}</td>
									 <td>${entity.name}</td>
                                                      
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
