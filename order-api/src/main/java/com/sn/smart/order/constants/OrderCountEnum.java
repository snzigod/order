package com.sn.smart.order.constants;

/**
 * 订单分析枚举
 * 
 * @author snzigod@hotmail.com
 *
 */
public interface OrderCountEnum {

	/**
	 * 统计对象
	 * 
	 * @author gxzhou2
	 *
	 */
	enum CountObject implements OrderCountEnum {
		/**
		 * 统计系统数
		 */
		SYSTEM_CODE("count(distinct system_code)"),
		/**
		 * 统计区域数
		 */
		AREA_CODE("count(distinct area_code)"),
		/**
		 * 统计 订单数
		 */
		ORDER_NO("count(order_no)"),
		/**
		 * 统计商家数
		 */
		MERCHANT_ID("count(distinct merchant_id)"),
		/**
		 * 统计商品数
		 */
		PRODUCT_ID("count(distinct product_id)"),
		/**
		 * 汇总商品数
		 */
		PRODUCT_NUM("sum(product_num)"),
		/**
		 * 汇总商品价值
		 */
		PRODUCT_TOTAL_PRICE("sum(product_total_price)"),
		/**
		 * 汇总优惠券金额
		 */
		COUPON_AMOUNT("sum(coupon_amount)"),
		/**
		 * 汇总运费
		 */
		CARRIAGE_FEE("sum(carriage_fee)"),
		/**
		 * 汇总返现金额
		 */
		CASHBACK_AMOUNT("sum(cashback_amount)"),
		/**
		 * 汇总礼品卡 金额
		 */
		GIFT_CARD_AMOUNT("sum(gift_card_amount)"),
		/**
		 * 汇总退款金额
		 */
		REFUND_AMOUNT("sum(refund_amount)"),
		/**
		 * 汇总商品实际支付额
		 */
		ACTUAL_PAID_AMOUNT("sum(actual_paid_amount)"),
		/**
		 * 汇总商品用户量
		 */
		PRODUCT_USER_NUM("sum(product_user_num)");

		private String value;

		CountObject(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	/**
	 * 统计维度
	 * 
	 * @author gxzhou2
	 *
	 */
	enum CountDemension implements OrderCountEnum {
		/**
		 * 系统维度
		 */
		SYSTEM_CODE("system_code"),
		/**
		 * 系统名称维度
		 */
		SYSTEM_NAME("system_name"),
		/**
		 * 区域维度
		 */
		AREA_CODE("area_code"),
		/**
		 * 区域名称维度
		 */
		AREA_NAME("area_name"),
		/**
		 * 订单类型维度
		 */
		ORDER_TYPE("order_type"),
		/**
		 * 订单类型名称维度
		 */
		ORDER_TYPE_NAME("order_type_name"),
		/**
		 * 商家维度
		 */
		MERCHANT_ID("merchant_id"),
		/**
		 * 商家名称维度
		 */
		MERCHANT_NAME("merchant_name"),
		/**
		 * 网点维度
		 */
		BRANCH_ID("branch_id"),
		/**
		 * 网点名称维度
		 */
		BRANCH_NAME("branch_name"),
		/**
		 * 商品维度
		 */
		PRODUCT_ID("product_id"),
		/**
		 * 商品名称维度
		 */
		PRODUCT_NAME("product_name"),
		/**
		 * 商品单价维度
		 */
		PRODUCT_PRICE("product_price"),
		/**
		 * 商品购买个数维度
		 */
		PRODUCT_NUM("product_num"),
		/**
		 * 商品购买总价维度
		 */
		PRODUCT_TOTAL_PRICE("product_total_price"),
		/**
		 * 优惠券金额维度
		 */
		COUPON_AMOUNT("coupon_amount"),
		/**
		 * 运费金额维度
		 */
		CARRIAGE_FEE("carriage_fee"),
		/**
		 * 返现金额维度
		 */
		CASHBACK_AMOUNT("cashback_amount"),
		/**
		 * 礼品卡金额维度
		 */
		GIFT_CARD_AMOUNT("gift_card_amount"),
		/**
		 * 退款金额维度
		 */
		REFUND_AMOUNT("refund_amount"),
		/**
		 * 实际付款金额维度
		 */
		ACTUAL_PAID_AMOUNT("actual_paid_amount"),
		/**
		 * 订单状态维度
		 */
		ORDER_STATE("order_state"),
		/**
		 * 业务状态维度
		 */
		SERVICE_STATE("service_state"),
		/**
		 * 是否支持退换维度
		 */
		SUPPORT_EXCHANGE_FLAG("support_exchange_flag"),
		/**
		 * 是否支持退款维度
		 */
		SUPPORT_REFUND_FLAG("support_refund_flag"),
		/**
		 * 是否支持发票维度
		 */
		SUPPORT_BILLING_FLAG("support_billing_flag"),
		/**
		 * 是否支持转手维度
		 */
		SUPPORT_SELL_FLAG("support_sell_flag"),
		/**
		 * 开具发票标志维度
		 */
		BILLING_FLAG("billing_flag"),
		/**
		 * 转手标志维度
		 */
		SELL_FLAG("sell_flag"),
		/**
		 * 是否支持售后维度
		 */
		SUPPORT_SERVICE_FLAG("support_service_flag"),
		/**
		 * 售后标志维度
		 */
		SERVICE_FLAG("service_flag"),
		/**
		 * 是否评价维度
		 */
		EVALUATE_FLAG("evaluate_flag"),
		/**
		 * 商品使用人数维度
		 */
		PRODUCT_USER_NUM("product_user_num"),
		/**
		 * 订单来源维度
		 */
		ORDER_SOURCE("order_source"),
		/**
		 * 修改人维度
		 */
		MODIFY_USER("modify_user"),
		/**
		 * 下单时间维度（秒）
		 */
		CREATE_TIME_SECOND("to_char(create_time,'yyyymmdd hh24:mi:ss')"),
		/**
		 * 下单时间维度（分钟）
		 */
		CREATE_TIME_MINUTE("to_char(create_time,'yyyymmdd hh24:mi')"),
		/**
		 * 下单时间维度（小时）
		 */
		CREATE_TIME_HOUR("to_char(create_time,'yyyymmdd hh24')"),
		/**
		 * 下单时间维度（天）
		 */
		CREATE_TIME_DAY("to_char(create_time,'yyyymmdd')"),
		/**
		 * 下单时间维度（月）
		 */
		CREATE_TIME_MONTH("to_char(create_time,'yyyymm')"),
		/**
		 * 下单时间维度（年）
		 */
		CREATE_TIME_YEAR("to_char(create_time,'yyyy')"),
		/**
		 * 下单时间维度（周）
		 */
		CREATE_TIME_WEEK("to_char(create_time,'iw')"),
		/**
		 * 下单时间维度（季）
		 */
		CREATE_TIME_SEASON("to_char(create_time,'q')"),
		/**
		 * 时间维度（秒）
		 */
		MODIFY_TIME_SECOND("to_char(modify_time,'yyyymmdd hh24:mi:ss')"),
		/**
		 * 时间维度（分钟）
		 */
		MODIFY_TIME_MINUTE("to_char(modify_time,'yyyymmdd hh24:mi')"),
		/**
		 * 时间维度（小时）
		 */
		MODIFY_TIME_HOUR("to_char(modify_time,'yyyymmdd hh24')"),
		/**
		 * 时间维度（天）
		 */
		MODIFY_TIME_DAY("to_char(modify_time,'yyyymmdd')"),
		/**
		 * 时间维度（月）
		 */
		MODIFY_TIME_MONTH("to_char(modify_time,'yyyymm')"),
		/**
		 * 时间维度（年）
		 */
		MODIFY_TIME_YEAR("to_char(modify_time,'yyyy')"),
		/**
		 * 时间维度（周）
		 */
		MODIFY_TIME_WEEK("to_char(modify_time,'iw')"),
		/**
		 * 时间维度（季）
		 */
		MODIFY_TIME_SEASON("to_char(modify_time,'q')");

		private String value;

		CountDemension(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	/**
	 * 统计排序
	 * 
	 * @author gxzhou2
	 *
	 */
	enum CountOrder implements OrderCountEnum {
		/**
		 * 按照xPoint正序
		 */
		XPOINT_ASC(" asc"),
		/**
		 * 按照xPoint倒序
		 */
		XPOINT_DESC(" desc"),
		/**
		 * 按照yPoint正序
		 */
		YPOINT_ASC(" asc"),
		/**
		 * 按照yPoint倒序
		 */
		YPOINT_DESC(" desc");

		private String value;

		CountOrder(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

}
