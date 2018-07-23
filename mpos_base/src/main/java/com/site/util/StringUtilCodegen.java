package com.site.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilCodegen {
	public static boolean isEmpty(String str) {
		if (str == null)
			return true;
		if (str.trim().equals(""))
			return true;
		return false;
	}

	public static boolean isNotEmpty(String str) {

		return !isEmpty(str);
	}
	/**
	 * 根据驱动类型，来获得表数据类型对应的java类型
	 * 
	 * @param driverName
	 *            驱动类型
	 * @param type
	 *            表的数据类型
	 * @return
	 */
	public static String getJavaTypeByDBType(String driverName, String type) {
		String ret = "String";
		if (driverName.equals(SystemConstant.MYSQL)) {
			if (type.equals("int")) {
				ret = "Integer";
			} else if (type.equals("bigint")) {
				ret = "Long";
			} else if (type.equals("varchar") || type.endsWith("text") || type.endsWith("clob")) {
				ret = "String";
			} else if (type.contains("date")) {
				ret = "Date";
			} else if (type.contains("time")) {
				ret = "Time";
			} else if (type.contains("double")) {
				ret = "Double";
			}
		}
		return ret;
	};
	/**
	 * 根据驱动类型，来获得表数据类型对应的jdbcType类型
	 * 
	 * @param driverName
	 *            驱动类型
	 * @param type
	 *            表的数据类型
	 * @return
	 */
	public static String getJdbcTypeByDBType(String driverName, String type) {
		String ret = "VARCHAR";
		if (driverName.equals(SystemConstant.MYSQL)) {
			if (type.endsWith("int") || type.equals("double") || type.equals("float") || type.equals("decimal") || type.endsWith("number")) {
				ret = "NUMERIC";
			} else if (type.contains("char")) {
				ret = "VARCHAR";
			} else if (type.equalsIgnoreCase("time") || type.equalsIgnoreCase("timestamp")) {
				ret = "TIME";
			} else if (type.equalsIgnoreCase("datetime") || type.equalsIgnoreCase("date")) {
				ret = "TIMESTAMP";
			} else if (type.endsWith("text") || type.endsWith("clob")) {
				ret = "CLOB";
			}
		}
		return ret;
	};

	/**
	 * 替换表变量
	 * 
	 * @param template
	 * @param tableName
	 * @return
	 */
	public static String replaceVariable(String template, String tableName) {
		Pattern regex = Pattern.compile("\\{(.*?)\\}");
		Matcher regexMatcher = regex.matcher(template);
		if (regexMatcher.find()) {
			String toReplace = regexMatcher.group(0);
			template = template.replace(toReplace, tableName);
		}
		return template;
	}

	/**
	 * 使用字符换替换内容
	 * 
	 * @param content
	 *            内容
	 * @param startTag
	 *            开始标签
	 * @param endTag
	 *            结束标签
	 * @param repalceWith
	 *            使用替换
	 * @return
	 */
	public static String replace(String content, String startTag, String endTag, String repalceWith) {
		String tmp = content.toLowerCase();
		String tmpStartTag = startTag.toLowerCase();
		String tmpEndTag = endTag.toLowerCase();

		StringBuffer sb = new StringBuffer();
		int beginIndex = tmp.indexOf(tmpStartTag);
		int endIndex = tmp.indexOf(tmpEndTag);
		while (beginIndex != -1 && endIndex != -1 && beginIndex < endIndex) {
			String pre = content.substring(0, tmp.indexOf(tmpStartTag) + tmpStartTag.length());
			String suffix = content.substring(tmp.indexOf(tmpEndTag));

			tmp = suffix.toLowerCase();
			content = suffix.substring(endTag.length());

			beginIndex = tmp.indexOf(tmpStartTag);
			endIndex = tmp.indexOf(tmpEndTag);
			String replaced = pre + "\r\n" + repalceWith + "\r\n" + endTag;
			sb.append(replaced);
		}
		sb.append(content);
		return sb.toString();
	}

	/**
	 * 截取字符串中的 指定两字串 中间的 字符串
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static String subString(String content, String start, String end) {
		String str = content;
		if (content.indexOf(start) != -1) {
			if (content.indexOf(end) != -1) {
				str = content.substring(content.indexOf(start) + start.length(), content.lastIndexOf(end));
			} else {
				str = content.substring(content.indexOf(start) + start.length());
			}
		}
		return str;
	}

	/**
	 * 获得符合java规范的名字,首字母大写
	 * 
	 * @param tableName
	 * @return
	 */
	public static String getJavaNameUpper(String tableName) {
		String separate = "_";// 分隔符
		String[] split = tableName.split(separate);
		tableName = "";
		for (String str : split) {
			if (isNotEmpty(str)) {
				tableName += fristUp(str);
			}
		}
		return tableName.replaceAll("BizPospay", "");
	}
	/**
	 * 获得符合java规范的名字,首字母小写
	 * 
	 * @param tableName
	 * @return
	 */
	public static String getJavaNameLower(String tableCol) {
		String javaNameFromTableName = getJavaNameUpper(tableCol);
		javaNameFromTableName = fristLower(javaNameFromTableName);
		return javaNameFromTableName;
	}
	/**
	 * 首字母大写
	 * 
	 * @param str
	 * @return
	 */
	public static String fristUp(String tableName) {
		String frist = tableName.substring(0, 1);
		String substring = tableName.substring(1);
		substring = frist.toUpperCase() + substring.toLowerCase();
		return substring;
	}
	/**
	 * 首字母小写
	 * 
	 * @param str
	 * @return
	 */
	public static String fristLower(String tableName) {
		String frist = tableName.substring(0, 1);
		String substring = tableName.substring(1);
		substring = frist.toLowerCase() + substring;
		return substring;
	}

	public static void main(String[] args) {
		String javaNameFromTableName = getJavaNameUpper("_order_prod_uct_");
		String javaNameFromTableName2 = getJavaNameUpper("customer");
		String javaNameFromTableName3 = getJavaNameUpper("order_product");
		String javaNameFromTableName4 = getJavaNameLower("order_product");
		System.out.println(javaNameFromTableName);
		System.out.println(javaNameFromTableName2);
		System.out.println(javaNameFromTableName3);
		System.out.println(javaNameFromTableName4);
	}

}
