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
		top.$('#mainIframe').contents().find("#tUserId").val(id);
		top.$('#mainIframe').contents().find("#tUserId_name").val(name);
		top.$("#tUserId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tUser"
		action="${contextPath}/tUser/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="userNo" placeholder="用户编码" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="name" placeholder="用户名称" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="shopId" placeholder="分店" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="storeId" placeholder="商铺ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="passwd" placeholder="登录密码" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="deptId" placeholder="部门" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="userType" placeholder="收银员类别" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="idCard" placeholder="证件号码" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="mobile" placeholder="联系电话" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="sex" placeholder="性别" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="state" placeholder="状态" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="isChangepw" placeholder="是否修改密码" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="rightLevel" placeholder="权限级别" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="createBy" placeholder="创建人" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="updateBy" placeholder="最后修改人" />
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
					<th>用户编码</th>
					<th>用户名称</th>
					<th>分店</th>
					<th>商铺ID</th>
					<th>登录密码</th>
					<th>部门</th>
					<th>收银员类别</th>
					<th>证件号码</th>
					<th>联系电话</th>
					<th>性别</th>
					<th>状态</th>
					<th>是否修改密码</th>
					<th>权限级别</th>
					<th>创建人</th>
					<th>创建日期</th>
					<th>最后修改人</th>
					<th>最后修改日期</th>
					<th>是否有效</th>
				
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id }" data-name="${entity.name }"  onclick="saveData(this)">
							
									 <td>${entity.id}</td>
									 <td>${entity.userNo}</td>
									 <td>${entity.name}</td>
									 <td>${entity.shopId}</td>
									 <td>${entity.storeId}</td>
									 <td>${entity.passwd}</td>
									 <td>${entity.deptId}</td>
									 <td>${entity.userType}</td>
									 <td>${entity.idCard}</td>
									 <td>${entity.mobile}</td>
									 <td>${entity.sex}</td>
									 <td>${entity.state}</td>
									 <td>${entity.isChangepw}</td>
									 <td>${entity.rightLevel}</td>
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
