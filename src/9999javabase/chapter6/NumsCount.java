package com.xuetang9.javabase.chapter6;
/**
 * ����һ���������飬��ֵ���������������ż������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��19�� ����11:29:43
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class NumsCount {
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
		
		int count1 = 0, count2 = 0;	//������ż���ĸ���
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0){//ż��
				count2++;
			}else{
				count1++;
			}
		}

	}

}
