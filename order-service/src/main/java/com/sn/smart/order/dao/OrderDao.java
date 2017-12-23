package com.sn.smart.order.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sn.smart.core.paginator.domain.PageBounds;
import com.sn.smart.core.paginator.domain.PageList;
import com.sn.smart.order.dto.OrderConditionDto;
import com.sn.smart.order.dto.OrderMultiConditionDto;
import com.sn.smart.order.entity.Order;

/**
 * 订单数据层
 *
 * @author snzigod@hotmail.com
 */
@Repository
public interface OrderDao {

	/**
	 * 新增订单
	 *
	 * @param order
	 *            订单基本信息
	 * @return 新增订单数
	 */
	int insertOrder(Order order);

	/**
	 * 批量新增订单
	 *
	 * @param orderList
	 *            订单基本信息
	 * @return 新增订单数
	 */
	int bachInsertOrder(List<Order> orderList);

	/**
	 * 获取订单基本信息
	 * 
	 * @param idOrNo
	 *            订单ID或订单No
	 * @return 订单基本信息
	 */
	Order getOrder(String idOrNo);

	/**
	 * 获取订单基本信息
	 *
	 * @param id
	 *            订单ID
	 * @return 订单基本信息
	 */
	Order getOrderById(String id);

	/**
	 * 获取订单基本信息
	 *
	 * @param orderNo
	 *            订单No
	 * @return 订单基本信息
	 */
	Order getOrderByNo(String orderNo);

	/**
	 * 根据订单ID或No更新订单基本信息
	 *
	 * @param order
	 *            订单基本信息
	 * @return 更新订单数
	 */
	int updateOrderByIdOrNo(Order order);

	/**
	 * 根据父订单ID更新订单基本信息
	 *
	 * @param order
	 *            订单基本信息
	 * @return 更新订单数
	 */
	int updateOrderByParentId(Order order);

	/**
	 * 根据订单ID或No批量更新订单基本信息
	 *
	 * @param orderList
	 *            订单基本信息
	 * @return 更新订单数
	 */
	int bachUpdateOrderByIdOrNo(List<Order> orderList);

	/**
	 * 根据父订单ID批量更新订单基本信息
	 * 
	 * @param orderList
	 *            订单基本信息
	 * @return 更新订单数
	 */
	int bachUpdateOrderByParentId(List<Order> orderList);

	/**
	 * 获取订单分页列表
	 *
	 * @param orderConditionDto
	 *            订单查询条件
	 * @param pageBounds
	 *            分页条件
	 * @return 订单分页列表
	 */
	PageList<Order> getOrderPageListByCondition(@Param("orderConditionDto") OrderConditionDto orderConditionDto,
			PageBounds pageBounds);

	/**
	 * 获取订单分页列表
	 * 
	 * @param orderMultiConditionDto
	 *            订单复合查询条件
	 * @param pageBounds
	 *            分页条件
	 * @return 订单分页列表
	 */
	PageList<Order> getOrderPageListByMultiCondition(
			@Param("orderMultiConditionDto") OrderMultiConditionDto orderMultiConditionDto, PageBounds pageBounds);
}