package cn.jbit.cxf.service;


import javax.jws.WebService;

import cn.jbit.cxf.entity.Product;

/**
 * ��Ʒ����ӿڡ�
 * @author ��������
 *
 */
@WebService
public interface IProductService {
	/**
	 * �����Ʒ��Ϣ��
	 * @param product
	 */
	public void addProduct(Product product);
	/**
	 * ����ID��ò�Ʒ��Ϣ��
	 * @param id
	 * @return
	 */
	public Product getPorductById(int id);
}
