<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html >
<html>
<head>
<script type="text/javascript" src="${staticPath}/js/list.js"></script>
<script type="text/javascript">


</script>
<title>联合智云商业平台</title>
</head>
<body>

    <ol class="breadcrumb">
        <!-- <li>首页</li> -->
        <li>组织管理</li>
        <li>test</li>
        <li>test2</li>
        <button type="button" class="btn btn-warning btn-sm bing-btn-sm nav-a"
            onclick="delete_check('${contextPath}/tWxSaleD/delete.do','listTable');">删除</button>
        <a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
            href="${contextPath}/tWxSaleD/add.do" target="mainIframe">新增</a>
    </ol>
    <form:form id="listForm" name="listForm" modelAttribute="tWxSaleD"
        action="${contextPath}/tWxSaleD/list.do" method="get" class="form-inline">
        <div class="row">
            <form:input class="query-input" path="id" placeholder="ID" />
            <form:input class="query-input" path="saleId" placeholder="主表ID" />
            <form:input class="query-input" path="saleNo" placeholder="销售流水号" />
            <form:input class="query-input" path="saleDate" placeholder="销售日期" />
            <form:input class="query-input" path="rowNo" placeholder="序号" />
            <form:input class="query-input" path="shopId" placeholder="分店" />
            <form:input class="query-input" path="storeId" placeholder="商铺" />
            <form:input class="query-input" path="itemId" placeholder="商品" />
            <form:input class="query-input" path="itemNo" placeholder="商品编码" />
            <form:input class="query-input" path="itemName" placeholder="商品名称" />
            <form:input class="query-input" path="saleNum" placeholder="销售数量" />
            <form:input class="query-input" path="salePrice" placeholder="商品单价" />
            <form:input class="query-input" path="salePriceReal" placeholder="商品折后单价" />
            <form:input class="query-input" path="itemDisc" placeholder="单品打折率" />
            <form:input class="query-input" path="itemDiscAmt" placeholder="单品打折金额" />
            <form:input class="query-input" path="vipPriceAmt" placeholder="会员价优惠金额" />
            <form:input class="query-input" path="allDistAmt" placeholder="优惠总金额" />
            <form:input class="query-input" path="itemSaleAmt" placeholder="销售总价" />
            <form:input class="query-input" path="points" placeholder="销售积分" />
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
    </form:form>

    <section class="row">
        <div class="col-sm-12">
            <table class="table table-striped  mgtop10" id="listTable">
                <thead>
                    <th><input id="allSelect" type="checkbox"></th> 
                    <th>ID</th>
                    <th>主表ID</th>
                    <th>销售流水号</th>
                    <th>销售日期</th>
                    <th>序号</th>
                    <th>分店</th>
                    <th>商铺</th>
                    <th>商品</th>
                    <th>商品编码</th>
                    <th>商品名称</th>
                    <th>销售数量</th>
                    <th>商品单价</th>
                    <th>商品折后单价</th>
                    <th>单品打折率</th>
                    <th>单品打折金额</th>
                    <th>会员价优惠金额</th>
                    <th>优惠总金额</th>
                    <th>销售总价</th>
                    <th>销售积分</th>
                    <th>操作</th>
                </thead>
                <tbody>                    
                    <c:forEach items="${list}" var="entity">
                        <tr onclick="setBox(this);">
                            <td><input name="singleCkb" type="checkbox" data-ckb-id="${entity.id}"></td>
                            <td>${entity.id}</td>                            
                            <td>${entity.saleId}</td>                            
                            <td>${entity.saleNo}</td>                            
                            <td><fmt:formatDate value="${entity.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td>${entity.rowNo}</td>                            
                            <td>${entity.shopId}</td>                            
                            <td>${entity.storeId}</td>                            
                            <td>${entity.itemId}</td>                            
                            <td>${entity.itemNo}</td>                            
                            <td>${entity.itemName}</td>                            
                            <td>${entity.saleNum}</td>                            
                            <td>${entity.salePrice}</td>                            
                            <td>${entity.salePriceReal}</td>                            
                            <td>${entity.itemDisc}</td>                            
                            <td>${entity.itemDiscAmt}</td>                            
                            <td>${entity.vipPriceAmt}</td>                            
                            <td>${entity.allDistAmt}</td>                            
                            <td>${entity.itemSaleAmt}</td>                            
                            <td>${entity.points}</td>                            
                            <td>
                            <a href="${contextPath}/tWxSaleD/view.do?id=${entity.id}" style="margin-left: 0px;">查看</a>
                            <a href="${contextPath}/tWxSaleD/edit.do?id=${entity.id}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </section>
</body>
</html>                    


