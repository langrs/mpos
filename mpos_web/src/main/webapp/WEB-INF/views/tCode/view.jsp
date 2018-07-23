<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>

<body>
	<ol class="breadcrumb">
		<li>系统维护</li>
		<li>数据字典</li>
		<li class="active">数据字典详情</li>
	</ol>
	
	<section class="row">
		<div class="col-xs-8 col-md-8 pull-right">
			<div class="btn-box">
				<a type="button" class="btn btn-success btn-sm bing-btn-sm"
					href="${contextPath}/tCode/edit.do?id=${tCode.id}">修改 </a> <a
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
						<td>参数类别：</td>
						<td><input class="input-text-lg2" name="codeType"  value="${tCode.codeType}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>参数描述：</td>
						<td><input class="input-text-lg2" name="codeDesc"  value="${tCode.codeDesc}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>代码编码：</td>
						<td><input class="input-text-lg2" name="codeNo"  value="${tCode.codeNo}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>代码名称：</td>
						<td><input class="input-text-lg2" name="name"  value="${tCode.name}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>代码值：</td>
						<td><input class="input-text-lg2" name="codeValue"  value="${tCode.codeValue}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否系统代码：</td>
						<%--<td><input class="input-text-lg2" name="isSys"  value="${tCode.isSys}"  disabled="disabled"></td>--%>
						<td>
							<c:forEach items="${listTCode}" var="listTCode">
								<c:if test="${listTCode.codeType == '0002' and listTCode.codeNo == tCode.isSys}">
									${listTCode.name}
								</c:if>
							</c:forEach>
						</td>
					</tr>
					<tr>
						<td>参数属性：</td>
						<td><input class="input-text-lg2" name="codeAttr"  value="${tCode.codeAttr}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建人：</td>
						<td><input class="input-text-lg2" name="createBy"  value="${tCode.createBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>创建日期：</td>
						<td><input class="input-text-lg2" name="createTime"  value="<fmt:formatDate value="${tCode.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改人：</td>
						<td><input class="input-text-lg2" name="updateBy"  value="${tCode.updateBy}"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>最后修改日期：</td>
						<td><input class="input-text-lg2" name="updateTime"  value="<fmt:formatDate value="${tCode.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" />"  disabled="disabled"></td>
					</tr>
					<tr>
						<td>是否有效：</td>
						<%--<td><input class="input-text-lg2" name="isFlag"  value="${tCode.isFlag}"  disabled="disabled"></td>--%>
						<td>
							<c:forEach items="${listTCode}" var="listTCode">
								<c:if test="${listTCode.codeType == '0002' and listTCode.codeNo == tCode.isFlag}">
									${listTCode.name}
								</c:if>
							</c:forEach>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	
</body>
</html>
