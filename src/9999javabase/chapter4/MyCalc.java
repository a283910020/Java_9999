package com.xuetang9.javabase.chapter4;

import java.util.Scanner;

/**
 * ʵ�ּ򵥵ļ��������ܣ��Ӽ��˳�ȡģ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��14�� ����10:55:42
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class MyCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2, result;	//������������һ���������
		String op = "";				//���������ֵΪ���ַ���
		String choice = null;		//�û���ѡ���Ƿ����
		do{
			System.out.println("������������������");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			
			System.out.print("�������������");
			op = input.next();
			//������������жϣ�������Ӧ�ļ���
			switch (op) {
			case "+":
				//System.out.println(num1 + op + num2 + " = " + (num1 + num2));
				//����������
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				//��Ҫ�жϱ������Ƿ�Ϊ0
				if(num2 == 0){
					System.out.println("��������Ϊ0��");
					result = 0;
				}else{
					result = num1 / num2;
				}
				break;
			case "%":
				result = num1 % num2;
				break;
			default:
				System.out.println("δ֪�����������ʧ�ܣ�");
				result = 0;
				break;
			}
			//��ӡ������
			System.out.printf("%.2f %s %.2f = %.2f\n", num1, op, num2, result);
			System.out.print("�Ƿ�������㣿(y/n)");
			choice = input.next();
		}while("y".equalsIgnoreCase(choice));
		

	}

}









