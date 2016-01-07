package cn.jbit.cxf.service.impl;


import javax.jws.WebService;

import cn.jbit.cxf.entity.Product;
import cn.jbit.cxf.service.IProductService;

/**
 * 产品处理接口实现类。
 * @author 北大青鸟
 *
 */
@WebService
public class ProductServiceImpl implements IProductService {

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println("####    服务端保存产品信息        ####");
		System.out.println("产品编号："+product.getId());
		System.out.println("产品名称："+product.getName());
		System.out.println("产品产地："+product.getArea());
		System.out.println("产品价格："+product.getPrice());
	}

	public Product getPorductById(int id) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setId(id);
		product.setName("IPAD");
		product.setArea("USA");
		product.setPrice(5860.0);
		return product;
	}

}
