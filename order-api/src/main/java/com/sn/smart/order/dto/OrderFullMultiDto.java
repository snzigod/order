package com.sn.smart.order.dto;

import java.util.List;

/**
 * 订单信息
 * 
 * @author snzigod@hotmail.com
 * @param <T>
 * @param <T>
 *
 */
public class OrderFullMultiDto<T> extends OrderFullDto<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 447869326280687637L;
	/**
	 * 子订单信息
	 */
	private List<OrderFullDto<T>> orderFullList;

	public List<OrderFullDto<T>> getOrderFullList() {
		return orderFullList;
	}

	public void setOrderFullList(List<OrderFullDto<T>> orderFullList) {
		this.orderFullList = orderFullList;
	}

}
