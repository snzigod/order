package com.sn.smart.order.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 订单扩展信息
 * 
 * @author snzigod@hotmail.com
 * 
 */
@Data
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

}
