package com.xuetang9.javabase.chapter4;

import java.util.Scanner;

/**
 * �������������������ÿλ����֮��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��12�� ����10:30:11
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class CalcSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ�����֣����������λ֮�ͣ�");
		//1.�õ�Ҫ�������������
		int num = input.nextInt();//Ҫ���в�ּ������������
		int tempNun = num;	//��ʱ����
		//2.������ر���
		int i = 0;		//ѭ������
		int sum = 0;	//�ۼӺ�
		//3.ѭ�����������ۼӺ�
		while(tempNun > 0){
			sum += tempNun % 10;//ÿ��ѭ���ۼӸ�λ
			tempNun /= 10;		//жĥɱ¿��ȥ����λ����
		}	
		//4.��ӡ������
		System.out.println(num + "�ĸ�λ����֮��Ϊ��" + sum);

	}

}
