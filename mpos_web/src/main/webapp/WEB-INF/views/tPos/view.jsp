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
				<a type="button" class="btn btn-success btn-sm bing-btn-sm" href="${contextPath}/tPos/edit.do?id=${tPos.id}">修改 </a>
				<a type="button" href="${sessionScope.lastUrl }" class="btn btn-warning btn-sm bing-btn-sm">返回 </a>
			</div>
		</div>
	</section>	
	<section class="row">
		<div class="col-sm-12 col-md-12">
			<table cellspacing="0" cellpadding="0" class="maoye-table mgtop10">
				<tbody>
				<tr>
					<td>ID</td>
					<td><input class="input-text-lg2" name="id"  value="${tPos.id}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>终端编码</td>
					<td><input class="input-text-lg2" name="posNo"  value="${tPos.posNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>终端名称</td>
					<td><input class="input-text-lg2" name="name"  value="${tPos.name}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>收单机构</td>
					<td><input class="input-text-lg2" name="bank"  value="${tPos.bank}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>MAC地址</td>
					<td><input class="input-text-lg2" name="mac"  value="${tPos.mac}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>IP地址</td>
					<td><input class="input-text-lg2" name="ipAddr"  value="${tPos.ipAddr}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>服务器ID</td>
					<td><input class="input-text-lg2" name="serverAddr"  value="${tPos.serverAddr}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>分店ID</td>
					<td><input class="input-text-lg2" name="shopId"  value="${tPos.shopId}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>终端类型</td>
					<td><input class="input-text-lg2" name="posType"  value="${tPos.posType}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>终端属性</td>
					<td><input class="input-text-lg2" name="posAttr"  value="${tPos.posAttr}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>终端状态</td>
					<td><input class="input-text-lg2" name="state"  value="${tPos.state}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>创建人</td>
					<td><input class="input-text-lg2" name="createBy"  value="${tPos.createBy}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>创建日期</td>
					<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tPos.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>最后修改人</td>
					<td><input class="input-text-lg2" name="updateBy"  value="${tPos.updateBy}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>最后修改日期</td>
					<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tPos.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>是否有效</td>
					<td><input class="input-text-lg2" name="isFlag"  value="${tPos.isFlag}"  disabled="disabled"></td>
				</tr>	
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>				
