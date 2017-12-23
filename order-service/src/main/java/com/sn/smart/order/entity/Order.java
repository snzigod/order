package com.sn.smart.order.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * 订单
 * 
 * @author snzigod@hotmail.com
 * 
 */
@Data
public class Order {
	/**
	 * 订单ID。
	 */
	private String id;
	/**
	 * 父级订单编码，不存在父级订单时为空。
	 */
	private String parentId;
	/**
	 * 主订单标志，0 否 1是 ，默认1。
	 */
	private Short mainOrderFlag;
	/**
	 * 是否存在子订单，0 否 1是 ，默认0。
	 */
	private Short hasChildFlag;
	/**
	 * 系统编码，每个接入系统对应一个系统编号，根据具体业务确定，建议系统编号规则：总长度6位，系统标识+数字补全。
	 */
	private String systemCode;
	/**
	 * 系统名称
	 */
	private String systemName;
	/**
	 * 区域编码
	 */
	private String areaCode;
	/**
	 * 区域名称
	 */
	private String areaName;
	/**
	 * 订单号，根据具体业务确定，默认生成规则：系统编号6位+订单来源1位+订单类型1位+时间戳8位+订单ID后四位，总共20位。
	 */
	private String orderNo;
	/**
	 * 为用户进行支付时，生成的支付订单号，是此笔支付的唯一标识。
	 */
	private String tradeNo;
	/**
	 * 订单名称。
	 */
	private String orderName;
	/**
	 * 订单类型，具体由接入系统业务确定。
	 */
	private Short orderType;
	/**
	 * 订单类型名称
	 */
	private String orderTypeName;
	/**
	 * 订单说明。
	 */
	private String orderRemark;
	/**
	 * 商家ID。
	 */
	private String merchantId;
	/**
	 * 商家名称。
	 */
	private String merchantName;
	/**
	 * 商家缩略图。
	 */
	private String merchantImgUrl;
	/**
	 * 网点ID
	 */
	private String branchId;
	/**
	 * 网点名称
	 */
	private String branchName;
	/**
	 * 网点缩略图
	 */
	private String branchImgUrl;
	/**
	 * 商品ID。
	 */
	private String productId;
	/**
	 * 商品名称。
	 */
	private String productName;
	/**
	 * 商品缩略图地址。
	 */
	private String productImgUrl;
	/**
	 * 商品购买单价 ，默认0。
	 */
	private BigDecimal productPrice;
	/**
	 * 商品购买个数，默认1。
	 */
	private Integer productNum;
	/**
	 * 商品总价 ，默认0。
	 */
	private BigDecimal productTotalPrice;
	/**
	 * 优惠券金额 ，默认0。
	 */
	private BigDecimal couponAmount;
	/**
	 * 运费金额 ，默认0。
	 */
	private BigDecimal carriageFee;
	/**
	 * 返现金额 ，默认0。
	 */
	private BigDecimal cashbackAmount;
	/**
	 * 礼品卡金额 ，默认0。
	 */
	private BigDecimal giftCardAmount;
	/**
	 * 退款金额，默认0.
	 */
	private BigDecimal refundAmount;
	/**
	 * 实际付款金额 ，默认0。
	 */
	private BigDecimal actualPaidAmount;
	/**
	 * 订单状态，0 已删除、1 已生成、2 已取消、3 已付款、4 已退款、5 已发货、6 已完成。
	 */
	private Short orderState;
	/**
	 * 业务状态，包含订单状态，主要用于扩展订单状态，具体规则由业务系统确定。
	 */
	private Short serviceState;
	/**
	 * 是否支持退换，0 否 1是 ，默认0。
	 */
	private Short supportExchangeFlag;
	/**
	 * 是否支持退款，0 否 1是 ，默认0。
	 */
	private Short supportRefundFlag;
	/**
	 * 是否支持发票，0 否 1是 ，默认0。
	 */
	private Short supportBillingFlag;
	/**
	 * 是否支持转手，0 否 1是 ，默认0。
	 */
	private Short supportSellFlag;
	/**
	 * 开具发票标志，0 否 1是 ，默认0。
	 */
	private Short billingFlag;
	/**
	 * 转手标志，0 否 1是 ，默认0。
	 */
	private Short sellFlag;
	/**
	 * 是否支持售后，0 否 1是 ，默认0。
	 */
	private Short supportServiceFlag;
	/**
	 * 售后标志，0 否 1是 ，默认0。
	 */
	private Short serviceFlag;
	/**
	 * 是否评价，0 否 1是 ，默认0。
	 */
	private Short evaluateFlag;
	/**
	 * 商品使用人数，具体可根据业务系统需要确定，默认1。
	 */
	private Integer productUserNum;
	/**
	 * 下单人ID。
	 */
	private String createUser;
	/**
	 * 下单人名称
	 */
	private String createUserName;
	/**
	 * 下单时间。
	 */
	private Date createTime;
	/**
	 * 订单来源：1 WEB门户、2 Android、3 IOS、4 微信。
	 */
	private Short orderSource;
	/**
	 * 物流编号。
	 */
	private String logisticsId;
	/**
	 * 修改人编号。
	 */
	private String modifyUser;
	/**
	 * 修改人名称
	 */
	private String modifyUserName;
	/**
	 * 修改时间。
	 */
	private Date modifyTime;

}
