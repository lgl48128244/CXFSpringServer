package cn.itcast.cxf.service;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import cn.itcast.cxf.dao.HelloWorldService;
import cn.itcast.cxf.dao.impl.HelloWorldServiceImpl;

public class Service {
	public static void main(String[] args) {
		//serverFactory(new HelloWorldServiceImpl());
		jaxwsServerFactory(new HelloWorldServiceImpl());
	}

	/**
	 * 方式一：
	 */
	public static void serverFactory(HelloWorldService helloWorldService) {
		ServerFactoryBean serverFactoryBean = new ServerFactoryBean();

		serverFactoryBean.setServiceClass(HelloWorldService.class);
		serverFactoryBean.setAddress("http://localhost:8080/HelloWorldService");
		serverFactoryBean.setServiceBean(helloWorldService);
		serverFactoryBean.create();
	}

	/**
	 * 方式二：推荐使用子类(要求严格，必须在指定的参数上加@WebService,否则不会发布出方法)
	 */
	public static void jaxwsServerFactory(HelloWorldService helloWorldService) {
		JaxWsServerFactoryBean serverFactoryBean = new JaxWsServerFactoryBean();

		serverFactoryBean.setServiceClass(HelloWorldService.class);
		serverFactoryBean.setAddress("http://localhost:8080/HelloWorldService");
		serverFactoryBean.setServiceBean(helloWorldService);
		serverFactoryBean.create();
	}
}
