package com.xuetang9.javabase.chapter6;

import java.util.Scanner;

/**
 * ��������������������е��±꣬û���ҵ����±�Ϊ-1
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��19�� ����11:32:25
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class SearchDemo {

	public static void main(String[] args) {
		String [] values = {"abc", "def", "cvb"};
		for(String value : values){
			System.out.println(value);
		}
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		
		
		
		
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
		
		//���û�����Ҫ���ҵ�����
		//ѭ������  �������飬���Ҷ�Ӧ��Ԫ�أ�����ҵ��ˣ���ӡ�±꣬û�ҵ�����ӡ-1
		System.out.print("������Ҫ���ҵ�Ԫ�أ�");
		int searchNum = new Scanner(System.in).nextInt();
		int searchIndex = -1;//��·��һ��Ҫ�ҵ��±꣬��ֵΪ-1
		//ѭ������
//		for (int i = 0; i < nums.length; i++) {
//			if(searchNum == nums[i]){
//				//System.out.println("�ҵ��ˣ��±�Ϊ��" + i);.
//				//�ҵ��󣬼�¼��Ҫ����Ԫ�ص��±�
//				searchIndex = i;
//				break;
//			}
//		}
		for (int i : nums) {
			if(searchNum == nums[i]){
				//System.out.println("�ҵ��ˣ��±�Ϊ��" + i);.
				//�ҵ��󣬼�¼��Ҫ����Ԫ�ص��±�
				searchIndex = i;
				break;
			}
		}
		
		
		//��ѭ��������ж�
		if(searchIndex == -1){
			System.out.println("���ź���û���ҵ����Ԫ�أ�");
		}else{
			System.out.println("Ҫ���ҵ�Ԫ���±�Ϊ��" + searchIndex);
		}
		
		
		
		
		
		
		
		
		

	}

}
