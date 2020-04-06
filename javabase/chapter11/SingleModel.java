package com.xuetang9.javabase.chapter11;
/**
 * ����ģʽʾ�� - ��·
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��1�� ����10:23:06
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class SingleModel {
	/** ��������Ψһ�ı����ʵ�� */
	private static SingleModel me = null;
	public int count = 0;
	
	private SingleModel(){
		count++;
	}
	/**
	 * ��ñ���Ψһ��һ��ʵ�� -- ����ģʽ�ĺ��ķ���
	 * @return
	 */
	public static SingleModel getInstance(){
		if(null == me) 
			me = new SingleModel();
		return me;
	}
}




