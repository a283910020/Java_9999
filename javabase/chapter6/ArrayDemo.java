package com.xuetang9.javabase.chapter6;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Ҫ���û���̬¼��5��ѧ���ĳɼ�����ƽ���ɼ�
		final int N = 10;
		double[] scores = new double[N];  //sizeof(scores) / sizeof(double)
		double sum = 0, avg;	//�ܳɼ���ƽ���ɼ�
		for(int i = 0; i < scores.length; i++){
			System.out.print("�������" + (i+1) + "λͬѧ�ĳɼ���");
			//���û������double�������֣���ֵ�������еĵ�i��Ԫ��
			scores[i] = input.nextDouble();//�ص���䣡  
		}
		//�����ܳɼ�     �ʾ����Ͼ�ѧ��΢�Ź��ں� 
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];	//�������
		}
		
		System.out.printf("%dλͬѧ��ƽ���ɼ�Ϊ��%.2f", scores.length, sum / scores.length);
		
		
		
		
		
		
		
		
		//		int[] nums = null;	//������һ���������� nums
//		nums[0] = 9;		//Ϊ�����0��Ԫ�ظ�ֵΪ9
		//java.lang.NullPointerException
		//�쳣- ��ָ���쳣 - û�пռ�
		
		//�����������·����ڴ�ռ���׵�ַ
//		int[] nums = new int[5];	//�ڶ��ڴ��з�����5��int���ʹ�С�Ŀռ�
//		System.out.println(nums);
//		
//		int num;	//�����������ʱ����ջ�ڴ���ֱ�ӷ����˿ռ䣨����Ҫ�ֶ�����ռ䣩
//		num = 9;
//		
//		Scanner input = new Scanner(System.in); //new:�ڶ��ڴ��з����˿ռ�
//		input.next();   
	}

}
