package com.xuetang9.javabase.chapter9.productdemo;

import javax.swing.JOptionPane;

/**
 * ��Ʒ������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��8�� ����3:36:27
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class ProductBiz {
	public static void main(String[] args) {
		/** ��������ÿ����Ʒ�� ���� */
		int[] counts = new int[3];
		double total = 0;	//����Ҫ֧�����ܽ��
		//�Ľ�������ʹ�ö�������
		Product[] products = new Product[3];
		for (int i = 0; i < counts.length; i++) {
			if(products[i] == null)
				products[i] = new Product();	//���������е�Ԫ��ʹ��֮ǰ��һ��Ҫ�ǵ÷���ռ�		
			//Product product = new Product();
			String name = JOptionPane.showInputDialog("��������Ʒ���ƣ�");
			products[i].setName(name);
			//�����û��������Ʒ���ۣ�Ҫע�⣬����ֵ���ַ������ͣ���
			String strPrice = JOptionPane.showInputDialog("��������Ʒ�ĵ��ۣ�");
			//��Ҫ���ַ�������ת��Ϊdouble���ͣ��ٽ��и�ֵ��
			//ת��ǰ��ý�����ȷ����֤���Ա����쳣
			products[i].setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("�����빺���������");
			counts[i] = Integer.parseInt(strCount);
			
			//�ۼ��ܽ��
			total += products[i].getPrice() * counts[i];
		}
		System.out.println("������㣺");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName() + "\t" + products[i].getPrice());
		}
		System.out.println("��Ʒ�ܽ��Ϊ��" + total);
	}
}






