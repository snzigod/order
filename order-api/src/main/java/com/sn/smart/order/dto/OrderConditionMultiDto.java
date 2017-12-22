package com.sn.smart.order.dto;

import java.util.List;

public class OrderConditionMultiDto extends OrderConditionDto {

	private List<OrderConditionDto> orderSearchDtoList;

	public List<OrderConditionDto> getOrderSearchDtoList() {
		return orderSearchDtoList;
	}

	public void setOrderSearchDtoList(List<OrderConditionDto> orderSearchDtoList) {
		this.orderSearchDtoList = orderSearchDtoList;
	}

}
