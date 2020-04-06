package com.xuetang9.javabase.chapter9;

/**
 * ͼ��ʵ����
 * 
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��8�� ����2:18:22
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Book {
	private String name;
	private String isbn;
	private double price;
	private int count; 		// ��ǰͼ�����Ŀ����
	private boolean borrow;	//�Ƿ�ɽ�
	
	public Book(){}
	
	public Book(String name){
		this.setName(name);
	}
	
	public Book(String name, String isbn, double price, int count){
		setName(name);
		setIsbn(isbn);
		setPrice(price);
		setCount(count);
		setBorrow(borrow);
	}

	public boolean isBorrow() {
		return borrow;
	}

	public void setBorrow(boolean borrow) {
		this.borrow = borrow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		//������д�ж��߼�
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if(count < 0){
			count = 0;
		}else{
			this.count = count;
		}	
	}

}
