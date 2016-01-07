package cn.itcast.cxf.dao.impl;

import cn.itcast.cxf.dao.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "say:Hi" + name;
	}

}
