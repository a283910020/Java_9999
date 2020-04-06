package com.xuetang9.javabase.chapter7;

import java.util.Scanner;

/**
 * ��д����������������ת��Ϊ���ְ沢���
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��26�� ����11:21:00
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class WeekDayDemo {

	public static void main(String[] args) {
		System.out.print("��������������ڼ���");
		int dayOfWeek = new Scanner(System.in).nextInt();	
		//����
		ShowWeekDayByChinese(dayOfWeek-1);
		//����
		ShowWeekDayByJpanese(dayOfWeek-1);
		//Ӣ��
		ShowWeekDayByEnglish(dayOfWeek-1);
	}
	
	/**
	 * �����жϴ���Ĳ����Ƿ���1-7֮��
	 * @param dayOfWeek Ҫ�жϵ��������֣����ڼ�
	 * @return ����Ϸ�������true���Ƿ�������false
	 */
	private static boolean isRight(int dayOfWeek){
		if(dayOfWeek < 1 || dayOfWeek > 7){
			//System.out.println("��������1-7֮�������");
			return false;
		}
		return true;
	}
	
	/**
	 * �����ĵķ�ʽ����ӡ���ڼ�
	 * @param dayOfWeek 1-7֮����������֣�������ʾ���ڼ�
	 */
	public static void ShowWeekDayByChinese(int dayOfWeek){
		if(!isRight(dayOfWeek)){
			System.out.println("��������1-7֮�������");
			return;
		}
		String[] weekdays = {"����һ", "���ڶ�", "������", "������", "������", "������", "������"}; 
		System.out.println(weekdays[dayOfWeek]);
	}
	
	static void ShowWeekDayByJpanese(int dayOfWeek){
		if(!isRight(dayOfWeek)){
			System.out.println("��������1-7֮�������");
			return;
		}
		String[] weekdays = {"������", "������", "ˮ����", "ľ����", "������", "������", "������"}; 
		System.out.println(weekdays[dayOfWeek]);
	}
	
	static void ShowWeekDayByEnglish(int dayOfWeek){
		if(!isRight(dayOfWeek)){
			System.out.println("��������1-7֮�������");
			return;
		}
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	
	
	
	
	
	
	
	
	
	

}
