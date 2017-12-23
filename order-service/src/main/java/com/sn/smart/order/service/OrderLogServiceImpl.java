package com.sn.smart.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.google.gson.reflect.TypeToken;
import com.sn.smart.core.utils.GsonUtils;
import com.sn.smart.order.api.OrderLogService;
import com.sn.smart.order.dao.OrderLogDao;
import com.sn.smart.order.dto.OrderLogDto;

@Service(version = "${dubbo.service.version}")
public class OrderLogServiceImpl implements OrderLogService {

	@Autowired
	private OrderLogDao orderLogDao;

	public List<OrderLogDto> getOrderLogList(String idOrNo) {
		return GsonUtils.convert(orderLogDao.getOrderLogListByOrderId(idOrNo), new TypeToken<List<OrderLogDto>>() {
		}.getType());
	}

}
