package com.xuetang9.javabase.chapter3;

import java.util.Scanner;

/**
 * �����·ݴ�ӡ��Ӧ������
	��������꣬2�·�����Ϊ29��
	ʹ��switch-case�ṹ
   	�����������
	isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��9�� ����11:14:32
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class SimpleCalendar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1.����������ꡢ�¡�����
		int year = -1, month = -1, dayOfMonth = -1; //��ֵ��һ�������ܵ�ֵ�������Ժ���ж�
		System.out.print("��ݣ�");
		year = input.nextInt();
		System.out.print("�·ݣ�");
		month = input.nextInt();
		//2.�����·ݼ��㵱�µ�������2��Ĭ��28��
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayOfMonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dayOfMonth = 30;
			break;
		case 2:
			dayOfMonth = 28;
			break;
		default:
			System.out.println("ֻ������1-12֮����������֣�");
			System.exit(0);
		}
		
		//3.����������������꣬�·�����+1
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
//		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//			
//		}
		if(isLeapYear){
			dayOfMonth++;
		}
		System.out.println(year + "��" + month + "����" + dayOfMonth + "�죡");
	}

}





