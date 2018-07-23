package com.site.core.taglib;

import com.site.core.base.ThreadLocalMap;
import com.site.core.page.DefaultPage;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 分页标签java 类
 * 
 * @author yanghao
 * 
 */
public class PageTage extends TagSupport {

	private static final long serialVersionUID = 5729832874890369508L;

	private String url; // 请求URI
	private int pageSize; // 每页要显示的记录数
	private int pageNo; // 当前页号
	private int total; // 总记录数

	public int doStartTag() throws JspException {
		DefaultPage defaultPage = (DefaultPage) ThreadLocalMap.get("page");
		ThreadLocalMap.reset();
		if(defaultPage==null){
			throw new JspException("当前页面未设置为白名单，请将当前页面加入分页过滤器的白名单..");
		}
		total = defaultPage.getCount();
		pageSize = defaultPage.getLimit();
		pageNo = defaultPage.getPage();
		ServletRequest servletRequest = pageContext.getRequest();
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		String urlString = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/" + this.url + "?";
		Map parameterMap = request.getParameterMap();
		Set keySet = parameterMap.keySet();
		int i = 0;
		for (Iterator iter = parameterMap.entrySet().iterator(); iter.hasNext();) {
			Map.Entry element = (Map.Entry) iter.next();
			String key = element.getKey().toString();
			if (!key.equals("pageNo")) {
				String[] value = (String[]) element.getValue();
				String strObj = value[0];
				urlString += "&" + key + "=" + strObj;
				i++;
			}
		};
		this.url = urlString;

		int pageTotal = (total + pageSize - 1) / pageSize; // 计算总页数
		pageTotal = pageTotal == 0 ? 1 : pageTotal;

		StringBuilder sb = new StringBuilder();
		// 页号越界处理
		if (pageNo > pageTotal) {
			pageNo = pageTotal;
		}
		if (pageNo < 1) {
			pageNo = 1;
		}
		sb.append("<script type='text/javascript'>" + "function page_goto(){ " + "var pageNo=$('#gotoPageNo').val();location.href='" + url + "&pageNo='+pageNo;}</script>");
		sb.append("<input type=\"hidden\" name=\"pageNo\" value=\"").append(pageNo).append("\"/>\r\n");
		sb.append("<input type=\"hidden\" name=\"pageSize\" value=\"").append(pageSize).append("\"/>\r\n");
		// sb.append("       <div class=\"Paging row\">\r\n");
		sb.append("             <div class=\"col-xs-10 paddingLeft\">\r\n");
		sb.append("                  <ul class=\"pagination pagination-sm\">\r\n");
		// 上一页处理
		if (pageNo == 1) {
			sb.append("                      <li class=\"disabled\"><a class=\"page_a\" href=\"javascript:\">« 上一页</a></li>\r\n");
		} else {
			sb.append("<li><a class=\"page_a\" href='" + url + "&pageNo=" + (pageNo - 1) + "'").append(")\">&laquo;&nbsp;上一页</a></li>\r\n");
		}
		// 下一页处理
		if (pageNo >= pageTotal) {
			sb.append("                      <li class=\"disabled\"><a class=\"page_a\" href=\"#\">下一页 »</a></li>\r\n");
		} else {
			sb.append("<li><a class=\"page_a\" href='" + url + "&pageNo=" + (pageNo + 1) + "'").append(")\">&nbsp;下一页&raquo;</a></li>\r\n");
		}
		// sb.append("             </div>\r\n");
		// sb.append("             <div class=\"col-xs-6\">\r\n");
		// sb.append("                  <div class=\"pull-right\">\r\n");
		sb.append("                       <span class=\"Paging_2\">&nbsp;&nbsp;第").append(pageNo + "/" + pageTotal + "页</span>&nbsp;&nbsp;\r\n");
		// sb.append("                       <span class=\"Paging_2\">共").append(pageTotal).append("页</span>\r\n");
		sb.append("                       <span class=\"Paging_2\">总").append(total).append("条</span>\r\n");
		sb.append("                       <span>&nbsp;&nbsp;到第&nbsp</span><input onkeyup='checkNum(this,"+pageTotal+")' id=\"gotoPageNo\" type=\"text\">\r\n页");
		sb.append("                       <a class=\"btn btn-default btn-sm Paging_3\" href=\"javascript:page_goto()\" role=\"button\">跳转</a>\r\n");
		sb.append("                  </ul>\r\n");
		sb.append("                  </div>\r\n");
		// sb.append("             </div>\r\n");
		// sb.append("        </div> \n");

		// 把生成的HTML输出到响应中
		try {
			pageContext.getOut().println(sb.toString());
		} catch (IOException e) {
			throw new JspException(e);
		}
		return SKIP_BODY;
	}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
