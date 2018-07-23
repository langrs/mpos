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
		top.$('#mainIframe').contents().find("#tCouponTypeId").val(id);
		top.$('#mainIframe').contents().find("#tCouponTypeId_name").val(name);
		top.$("#tCouponTypeId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tCouponType"
		action="${contextPath}/tCouponType/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="shopId" placeholder="分店ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="typeNo" placeholder="类别编号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="name" placeholder="类别名称" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="isChange" placeholder="允许找零" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="validUnit" placeholder="日期单位" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="isProm" placeholder="特价不参与" />
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
					<th>分店ID</th>
					<th>类别编号</th>
					<th>类别名称</th>
					<th>券面值</th>
					<th>允许找零</th>
					<th>有效期值</th>
					<th>日期单位</th>
					<th>限用买满金额</th>
					<th>限用张数</th>
					<th>特价不参与</th>
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
									 <td>${entity.shopId}</td>
									 <td>${entity.typeNo}</td>
									 <td>${entity.name}</td>
									 <td>${entity.value}</td>
									 <td>${entity.isChange}</td>
									 <td>${entity.validNum}</td>
									 <td>${entity.validUnit}</td>
									 <td>${entity.limitAmount}</td>
									 <td>${entity.limitNum}</td>
									 <td>${entity.isProm}</td>
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
