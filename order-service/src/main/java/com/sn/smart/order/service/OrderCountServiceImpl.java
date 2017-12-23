package com.sn.smart.order.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.sn.smart.core.paginator.domain.PageBounds;
import com.sn.smart.core.utils.ReflectUtils;
import com.sn.smart.order.api.OrderCountService;
import com.sn.smart.order.constants.OrderCountEnum;
import com.sn.smart.order.dao.OrderCountDao;
import com.sn.smart.order.dto.OrderCountConditionDto;
import com.sn.smart.order.dto.OrderCountDto;
import com.sn.smart.order.dto.OrderCountListDto;
import com.sn.smart.order.dto.OrderCountResultDto;
import com.sn.smart.order.dto.OrderCountsDto;
import com.sn.smart.order.dto.OrderCountsListDto;
import com.sn.smart.utils.time.TimeSeparator;

@Service(version = "${dubbo.service.version}")
public class OrderCountServiceImpl implements OrderCountService {

	@Autowired
	private OrderCountDao orderCountDao;

	public String getOrderCount(OrderCountDto orderCountDto) {
		if (orderCountDto.getOrderCountCondition() != null) {
			return orderCountDao.getOrderCountByCondition(orderCountDto.getCountObject().getValue(),
					orderCountDto.getOrderCountCondition());
		}
		if (orderCountDto.getOrderCountMultiCondition() != null) {
			for (OrderCountConditionDto orderCountConditionDto : orderCountDto.getOrderCountMultiCondition()
					.getOrderCountConditionList()) {
				ReflectUtils.reflectB2A(orderCountConditionDto, orderCountDto.getOrderCountMultiCondition());
			}
			return orderCountDao.getOrderCountByMultiCondition(orderCountDto.getCountObject().getValue(),
					orderCountDto.getOrderCountMultiCondition());
		}
		return null;
	}

	public String getOrderCount(OrderCountsDto orderCountsDto) {
		List<String> countClumnList = new ArrayList<String>();
		for (OrderCountEnum.CountObject countObject : orderCountsDto.getCountObject()) {
			countClumnList.add(countObject.getValue());
		}
		if (orderCountsDto.getOrderCountCondition() != null) {
			return orderCountDao.getOrderCountsByCondition(countClumnList, orderCountsDto.getOrderCountCondition());
		}
		if (orderCountsDto.getOrderCountMultiCondition() != null) {
			for (OrderCountConditionDto orderCountConditionDto : orderCountsDto.getOrderCountMultiCondition()
					.getOrderCountConditionList()) {
				ReflectUtils.reflectB2A(orderCountConditionDto, orderCountsDto.getOrderCountMultiCondition());
			}
			return orderCountDao.getOrderCountsByMultiCondition(countClumnList,
					orderCountsDto.getOrderCountMultiCondition());
		}
		return null;
	}

	public List<OrderCountResultDto> getOrderCountList(OrderCountListDto orderCountListDto) {
		String countClumn = orderCountListDto.getCountObject().getValue();
		String countDimensionClumn = new String();
		String countOrderClumn = null;
		if (orderCountListDto.getCountDimension() != null) {
			countDimensionClumn = orderCountListDto.getCountDimension().getValue();
		}
		if (orderCountListDto.getCountOrder() != null) {
			OrderCountEnum.CountOrder countOrder = orderCountListDto.getCountOrder();
			String orderType = orderCountListDto.getCountOrder().getValue();
			switch (countOrder) {
			case XPOINT_ASC:
			case XPOINT_DESC:
				countOrderClumn = countDimensionClumn + orderType;
				break;
			case YPOINT_ASC:
			case YPOINT_DESC:
				countOrderClumn = countClumn + orderType;
				break;
			default:
			}
		}
		List<OrderCountResultDto> orderCountList = null;
		if (orderCountListDto.getOrderCountCondition() != null) {
			orderCountList = orderCountDao.getOrderCountPageListByCondition(countClumn, countDimensionClumn,
					countOrderClumn, orderCountListDto.getOrderCountCondition(),
					orderCountListDto.getCountSize() == null ? new PageBounds()
							: new PageBounds(orderCountListDto.getCountSize()));
		}
		if (orderCountListDto.getOrderCountMultiCondition() != null) {
			for (OrderCountConditionDto orderCountConditionDto : orderCountListDto.getOrderCountMultiCondition()
					.getOrderCountConditionList()) {
				ReflectUtils.reflectB2A(orderCountConditionDto, orderCountListDto.getOrderCountMultiCondition());
			}
			orderCountList = orderCountDao.getOrderCountPageListByMultiCondition(countClumn, countDimensionClumn,
					countOrderClumn, orderCountListDto.getOrderCountMultiCondition(),
					orderCountListDto.getCountSize() == null ? new PageBounds()
							: new PageBounds(orderCountListDto.getCountSize()));
		}
		if (orderCountList == null) {
			return null;
		}
		switch (orderCountListDto.getCountDimension()) {
		case CREATE_TIME_SECOND:
		case MODIFY_TIME_SECOND:
			return getOrderCountList(orderCountList, orderCountListDto.getOrderCountCondition().getStartTime(),
					orderCountListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.SECOND);
		case CREATE_TIME_MINUTE:
		case MODIFY_TIME_MINUTE:
			return getOrderCountList(orderCountList, orderCountListDto.getOrderCountCondition().getStartTime(),
					orderCountListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.MINUTE);
		case CREATE_TIME_HOUR:
		case MODIFY_TIME_HOUR:
			return getOrderCountList(orderCountList, orderCountListDto.getOrderCountCondition().getStartTime(),
					orderCountListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.HOUR);
		case CREATE_TIME_DAY:
		case MODIFY_TIME_DAY:
			return getOrderCountList(orderCountList, orderCountListDto.getOrderCountCondition().getStartTime(),
					orderCountListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.DAY);
		case CREATE_TIME_MONTH:
		case MODIFY_TIME_MONTH:
			return getOrderCountList(orderCountList, orderCountListDto.getOrderCountCondition().getStartTime(),
					orderCountListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.MONTH);
		case CREATE_TIME_YEAR:
		case MODIFY_TIME_YEAR:
			return getOrderCountList(orderCountList, orderCountListDto.getOrderCountCondition().getStartTime(),
					orderCountListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.YEAR);
		default:
			return orderCountList;
		}
	}

	public List<OrderCountResultDto> getOrderCountList(OrderCountsListDto orderCountsListDto) {
		List<OrderCountEnum.CountObject> countObjList = orderCountsListDto.getCountObject();
		List<String> countClumnList = new ArrayList<String>();
		if (countObjList != null && !countObjList.isEmpty()) {
			for (OrderCountEnum.CountObject countObj : countObjList) {
				countClumnList.add(countObj.getValue());
			}
		} else {
			return null;
		}
		String countDimensionClumn = null;
		if (orderCountsListDto.getCountDimension() != null) {
			countDimensionClumn = orderCountsListDto.getCountDimension().getValue();
		}
		List<OrderCountEnum.CountOrder> countOrderList = orderCountsListDto.getCountOrder();
		List<String> orderClumnList = new ArrayList<String>();
		if (countOrderList != null && !countOrderList.isEmpty()) {
			for (OrderCountEnum.CountOrder countOrder : countOrderList) {
				String orderType = countOrder.getValue();
				switch (countOrder) {
				case XPOINT_ASC:
				case XPOINT_DESC:
					orderClumnList.add(countDimensionClumn + orderType);
					break;
				case YPOINT_ASC:
				case YPOINT_DESC:
					orderClumnList.add(countClumnList.get(orderClumnList.size()) + orderType);
					break;
				default:
				}
			}
		}
		List<OrderCountResultDto> orderCountList = null;
		if (orderCountsListDto.getOrderCountCondition() != null) {
			orderCountList = orderCountDao.getOrderCountsPageListByCondition(countClumnList, countDimensionClumn,
					orderClumnList, orderCountsListDto.getOrderCountCondition(),
					orderCountsListDto.getCountSize() == null ? new PageBounds()
							: new PageBounds(orderCountsListDto.getCountSize()));
		}
		if (orderCountsListDto.getOrderCountMultiCondition() != null) {
			for (OrderCountConditionDto orderCountConditionDto : orderCountsListDto.getOrderCountMultiCondition()
					.getOrderCountConditionList()) {
				ReflectUtils.reflectB2A(orderCountConditionDto, orderCountsListDto.getOrderCountMultiCondition());
			}
			orderCountList = orderCountDao.getOrderCountsPageListByMultiCondition(countClumnList, countDimensionClumn,
					orderClumnList, orderCountsListDto.getOrderCountMultiCondition(),
					orderCountsListDto.getCountSize() == null ? new PageBounds()
							: new PageBounds(orderCountsListDto.getCountSize()));
		}
		if (orderCountList == null) {
			return null;
		}
		switch (orderCountsListDto.getCountDimension()) {
		case CREATE_TIME_SECOND:
		case MODIFY_TIME_SECOND:
			return getOrderCountList(orderCountList, orderCountsListDto.getOrderCountCondition().getStartTime(),
					orderCountsListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.SECOND);
		case CREATE_TIME_MINUTE:
		case MODIFY_TIME_MINUTE:
			return getOrderCountList(orderCountList, orderCountsListDto.getOrderCountCondition().getStartTime(),
					orderCountsListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.MINUTE);
		case CREATE_TIME_HOUR:
		case MODIFY_TIME_HOUR:
			return getOrderCountList(orderCountList, orderCountsListDto.getOrderCountCondition().getStartTime(),
					orderCountsListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.HOUR);
		case CREATE_TIME_DAY:
		case MODIFY_TIME_DAY:
			return getOrderCountList(orderCountList, orderCountsListDto.getOrderCountCondition().getStartTime(),
					orderCountsListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.DAY);
		case CREATE_TIME_MONTH:
		case MODIFY_TIME_MONTH:
			return getOrderCountList(orderCountList, orderCountsListDto.getOrderCountCondition().getStartTime(),
					orderCountsListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.MONTH);
		case CREATE_TIME_YEAR:
		case MODIFY_TIME_YEAR:
			return getOrderCountList(orderCountList, orderCountsListDto.getOrderCountCondition().getStartTime(),
					orderCountsListDto.getOrderCountCondition().getEndTime(), TimeSeparator.TimeRangeType.YEAR);
		default:
			return orderCountList;
		}
	}

	/**
	 * 订单统计（时间轴）
	 * 
	 * @param orderCountResultDtoList
	 *            订单统计列表
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @param timeType
	 *            时间类型
	 * @return 订单统计（时间轴）
	 */
	private List<OrderCountResultDto> getOrderCountList(List<OrderCountResultDto> orderCountResultDtoList,
			Date startTime, Date endTime, TimeSeparator.TimeRangeType timeType) {
		List<OrderCountResultDto> orderCountList = new ArrayList<OrderCountResultDto>();
		SimpleDateFormat sdf = new SimpleDateFormat(timeType.getValue());
		List<Date> dateList = TimeSeparator.getTimeList(startTime, endTime, timeType);
		for (Date date : dateList) {
			OrderCountResultDto OrderCountVo = new OrderCountResultDto();
			OrderCountVo.setxPoint(sdf.format(date));
			for (OrderCountResultDto orderCount : orderCountResultDtoList) {
				if (orderCount.getxPoint().equals(OrderCountVo.getxPoint())) {
					OrderCountVo.setyPoint(orderCount.getyPoint());
				}
			}
			orderCountList.add(OrderCountVo);
		}
		return orderCountList;
	}

}
