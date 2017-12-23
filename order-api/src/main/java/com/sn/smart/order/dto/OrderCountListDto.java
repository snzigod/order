package com.sn.smart.order.dto;

import com.sn.smart.order.constants.OrderCountEnum;

/**
 * 单个统计的统计列表条件
 * 
 * @author snzigod@hotmail.com
 *
 */
public class OrderCountListDto extends OrderCountDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8796736361625592579L;
	/**
	 * 统计维度
	 */
	private OrderCountEnum.CountDemension countDimension;
	/**
	 * 统计排序
	 */
	private OrderCountEnum.CountOrder countOrder;
	/**
	 * 统计长度
	 */
	private Integer countSize;

	public OrderCountEnum.CountDemension getCountDimension() {
		return countDimension;
	}

	public void setCountDimension(OrderCountEnum.CountDemension countDimension) {
		this.countDimension = countDimension;
	}

	public OrderCountEnum.CountOrder getCountOrder() {
		return countOrder;
	}

	public void setCountOrder(OrderCountEnum.CountOrder countOrder) {
		this.countOrder = countOrder;
	}

	public Integer getCountSize() {
		return countSize;
	}

	public void setCountSize(Integer countSize) {
		this.countSize = countSize;
	}

}
