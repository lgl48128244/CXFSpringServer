package cn.jbit.cxf.service;


import javax.jws.WebService;

import cn.jbit.cxf.entity.Product;

/**
 * 产品处理接口。
 * @author 北大青鸟
 *
 */
@WebService
public interface IProductService {
	/**
	 * 保存产品信息。
	 * @param product
	 */
	public void addProduct(Product product);
	/**
	 * 根据ID获得产品信息。
	 * @param id
	 * @return
	 */
	public Product getPorductById(int id);
}
