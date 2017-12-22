package com.sn.smart.order.dto;

import java.util.List;

public class OrderCountConditionMultiDto extends OrderCountConditionDto {

	private List<OrderCountConditionDto> orderCountConditionList;

	public List<OrderCountConditionDto> getOrderCountConditionList() {
		return orderCountConditionList;
	}

	public void setOrderCountConditionList(List<OrderCountConditionDto> orderCountConditionList) {
		this.orderCountConditionList = orderCountConditionList;
	}

}
