package com.sn.smart.order.constants;

/**
 * 订单字典枚举
 * 
 * @author snzigod@hotmail.com
 *
 */
public enum OrderDicEnum {

	/**
	 * 系统
	 */
	SYSTEM("system_code", "system_name", null),
	/**
	 * 区域
	 */
	AREA("area_code", "area_name", null),
	/**
	 * 订单类型
	 */
	ORDER_TYPE("order_type", "order_type_name", null),
	/**
	 * 商家
	 */
	MERCHANT("merchant_id", "merchant_name", null),
	/**
	 * 网点
	 */
	BRANCH("branch_id", "branch_name", null),
	/**
	 * 商品
	 */
	PRODUCT("product_id", "product_name", null);

	/**
	 * 键
	 */
	private String key;
	/**
	 * 值
	 */
	private String value;
	/**
	 * 排序（可自定义设置）
	 */
	private String sort;

	OrderDicEnum(String key, String value, String sort) {
		this.key = key;
		this.value = value;
		this.sort = sort == null ? "order by key" : sort;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

}
