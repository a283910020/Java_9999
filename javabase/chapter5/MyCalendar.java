package com.xuetang9.javabase.chapter5;
/**
 * ��ӡ1997��7�µ�����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��14�� ����11:47:26
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class MyCalendar {
	/*
	 * ��ӡ����
		��ʹ��ѭ����ӡ1997��7�µ�����
		��֪��1997��7��1��(���ڶ�) ,��ۻع�ٹ�ͬ��
	 */
	public static void main(String[] args) {
		System.out.println("����һ\t���ڶ�\t������\t������\t������\t������\t������");
		System.out.print("\t");
		//System.out.print("1\t2\t3\t4\t5\t6\n");
		
		int dayOfMonth = 31;	//1997���7��һ����31��
		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.print(i);
			//�жϺ�ʱ\t����ʱ\n(��������)
			//��֪��1�������ڶ�
			if((i + 1) % 7 == 0){
				System.out.print("\n");
			}else{
				System.out.print("\t");
			}
		}

	}

}






