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
		top.$('#mainIframe').contents().find("#tCustInfoId").val(id);
		top.$('#mainIframe').contents().find("#tCustInfoId_name").val(name);
		top.$("#tCustInfoId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tCustInfo"
		action="${contextPath}/tCustInfo/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="openId" placeholder="微信号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="cardNo" placeholder="实体卡号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="custName" placeholder="顾客名称" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="custPhone" placeholder="顾客电话" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="custAddr" placeholder="顾客地址" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="custEmail" placeholder="顾客邮箱" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="custSex" placeholder="顾客性别" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="custSrc" placeholder="顾客来源" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="custRegion" placeholder="顾客区域" />
<input class="hide" name="dialog" value="true">
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					
					<th>ID</th>
					<th>微信号</th>
					<th>实体卡号</th>
					<th>顾客名称</th>
					<th>顾客电话</th>
					<th>顾客地址</th>
					<th>顾客邮箱</th>
					<th>顾客性别</th>
					<th>顾客来源</th>
					<th>顾客区域</th>
					<th>最后消费日期</th>
					<th>最后消费金额</th>
					<th>总消费金额</th>
					<th>顾客积分</th>
					<th>顾客生日</th>
				
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id }" data-name="${entity.name }"  onclick="saveData(this)">
							
									 <td>${entity.id}</td>
									 <td>${entity.openId}</td>
									 <td>${entity.cardNo}</td>
									 <td>${entity.custName}</td>
									 <td>${entity.custPhone}</td>
									 <td>${entity.custAddr}</td>
									 <td>${entity.custEmail}</td>
									 <td>${entity.custSex}</td>
									 <td>${entity.custSrc}</td>
									 <td>${entity.custRegion}</td>
									 <td><fmt:formatDate value="${entity.lastDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.lastAmt}</td>
									 <td>${entity.allAmt}</td>
									 <td>${entity.custPoints}</td>
									 <td><fmt:formatDate value="${entity.custBirth}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                                                      
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
