package cn.itcast.cxf.entity;

import java.io.Serializable;

/**
 * ��Ʒʵ���ࡣ
 * @author ��������
 *
 */
public class Product implements Serializable {
	private static final long serialVersionUID = 4528984960789097986L;
	// ��Ʒ���
	private int id;
	// ��Ʒ���
	private String name;
	// ��Ʒ���
	private String area;
	// ��Ʒ�۸�
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
