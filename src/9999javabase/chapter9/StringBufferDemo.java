package com.xuetang9.javabase.chapter9;

import java.util.Collections;

/**
 * ��ǿ����ַ��� - ��������ַ���
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��15�� ����2:16:49
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer strBuffer = new StringBuffer("��ã��ɶ���");
		StringBuffer strBuffer1 = new StringBuffer("��ã��ɶ���");
		StringBuffer strBuffer2 = new StringBuffer("��ã��ɶ���");
		
		System.out.println(strBuffer.reverse());	//��ת�ַ���
		
		//strBuffer1.insert(3, "3L");					//�ڹ涨���±괦����Ԫ��
		//System.out.println(strBuffer1);
		
		//strBuffer2.deleteCharAt(3);
		//System.out.println(strBuffer2);
		strBuffer2.delete(2, 4);					//ɾ��[2, 4)�±�֮���Ԫ��
		System.out.println(strBuffer2);
		
		strBuffer1.replace(2, 4, "����");
		System.out.println(strBuffer1);
		
		strBuffer.setCharAt(3, '��');
		System.out.println(strBuffer);
		
		System.out.println("�����С��" + strBuffer.capacity());
		
		strBuffer.setLength(0);						//�൱��������ַ�������
		
		
		strBuffer.trimToSize();
		
		
		
		
		
		
		
//		final int N = 500000;	//10��
//		long startTime = System.currentTimeMillis();
//		String str = "*";
//		for(int i = 0; i < N; i++){//10���ѭ��
//			str += "*";
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("+=��ʱ��" + (endTime - startTime) + "����");
//
//		//ʹ��StringBuffer�����ַ���ƴ��
//		startTime = System.currentTimeMillis();
//		StringBuffer str1 = new StringBuffer("*");
//		for(int i = 0; i < N; i++){//10���ѭ��
//			str1.append("*");
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("StringBuffer��append��ʱ��" + (endTime - startTime) + "����");
//		
//		//StringBuilder
//		startTime = System.currentTimeMillis();
//		StringBuilder str2 = new StringBuilder("*");
//		for(int i = 0; i < N; i++){//10���ѭ��
//			str2.append("*");
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("StringBuilder��append��ʱ��" + (endTime - startTime) + "����");
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
