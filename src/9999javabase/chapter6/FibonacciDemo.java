package com.xuetang9.javabase.chapter6;
/**
 * 쳲���������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��19�� ����11:10:11
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class FibonacciDemo {
	public static void main(String[] args) {
		//0��1��1��2��3��5��8��13��21 ��34��55 �� 89 �� 144 
		//���ɣ�ǰ����Ԫ��ֵ�̶���
		int[] nums = new int[20];
		int sum = 0;
		double avg;
		nums[0] = 0;
		nums[1] = 1;
		for(int i = 2; i < nums.length; i++){//��������ʼ����ǰ����Ԫ��֮��
			nums[i] = nums[i - 1] + nums[i - 2];
		}
		
		System.out.println("��ӡ���");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
			sum += nums[i];
		}
		System.out.println();//��ӡ����
		System.out.println(sum / 1.0 / nums.length);
	}

}
