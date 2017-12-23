package com.sn.smart.order.dto;

import java.io.Serializable;

/**
 * 统计结果
 * 
 * @author snzigod@hotmail.com
 *
 */
public class OrderCountResultDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8203280982200679150L;
	/**
	 * x轴（统计维度）
	 */
	private String xPoint;
	/**
	 * y轴（统计对象，多个以逗号分隔）
	 */
	private String yPoint;

	public String getxPoint() {
		return xPoint;
	}

	public void setxPoint(String xPoint) {
		this.xPoint = xPoint;
	}

	public String getyPoint() {
		return yPoint;
	}

	public void setyPoint(String yPoint) {
		this.yPoint = yPoint;
	}

}
