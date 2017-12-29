package com.sn.smart.order.base;

import java.nio.charset.Charset;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class RedisKeySerializer implements RedisSerializer<Object> {

	private final Charset charset;

	public RedisKeySerializer() {
		this(Charset.forName("UTF8"));
	}

	public RedisKeySerializer(Charset charset) {
		this.charset = charset;
	}

	public byte[] serialize(Object t) throws SerializationException {
		String string = String.valueOf(t);
		return (string == null ? null : string.getBytes(charset));
	}

	public Object deserialize(byte[] bytes) throws SerializationException {
		return (bytes == null ? null : new String(bytes, charset));
	}

}