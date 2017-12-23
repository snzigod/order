package com.sn.smart.order.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sn.smart.core.paginator.domain.PageBounds;
import com.sn.smart.core.paginator.domain.PageList;
import com.sn.smart.order.dto.OrderCountConditionDto;
import com.sn.smart.order.dto.OrderCountMultiConditionDto;
import com.sn.smart.order.dto.OrderCountResultDto;

/**
 * 订单 统计分析
 * 
 * @author snzigod@hotmail.com
 *
 */
@Repository
public interface OrderCountDao {

	/**
	 * 获取单个统计结果
	 * 
	 * @param countClumn
	 *            统计对象
	 * @param orderCountCondition
	 *            统计条件
	 * @return 单个统计结果
	 */
	String getOrderCountByCondition(@Param("countClumn") String countClumn,
			@Param("orderConditionDto") OrderCountConditionDto orderCountCondition);

	/**
	 * 获取单个统计结果
	 * 
	 * @param countClumn
	 *            统计对象
	 * @param orderCountCondition
	 *            复合统计条件
	 * @return 单个统计结果
	 */
	String getOrderCountByMultiCondition(@Param("countClumn") String countClumn,
			@Param("orderCountMultiConditionDto") OrderCountMultiConditionDto orderCountConditionMulti);

	/**
	 * 获取多个统计结果
	 * 
	 * @param countClumnList
	 *            统计对象
	 * @param orderCountCondition
	 *            统计条件
	 * @return 多个统计结果
	 */
	String getOrderCountsByCondition(@Param("countClumnList") List<String> countClumnList,
			@Param("orderConditionDto") OrderCountConditionDto orderCountCondition);

	/**
	 * 获取多个统计结果
	 * 
	 * @param countClumnList
	 *            统计对象
	 * @param orderCountCondition
	 *            复合统计条件
	 * @return 多个统计结果
	 */
	String getOrderCountsByMultiCondition(@Param("countClumnList") List<String> countClumnList,
			@Param("orderCountMultiConditionDto") OrderCountMultiConditionDto orderCountConditionMulti);

	/**
	 * 获取单个统计的统计列表
	 * 
	 * @param countClumn
	 *            统计对象
	 * @param countDimensionClumn
	 *            统计维度
	 * @param countOrderClumn
	 *            统计排序
	 * @param orderCountCondition
	 *            统计条件
	 * @param pageBounds
	 *            分页条件
	 * @return 单个统计的统计列表
	 */
	PageList<OrderCountResultDto> getOrderCountPageListByCondition(@Param("countClumn") String countClumn,
			@Param("countDimensionClumn") String countDimensionClumn, @Param("countOrderClumn") String countOrderClumn,
			@Param("orderConditionDto") OrderCountConditionDto orderCountCondition, PageBounds pageBounds);

	/**
	 * 获取单个统计的统计列表
	 * 
	 * @param countClumn
	 *            统计对象
	 * @param countDimensionClumn
	 *            统计维度
	 * @param countOrderClumn
	 *            统计排序
	 * @param orderCountCondition
	 *            复合统计条件
	 * @param pageBounds
	 *            分页条件
	 * @return 单个统计的统计列表
	 */
	PageList<OrderCountResultDto> getOrderCountPageListByMultiCondition(@Param("countClumn") String countClumn,
			@Param("countDimensionClumn") String countDimensionClumn, @Param("countOrderClumn") String countOrderClumn,
			@Param("orderCountMultiConditionDto") OrderCountMultiConditionDto orderCountConditionMulti,
			PageBounds pageBounds);

	/**
	 * 获取多个统计的统计列表
	 * 
	 * @param countClumnList
	 *            统计对象
	 * @param countDimensionClumn
	 *            统计维度
	 * @param countOrderClumnList
	 *            统计排序
	 * @param orderCountCondition
	 *            统计条件
	 * @param pageBounds
	 *            分页条件
	 * @return 多个统计的统计列表
	 */
	PageList<OrderCountResultDto> getOrderCountsPageListByCondition(
			@Param("countClumnList") List<String> countClumnList,
			@Param("countDimensionClumn") String countDimensionClumn,
			@Param("countOrderClumnList") List<String> countOrderClumnList,
			@Param("orderConditionDto") OrderCountConditionDto orderCountCondition, PageBounds pageBounds);

	/**
	 * 获取多个统计的统计列表
	 * 
	 * @param countClumnList
	 *            统计对象
	 * @param countDimensionClumn
	 *            统计维度
	 * @param countOrderClumnList
	 *            统计排序
	 * @param orderCountCondition
	 *            复合统计条件
	 * @param pageBounds
	 *            分页条件
	 * @return 多个统计的统计列表
	 */
	PageList<OrderCountResultDto> getOrderCountsPageListByMultiCondition(
			@Param("countClumnList") List<String> countClumnList,
			@Param("countDimensionClumn") String countDimensionClumn,
			@Param("countOrderClumnList") List<String> countOrderClumnList,
			@Param("orderCountMultiConditionDto") OrderCountMultiConditionDto orderCountConditionMulti,
			PageBounds pageBounds);
}
