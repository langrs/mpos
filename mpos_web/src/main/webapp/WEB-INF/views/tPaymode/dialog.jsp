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
		top.$('#mainIframe').contents().find("#tPaymodeId").val(id);
		top.$('#mainIframe').contents().find("#tPaymodeId_name").val(name);
		top.$("#tPaymodeId").modal('hide');
	}
</script>

<title>联合智云管理平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tPaymode"
		action="${contextPath}/tPaymode/list.do" method="get" class="form-inline">
		<div class="row">
            <form:input class="query-input" path="id" placeholder="ID" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="paymodeNo" placeholder="支付编码" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="name" placeholder="支付名称" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="paymodeQy" placeholder="企业支付编码" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="paymodeTypeId" placeholder="支付类别ID" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="shopId" placeholder="分店ID" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="isChange" placeholder="是否找零" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="isPoint" placeholder="是否积分" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="isInvoice" placeholder="是否开票" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="isCoupon" placeholder="是否兑券" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="isRet" placeholder="是否退货" />
<input class="hide" name="dialog" value="true">            
            <form:input class="query-input" path="currencyId" placeholder="币种ID" />
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
                    <th>支付编码</th>
                    <th>支付名称</th>
                    <th>企业支付编码</th>
                    <th>支付类别ID</th>
                    <th>分店ID</th>
                    <th>是否找零</th>
                    <th>是否积分</th>
                    <th>是否开票</th>
                    <th>是否兑券</th>
                    <th>是否退货</th>
                    <th>币种ID</th>
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
                            <td>${entity.paymodeNo}</td>                            
                            <td>${entity.name}</td>                            
                            <td>${entity.paymodeQy}</td>                            
                            <td>${entity.paymodeTypeId}</td>                            
                            <td>${entity.shopId}</td>                            
                            <td>${entity.isChange}</td>                            
                            <td>${entity.isPoint}</td>                            
                            <td>${entity.isInvoice}</td>                            
                            <td>${entity.isCoupon}</td>                            
                            <td>${entity.isRet}</td>                            
                            <td>${entity.currencyId}</td>                            
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
