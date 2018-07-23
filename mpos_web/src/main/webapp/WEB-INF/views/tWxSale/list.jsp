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
            onclick="delete_check('${contextPath}/tWxSale/delete.do','listTable');">删除</button>
        <a type="button" class="btn btn-success btn-sm bing-btn-sm nav-a"
            href="${contextPath}/tWxSale/add.do" target="mainIframe">新增</a>
    </ol>
    <form:form id="listForm" name="listForm" modelAttribute="tWxSale"
        action="${contextPath}/tWxSale/list.do" method="get" class="form-inline">
        <div class="row">
            <form:input class="query-input" path="id" placeholder="ID" />
            <form:input class="query-input" path="saleNo" placeholder="销售流水号" />
            <form:input class="query-input" path="saleDate" placeholder="销售日期" />
            <form:input class="query-input" path="userId" placeholder="收银员ID" />
            <form:input class="query-input" path="saleNoShort" placeholder="交易序号" />
            <form:input class="query-input" path="dealType" placeholder="交易类型" />
            <form:input class="query-input" path="saleSource" placeholder="销售来源" />
            <form:input class="query-input" path="saleType" placeholder="销售单类型" />
            <form:input class="query-input" path="companyId" placeholder="公司ID" />
            <form:input class="query-input" path="shopId" placeholder="分店" />
            <form:input class="query-input" path="posId" placeholder="终端" />
            <form:input class="query-input" path="storeId" placeholder="商铺" />
            <form:input class="query-input" path="vipNo" placeholder="会员卡号" />
            <form:input class="query-input" path="originalPoints" placeholder="期初积分" />
            <form:input class="query-input" path="salePoints" placeholder="销售积分" />
            <form:input class="query-input" path="originalAmt" placeholder="原价金额" />
            <form:input class="query-input" path="saleAmt" placeholder="应收金额" />
            <form:input class="query-input" path="payAmt" placeholder="实收金额" />
            <form:input class="query-input" path="discAmt" placeholder="折扣金额" />
            <form:input class="query-input" path="isTrain" placeholder="培训模式" />
            <form:input class="query-input" path="reason" placeholder="退货理由" />
            <form:input class="query-input" path="retAmt" placeholder="退货金额" />
            <form:input class="query-input" path="ebillType" placeholder="领取电子小票" />
            <button type="submit" class="btn  btn-sm bing-btn-sm">查 询</button>
        </div>
    </form:form>

    <section class="row">
        <div class="col-sm-12">
            <table class="table table-striped  mgtop10" id="listTable">
                <thead>
                    <th><input id="allSelect" type="checkbox"></th> 
                    <th>ID</th>
                    <th>销售流水号</th>
                    <th>销售日期</th>
                    <th>收银员ID</th>
                    <th>交易序号</th>
                    <th>交易类型</th>
                    <th>销售来源</th>
                    <th>销售单类型</th>
                    <th>公司ID</th>
                    <th>分店</th>
                    <th>终端</th>
                    <th>商铺</th>
                    <th>会员卡号</th>
                    <th>期初积分</th>
                    <th>销售积分</th>
                    <th>原价金额</th>
                    <th>应收金额</th>
                    <th>实收金额</th>
                    <th>折扣金额</th>
                    <th>培训模式</th>
                    <th>退货理由</th>
                    <th>退货金额</th>
                    <th>领取电子小票</th>
                    <th>操作</th>
                </thead>
                <tbody>                    
                    <c:forEach items="${list}" var="entity">
                        <tr onclick="setBox(this);">
                            <td><input name="singleCkb" type="checkbox" data-ckb-id="${entity.id}"></td>
                            <td>${entity.id}</td>                            
                            <td>${entity.saleNo}</td>                            
                            <td><fmt:formatDate value="${entity.saleDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                            <td>${entity.userId}</td>                            
                            <td>${entity.saleNoShort}</td>                            
                            <td>${entity.dealType}</td>                            
                            <td>${entity.saleSource}</td>                            
                            <td>${entity.saleType}</td>                            
                            <td>${entity.companyId}</td>                            
                            <td>${entity.shopId}</td>                            
                            <td>${entity.posId}</td>                            
                            <td>${entity.storeId}</td>                            
                            <td>${entity.vipNo}</td>                            
                            <td>${entity.originalPoints}</td>                            
                            <td>${entity.salePoints}</td>                            
                            <td>${entity.originalAmt}</td>                            
                            <td>${entity.saleAmt}</td>                            
                            <td>${entity.payAmt}</td>                            
                            <td>${entity.discAmt}</td>                            
                            <td>${entity.isTrain}</td>                            
                            <td>${entity.reason}</td>                            
                            <td>${entity.retAmt}</td>                            
                            <td>${entity.ebillType}</td>                            
                            <td>
                            <a href="${contextPath}/tWxSale/view.do?id=${entity.id}" style="margin-left: 0px;">查看</a>
                            <a href="${contextPath}/tWxSale/edit.do?id=${entity.id}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </section>
</body>
</html>                    


