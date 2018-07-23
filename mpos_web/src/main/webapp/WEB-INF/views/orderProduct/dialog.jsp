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
		top.$('#mainIframe').contents().find("#orderProductId").val(id);
		top.$('#mainIframe').contents().find("#orderProductId_name").val(name);
		top.$("#orderProductId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="orderProduct"
		action="${contextPath}/orderProduct/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="productinfo" placeholder="商品的信息明细" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="status" placeholder="商品状态" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="remark" placeholder="订单商品说明" />
<input class="hide" name="dialog" value="true">
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					
					<th>id_</th>
					<th>商品的信息明细</th>
					<th>订单id</th>
					<th>产品id</th>
					<th>商品状态</th>
					<th>订单商品说明</th>
				
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id }" data-name="${entity.name }"  onclick="saveData(this)">
							
									 <td>${entity.id}</td>
									 <td>${entity.productinfo}</td>
									 <td>${entity.orderId}</td>
									 <td>${entity.productId}</td>
									 <td>${entity.status}</td>
									 <td>${entity.remark}</td>
                                                      
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
