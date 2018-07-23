<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="${staticPath}/js/list.js"></script>
<script type="text/javascript">
	function saveData() {
			var ids=[];
			var ids_name=[];
			$("#userDiv").find("input:checked").each(function(){
				ids.push($(this).val());
				ids_name.push($(this).attr("data-name"));
			});
			var spans=top.$('#mainIframe').contents().find("#userNames");
			var htm="";
			for (var i = 0; i < ids.length; i++) {
				htm+=ids_name[i]+'<input flag="userData" name="roleUsers['+i+'].userid" value="'+ids[i]+'" style="display:none;">';
			}
			spans.html(htm);
			top.$("#userSelect").modal('hide');
		}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	<ol class="breadcrumb">
		<!-- <li>首页</li> -->
		<li>人员选择</li>
		<a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
			href="javascript:void(0)" target="mainIframe" onclick="saveData();">确定</a>
	</ol>


	<section class="row">
		<div class="col-sm-12" id="userDiv">

			<c:forEach items="${list}" var="entity" varStatus="status">
				<input type="checkbox" id="${entity.id }" value="${entity.id }"
					data-name="${entity.name }" />
				<label for="${entity.id }">${entity.name}(${entity.userNo})</label>&nbsp
			</c:forEach>


		</div>



	</section>
</body>
</html>
