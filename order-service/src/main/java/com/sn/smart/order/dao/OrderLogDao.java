package com.sn.smart.order.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sn.smart.order.entity.OrderLog;

/**
 * 订单日志数据层
 * 
 * @author snzigod@hotmail.com
 * 
 */
@Repository
public interface OrderLogDao {

	/**
	 * 新增订单日志
	 * 
	 * @param orderLog
	 *            订单日志
	 * @return 新增订单日志数
	 */
	int insertOrderLog(OrderLog orderLog);

	/**
	 * 批量新增订单日志
	 * 
	 * @param orderLogList
	 *            订单日志
	 * @return 新增订单日志数
	 */
	int bachInsertOrderLog(List<OrderLog> orderLogList);

	/**
	 * 获取订单日志列表
	 * 
	 * @param idOrNo
	 *            订单编号
	 * @return 订单日志列表
	 */
	List<OrderLog> getOrderLogListByOrderId(String idOrNo);
}