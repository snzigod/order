package com.sn.smart.order.app.biz;

import org.springframework.stereotype.Service;

import com.sn.smart.order.app.vo.DemoVo;

@Service
public class DemoBiz {

	public String sayHello(String name) {
		return "hello, " + name;
	}

	public String sayHello(DemoVo vo) {
		return "hello, " + vo.getName();
	}

}
