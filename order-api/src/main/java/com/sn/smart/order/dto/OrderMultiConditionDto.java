package com.sn.smart.order.dto;

import java.util.List;

/**
 * 订单（复合）查询条件
 * 
 * @author snzigod@hotmail.com
 * 
 */
public class OrderMultiConditionDto extends OrderConditionDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4098725469657201585L;
	/**
	 * 订单复合查询条件（主条件生效时会主动覆盖子条件）
	 */
	private List<OrderConditionDto> orderConditionList;

	public List<OrderConditionDto> getOrderConditionList() {
		return orderConditionList;
	}

	public void setOrderConditionList(List<OrderConditionDto> orderConditionList) {
		this.orderConditionList = orderConditionList;
	}

}
