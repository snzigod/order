package com.sn.smart.order.service;

import java.lang.reflect.Type;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.sn.smart.core.base.Page;
import com.sn.smart.order.api.OrderService;
import com.sn.smart.order.dto.OrderConditionDto;
import com.sn.smart.order.dto.OrderDto;
import com.sn.smart.order.dto.OrderFullDto;
import com.sn.smart.order.dto.OrderFullMultiDto;
import com.sn.smart.order.dto.OrderMultiConditionDto;

@Service(version = "${dubbo.service.version}")
public class OrderServiceImpl implements OrderService {

	public String addOrder(OrderFullDto orderFullDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> addOrder(List<OrderFullDto> orderFullDtoList) {
		// TODO Auto-generated method stub
		return null;
	}

	public String addOrder(OrderFullMultiDto orderFullMultiDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public int modifyOrder(OrderDto orderDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int modifyOrder(List<OrderDto> orderDtoList) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int modifyOrder(OrderFullDto orderFullDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Page<OrderDto> getOrderPage(OrderConditionDto orderConditionDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> Page<T> getOrderPage(OrderConditionDto orderConditionDto, Type typeOfT) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<OrderDto> getOrderPage(OrderMultiConditionDto orderMultiConditionDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> Page<T> getOrderPage(OrderMultiConditionDto orderMultiConditionDto, Type typeOfT) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<OrderDto> getOrderList(OrderConditionDto orderConditionDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> List<T> getOrderList(OrderConditionDto orderConditionDto, Type typeOfT) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<OrderDto> getOrderList(OrderMultiConditionDto orderMultiConditionDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> List<T> getOrderList(OrderMultiConditionDto orderMultiConditionDto, Type typeOfT) {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderFullDto getOrder(String idOrNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getOrder(String idOrNo, Class<T> classOfT) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getOrderJosn(String idOrNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int delOrder(String idOrNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delOrder(List<String> idOrNoList) {
		// TODO Auto-generated method stub
		return 0;
	}

}
