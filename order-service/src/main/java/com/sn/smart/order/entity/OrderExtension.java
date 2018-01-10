package com.sn.smart.order.entity;

/**
 * 订单扩展信息
 * 
 * @author snzigod@hotmail.com
 *
 */
public class OrderExtension {
	/**
	 * ID。
	 */
	private String id;
	/**
	 * 订单ID。
	 */
	private String orderId;
	/**
	 * 订单NO。
	 */
	private String orderNo;
	/**
	 * 扩展信息。
	 */
	private String orderExtension;
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

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderExtension() {
		return orderExtension;
	}

	public void setOrderExtension(String orderExtension) {
		this.orderExtension = orderExtension;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}