package com.sn.smart.order.dto;

import java.io.Serializable;

import com.sn.smart.order.constants.OrderCountEnum;

/**
 * 单个统计的统计条件
 * 
 * @author snzigod@hotmail.com
 *
 */
public class OrderCountDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2376970180251705702L;
	/**
	 * 统计对象
	 */
	private OrderCountEnum.CountObject countObject;
	/**
	 * 统计条件
	 */
	private OrderCountConditionDto orderCountCondition;
	/**
	 * （复合）统计条件
	 */
	private OrderCountMultiConditionDto orderCountMultiCondition;

	public OrderCountEnum.CountObject getCountObject() {
		return countObject;
	}

	public void setCountObject(OrderCountEnum.CountObject countObject) {
		this.countObject = countObject;
	}

	public OrderCountConditionDto getOrderCountCondition() {
		return orderCountCondition;
	}

	public void setOrderCountCondition(OrderCountConditionDto orderCountCondition) {
		this.orderCountCondition = orderCountCondition;
	}

	public OrderCountMultiConditionDto getOrderCountMultiCondition() {
		return orderCountMultiCondition;
	}

	public void setOrderCountMultiCondition(OrderCountMultiConditionDto orderCountMultiCondition) {
		this.orderCountMultiCondition = orderCountMultiCondition;
	}

}
