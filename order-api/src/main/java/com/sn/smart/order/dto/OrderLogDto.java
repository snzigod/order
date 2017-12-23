package com.sn.smart.order.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 订单日志
 * 
 * @author snzigod@hotmail.com
 * 
 */
@Data
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

}
