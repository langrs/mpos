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
		top.$('#mainIframe').contents().find("#tNoticeId").val(id);
		top.$('#mainIframe').contents().find("#tNoticeId_name").val(name);
		top.$("#tNoticeId").modal('hide');
	}
</script>

<title>联合智云管理平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tNotice"
		action="${contextPath}/tNotice/list.do" method="get" class="form-inline">
		<div class="row">
            <form:input class="query-input" path="id" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="noticeNo" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="title" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="memo" placeholder="" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="validDate" placeholder="" />
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
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
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
                            <td>${entity.noticeNo}</td>                            
                            <td>${entity.title}</td>                            
                            <td>${entity.memo}</td>                            
                        	<td><fmt:formatDate value="${entity.validDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
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
