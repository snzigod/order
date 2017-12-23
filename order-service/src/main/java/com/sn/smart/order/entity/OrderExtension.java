package com.sn.smart.order.entity;

import lombok.Data;

/**
 * 订单扩展信息
 * 
 * @author snzigod@hotmail.com
 *
 */
@Data
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

}