package com.xuetang9.javabase.chapter9;

public class Hero {
	
	
	String name = "Ĭ��ֵ";
	
	public  void test1(){
		String name = "����"; //null	//�ֲ�����
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		new Hero().test1();
	}
}
