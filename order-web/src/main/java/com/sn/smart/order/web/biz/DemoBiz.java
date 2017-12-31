package com.sn.smart.order.web.biz;

import org.springframework.stereotype.Service;

import com.sn.smart.order.web.vo.DemoVo;

@Service
public class DemoBiz {

	public String sayHello(String name) {
		return "hello, " + name;
	}

	public String sayHello(DemoVo vo) {
		return "hello, " + vo.getName();
	}

}
