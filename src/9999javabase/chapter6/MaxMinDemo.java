package com.xuetang9.javabase.chapter6;
/**
 * �������е����ֵ����Сֵ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��19�� ����11:18:55
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class MaxMinDemo {

	public static void main(String[] args) {
		//�������һ�����飬����������ֵ����Сֵ
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int)(Math.random() * 10000)) % 1001; //0-1000�������
		}
		System.out.println("����Ԫ��");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println();
		//�����ֵ����Сֵ
		//1.�����һ��Ԫ�������ֵ/��Сֵ
		//2.�����ֵ/��Сֵ������������Ƚϣ����ĳ��Ԫ�ر����ֵ����you can you Up!
		
		//int max = nums[0];
		//int min = nums[0];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > max){//��������е�ĳ��Ԫ�ر�max����
				//you can you Up!
				max = nums[i];
			}
			if(min > nums[i]){
				min = nums[i];
			}
		}
		
		System.out.println("�����е����ֵ�ǣ�" + max);
		System.out.println("�����е���Сֵ�ǣ�" + min);
	}

}
