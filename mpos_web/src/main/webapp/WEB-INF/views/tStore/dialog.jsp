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
		top.$('#mainIframe').contents().find("#tStoreId").val(id);
		top.$('#mainIframe').contents().find("#tStoreId_name").val(name);
		top.$("#tStoreId").modal('hide');
	}
</script>

<title>联合智云管理平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tStore"
		action="${contextPath}/tStore/list.do" method="get" class="form-inline">
		<div class="row">
            <form:input class="query-input" path="storeNo" placeholder="商铺编码" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="name" placeholder="商铺名称" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="shopId" placeholder="所属分店" />
<input class="hide" name="dialog" value="true">            
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>					
                    <th>ID</th>
                    <th>商铺编码</th>
                    <th>商铺名称</th>
                    <th>所属分店</th>

				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id}" data-name="${entity.name}"  onclick="saveData(this)">
                            <td>${entity.id}</td>
                            <td>${entity.storeNo}</td>
                            <td>${entity.name}</td>                            
                            <td>${entity.shopId}</td>                            
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
