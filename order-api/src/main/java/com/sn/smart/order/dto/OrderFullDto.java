package com.sn.smart.order.dto;

import java.io.Serializable;

/**
 * 订单信息
 * 
 * @author snzigod@hotmail.com
 * @param <T>
 * 
 */
public class OrderFullDto<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2249356706047014859L;

	/**
	 * 订单信息
	 */
	private OrderDto order;
	/**
	 * 订单扩展信息
	 */
	private T orderExtension;

	public OrderDto getOrder() {
		return order;
	}

	public void setOrder(OrderDto order) {
		this.order = order;
	}

	public T getOrderExtension() {
		return orderExtension;
	}

	public void setOrderExtension(T orderExtension) {
		this.orderExtension = orderExtension;
	}

}
