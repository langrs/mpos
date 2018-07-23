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
					href="${contextPath}/tSerial/edit.do?id=${tSerial.id}">修改 </a> <a
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
						<td>编码名称：</td>
						<td><input class="input-text-lg2" name="name"  value="${tSerial.name}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>系统代号：</td>
						<td><input class="input-text-lg2" name="serialType"  value="${tSerial.serialType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>流水位数：</td>
						<td><input class="input-text-lg2" name="serialLength"  value="${tSerial.serialLength}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>编号长度：</td>
						<td><input class="input-text-lg2" name="serialLong"  value="${tSerial.serialLong}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>机构代码：</td>
						<td><input class="input-text-lg2" name="isOrg"  value="${tSerial.isOrg}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>日期格式：</td>
						<td><input class="input-text-lg2" name="dateFormate"  value="${tSerial.dateFormate}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>当前流水：</td>
						<td><input class="input-text-lg2" name="serialNum"  value="${tSerial.serialNum}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tSerial.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tSerial.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tSerial.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tSerial.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<td><input class="input-text-lg2" name="isFlag"  value="${tSerial.isFlag}"  disabled="disabled"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
