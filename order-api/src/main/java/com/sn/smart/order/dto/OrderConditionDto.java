package com.sn.smart.order.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sn.smart.order.constants.OrderKeywordEnum;

/**
 * 订单查询条件
 * 
 * @author snzigod@hotmail.com
 * 
 */
public class OrderConditionDto extends OrderDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5259950365204983865L;
	/**
	 * 多个订单类型
	 */
	private List<Short> orderTypeList;
	/**
	 * 多个订单状态
	 */
	private List<Short> orderStateList;
	/**
	 * 多个服务状态
	 */
	private List<Short> serviceStateList;
	/**
	 * 订单来源
	 */
	private List<Short> orderSourceList;
	/**
	 * 订单关键字
	 */
	private OrderKeywordDto orderKeywordDto;
	/**
	 * 订单关键字值
	 */
	private List<String> keywordCloumnList;
	/**
	 * 订单关键字
	 */
	private String keyword;
	/**
	 * 下单时间（开始）。
	 */
	private Date startTime;
	/**
	 * 下单时间（结束）。
	 */
	private Date endTime;
	/**
	 * 修改时间（开始）。
	 */
	private Date startMTime;
	/**
	 * 修改时间（结束）。
	 */
	private Date endMTime;
	/**
	 * 页码（仅用于分页方法）。
	 */
	private Integer pageIndex;
	/**
	 * 页大小（仅用于分页方法）。
	 */
	private Integer pageSize;

	public List<Short> getOrderTypeList() {
		return orderTypeList;
	}

	public void setOrderTypeList(List<Short> orderTypeList) {
		this.orderTypeList = orderTypeList;
	}

	public List<Short> getOrderStateList() {
		return orderStateList;
	}

	public void setOrderStateList(List<Short> orderStateList) {
		this.orderStateList = orderStateList;
	}

	public List<Short> getServiceStateList() {
		return serviceStateList;
	}

	public void setServiceStateList(List<Short> serviceStateList) {
		this.serviceStateList = serviceStateList;
	}

	public List<Short> getOrderSourceList() {
		return orderSourceList;
	}

	public void setOrderSourceList(List<Short> orderSourceList) {
		this.orderSourceList = orderSourceList;
	}

	public OrderKeywordDto getOrderKeywordDto() {
		return orderKeywordDto;
	}

	public void setOrderKeywordDto(OrderKeywordDto orderKeywordDto) {
		this.orderKeywordDto = orderKeywordDto;
		if (this.keywordCloumnList == null) {
			List<String> keywordCloumnList = new ArrayList<String>();
			OrderKeywordEnum[] keywordEnums = orderKeywordDto.getKeywordEnums();
			for (OrderKeywordEnum keywordEnum : keywordEnums) {
				keywordCloumnList.add(keywordEnum.getValue());
			}
			setKeywordCloumnList(keywordCloumnList);
		}
		if (this.keyword == null) {
			setKeyword(orderKeywordDto.getKeywordValue());
		}

	}

	public List<String> getKeywordCloumnList() {
		return keywordCloumnList;
	}

	private void setKeywordCloumnList(List<String> keywordCloumnList) {
		this.keywordCloumnList = keywordCloumnList;
	}

	public String getKeyword() {
		return keyword;
	}

	private void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartMTime() {
		return startMTime;
	}

	public void setStartMTime(Date startMTime) {
		this.startMTime = startMTime;
	}

	public Date getEndMTime() {
		return endMTime;
	}

	public void setEndMTime(Date endMTime) {
		this.endMTime = endMTime;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
