package com.xuetang9.javabase.chapter12;
/**
 * �Զ����쳣 - С����ʱ����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��8�� ����12:00:11
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class LessThanZeroException extends Exception{
	//��д������������췽������
	
	private int value;
	
	
	public LessThanZeroException(){
		super("���ֲ���С���㣡");
	}
	
	public LessThanZeroException(int value){
		super("���������Ϊ��" + value + "������С���㣡");
	}

}
