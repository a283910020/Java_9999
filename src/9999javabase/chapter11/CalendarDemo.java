package com.xuetang9.javabase.chapter11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ��ʾ������ĳ��÷���
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��1�� ����10:41:06
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class CalendarDemo {
	public static void main(String[] args) throws ParseException {
		//Calendar��һ�������࣬һ��������GregorianCalendarʵ��
		Calendar cal = Calendar.getInstance();
		//ʹ��������ӡ��ǰ��ʱ��
		int year 	= cal.get(Calendar.YEAR);
		int month 	= cal.get(Calendar.MONTH) + 1;
		int day 	= cal.get(Calendar.DATE);
		int hour 	= cal.get(Calendar.HOUR_OF_DAY);
		int minute 	= cal.get(Calendar.MINUTE);
		int second 	= cal.get(Calendar.SECOND);
		int milliSecond = cal.get(Calendar.MILLISECOND);
		System.out.println("��ǰʱ�䣺");
		String strTime = String.format("%d-%02d-%02d %d-%d-%d:%s", 
			year, month, day, hour, minute, second, milliSecond
		);
		System.out.println(strTime);
//		
//		//Ϊ���������趨ʱ��
//		cal.set(2012, 5, 12, 14, 28, 4);
//		Date date = cal.getTime();
//		System.out.println(date.toLocaleString());
//		
//		//���ڸ�ʽ����
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//		String strDate = format.format(date);
//		System.out.println(strDate);
//		//���ַ���ת��ΪDate����
//		Date newDate = format.parse("2017-12-30 23:59:59:999");
//		System.out.println(newDate.toGMTString());
		
		Calendar cal2 = new GregorianCalendar(2017, (8 - 1), 19);
		long diff = Math.abs(cal.getTimeInMillis() - cal2.getTimeInMillis());
		int diffDays = (int)(diff / 1000 / 60 / 60 / 24);
		System.out.println("���" + diffDays + "��");
		
		cal.add(Calendar.YEAR, 3);
		System.out.println(cal.get(Calendar.YEAR));
		
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
}











