package com.site.util;

/**
 * 通用常量类
 * 
 * @author site
 * 
 */
public class ConstantUtil {
	/**
	 * 序号列下标
	 */
	public static final int GOODS_SERIAL_INDEX = 0;
	/**
	 * 商品 barcode
	 */
	public static final int GOODS_ID_INDEX = 1;
	/**
	 * name列下标
	 */
	public static final int GOODS_NAME_INDEX = 2;
	/**
	 * 价格所需变更列下标
	 */
	public static final int GOODS_PRICE_INDEX = 3;
	/**
	 * 折率
	 */
	public static final int GOODS_DISCOUNT = 4;
	/**
	 * 折后价
	 */
	public static final int GOODS_REAL_PRICE = 5;
	/**
	 * 数量
	 */
	public static final int GOODS_SALE_NUM = 6;
	/**
	 * 金额
	 */
	public static final int GOODS_SALE_AMOUNT = 7;
	/**
	 * 大键盘Enter键盘码
	 */
	public static final int KEY_IS_MAX_ENTER = 13;
	/**
	 * 小键盘Enter键盘码
	 */
	public static final int KEY_IS_MIN_ENTER = 16777296;
	/**
	 * 键盘DOWN键盘码
	 */
	public static final int KEY_IS_DOWN = 16777218;
	/**
	 * 键盘UP键盘码
	 */
	public static final int KEY_IS_UP = 16777217;
	/**
	 * 键盘ESC键盘码
	 */
	public static final int KEY_IS_ESC = 27;
	/**
	 * 是否为解挂单 0是 1不是
	 */
	public static final int RELIEVE_WAIT_SINGLE_YES = 0;
	/**
	 * 是否为解挂单 0是 1不是
	 */
	public static final int RELIEVE_WAIT_SINGLE_NO = 1;

	/**
	 * 卡支付方式-银行卡支付
	 */
	public static final String BANK_CARD = "银   行    卡    支    付";
	/**
	 * 卡支付方式-支票支付
	 */
	public static final String CHECK = "支  票  支  付";

	/**
	 * 支付方式序号下标
	 */
	public static final int PAYMODE_INDEX = 0;
	/**
	 * 支付方式名称下标
	 */
	public static final int PAYMODE_METHOD = 1;
	/**
	 * 支付方式金额
	 */
	public static final int PAYMODE_MONEY = 2;
	/**
	 * 退货权限
	 */
	public static final int OPERATE_TYPE_1 = 1;
	/**
	 * 变价权限
	 */
	public static final int OPERATE_TYPE_4 = 4;
	/**
	 * 单品删除
	 */
	public static final int OPERATE_TYPE_5 = 5;
	/**
	 * 整单清空
	 */
	public static final int OPERATE_TYPE_6 = 6;
	/**
	 * 修改商品数量
	 */
	public static final int OPERATE_TYPE_7 = 7;
	/**
	 * 打印类型 0打印 1单品取消 2整单取消 3修改数量 4修改价格
	 */
	public static final int ISPRINTTYPE_0 = 0;
	/**
	 * 打印类型 0打印 1单品取消 2整单取消 3修改数量 4修改价格
	 */
	public static final int ISPRINTTYPE_1 = 1;
	/**
	 * 打印类型 0打印 1单品取消 2整单取消 3修改数量 4修改价格
	 */
	public static final int ISPRINTTYPE_2 = 2;
	/**
	 * 打印类型 0打印 1单品取消 2整单取消 3修改数量 4修改价格
	 */
	public static final int ISPRINTTYPE_3 = 3;
	/**
	 * 打印类型 0打印 1单品取消 2整单取消 3修改数量 4修改价格
	 */
	public static final int ISPRINTTYPE_4 = 4;
	/**
	 * 是否整单退 0 否 1是
	 */
	public static final String IS_RETURN_GOODS_0 = "0";
	/**
	 * 是否整单退 0 否 1是
	 */
	public static final String IS_RETURN_GOODS_1 = "1";
	/**
	 * 当日MIS扣款
	 */
	public static final String MIS_01 = "01";
	public static final String MIS_MESSAGE_01 = "当日MIS扣款";

	/**
	 * 隔日MIS扣款
	 */
	public static final String MIS_02 = "02";
	public static final String MIS_MESSAGE_02 = "隔日MIS扣款";
	// 日志
	/**
	 * 退货
	 */
	public static final String HANDLE_TYPE_C1 = "C1";
	/**
	 * 日结
	 */
	public static final String HANDLE_TYPE_C2 = "C2";
	/**
	 * 打折
	 */
	public static final String HANDLE_TYPE_C3 = "C3";
	/**
	 * 变价
	 */
	public static final String HANDLE_TYPE_C4 = "C4";
	/**
	 * 单品取消
	 */
	public static final String HANDLE_TYPE_C5 = "C5";
	/**
	 * 整单取消
	 */
	public static final String HANDLE_TYPE_C6 = "C6";
	/**
	 * 改变数量
	 */
	public static final String HANDLE_TYPE_C7 = "C7";
	/**
	 * 交接班
	 */
	public static final String HANDLE_TYPE_C8 = "C8";
	/**
	 * 冲正异常
	 */
	public static final String HANDLE_TYPE_C9 = "C9";
	/**
	 * 是否可变更价格
	 */
	public static final String IS_PRICE = "1";
	
	/**
	 * 门店销售
	 */
	public static final String CODE_NO_V1 = "V1";
	/**
	 * 门店团购
	 */
	public static final String CODE_NO_V2 = "V2";
	/**
	 * 线上销售
	 */
	public static final String CODE_NO_V3 = "V3";
	/**
	 * 批发
	 */
	public static final String CODE_NO_V4 = "V4";
	/**
	 * 租赁销售
	 */
	public static final String CODE_NO_V5 = "V5";
	/**
	 * 代理销售
	 */
	public static final String CODE_NO_V6 = "V6";
	/**
	 * 调拨
	 */
	public static final String CODE_NO_V7 = "V7";
	/**
	 * 所需税控的分店
	 */
	public static final String TAX_SHOP_NO = "1203,";
	/**
	 * 瑞康一卡通的分店
	 */
	public static final String RK_ONECAR_SHOP_NO = "6101,6102,6103,6105,6109,6111,";
	/**
	 * 入库分店记录log
	 */
	public static final String CREATE_INSERT_DATA = "1002,";
}
