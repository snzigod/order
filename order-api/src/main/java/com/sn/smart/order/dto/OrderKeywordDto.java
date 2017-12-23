package com.sn.smart.order.dto;

import java.io.Serializable;

import com.sn.smart.order.constants.OrderKeywordEnum;

/**
 * 订单关键字
 * 
 * @author snzigod@hotmail.com
 *
 */
public class OrderKeywordDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6686103219259812481L;
	/**
	 * 关键字
	 */
	private OrderKeywordEnum[] keywordEnums;
	/**
	 * 关键字值
	 */
	private String keywordValue;

	public OrderKeywordEnum[] getKeywordEnums() {
		return keywordEnums;
	}

	public void setKeywordEnums(OrderKeywordEnum[] keywordEnums) {
		this.keywordEnums = keywordEnums;
	}

	public String getKeywordValue() {
		return keywordValue;
	}

	public void setKeywordValue(String keywordValue) {
		this.keywordValue = keywordValue;
	}

}
