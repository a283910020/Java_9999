package com.xuetang9.javabase.chapter5;

import java.util.Scanner;

/**
 * ����Ϸ������ҵ�ƽ��ս����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��14�� ����11:40:45
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class CalcAvgPower {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int power = 0;	//��ҵ�ս����
		int sum = 0;	//�ۼӺ�
		double avg = 0;	//ƽ��ֵ
		//��������ս������ƽ��ֵ
		for (int i = 0; i < 3; i++) {
			System.out.print("�������" + (i + 1) + "λ��ҵ�ս������");
			power = input.nextInt();
			sum += power;
		}
		avg = sum / 3.0;
		System.out.printf("��λ��ҵ�ս����ƽ��ֵΪ��%.2f\n", avg);
		//ǿ�ҽ��飺һ��ѭ�����ֻ��һ����
		//���Ժ�ѧϰ�����ʹ�õ�����ѭ����ս��֮��
//		for (int i = 0; i < 3; i++) {
//			
//		}
		
	}

}




