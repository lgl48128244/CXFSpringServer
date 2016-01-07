package cn.itcast.cxf.dao;

import javax.jws.WebService;

/**
 * Hello world!
 *
 */
@WebService
public interface HelloWorldService {
	public String sayHello(String name);
}
