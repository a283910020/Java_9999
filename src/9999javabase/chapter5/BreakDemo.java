package com.xuetang9.javabase.chapter5;

import java.util.Scanner;

/**
 * ��ʾbreak�Ļ����÷�
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��16�� ����10:05:26
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class BreakDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ͳ����ҵĸ��˹��׶ȣ�������ֵ��ֱ������ѭ��
		int exp = 0;	//���˹��׶�
		int sum = 0;	//�����ܹ��׶�
		for(;;){//��ѭ��
			System.out.print("�����뱾�εĹ��׶ȣ�");
			exp = new Scanner(System.in).nextInt();//�����ķ�ʽ���ö��󷽷�
			if(exp < 0){
				System.out.println("���˹��׶Ȳ���Ϊ����������ǿ���˳���");
				break;
			}
			sum += exp;
		}
		
		System.out.println("������Ĺ��׶�����Ϊ��" + sum);
		
		
		
//		long count = 0;
//		long startTime = System.currentTimeMillis();//1970-1-1�����ڵĺ�����
//		while(true){//��ѭ��
//			if(count++ == Long.MAX_VALUE){
//				break;
//			}
//		}
//		long endTime = System.currentTimeMillis();//1970-1-1�����ڵĺ�����
//		System.out.println("ѭ���ѽ���" + count);
//		System.out.println("ѭ����ʱ��" + (endTime - startTime) + "���룡");

	}

}
