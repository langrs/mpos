<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="${staticPath}/js/roleAdd.js"></script>
<script type="text/javascript">
	//全部选中
	function checkAll(t, i) {
		var div1;
		switch (i) {
		case 1:
			div1 = $(t).closest("div.media-body");
			break;
		case 2:
			div1 = $(t).closest("div.media-body");
			break;
		}
		if ($(t).attr("checked")) {
			div1.find(":checkbox").prop("checked", true);
		} else {
			div1.find(":checkbox").prop("checked", false);
		}
	}

	$(document).ready(function() {
		$("#key").focus();
		$("#dataForm").validate({
			submitHandler : function(form) {
				var res = $("section").find(":input:checked");
				if (res.length == 0) {
					alert("请分配权限");
				} else {
					Oosp_Loading('正在提交，请稍等...');
					form.submit();
				}
			},
			errorContainer : "#messageBox",
			errorPlacement : function(error, element) {
				$("#messageBox").text("输入有误，请先更正。");
				if (element.is(":checkbox") || element.is(":radio") || element.parent().is(".input-append")) {
					error.appendTo(element.parent().parent());
				} else {
					error.insertAfter(element);
				}
			}
		});
	});
	
	$(function(){
		ids=""<c:forEach items="${role.roleUsers }" var="roleUser">+","+"${roleUser.useridObj.id }"</c:forEach>;
		top.createUserDialog(ids);
	})
	
</script>
</head>
<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
	</ol>
	<form:form id="dataForm" modelAttribute="role"
		action="${contextPath}/role/save.do" method="post" role="form">
		<form:hidden path="id" />
		<section class="row">
		<div class="col-xs-8 col-md-8 pull-right">
			<div class="btn-box">
				<button type="submit"
					class="btn btn-success btn-sm bing-btn-sm submit">保存</button>
				<a class="btn btn-warning btn-sm bing-btn-sm"
					href="${sessionScope.lastUrl }">取消</a>
			</div>
		</div>
		</section>

		<section class="row">
		<div class="col-sm-12 col-md-12">
			<table cellspacing="0" cellpadding="0" class="maoye-table mgtop10">
				<tbody>
					<form:hidden path="id" />
					<tr>
						<td>角色名:</td>
						<td><form:input id="name" path="name"
								class="input-text-lg required" /></td>
					</tr>
					<tr>
						<td>禁用:</td>
						<td><form:checkbox path="status" value="0" /></td>
					</tr>
					<tr>
						<td>分配人员:</td>
						<td><span id="userNames"><c:forEach items="${role.roleUsers }" var="roleUser" varStatus="status">
						${roleUser.useridObj.name }
						<input flag="userData" name="roleUsers[${status.index }].userid" value="${ roleUser.useridObj.id}" style="display:none;">
						</c:forEach></span>
							<button type="button"
								class="btn btn-success btn-sm bing-btn-sm submit" onclick="top.$('#userSelect').modal('show');">分配</button></td>
					
					</tr>
				</tbody>
			</table>




			<p style="margin-bottom: 0; margin-top: 20px;">权限分配：</p>
			<div class="maoye-nav" style="overflow: auto;">
				<c:forEach items="${list }" var="nav">
					<div class="media-body maoye-mbody">
						<h4 class="media-heading">
							<div class="checkbox m-checkbox mgtop0">
								<div class="pull-left">
									<i class="fl"><input type="checkbox"
										onclick="checkAll(this,1);"
										<c:if test="${nav.isCheck==1 }">checked="checked"</c:if>></i>
									<span class="fl" onclick="openDiv(this,1);">${nav.name }</span>
								</div>
							</div>
						</h4>
						<c:forEach items="${nav.chirldList }" var="chNav">
							<div class="media maoye-media"
								style="display: none; margin-left: 20px;">

								<div class="media-body">
									<h4 class="media-heading">
										<div class="checkbox m-checkbox mgtop0">
											<div class="pull-left">
												<i class="fl"><input type="checkbox"
													onclick="checkAll(this,2);"
													<c:if test="${chNav.isCheck==1 }">checked="checked"</c:if>></i>
												<span class="fl" onclick="openDiv(this,2);">${chNav.name }</span>
											</div>
										</div>
									</h4>
									<section class="maoye-checkbox" style="display:none ;">
									<c:forEach items="${chNav.authResList }" var="res">
										<label style="width: 20%;"> <input type="checkbox"
											value="${res.id }" name="permIds"
											<c:if test="${res.isCheck==1 }">checked="checked"</c:if>>
											${res.name }
										</label>
										&nbsp; 
									</c:forEach> <label style="width: 20%;"> </label> </section>
								</div>
							</div>
						</c:forEach>
					</div>
				</c:forEach>
			</div>

		</div>



		</section>

	</form:form>


</body>
</html>
