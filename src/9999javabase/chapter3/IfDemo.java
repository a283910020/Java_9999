package com.xuetang9.javabase.chapter3;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
//		Ӳ���̷�һ�����A-Z��д��ĸ��ʾ
//		ʹ�ó����ж��û�������ַ��Ƿ��ǺϷ���Ӳ���̷�
		//1.����Ӳ�̵��̷�
		//2.�ж��Ƿ�Ϸ�
		//3.��ӡ���
		int num1 = 4, num2 = 0;
		if(num1 > num2)
			//System.out.println("abc");
			System.out.println("bca");
			else
				System.out.println("");
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("������Ӳ���̷���");
		char ch = input.next().charAt(0);//ȡ�û������ַ����ĵ�һ���ַ�
		if(ch >= 'A' && ch <= 'Z'){ // �ȼ�д�� !(ch < 'A' || ch > 'Z')
			//'A' <= ch <= 'Z' -- �����д��������
			System.out.println("��������̷��ǺϷ����̷���");
		}else{
			System.err.println("�����˷Ƿ��̷�������");
		}

		
	}
}
