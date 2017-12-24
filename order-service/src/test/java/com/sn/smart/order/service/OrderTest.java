package com.sn.smart.order.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.sn.smart.order.api.OrderService;
import com.sn.smart.order.base.BaseTest;
import com.sn.smart.order.dto.OrderFullDto;

public class OrderTest extends BaseTest {

	@Autowired
	private OrderService orderService;

	/**
	 * 新增单个订单
	 * 
	 * @param <T>
	 */
	@Test
	@Rollback(true)
	public <T> void testAddOrder() {
		OrderFullDto<T> orderFullDto = new OrderFullDto<T>();
		orderService.addOrder(orderFullDto);
	}

}
