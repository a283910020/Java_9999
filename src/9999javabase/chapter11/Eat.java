package com.xuetang9.javabase.chapter11;
/**
 * �Խӿ�
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��5�� ����3:04:48
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public interface Eat {
	String name = "�ӿ��ж����������";
	
	default public void eating(){
		System.out.println("Eat�ӿڵ�Ĭ��ʵ��");
	}
}
interface Eat1{
	default public void eating(){
		System.out.println("Eat1�ӿڵ�Ĭ��ʵ��");
	}
}
