package com.sn.smart.order.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sn.smart.core.paginator.domain.PageBounds;
import com.sn.smart.core.paginator.domain.PageList;
import com.sn.smart.order.dto.OrderDicDto;

/**
 * 订单字典
 * 
 * @author snzigod@hotmail.com
 *
 */
@Repository
public interface OrderDicDao {

	/**
	 * 获取订单字典列表
	 * 
	 * @param dicKeyClumn
	 *            字典键
	 * @param dicValueClumn
	 *            字典值
	 * @param dicValueClumn
	 *            字典查询条件
	 * @param dicSortClumn
	 *            字典排序
	 * @param pageBounds
	 *            分页条件
	 * @return 订单字典列表
	 */
	PageList<OrderDicDto> getOrderDicPageList(@Param("dicKeyClumn") String dicKeyClumn,
			@Param("dicValueClumn") String dicValueClumn, @Param("dicSortClumn") String dicSortClumn,
			PageBounds pageBounds);
}
