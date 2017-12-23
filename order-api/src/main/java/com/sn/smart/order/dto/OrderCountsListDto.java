package com.sn.smart.order.dto;

import java.util.List;

import com.sn.smart.order.constants.OrderCountEnum;

/**
 * 多个统计的统计列表条件
 * 
 * @author snzigod@hotmail.com
 *
 */
public class OrderCountsListDto extends OrderCountsDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4409877832564009533L;
	/**
	 * 统计维度
	 */
	private OrderCountEnum.CountDemension countDimension;
	/**
	 * 统计排序
	 */
	private List<OrderCountEnum.CountOrder> countOrder;
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

	public List<OrderCountEnum.CountOrder> getCountOrder() {
		return countOrder;
	}

	public void setCountOrder(List<OrderCountEnum.CountOrder> countOrder) {
		this.countOrder = countOrder;
	}

	public Integer getCountSize() {
		return countSize;
	}

	public void setCountSize(Integer countSize) {
		this.countSize = countSize;
	}

}
