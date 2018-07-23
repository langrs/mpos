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
		top.$('#mainIframe').contents().find("#tSaleDId").val(id);
		top.$('#mainIframe').contents().find("#tSaleDId_name").val(name);
		top.$("#tSaleDId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tSaleD"
		action="${contextPath}/tSaleD/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="saleId" placeholder="主表ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="saleNo" placeholder="销售流水号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="companyId" placeholder="公司ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="shopId" placeholder="分店" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="storeId" placeholder="商铺" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="itemId" placeholder="商品" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="itemNo" placeholder="商品编码" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="retFlag" placeholder="退货标志" />
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
					<th>销售日期</th>
					<th>序号</th>
					<th>公司ID</th>
					<th>分店</th>
					<th>商铺</th>
					<th>商品</th>
					<th>商品编码</th>
					<th>销售数量</th>
					<th>商品单价</th>
					<th>商品折后单价</th>
					<th>税率</th>
					<th>税金</th>
					<th>单品打折率</th>
					<th>单品打折金额</th>
					<th>整单打折率</th>
					<th>整单打折金额</th>
					<th>会员打折率</th>
					<th>会员打折金额</th>
					<th>促销打折率</th>
					<th>促销打折金额</th>
					<th>其他打折率</th>
					<th>其他打折金额</th>
					<th>满减优惠金额</th>
					<th>会员价优惠金额</th>
					<th>优惠总金额</th>
					<th>销售总价</th>
					<th>销售积分</th>
					<th>退货标志</th>
					<th>已退金额</th>
					<th>上传标志</th>
					<th>上传日期</th>
				
					
				</thead>
				<tbody>
					<c:forEach items="${list}" var="entity">
						<tr data-id="${entity.id }" data-name="${entity.name }"  onclick="saveData(this)">
							
									 <td>${entity.id}</td>
									 <td>${entity.saleId}</td>
									 <td>${entity.saleNo}</td>
									 <td><fmt:formatDate value="${entity.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									 <td>${entity.rowNo}</td>
									 <td>${entity.companyId}</td>
									 <td>${entity.shopId}</td>
									 <td>${entity.storeId}</td>
									 <td>${entity.itemId}</td>
									 <td>${entity.itemNo}</td>
									 <td>${entity.saleNum}</td>
									 <td>${entity.salePrice}</td>
									 <td>${entity.salePriceReal}</td>
									 <td>${entity.taxRate}</td>
									 <td>${entity.taxAmt}</td>
									 <td>${entity.itemDisc}</td>
									 <td>${entity.itemDiscAmt}</td>
									 <td>${entity.billDist}</td>
									 <td>${entity.billDiscAmt}</td>
									 <td>${entity.vipDisc}</td>
									 <td>${entity.vipDiscAmt}</td>
									 <td>${entity.promDisc}</td>
									 <td>${entity.promDiscAmt}</td>
									 <td>${entity.otherDisc}</td>
									 <td>${entity.otherDiscAmt}</td>
									 <td>${entity.reduceAmt}</td>
									 <td>${entity.vipPriceAmt}</td>
									 <td>${entity.allDistAmt}</td>
									 <td>${entity.itemSaleAmt}</td>
									 <td>${entity.points}</td>
									 <td>${entity.retFlag}</td>
									 <td>${entity.retAmt}</td>
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
