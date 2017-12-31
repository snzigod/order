package com.sn.smart.order.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sn.smart.order.web.biz.DemoBiz;
import com.sn.smart.order.web.vo.DemoVo;

@Controller
@RequestMapping("/demo")
public class DemoRest {

	@Autowired
	private DemoBiz demoBiz;

	@ResponseBody
	@RequestMapping(value = "/getParam", method = RequestMethod.GET)
	public String getParam(String name) {
		return demoBiz.sayHello(name);
	}

	@ResponseBody
	@RequestMapping(value = "/getBeanParam", method = RequestMethod.GET)
	public String getBeanParam(DemoVo vo) {
		return demoBiz.sayHello(vo);
	}

	@ResponseBody
	@RequestMapping(value = "/postParam", method = RequestMethod.POST)
	public String postParam(String name) {
		return demoBiz.sayHello(name);
	}

	@ResponseBody
	@RequestMapping(value = "/postBeanParam", method = RequestMethod.POST)
	public String postBeanParam(DemoVo vo) {
		return demoBiz.sayHello(vo);
	}

}
