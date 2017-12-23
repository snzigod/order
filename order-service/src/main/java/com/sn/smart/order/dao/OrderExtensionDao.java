package com.sn.smart.order.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sn.smart.core.paginator.domain.PageBounds;
import com.sn.smart.core.paginator.domain.PageList;
import com.sn.smart.order.entity.OrderExtension;

/**
 * 订单扩展信息
 * 
 * @author snzigod@hotmail.com
 *
 */
@Repository
public interface OrderExtensionDao {

	/**
	 * 批量新增订单扩展信息
	 * 
	 * @param orderExtension
	 *            订单扩展信息
	 * @return 新增订单扩展数
	 */
	int bachInsertOrderExtension(List<OrderExtension> orderExtension);

	/**
	 * 删除订单扩展信息
	 * 
	 * @param orderId
	 *            订单ID
	 * @return 订单删除数
	 */
	int delOrderExtensionByOrderId(String orderId);

	/**
	 * 获取订单扩展信息分页列表
	 * 
	 * @param orderId
	 *            订单ID
	 * @param pageBounds
	 *            分页条件
	 * @return 订单扩展信息分页列表
	 */
	PageList<OrderExtension> getOrderExtensionPageListByOrderId(String orderId, PageBounds pageBounds);

}