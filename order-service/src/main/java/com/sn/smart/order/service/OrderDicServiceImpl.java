package com.sn.smart.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.sn.smart.core.paginator.domain.PageBounds;
import com.sn.smart.order.api.OrderDicService;
import com.sn.smart.order.constants.OrderDicEnum;
import com.sn.smart.order.dao.OrderDicDao;
import com.sn.smart.order.dto.OrderDicDto;

@Service(version = "${dubbo.service.version}")
public class OrderDicServiceImpl implements OrderDicService {

	@Autowired
	private OrderDicDao orderDicDao;

	public List<OrderDicDto> getOrderDicList(OrderDicEnum orderDicEnum) {
		return orderDicDao.getOrderDicPageList(orderDicEnum.getKey(), orderDicEnum.getValue(), orderDicEnum.getSort(),
				new PageBounds());
	}

}
