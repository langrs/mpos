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
		top.$('#mainIframe').contents().find("#tWxMenuId").val(id);
		top.$('#mainIframe').contents().find("#tWxMenuId_name").val(name);
		top.$("#tWxMenuId").modal('hide');
	}
</script>

<title>联合智云管理平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tWxMenu"
		action="${contextPath}/tWxMenu/list.do" method="get" class="form-inline">
		<div class="row">
            <form:input class="query-input" path="id" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="menuName" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="menuClass" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="menuType" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="menuKey" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="menuUrl" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="mediaId" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="parentId" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>					
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id}" data-name="${entity.name}"  onclick="saveData(this)">
                            <td>${entity.id}</td>                            
                            <td>${entity.menuName}</td>                            
                            <td>${entity.menuClass}</td>                            
                            <td>${entity.menuType}</td>                            
                            <td>${entity.menuKey}</td>                            
                            <td>${entity.menuUrl}</td>                            
                            <td>${entity.mediaId}</td>                            
                            <td>${entity.parentId}</td>                            
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
