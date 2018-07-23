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
		top.$('#mainIframe').contents().find("#tPosId").val(id);
		top.$('#mainIframe').contents().find("#tPosId_name").val(name);
		top.$("#tPosId").modal('hide');
	}
</script>

<title>联合智云管理平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tPos"
		action="${contextPath}/tPos/list.do" method="get" class="form-inline">
		<div class="row">
            <form:input class="query-input" path="posNo" placeholder="终端编码" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="name" placeholder="终端名称" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="mac" placeholder="MAC地址" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="shopId" placeholder="分店ID" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="state" placeholder="终端状态" />
<input class="hide" name="dialog" value="true">            
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>					
                    <th>ID</th>
                    <th>终端编码</th>
                    <th>终端名称</th>
                    <th>MAC地址</th>
                    <th>分店ID</th>
                    <th>终端类型</th>
                    <th>终端属性</th>
                    <th>终端状态</th>

				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id}" data-name="${entity.name }"  onclick="saveData(this)">
                            <td>${entity.id}</td>                            
                            <td>${entity.posNo}</td>                            
                            <td>${entity.name}</td>                            
                            <td>${entity.mac}</td>
                            <td>${entity.shopId}</td>
                            <td>${entity.posType}</td>                            
                            <td>${entity.posAttr}</td>                            
                            <td>${entity.state}</td>                            
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
