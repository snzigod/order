package com.sn.smart.order.dto;

import java.io.Serializable;

/**
 * 订单扩展信息
 * 
 * @author snzigod@hotmail.com
 * 
 */
public class OrderExtensionDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8013101884100561423L;
	/**
	 * ID（只读）。
	 */
	private String id;
	/**
	 * 订单ID。
	 */
	private String orderId;
	/**
	 * 扩展key值。
	 */
	private String key;
	/**
	 * 扩展value值。
	 */
	private String value;
	/**
	 * 描述。
	 */
	private String remark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
