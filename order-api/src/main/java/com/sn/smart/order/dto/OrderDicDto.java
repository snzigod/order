package com.sn.smart.order.dto;

import java.io.Serializable;

/**
 * 订单字典
 * 
 * @author snzigod@hotmail.com
 *
 */
public class OrderDicDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6053618660993012519L;
	/**
	 * 字典键
	 */
	private String key;
	/**
	 * 字典值
	 */
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
