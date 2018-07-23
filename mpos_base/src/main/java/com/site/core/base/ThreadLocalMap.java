package com.site.core.base;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * ThreadLocal Context
 * 
 * @author hujie
 * @version
 */
public class ThreadLocalMap {
	private static Logger logger = Logger.getLogger(ThreadLocalMap.class);

	protected final static ThreadLocal<Map<String, Object>> threadContext = new MapThreadLocal();

	private ThreadLocalMap() {
	};

	public static void put(String key, Object value) {
		getContextMap().put(key, value);
	}

	public static Object remove(String key) {
		return getContextMap().remove(key);
	}

	public static Object get(String key) {
		return getContextMap().get(key);
	}
	/**
	 * ThreadLocal是一个保存当前线程的map的对象。可以将参数放入其中，就不必每一层来传递参数了。
	 * 
	 * @author hujie
	 * 
	 */
	private static class MapThreadLocal extends ThreadLocal<Map<String, Object>> {
		protected Map<String, Object> initialValue() {
			return new HashMap<String, Object>() {

				private static final long serialVersionUID = 3637958959138295593L;

				public Object put(String key, Object value) {
					if (logger.isDebugEnabled()) {
						if (containsKey(key)) {
							logger.debug("Overwritten attribute to thread context: " + key + " = " + value);
						} else {
							logger.debug("Added attribute to thread context: " + key + " = " + value);
						}
					}

					return super.put(key, value);
				}
			};
		}
	}

	/**
	 * 取得thread context Map的实例。
	 * 
	 * @return thread context Map的实例
	 */
	protected static Map<String, Object> getContextMap() {
		return (Map<String, Object>) threadContext.get();
	}

	/**
	 * 清理线程所有被hold住的对象。以便重用！
	 */

	public static void reset() {
		getContextMap().clear();
	}
}
