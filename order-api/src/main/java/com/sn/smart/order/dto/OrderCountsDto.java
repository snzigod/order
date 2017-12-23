package com.sn.smart.order.dto;

import java.io.Serializable;
import java.util.List;

import com.sn.smart.order.constants.OrderCountEnum;

/**
 * 多个统计的统计条件
 * 
 * @author snzigod@hotmail.com
 *
 */
public class OrderCountsDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4734226447374262182L;
	/**
	 * 统计对象
	 */
	private List<OrderCountEnum.CountObject> countObject;
	/**
	 * 统计条件
	 */
	private OrderCountConditionDto orderCountCondition;
	/**
	 * （复合）统计条件
	 */
	private OrderCountMultiConditionDto orderCountMultiCondition;

	public List<OrderCountEnum.CountObject> getCountObject() {
		return countObject;
	}

	public void setCountObject(List<OrderCountEnum.CountObject> countObject) {
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
