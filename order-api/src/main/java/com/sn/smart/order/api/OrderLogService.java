package com.sn.smart.order.api;

import java.util.List;

import com.sn.smart.order.dto.OrderLogDto;

/**
 * 订单日志
 * 
 * @author snzigod@hotmail.com
 *
 */
public interface OrderLogService {

	/**
	 * 根据订单ID或NO获取订单日志列表
	 * 
	 * @param idOrNo
	 *            订单ID或NO
	 * @return 订单日志列表
	 */
	List<OrderLogDto> getOrderLogList(String idOrNo);
}
