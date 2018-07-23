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
		top.$('#mainIframe').contents().find("#productId").val(id);
		top.$('#mainIframe').contents().find("#productId_name").val(name);
		top.$("#productId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="product"
		action="${contextPath}/product/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="name" placeholder="name_" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="model" placeholder="产品型号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="color" placeholder="产品颜色" />
<input class="hide" name="dialog" value="true">
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					
					<th>id_</th>
					<th>name_</th>
					<th>产品型号</th>
					<th>产品颜色</th>
					<th>生产厂家</th>
				
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id }" data-name="${entity.name }"  onclick="saveData(this)">
							
									 <td>${entity.id}</td>
									 <td>${entity.name}</td>
									 <td>${entity.model}</td>
									 <td>${entity.color}</td>
									 <td>${entity.factoryId}</td>
                                                      
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
