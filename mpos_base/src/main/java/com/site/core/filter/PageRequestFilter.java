package com.site.core.filter;

import com.site.core.base.ThreadLocalMap;
import com.site.core.page.DefaultPage;
import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PageRequestFilter implements Filter {
	private List<String> noCheckList = new ArrayList<String>();
	private static int pageNo = 10;
	@Override
	public void init(FilterConfig init) throws ServletException {
		String noChecks = init.getInitParameter("noCheck");
		String pageNoStr = init.getInitParameter("pageNo");
		pageNo = Integer.parseInt(pageNoStr);
		if (StringUtils.isNotBlank(noChecks)) {
			if (StringUtils.indexOf(noChecks, ",") != -1) {
				for (String no : noChecks.split(",")) {
					noCheckList.add(StringUtils.trimToEmpty(no));
				}
			} else {
				noCheckList.add(noChecks);
			}
		}
	}

	private boolean check(String path) {
		if (noCheckList == null || noCheckList.size() <= 0)
			return false;
		for (String s : noCheckList) {
			if (path.endsWith(s)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;

		// 将上一个页面的地址保存到session里面
		HttpSession session = request.getSession();
		// 这个只能捕获到浏览器上面的地址，所以只能用get请求
		String header = request.getHeader("Referer");
		// 只捕获list页面,避免查看和更新返回进入死循环
		if (header != null && header.contains("list.do")) {
			session.setAttribute("lastUrl", header);
		}

		String contextpath = request.getContextPath();
		if ("/".equals(contextpath)) {
			contextpath = "";
		}
		if (check(request.getRequestURI())) {
			DefaultPage defaultPage = new DefaultPage();
			defaultPage.setLimit(pageNo);
			if (!StringUtils.isEmpty(request.getParameter("pageNo"))) {
				String pageNo = request.getParameter("pageNo");
				defaultPage.setPage(Integer.parseInt(pageNo));
			}
			ThreadLocalMap.put("page", defaultPage);
			arg2.doFilter(request, response);
		} else {
			arg2.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {

	}

}
