package com.sn.smart.order.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单
 * 
 * @author snzigod@hotmail.com
 * 
 */
public class OrderDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4955017879963271315L;
	/**
	 * 订单ID。
	 */
	private String id;
	/**
	 * 父级订单编码，不存在父级订单时为空。
	 */
	private String parentId;
	/**
	 * 是否存在子订单，0 否 1是 ，默认0。
	 */
	private Short hasChildFlag;
	/**
	 * 主订单标志，0 否 1是 ，默认1。
	 */
	private Short mainOrderFlag;
	/**
	 * 系统编码，每个接入系统对应一个系统编号，根据具体业务确定，建议系统编号规则：总长度6位，系统标识+数字补全。例如：池州旅游系统标识为ST，
	 * 系统编码则可以定义为ST0001。
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
	 * 下单人名称。
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
	 * 修改人名称。
	 */
	private String modifyUserName;
	/**
	 * 修改时间。
	 */
	private Date modifyTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Short getHasChildFlag() {
		return hasChildFlag;
	}

	public void setHasChildFlag(Short hasChildFlag) {
		this.hasChildFlag = hasChildFlag;
	}

	public Short getMainOrderFlag() {
		return mainOrderFlag;
	}

	public void setMainOrderFlag(Short mainOrderFlag) {
		this.mainOrderFlag = mainOrderFlag;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Short getOrderType() {
		return orderType;
	}

	public void setOrderType(Short orderType) {
		this.orderType = orderType;
	}

	public String getOrderTypeName() {
		return orderTypeName;
	}

	public void setOrderTypeName(String orderTypeName) {
		this.orderTypeName = orderTypeName;
	}

	public String getOrderRemark() {
		return orderRemark;
	}

	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantImgUrl() {
		return merchantImgUrl;
	}

	public void setMerchantImgUrl(String merchantImgUrl) {
		this.merchantImgUrl = merchantImgUrl;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchImgUrl() {
		return branchImgUrl;
	}

	public void setBranchImgUrl(String branchImgUrl) {
		this.branchImgUrl = branchImgUrl;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImgUrl() {
		return productImgUrl;
	}

	public void setProductImgUrl(String productImgUrl) {
		this.productImgUrl = productImgUrl;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductNum() {
		return productNum;
	}

	public void setProductNum(Integer productNum) {
		this.productNum = productNum;
	}

	public BigDecimal getProductTotalPrice() {
		return productTotalPrice;
	}

	public void setProductTotalPrice(BigDecimal productTotalPrice) {
		this.productTotalPrice = productTotalPrice;
	}

	public BigDecimal getCouponAmount() {
		return couponAmount;
	}

	public void setCouponAmount(BigDecimal couponAmount) {
		this.couponAmount = couponAmount;
	}

	public BigDecimal getCarriageFee() {
		return carriageFee;
	}

	public void setCarriageFee(BigDecimal carriageFee) {
		this.carriageFee = carriageFee;
	}

	public BigDecimal getCashbackAmount() {
		return cashbackAmount;
	}

	public void setCashbackAmount(BigDecimal cashbackAmount) {
		this.cashbackAmount = cashbackAmount;
	}

	public BigDecimal getGiftCardAmount() {
		return giftCardAmount;
	}

	public void setGiftCardAmount(BigDecimal giftCardAmount) {
		this.giftCardAmount = giftCardAmount;
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public BigDecimal getActualPaidAmount() {
		return actualPaidAmount;
	}

	public void setActualPaidAmount(BigDecimal actualPaidAmount) {
		this.actualPaidAmount = actualPaidAmount;
	}

	public Short getOrderState() {
		return orderState;
	}

	public void setOrderState(Short orderState) {
		this.orderState = orderState;
	}

	public Short getServiceState() {
		return serviceState;
	}

	public void setServiceState(Short serviceState) {
		this.serviceState = serviceState;
	}

	public Short getSupportExchangeFlag() {
		return supportExchangeFlag;
	}

	public void setSupportExchangeFlag(Short supportExchangeFlag) {
		this.supportExchangeFlag = supportExchangeFlag;
	}

	public Short getSupportRefundFlag() {
		return supportRefundFlag;
	}

	public void setSupportRefundFlag(Short supportRefundFlag) {
		this.supportRefundFlag = supportRefundFlag;
	}

	public Short getSupportBillingFlag() {
		return supportBillingFlag;
	}

	public void setSupportBillingFlag(Short supportBillingFlag) {
		this.supportBillingFlag = supportBillingFlag;
	}

	public Short getSupportSellFlag() {
		return supportSellFlag;
	}

	public void setSupportSellFlag(Short supportSellFlag) {
		this.supportSellFlag = supportSellFlag;
	}

	public Short getBillingFlag() {
		return billingFlag;
	}

	public void setBillingFlag(Short billingFlag) {
		this.billingFlag = billingFlag;
	}

	public Short getSellFlag() {
		return sellFlag;
	}

	public void setSellFlag(Short sellFlag) {
		this.sellFlag = sellFlag;
	}

	public Short getSupportServiceFlag() {
		return supportServiceFlag;
	}

	public void setSupportServiceFlag(Short supportServiceFlag) {
		this.supportServiceFlag = supportServiceFlag;
	}

	public Short getServiceFlag() {
		return serviceFlag;
	}

	public void setServiceFlag(Short serviceFlag) {
		this.serviceFlag = serviceFlag;
	}

	public Short getEvaluateFlag() {
		return evaluateFlag;
	}

	public void setEvaluateFlag(Short evaluateFlag) {
		this.evaluateFlag = evaluateFlag;
	}

	public Integer getProductUserNum() {
		return productUserNum;
	}

	public void setProductUserNum(Integer productUserNum) {
		this.productUserNum = productUserNum;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Short getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(Short orderSource) {
		this.orderSource = orderSource;
	}

	public String getLogisticsId() {
		return logisticsId;
	}

	public void setLogisticsId(String logisticsId) {
		this.logisticsId = logisticsId;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String getModifyUserName() {
		return modifyUserName;
	}

	public void setModifyUserName(String modifyUserName) {
		this.modifyUserName = modifyUserName;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
