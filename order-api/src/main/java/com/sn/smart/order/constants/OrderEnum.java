package com.sn.smart.order.constants;

/**
 * 订单枚举集合
 * 
 * @author snzigod@hotmail.com
 * 
 */
public interface OrderEnum {

	/**
	 * 通用状态枚举：0 否、1 是.
	 * 适用范围：主订单标志、是否支持退换、是否支持退款、是否支持发票、是否支持转手、开具发票标志、转手标志、是否支持售后、售后标志、是否评价、
	 */
	enum GeneralState implements OrderEnum {
		/**
		 * 否
		 */
		NO((short) 0, "否"),
		/**
		 * 是
		 */
		YES((short) 1, "是");

		private Short key;
		private String value;

		GeneralState(Short key, String value) {
			this.key = key;
			this.value = value;
		}

		public Short getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

		/**
		 * 获取key
		 * 
		 * @param value
		 * @return key
		 */
		public static Short getKey(String value) {
			for (GeneralState state : GeneralState.values()) {
				if (value.equals(value)) {
					return state.getKey();
				}
			}
			return null;
		}

		/**
		 * 获取value
		 * 
		 * @param key
		 * @return value
		 */
		public static String getValue(Short key) {
			for (GeneralState state : GeneralState.values()) {
				if (state.getKey() == key) {
					return state.getValue();
				}
			}
			return null;
		}
	}

}
