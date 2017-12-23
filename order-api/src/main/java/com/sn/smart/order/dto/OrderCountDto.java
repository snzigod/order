package com.sn.smart.order.dto;

import java.io.Serializable;

import com.sn.smart.order.constants.OrderCountEnum;

import lombok.Data;

/**
 * 单个统计的统计条件
 * 
 * @author snzigod@hotmail.com
 *
 */
@Data
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

}
