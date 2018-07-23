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
		top.$('#mainIframe').contents().find("#tCustSaleinfoId").val(id);
		top.$('#mainIframe').contents().find("#tCustSaleinfoId_name").val(name);
		top.$("#tCustSaleinfoId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tCustSaleinfo"
		action="${contextPath}/tCustSaleinfo/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="shopId" placeholder="分店ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="custId" placeholder="顾客ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="saleId" placeholder="小票ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="saleNo" placeholder="小票流水" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="ebillType" placeholder="电子小票类型" />
<input class="hide" name="dialog" value="true">
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					
					<th>ID</th>
					<th>分店ID</th>
					<th>顾客ID</th>
					<th>小票ID</th>
					<th>小票流水</th>
					<th>电子小票类型</th>
					<th>发送日期</th>
					<th>消费日期</th>
				
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id }" data-name="${entity.name }"  onclick="saveData(this)">
							
									 <td>${entity.id}</td>
									 <td>${entity.shopId}</td>
									 <td>${entity.custId}</td>
									 <td>${entity.saleId}</td>
									 <td>${entity.saleNo}</td>
									 <td>${entity.ebillType}</td>
									 <td><fmt:formatDate value="${entity.sendDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td><fmt:formatDate value="${entity.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                                                      
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
