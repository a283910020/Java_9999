package com.xuetang9.javabase.chapter3;

import java.util.Scanner;

/**
 * �պ��Ǵ��ۼ�������ܼ۴���50000�ʹ�7�ۣ�����9��
 * �������Ӧ�����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��9�� ����10:05:45
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class ShoppingDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float price;	//��Ʒ�ĵ���
		float price1, price2, price3;
		int count;		//��Ʒ������
		double total;	//������Ʒ���ܼ�
		float zhekou;	//�ۿ���
		//1.���û�����������Ʒ�ĵ��ۺ�����
		System.out.print("������·��˹�����к��ֱ�ĵ��ۣ�");
		price1 = price = input.nextFloat();	//�����û�����ĵ�������
		System.out.print("��������Ʒ��������");
		count = input.nextInt();
		total = price * count;	//�����ܼ�
		
		System.out.print("�����밮����ʱ������Ƥ���ĵ��ۣ�");
		price2 = price = input.nextFloat();	//�����û�����ĵ�������
		System.out.print("��������Ʒ��������");
		count = input.nextInt();
		total += price * count;	//����������Ʒ���ۼ��ܼ�
		
		System.out.print("���������ζ�����������ˮ�ĵ��ۣ�");
		price3 = price = input.nextFloat();	//�����û�����ĵ�������
		System.out.print("��������Ʒ��������");
		count = input.nextInt();
		total += price * count;	//����������Ʒ���ۼ��ܼ�
		//2.�����ܼ�
		//3.�����ܼ��ж��Ƿ����
		
		//�̼Ҹ��������ۿ۵Ĺ���
		//��������������Ʒÿ����Ʒ���ܼ۶�����5000
		//��������Ʒ�ܽ�����35000���ۿ���Ϊ30%��
		//�����ۿ���Ϊ80%
		if(price1 > 5000 && price2 > 5000 && price3 > 5000 || total > 35000){
			zhekou = 0.3f;
			System.out.println("��3�ۣ���");
		}else{
			zhekou = 0.8f;
			System.out.println("��8�ۣ�");
		}

//		if(total >= 50000){
//			//������
//			//total *= 0.7;	//total = total * 0.7;
//			zhekou = 0.7f;
//		}else{
//			//total *= 0.9;
//			zhekou = 0.9f;
//		}
		total *= zhekou;
		//4.��ӡ���ۺ�Ӧ��֧���Ľ��
		System.out.printf("����Ӧ֧���Ľ��Ϊ��%.1f", total);
	}

}











