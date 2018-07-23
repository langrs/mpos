<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="${staticPath}/js/list.js"></script>

<link href="${staticPath}/css/tree.css" rel="stylesheet" type="text/css">
<script src="${staticPath}/js/dtree.js" type="text/javascript"></script>
<link href="${staticPath}/css/dtree.css" rel="stylesheet"
	type="text/css">
<script type="text/javascript">
var selectId=0;
	$(document).ready(function() {
		$("#key").focus();
		$("#dataForm").validate({
			submitHandler : function(form) {
				if ($("#parent").val() == "") {
					alert("请选择父节点");
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

	function setParent(id) {
		$("#parent").val(id);
		selectId=id;
	}
	function deleteNode(){
		if(selectId!=0){
			Oosp_Loading('正在提交，请稍等...');
			funform('${contextPath}/nav/delete.do?id='+selectId,'_self');
		}else{
			alert("请选择要删除的节点");
		}
	}
</script>
<title>茂业运营服务支撑平台</title>
</head>
<body>

	<ol class="breadcrumb">
		<!-- <li>首页</li> -->
		<li>组织管理</li>
		<li>test</li>
		<li>test2</li>
	</ol>


	<section class="row">
		<div class="col-sm-12" style="margin-top: 10px;">
			<form:form id="dataForm" modelAttribute="nav"
				action="${contextPath}/nav/save.do" method="post" role="form">
				<section class="row">
					<div class="col-xs-8 col-md-8 pull-right">
						<div class="btn-box">
						<font color="red">${message }</font>
							<button type="submit"
								class="btn btn-success btn-sm bing-btn-sm submit">新增</button>
							<a class="btn btn-warning btn-sm bing-btn-sm"
								href="javascript:deleteNode();">删除</a>
						</div>
					</div>
				</section>

				<section class="row">
					<div class="col-sm-12 col-md-12">
						<table cellspacing="0" cellpadding="0" class="maoye-table mgtop10">
							<tbody>
								<input type="hidden" value="0" name="id">
								<input type="hidden" value="${parent }" name="parent"
									id="parent">
								<tr>
									<td>名称:</td>
									<td><form:input id="name" path="name"
											class="input-text-lg required" /></td>
								</tr>
								<tr>
									<td>连接地址:</td>
									<td><form:input id="url" path="url"
											class="input-text-lg " /></td>
								</tr>
							</tbody>
						</table>
					</div>
				</section>

			</form:form>
		</div>
		<div class="col-sm-12" style="margin-top: 10px;">
			<script type="text/javascript">
				//这个变量的名字要一致，也就是说d要等于后面的“d”
				d = new dTree('d');
				//四个参数，第一个：节点的id，第二个：父节点的id，第三个：节点显示的名字，第四个：点击节点执行的方法
				d.add(0, -1, '菜单列表', "javascript:setParent(0)");
				<c:forEach var="entity" items="${list}">
				d.add(${entity.id}, ${entity.parent}, '${entity.name}', "javascript:setParent(${entity.id})");
				</c:forEach>
				document.write(d);
				d.openAll();
				//打开节点到id
				//d.openTo('${selectId}', true);
			</script>
		</div>
	</section>


</body>
</html>
