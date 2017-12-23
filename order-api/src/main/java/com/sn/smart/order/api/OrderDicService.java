package com.sn.smart.order.api;

import java.util.List;

import com.sn.smart.order.constants.OrderDicEnum;
import com.sn.smart.order.dto.OrderDicDto;

/**
 * 订单字典
 * 
 * @author snzigod@hotmail.com
 *
 */
public interface OrderDicService {
	/**
	 * 获取订单字典
	 * 
	 * @param orderDicEnum
	 *            订单字典枚举
	 * @return 订单字典
	 */
	List<OrderDicDto> getOrderDicList(OrderDicEnum orderDicEnum);
}
