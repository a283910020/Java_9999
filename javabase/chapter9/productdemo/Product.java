package com.xuetang9.javabase.chapter9.productdemo;
/**
 * ��Ʒʵ����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��8�� ����3:33:38
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Product {
	private String name;
	private double price;
	/** ��Ʒ������ */
	private String description;
	/** ��Ʒ�ķ��� */
	private String[] services;
	
	public Product(){}
	
	public Product(String name, String description){
		setName(name);
		setDescription(description);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getServices() {
		return services;
	}
	public void setServices(String[] services) {
		this.services = services;
	}
	
	
}










