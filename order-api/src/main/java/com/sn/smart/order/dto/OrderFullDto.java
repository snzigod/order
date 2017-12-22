package com.sn.smart.order.dto;

public class OrderFullDto<T> {

	/**
	 * 订单信息
	 */
	private OrderDto orderDto;
	/**
	 * 订单扩展信息
	 */
	private T orderExtensionDto;

	public OrderDto getOrderDto() {
		return orderDto;
	}

	public void setOrderDto(OrderDto orderDto) {
		this.orderDto = orderDto;
	}

	public T getOrderExtensionDto() {
		return orderExtensionDto;
	}

	public void setOrderExtensionDto(T orderExtensionDto) {
		this.orderExtensionDto = orderExtensionDto;
	}

}
