package cn.jbit.cxf.service.impl;


import javax.jws.WebService;

import cn.jbit.cxf.entity.Product;
import cn.jbit.cxf.service.IProductService;

/**
 * ��Ʒ����ӿ�ʵ���ࡣ
 * @author ��������
 *
 */
@WebService
public class ProductServiceImpl implements IProductService {

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println("####    ����˱����Ʒ��Ϣ        ####");
		System.out.println("��Ʒ��ţ�"+product.getId());
		System.out.println("��Ʒ���ƣ�"+product.getName());
		System.out.println("��Ʒ���أ�"+product.getArea());
		System.out.println("��Ʒ�۸�"+product.getPrice());
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
