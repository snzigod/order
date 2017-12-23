package com.sn.smart.order.api;

import java.util.List;

import com.sn.smart.order.dto.OrderCountDto;
import com.sn.smart.order.dto.OrderCountListDto;
import com.sn.smart.order.dto.OrderCountResultDto;
import com.sn.smart.order.dto.OrderCountsDto;
import com.sn.smart.order.dto.OrderCountsListDto;

/**
 * 订单 统计分析
 * 
 * @author snzigod@hotmail.com
 *
 */
public interface OrderCountService {

	/**
	 * 获取单个统计结果
	 * 
	 * @param countDto
	 *            统计条件
	 * @return 单个统计结果
	 */
	String getOrderCount(OrderCountDto countDto);

	/**
	 * 获取多个统计结果
	 * 
	 * @param countDto
	 *            统计条件
	 * @return 多个统计结果
	 */
	String getOrderCount(OrderCountsDto countDto);

	/**
	 * 获取单个统计的统计列表
	 * 
	 * @param countListDto
	 *            统计条件
	 * @return 单个统计的统计列表
	 */
	List<OrderCountResultDto> getOrderCountList(OrderCountListDto countListDto);

	/**
	 * 获取多个统计的统计列表
	 * 
	 * @param countListDto
	 *            统计条件
	 * @return 多个统计的统计列表
	 */
	List<OrderCountResultDto> getOrderCountList(OrderCountsListDto countListDto);

}
