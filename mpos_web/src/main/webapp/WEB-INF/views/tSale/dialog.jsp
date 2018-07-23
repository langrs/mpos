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
		top.$('#mainIframe').contents().find("#tSaleId").val(id);
		top.$('#mainIframe').contents().find("#tSaleId_name").val(name);
		top.$("#tSaleId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tSale"
		action="${contextPath}/tSale/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="saleNo" placeholder="销售流水号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="userId" placeholder="收银员ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="sSaleNo" placeholder="原流水号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="saleNoShort" placeholder="交易序号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="billNo" placeholder="收据号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="dealType" placeholder="交易类型" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="saleSource" placeholder="销售来源" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="saleType" placeholder="销售单类型" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="companyId" placeholder="公司ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="shopId" placeholder="分店" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="regionId" placeholder="区域" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="posId" placeholder="终端" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="storeId" placeholder="商铺" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="salesId" placeholder="业务员" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="vipNo" placeholder="会员卡号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="isTrain" placeholder="培训模式" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="reason" placeholder="退货理由" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="ebillType" placeholder="领取电子小票" />
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
					<th>销售流水号</th>
					<th>销售日期</th>
					<th>收银员ID</th>
					<th>原流水号</th>
					<th>交易序号</th>
					<th>收据号</th>
					<th>交易类型</th>
					<th>销售来源</th>
					<th>销售单类型</th>
					<th>公司ID</th>
					<th>分店</th>
					<th>区域</th>
					<th>终端</th>
					<th>商铺</th>
					<th>业务员</th>
					<th>会员卡号</th>
					<th>期初积分</th>
					<th>销售积分</th>
					<th>原价金额</th>
					<th>应收金额</th>
					<th>实收金额</th>
					<th>折扣金额</th>
					<th>抹零金额</th>
					<th>溢收金额</th>
					<th>税金金额</th>
					<th>会员折扣金额</th>
					<th>培训模式</th>
					<th>退货理由</th>
					<th>退货金额</th>
					<th>领取电子小票</th>
					<th>上传标志</th>
					<th>上传日期</th>
				
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id }" data-name="${entity.name }"  onclick="saveData(this)">
							
									 <td>${entity.id}</td>
									 <td>${entity.saleNo}</td>
									 <td><fmt:formatDate value="${entity.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.userId}</td>
									 <td>${entity.sSaleNo}</td>
									 <td>${entity.saleNoShort}</td>
									 <td>${entity.billNo}</td>
									 <td>${entity.dealType}</td>
									 <td>${entity.saleSource}</td>
									 <td>${entity.saleType}</td>
									 <td>${entity.companyId}</td>
									 <td>${entity.shopId}</td>
									 <td>${entity.regionId}</td>
									 <td>${entity.posId}</td>
									 <td>${entity.storeId}</td>
									 <td>${entity.salesId}</td>
									 <td>${entity.vipNo}</td>
									 <td>${entity.originalPoints}</td>
									 <td>${entity.salePoints}</td>
									 <td>${entity.originalAmt}</td>
									 <td>${entity.saleAmt}</td>
									 <td>${entity.payAmt}</td>
									 <td>${entity.discAmt}</td>
									 <td>${entity.changeAmt}</td>
									 <td>${entity.excessAmt}</td>
									 <td>${entity.saleTaxAmt}</td>
									 <td>${entity.vipDiscAmt}</td>
									 <td>${entity.isTrain}</td>
									 <td>${entity.reason}</td>
									 <td>${entity.retAmt}</td>
									 <td>${entity.ebillType}</td>
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
