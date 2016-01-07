package cn.itcast.cxf.dao;

import javax.jws.WebService;

import cn.itcast.cxf.entity.Product;

/**
 * ��Ʒ����ӿڡ�
 * @author ��������
 *
 */
@WebService
public interface ProductService {
	/**
	 * �����Ʒ��Ϣ��
	 * @param product
	 */
	public void saveProduct(Product product);

	/**
	 * ��ݲ�Ʒ��Ż�ò�Ʒ��Ϣ��
	 * @param id
	 * @return
	 */
	public Product getProduct(int id);
}
