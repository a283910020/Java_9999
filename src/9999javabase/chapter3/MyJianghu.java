package com.xuetang9.javabase.chapter3;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * ���ݽ�ɫ������ֵ��ӡ��ɫ����������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��9�� ����10:31:29
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class MyJianghu {
	public static void main(String[] args) {
		String info = null;	//��ɫ��Ϣ
		Scanner input = new Scanner(System.in);
		System.out.print("�������ɫ������ֵ��");
		int power = input.nextInt();
		if(power <= 1000){
			info = "����һ��";
		}else if(power < 3000){
			info = "��������";
		}
		System.out.println("���Ϸɴ���" + info);
		
//		if(power >=0 && power < 1000){
//			System.out.println("������������һ��");
//		}else if(!(power < 1000 || power > 3000)){//1000 - 3000֮��
//			System.out.println("�������ò�����");
//		}
	}

}










