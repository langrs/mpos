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
		top.$('#mainIframe').contents().find("#tProduceId").val(id);
		top.$('#mainIframe').contents().find("#tProduceId_name").val(name);
		top.$("#tProduceId").modal('hide');
	}
</script>

<title>茂业运营服务支撑平台</title>
</head>
<body>

	

	<form:form id="listForm" name="listForm" modelAttribute="tProduce"
		action="${contextPath}/tProduce/list.do" method="get" class="form-inline">
		<div class="row">
				<form:input class="query-input" path="id" placeholder="ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="itemNo" placeholder="商品编码" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="itemEname" placeholder="英文名称" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="name" placeholder="商品名称" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="itemSubno" placeholder="商品内码" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="storeId" placeholder="商铺" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="companyId" placeholder="公司ID" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="shopId" placeholder="分店" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="categoryId" placeholder="类别" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="brandId" placeholder="品牌" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="model" placeholder="型号" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="itemColor" placeholder="颜色码" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="itemSize" placeholder="尺码" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="produceArea" placeholder="产地" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="itemUnit" placeholder="单位" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="isPrice" placeholder="定价商品" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="itemAttr" placeholder="商品属性" />
<input class="hide" name="dialog" value="true">
				<form:input class="query-input" path="state" placeholder="商品状态" />
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
					<th>商品编码</th>
					<th>英文名称</th>
					<th>商品名称</th>
					<th>商品内码</th>
					<th>商铺</th>
					<th>公司ID</th>
					<th>分店</th>
					<th>类别</th>
					<th>品牌</th>
					<th>型号</th>
					<th>颜色码</th>
					<th>尺码</th>
					<th>产地</th>
					<th>单位</th>
					<th>售价</th>
					<th>定价商品</th>
					<th>商品属性</th>
					<th>商品状态</th>
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
									 <td>${entity.itemNo}</td>
									 <td>${entity.itemEname}</td>
									 <td>${entity.name}</td>
									 <td>${entity.itemSubno}</td>
									 <td>${entity.storeId}</td>
									 <td>${entity.companyId}</td>
									 <td>${entity.shopId}</td>
									 <td>${entity.categoryId}</td>
									 <td>${entity.brandId}</td>
									 <td>${entity.model}</td>
									 <td>${entity.itemColor}</td>
									 <td>${entity.itemSize}</td>
									 <td>${entity.produceArea}</td>
									 <td>${entity.itemUnit}</td>
									 <td>${entity.salePrice}</td>
									 <td>${entity.isPrice}</td>
									 <td>${entity.itemAttr}</td>
									 <td>${entity.state}</td>
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
