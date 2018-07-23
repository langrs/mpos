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
				<a type="button" class="btn btn-success btn-sm bing-btn-sm" href="${contextPath}/tNotice/edit.do?id=${tNotice.id}">修改 </a>
				<a type="button" href="${sessionScope.lastUrl }" class="btn btn-warning btn-sm bing-btn-sm">返回 </a>
			</div>
		</div>
	</section>	
	<section class="row">
		<div class="col-sm-12 col-md-12">
			<table cellspacing="0" cellpadding="0" class="maoye-table mgtop10">
				<tbody>
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="id"  value="${tNotice.id}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="noticeNo"  value="${tNotice.noticeNo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="title"  value="${tNotice.title}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="memo"  value="${tNotice.memo}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td></td>
					<td><input class="input-text-lg2" name="validDate"  value="<fmt:formatDate value="${tNotice.validDate}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>创建人</td>
					<td><input class="input-text-lg2" name="createBy"  value="${tNotice.createBy}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>创建日期</td>
					<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tNotice.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>最后修改人</td>
					<td><input class="input-text-lg2" name="updateBy"  value="${tNotice.updateBy}"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>最后修改日期</td>
					<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tNotice.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
				</tr>	
				<tr>
					<td>是否有效</td>
					<td><input class="input-text-lg2" name="isFlag"  value="${tNotice.isFlag}"  disabled="disabled"></td>
				</tr>	
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>				
