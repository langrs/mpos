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
		top.$('#mainIframe').contents().find("#tShopId").val(id);
		top.$('#mainIframe').contents().find("#tShopId_name").val(name);
		top.$("#tShopId").modal('hide');
	}
</script>

<title>联合智云管理平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tShop"
		action="${contextPath}/tShop/list.do" method="get" class="form-inline">
<input class="hide" name="dialog" value="true">
            <form:input class="query-input" path="shopNo" placeholder="分店编码" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="name" placeholder="分店名称" />
<input class="hide" name="dialog" value="true">
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>					
                    <th>分店编码</th>
                    <th>分店名称</th>
                    <th>区域</th>

				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id}" data-name="${entity.name }"  onclick="saveData(this)">
                            <td>${entity.shopNo}</td>
                            <td>${entity.name}</td>                            
                            <td>${entity.regionId}</td>                            
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
