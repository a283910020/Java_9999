package com.xuetang9.javabase.chapter5;

import java.util.Scanner;

public class MoneyTotal {

	public static void main(String[] args) {
		//ѭ������5����ҵ����ѣ�ͳ�����Ѷ����500���������
		//������Ѵ��ڵ���500����������С��500�������+1
		Scanner input = new Scanner(System.in);
		
		//����1-100֮���ż����
		int sum = 0; 
		for (int i = 0; i <= 100; i++) {
			if(i % 2 != 0)
				continue;	//�������������
			sum += i;
		}
		for (int i = 1; i < 100; i += 2) {
			
		}
		
		
		
		//1.ѭ��¼��5����ҵ����ѽ��
		//2.¼��������ж��Ƿ�С��500
		//3.�ۼ�С��500���ܴ���
//		int count = 0;						//�����ĳ�ֵһ��Ϊ0
//		double money = Double.MAX_VALUE;	//��һ�������ܵ�ֵ�����������ж�
//		for (int i = 0; i < 5; i++) {
//			System.out.println("�������" + (i + 1) + "λ��ҵ����ѽ�");
//			money = input.nextDouble();
//			
//			if(money >= 500)
//				continue;//���������ۼ� - ��������500�������ֱ�ӵ��´�ѭ��
//			count++;
////			if(money < 500){
////				count++;
////			}
//		}
//		System.out.println("�����ܽ��С��500������Ϊ��" + count);


	}

}
