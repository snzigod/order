package com.sn.smart.order.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单日志
 * 
 * @author snzigod@hotmail.com
 * 
 */
public class OrderLogDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 578523758967870732L;
	/**
	 * ID（只读）。
	 */
	private String id;
	/**
	 * 订单ID。
	 */
	private String orderId;
	/**
	 * 业务状态。
	 */
	private Short serviceState;
	/**
	 * 操作状态,订单操作要产生的状态.
	 */
	private Short orderState;
	/**
	 * 操作业务状态,订单操作要产生的业务状态.
	 */
	private Short operateServiceState;
	/**
	 * 操作状态。
	 */
	private Short operateState;
	/**
	 * 描述。
	 */
	private String remark;
	/**
	 * 创建人。
	 */
	private String createUser;
	/**
	 * 创建时间（只读）。
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

	public Short getServiceState() {
		return serviceState;
	}

	public void setServiceState(Short serviceState) {
		this.serviceState = serviceState;
	}

	public Short getOrderState() {
		return orderState;
	}

	public void setOrderState(Short orderState) {
		this.orderState = orderState;
	}

	public Short getOperateServiceState() {
		return operateServiceState;
	}

	public void setOperateServiceState(Short operateServiceState) {
		this.operateServiceState = operateServiceState;
	}

	public Short getOperateState() {
		return operateState;
	}

	public void setOperateState(Short operateState) {
		this.operateState = operateState;
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
