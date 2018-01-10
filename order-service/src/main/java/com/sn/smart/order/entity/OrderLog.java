package com.sn.smart.order.entity;

import java.util.Date;

/**
 * 订单日志
 * 
 * @author snzigod@hotmail.com
 * 
 */
public class OrderLog {
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
	 * 订单状态。
	 */
	private Short orderState;
	/**
	 * 描述。
	 */
	private String remark;
	/**
	 * 创建人。
	 */
	private String createUser;
	/**
	 * 创建时间。
	 */
	private Date createTime;

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

	public Short getOrderState() {
		return orderState;
	}

	public void setOrderState(Short orderState) {
		this.orderState = orderState;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}