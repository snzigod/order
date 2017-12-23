package com.sn.smart.order.api;

import java.lang.reflect.Type;
import java.util.List;

import com.sn.smart.core.base.Page;
import com.sn.smart.order.dto.OrderConditionDto;
import com.sn.smart.order.dto.OrderDto;
import com.sn.smart.order.dto.OrderFullDto;
import com.sn.smart.order.dto.OrderFullMultiDto;
import com.sn.smart.order.dto.OrderMultiConditionDto;

/**
 * 订单
 * 
 * @author snzigod@hotmail.com
 *
 */
public interface OrderService {

	/**
	 * 生成订单
	 * 
	 * @param orderFullDto
	 *            订单信息（包含扩展信息）
	 * @return 订单ID
	 */
	String addOrder(OrderFullDto orderFullDto);

	/**
	 * 批量生成订单
	 * 
	 * @param orderFullDtoList
	 *            订单信息列表（包含扩展信息）
	 * @return 订单ID列表
	 */
	List<String> addOrder(List<OrderFullDto> orderFullDtoList);

	/**
	 * 生成父子订单
	 * 
	 * @param orderFullMultiDto
	 *            合并订单信息
	 * @return 父订单ID
	 */
	String addOrder(OrderFullMultiDto orderFullMultiDto);

	/**
	 * （通过订单Id或No）修改订单
	 * 
	 * @param orderDto
	 *            待修改订单
	 * @return 修改订单数
	 */
	int modifyOrder(OrderDto orderDto);

	/**
	 * （通过订单Id或No）批量修改订单
	 * 
	 * @param orderDtoList
	 *            待修改订单列表
	 * @return 修改订单数
	 */
	int modifyOrder(List<OrderDto> orderDtoList);

	/**
	 * （通过订单Id或No）修改订单
	 * 
	 * @param orderFullDto
	 *            待修改订单（包含扩展信息）
	 * @return 修改订单数
	 */
	int modifyOrder(OrderFullDto orderFullDto);

	/**
	 * 获取订单分页列表
	 * 
	 * @param orderConditionDto
	 *            查询条件
	 * @return 订单分页列表
	 */
	Page<OrderDto> getOrderPage(OrderConditionDto orderConditionDto);

	/**
	 * 获取订单列表（支持自定义返回类型）
	 * 
	 * @param orderConditionDto
	 *            查询条件
	 * @param typeOfT
	 *            返回类型
	 * @return
	 */
	<T> Page<T> getOrderPage(OrderConditionDto orderConditionDto, Type typeOfT);

	/**
	 * 获取订单分页列表
	 * 
	 * @param orderMultiConditionDto
	 *            复合查询条件
	 * @return 订单列表
	 */
	Page<OrderDto> getOrderPage(OrderMultiConditionDto orderMultiConditionDto);

	/**
	 * 获取订单列表（支持自定义返回类型）
	 * 
	 * @param orderMultiConditionDto
	 *            查询条件
	 * @param typeOfT
	 *            返回类型
	 * @return
	 */
	<T> Page<T> getOrderPage(OrderMultiConditionDto orderMultiConditionDto, Type typeOfT);

	/**
	 * 获取订单列表
	 * 
	 * @param orderConditionDto
	 *            查询条件
	 * @return 订单列表
	 */
	List<OrderDto> getOrderList(OrderConditionDto orderConditionDto);

	/**
	 * 获取订单列表（支持自定义返回类型）
	 * 
	 * @param orderConditionDto
	 *            查询条件
	 * @param typeOfT
	 *            返回类型
	 * @return 订单列表
	 */
	<T> List<T> getOrderList(OrderConditionDto orderConditionDto, Type typeOfT);

	/**
	 * 获取订单列表
	 * 
	 * @param orderMultiConditionDto
	 *            复合查询条件
	 * @return 订单列表
	 */
	List<OrderDto> getOrderList(OrderMultiConditionDto orderMultiConditionDto);

	/**
	 * 获取订单列表（支持自定义返回类型）
	 * 
	 * @param orderMultiConditionDto
	 *            复合查询条件
	 * @param classOfT
	 *            返回类型
	 * @return 订单列表
	 */
	<T> List<T> getOrderList(OrderMultiConditionDto orderMultiConditionDto, Type typeOfT);

	/**
	 * 获取订单
	 * 
	 * @param idOrNo
	 *            订单Id或NO
	 * @return 订单
	 */
	OrderFullDto getOrder(String idOrNo);

	/**
	 * 获取订单（支持自定义返回类型）
	 * 
	 * @param idOrNo
	 *            订单Id或NO
	 * @param classOfT
	 *            返回类型
	 * @return 订单
	 */
	<T> T getOrder(String idOrNo, Class<T> classOfT);

	/**
	 * 获取订单
	 * 
	 * @param idOrNo
	 *            订单Id或NO
	 * @return 订单信息json
	 * @throws Exception
	 */
	String getOrderJosn(String idOrNo) throws Exception;

	/**
	 * 删除订单
	 * 
	 * @param idOrNo
	 *            订单Id或No列表
	 * @return 删除订单数
	 */
	int delOrder(String idOrNo);

	/**
	 * 批量删除订单
	 * 
	 * @param idOrNoList
	 *            订单Id或No列表
	 * @return 删除订单数
	 */
	int delOrder(List<String> idOrNoList);

}
