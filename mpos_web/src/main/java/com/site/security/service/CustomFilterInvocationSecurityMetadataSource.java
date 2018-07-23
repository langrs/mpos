package com.site.security.service;

import com.site.core.base.SpringContextUtil;
import com.site.dao.AuthResDao;
import com.site.entity.AuthRes;
import org.apache.log4j.Logger;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.util.*;

/**
 * 资源源数据定义，即定义某一资源可以被哪些角色访问
 * 
 * @author hujie
 * 
 */
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

	private static final Logger logger = Logger.getLogger(CustomFilterInvocationSecurityMetadataSource.class);

	private static Map<String, Collection<ConfigAttribute>> resourceMap = null;
	private PathMatcher pathMatcher = new AntPathMatcher();


	public Collection<ConfigAttribute> getAllConfigAttributes() {

		return null;
	}

	public CustomFilterInvocationSecurityMetadataSource() {
		super();
		resourceMap = loadResourceMatchAuthority();
	}

	/**
	 * 加载资源与权限的映射关系
	 * 
	 * @return
	 */
	private Map<String, Collection<ConfigAttribute>> loadResourceMatchAuthority() {

		Map<String, Collection<ConfigAttribute>> map = new HashMap<String, Collection<ConfigAttribute>>();

		// 获取资源权限映射key：url，value：role
		AuthResDao authResDao = (AuthResDao) SpringContextUtil.getBean("authResDaoImpl");
		List<AuthRes> all = authResDao.getAll();
		for (AuthRes authRes : all) {
			String key = authRes.getKey();// 资源的标识
			Collection<ConfigAttribute> list = new ArrayList<ConfigAttribute>();
			String[] vals = key.split(",");
			for (String val : vals) {
				ConfigAttribute config = new SecurityConfig(val);
				list.add(config);
			}
			map.put(authRes.getPath(), list);
		}

		return map;

	}

	public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
		String url = ((FilterInvocation) object).getRequestUrl();

		logger.debug("requestUrl is " + url);

		if (resourceMap == null) {
			loadResourceMatchAuthority();
		}
		// 比较url是否存在
		Iterator<String> ite = resourceMap.keySet().iterator();
		while (ite.hasNext()) {
			String resURL = ite.next();
			if (pathMatcher.match(resURL, url)) {
				return resourceMap.get(resURL);
			}
		}
		return resourceMap.get(url);
	}

	public boolean supports(Class<?> clazz) {
		return true;
	}
}