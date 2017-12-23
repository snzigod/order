package com.sn.smart.order.base;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class RedisValueSerializer implements RedisSerializer<Object> {

	public byte[] serialize(Object source) throws SerializationException {
		if (source == null) {
			return new byte[0];
		}
		return JSON.toJSONBytes(source, SerializerFeature.WriteClassName);
	}

	public Object deserialize(byte[] source) throws SerializationException {
		if (source == null || source.length == 0) {
			return null;
		}
		Object obj = JSON.parse(source);
		return obj;
	}
}