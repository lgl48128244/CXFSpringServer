package cn.itcast.cxf.client;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

import cn.itcast.cxf.dao.HelloWorldService;

public class Client {
	public static void main(String[] args) {
		ClientProxyFactoryBean clientProxyFactoryBean = new ClientProxyFactoryBean();
		clientProxyFactoryBean.setServiceClass(HelloWorldService.class);
		clientProxyFactoryBean.setAddress("http://localhost:8080/HelloWorldService");
		HelloWorldService service = (HelloWorldService) clientProxyFactoryBean.create();

		String msgString = service.sayHello("lisi");
		System.out.println(msgString);
	}

}
