package com.xuetang9.javabase.chapter10;
/**
 * ʹ�õ���ģʽ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��18�� ����12:08:22
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class StaticDemoTest {
	public static void main(String[] args) {
		StaticDemo staticDemo1 = StaticDemo.getInstance();
		System.out.println(staticDemo1.normal_number);
		
		
		StaticDemo staticDemo2 = StaticDemo.getInstance();
		staticDemo2.normal_number = 1024;
		
		
		
		StaticDemo staticDemo3 = StaticDemo.getInstance();
		System.out.println(staticDemo3.normal_number);
		
		System.out.println(staticDemo1 == staticDemo2);

	}

}
