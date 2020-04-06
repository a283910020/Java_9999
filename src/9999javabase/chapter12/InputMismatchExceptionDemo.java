package com.xuetang9.javabase.chapter12;

import java.util.Scanner;

/**
 * ���벻ƥ���쳣ʾ��
 * �û����������ֻ�����������֣�ʹ���쳣������Ʋ��񲢴����쳣���
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��8�� ����11:12:15
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������䣨�������������֣�:");
		int age = -1;
		try {
			age = input.nextInt();
			age = age / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			//һ���ڿ�����ʱ��ʹ��
			//e.printStackTrace();
			e.printStackTrace(System.err);
			//System.err.println(e.getMessage());
		} 
		
		System.out.println("����������ǣ�" + age);
	}

}








