package com.sn.smart.order.entity;

import java.util.Date;

import lombok.Data;

/**
 * 订单日志
 * 
 * @author snzigod@hotmail.com
 * 
 */
@Data
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

}