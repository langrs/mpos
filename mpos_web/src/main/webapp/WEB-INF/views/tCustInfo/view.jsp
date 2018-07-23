<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>

<body>
	<ol class="breadcrumb">
		<li>基础数据管理</li>
		<li>人员类型</li>
		<li class="active">人员类型详情</li>
	</ol>
	
	<section class="row">
		<div class="col-xs-8 col-md-8 pull-right">
			<div class="btn-box">
				<a type="button" class="btn btn-success btn-sm bing-btn-sm"
					href="${contextPath}/tCustInfo/edit.do?id=${tCustInfo.id}">修改 </a> <a
					type="button" href="${sessionScope.lastUrl }"
					class="btn btn-warning btn-sm bing-btn-sm">返回 </a>
			</div>
		</div>
	</section>

	<section class="row">
		<div class="col-sm-12 col-md-12">
			<table cellspacing="0" cellpadding="0" class="maoye-table mgtop10">
				<tbody>
				
					<tr>
						<td>微信号：</td>
						<td><input class="input-text-lg2" name="openId"  value="${tCustInfo.openId}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>实体卡号：</td>
						<td><input class="input-text-lg2" name="cardNo"  value="${tCustInfo.cardNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>顾客名称：</td>
						<td><input class="input-text-lg2" name="custName"  value="${tCustInfo.custName}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>顾客电话：</td>
						<td><input class="input-text-lg2" name="custPhone"  value="${tCustInfo.custPhone}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>顾客地址：</td>
						<td><input class="input-text-lg2" name="custAddr"  value="${tCustInfo.custAddr}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>顾客邮箱：</td>
						<td><input class="input-text-lg2" name="custEmail"  value="${tCustInfo.custEmail}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>顾客性别：</td>
						<td><input class="input-text-lg2" name="custSex"  value="${tCustInfo.custSex}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>顾客来源：</td>
						<td><input class="input-text-lg2" name="custSrc"  value="${tCustInfo.custSrc}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>顾客区域：</td>
						<td><input class="input-text-lg2" name="custRegion"  value="${tCustInfo.custRegion}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后消费日期：</td>
						<td><input class="input-text-lg2" name="lastDate"  value="<fmt:formatDate value="${tCustInfo.lastDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后消费金额：</td>
						<td><input class="input-text-lg2" name="lastAmt"  value="${tCustInfo.lastAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>总消费金额：</td>
						<td><input class="input-text-lg2" name="allAmt"  value="${tCustInfo.allAmt}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>顾客积分：</td>
						<td><input class="input-text-lg2" name="custPoints"  value="${tCustInfo.custPoints}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>顾客生日：</td>
						<td><input class="input-text-lg2" name="custBirth"  value="<fmt:formatDate value="${tCustInfo.custBirth}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
