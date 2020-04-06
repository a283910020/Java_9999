package com.xuetang9.javabase.chapter7;

import java.util.Scanner;

/**
 * ʹ�÷���ʵ�������Ĵ�ӡ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��28�� ����11:38:40
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class PrintCalendarDemo {	
	/** �û��������� */
	public static int year = Integer.MIN_VALUE;
	/** �û�������·� */
	public static int month = Integer.MIN_VALUE;
	/** ��Ӧÿ���·ݵ����� */
	private static int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) {
		PrintCalendar();
		//getSumDayOfYears();
	}

	/**
	 * ��ӡ�����ĺ��ķ���
	 */
	public static void PrintCalendar() {
		//1.���û�������ݺ��·�
		InputYearAndMonth();
		//2.����1900-1-1 �� �û���������·ݵ�������(year=2017, month=7 2017-7-1)
		//	2-1.��������������
		//  2-2.������µ�����֮��
		int sum = getSumDayOfYears();
		sum += getSumDayOfMonth();
		sum++;
		System.out.println(sum % 7);
		//3.��ӡ��ݺ��·ݣ�Ӣ�ģ�
		PrintMonthTitle();
		//4.��ӡ�·ݵı��⣨����һ�������գ�
		//5.����ĳ��1�������ڼ�����ӡ����������
		PrintCalendarContent(sum % 7);
	}
	
	/**
	 * ���ݵ���1�����ܼ���ӡ����������
	 * @param dayOfWeek ����1�������ڼ�
	 */
	private static void PrintCalendarContent(int dayOfWeek){
		//ע�⣺dayOfWeekȡֵ��Χ��0-6   
		int sepCount = 0;	//\t������
		if(dayOfWeek == 0){
			sepCount = 6;
		}else {
			sepCount = dayOfWeek - 1;
		}
		for(int i = 0; i < sepCount; i++){
			System.out.print("\t");
		}
		for(int i = 0; i < dayOfMonth[month - 1]; i++){
			System.out.print(i + 1);
			if((dayOfWeek + i) % 7 == 0){
				//����
				System.out.println();
			}else{
				System.out.print("\t");
			}
		}
	}
	
	private static void PrintMonthTitle(){
		String[] monthNames = {"һ��", "����", "����", "����", "����", "����", "����", "����", "����", "ʮ��", "ʮһ��", "ʮ����"};
		System.out.println("\t\t" + year + "\t" + monthNames[month - 1]);
		String[] weekdays = {"������", "������", "ˮ����", "ľ����", "������", "������", "������"};
		for (int i = 0; i < weekdays.length; i++) {
			System.out.print(weekdays[i] + "\t");
		}
		System.out.println();
	}
	
	/**
	 * ���1900-year���������
	 * @return
	 */
	private static int getSumDayOfYears(){
		//��Ҫ�ж��û��Ƿ��Ѿ����������
		if(year == Integer.MIN_VALUE){
			System.out.println("��ݴ���������������ݺ��·ݣ�");
			InputYearAndMonth();
		}
		int sum = 0;
		for(int i = 1900; i < year; i++){
			sum += 365;		//ÿһ���ۼ�365��
			if(isLeapYear(i)){
				sum++;		//�����+1��
			}
		}
		return sum;
	}
	
	/**
	 * �õ�year��1��1�ŵ�year��month-1�����һ���������
	 * @return
	 */
	private static int getSumDayOfMonth(){
		int sum = 0;
		for(int i = 0; i < month - 1; i++){
			sum += dayOfMonth[i];
		}
		//���year�������꣬����month>=3
		if(isLeapYear(year) && month >= 3){
			sum++;
		}
		return sum;
	}
	
	/**
	 * �����жϴ����year�����ǲ�������
	 * @param year Ҫ�жϵ����
	 * @return �����꣬����true
	 */
	private static boolean isLeapYear(int year){
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
	
	/**
	 * �����û��������ݺ��·�
	 */
	private static void InputYearAndMonth(){
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ�");
		year = input.nextInt();
		System.out.print("�������·ݣ�");
		month = input.nextInt();
		input.close();
		input = null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
