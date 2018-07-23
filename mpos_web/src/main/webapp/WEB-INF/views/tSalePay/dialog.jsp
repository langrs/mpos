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
		top.$('#mainIframe').contents().find("#tSalePayId").val(id);
		top.$('#mainIframe').contents().find("#tSalePayId_name").val(name);
		top.$("#tSalePayId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tSalePay"
		action="${contextPath}/tSalePay/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="saleId" placeholder="主表ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="saleNo" placeholder="销售流水号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="shopId" placeholder="分店" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="paymodeId" placeholder="支付方式" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="billNo" placeholder="票据号码" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="collectBank" placeholder="收单行" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="issueBank" placeholder="发卡行" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="skType" placeholder="刷卡方式" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="currencyId" placeholder="币种" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="cardIssue" placeholder="储值发卡机构" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="upFlag" placeholder="上传标志" />
<input class="hide" name="dialog" value="true">
			<button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
		</div>
	</form:form>

	<section class="row">
		<div class="col-sm-12">
			<table class="table table-striped  mgtop10" id="listTable">
				<thead>
					
					<th>ID</th>
					<th>主表ID</th>
					<th>销售流水号</th>
					<th>序号</th>
					<th>销售日期</th>
					<th>分店</th>
					<th>支付方式</th>
					<th>溢收金额</th>
					<th>支付金额</th>
					<th>找零金额</th>
					<th>票据号码</th>
					<th>收单行</th>
					<th>发卡行</th>
					<th>刷卡方式</th>
					<th>币种</th>
					<th>币种汇率</th>
					<th>现金含量</th>
					<th>储值发卡机构</th>
					<th>上传标志</th>
					<th>上传日期</th>
				
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id }" data-name="${entity.name }"  onclick="saveData(this)">
							
									 <td>${entity.id}</td>
									 <td>${entity.saleId}</td>
									 <td>${entity.saleNo}</td>
									 <td>${entity.rowNo}</td>
									 <td><fmt:formatDate value="${entity.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.shopId}</td>
									 <td>${entity.paymodeId}</td>
									 <td>${entity.excessAmt}</td>
									 <td>${entity.payAmt}</td>
									 <td>${entity.changeAmt}</td>
									 <td>${entity.billNo}</td>
									 <td>${entity.collectBank}</td>
									 <td>${entity.issueBank}</td>
									 <td>${entity.skType}</td>
									 <td>${entity.currencyId}</td>
									 <td>${entity.exchangeRate}</td>
									 <td>${entity.cashRate}</td>
									 <td>${entity.cardIssue}</td>
									 <td>${entity.upFlag}</td>
									 <td><fmt:formatDate value="${entity.upDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                                                      
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
</body>
</html>
