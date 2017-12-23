package com.sn.smart.order.constants;

/**
 * 订单关键字枚举
 * 
 * @author snzigod@hotmail.com
 *
 */
public enum OrderKeywordEnum {
	/**
	 * 系统
	 */
	SYSTEM_CODE("system_code"),
	/**
	 * 系统名称
	 */
	SYSTEM_NAME("system_name"),
	/**
	 * 区域
	 */
	AREA_CODE("area_code"),
	/**
	 * 区域名称
	 */
	AREA_NAME("area_name"),
	/**
	 * 订单号
	 */
	ORDER_NO("order_no"),
	/**
	 * 交易号
	 */
	TRADE_NO("trade_no"),
	/**
	 * 定单名称
	 */
	ORDER_NAME("order_name"),
	/**
	 * 商家
	 */
	MERCHANT_ID("merchant_id"),
	/**
	 * 商家名称
	 */
	MERCHANT_NAME("merchant_name"),
	/**
	 * 网点
	 */
	BRANCH_ID("branch_id"),
	/**
	 * 网点名称
	 */
	BRANCH_NAME("branch_name"),
	/**
	 * 商品
	 */
	PRODUCT_ID("product_id"),
	/**
	 * 商品名称
	 */
	PRODUCT_NAME("product_name"),
	/**
	 * 下单人
	 */
	CREATE_USER("create_user"),
	/**
	 * 修改人
	 */
	MODIFY_USER("modify_user");

	private String value;

	OrderKeywordEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
