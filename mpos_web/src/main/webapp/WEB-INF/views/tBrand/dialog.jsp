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
		top.$('#mainIframe').contents().find("#tBrandId").val(id);
		top.$('#mainIframe').contents().find("#tBrandId_name").val(name);
		top.$("#tBrandId").modal('hide');
	}
</script>

<title>联合智云管理平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tBrand"
		action="${contextPath}/tBrand/list.do" method="get" class="form-inline">
		<div class="row">
            <form:input class="query-input" path="id" placeholder="ID" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="brandNo" placeholder="品牌编码" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="name" placeholder="品牌名称" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="brandClass" placeholder="品牌等级" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="createBy" placeholder="创建人" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="createTime" placeholder="创建日期" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="updateBy" placeholder="最后修改人" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="updateTime" placeholder="最后修改日期" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="isFlag" placeholder="是否有效" />
<input class="hide" name="dialog" value="true">            
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>					
                    <th>ID</th>
                    <th>品牌编码</th>
                    <th>品牌名称</th>
                    <th>品牌等级</th>
                    <th>创建人</th>
                    <th>创建日期</th>
                    <th>最后修改人</th>
                    <th>最后修改日期</th>
                    <th>是否有效</th>
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id}" data-name="${entity.name}"  onclick="saveData(this)">
                            <td>${entity.id}</td>                            
                            <td>${entity.brandNo}</td>                            
                            <td>${entity.name}</td>                            
                            <td>${entity.brandClass}</td>                            
                            <td>${entity.createBy}</td>                            
                        	<td><fmt:formatDate value="${entity.createTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td>${entity.updateBy}</td>                            
                        	<td><fmt:formatDate value="${entity.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td>${entity.isFlag}</td>                            
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
