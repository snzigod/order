package com.sn.smart.order.dto;

import java.util.List;

/**
 * 订单统计（复合）查询条件
 * 
 * @author snzigod@hotmail.com
 * 
 */
public class OrderCountMultiConditionDto extends OrderCountConditionDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6637221710969424722L;
	/**
	 * 订单统计复合查询条件（主条件生效时会主动覆盖子条件）
	 */
	private List<OrderCountConditionDto> orderCountConditionList;

	public List<OrderCountConditionDto> getOrderCountConditionList() {
		return orderCountConditionList;
	}

	public void setOrderCountConditionList(List<OrderCountConditionDto> orderCountConditionList) {
		this.orderCountConditionList = orderCountConditionList;
	}

}
