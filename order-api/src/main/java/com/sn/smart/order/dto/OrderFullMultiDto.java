package com.sn.smart.order.dto;

import java.util.List;

public class OrderFullMultiDto<T> extends OrderFullDto<T> {

	private List<OrderFullDto<T>> orderFullDtoList;

	public List<OrderFullDto<T>> getOrderFullDtoList() {
		return orderFullDtoList;
	}

	public void setOrderFullDtoList(List<OrderFullDto<T>> orderFullDtoList) {
		this.orderFullDtoList = orderFullDtoList;
	}

}
