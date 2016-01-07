package cn.itcast.cxf.dao.impl;

import javax.jws.WebService;

import cn.itcast.cxf.dao.ProductService;
import cn.itcast.cxf.entity.Product;

/**
 * ��Ʒ����ʵ���ࡣ
 * @author ��������
 *
 */
@WebService
public class ProductServiceImpl implements ProductService {

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setId(1002);
		product.setName("HTC G10");
		product.setArea("美国");
		product.setPrice(3400.0);
		return product;
	}

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getId() + "#" + product.getName() + "#" + product.getArea() + "#" + product.getPrice());
	}

}
