package com.xuetang9.javabase.chapter6;

import java.util.Scanner;

/**
 * ���ֲ��ҷ���ǰ��-�����Ѿ�����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��21�� ����11:31:58
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class BinarySearchDemo {
	public static void main(String[] args) {
//		����ԭ��
//		���Ƚ�Ҫ���ҵ�Ԫ��(key)��������м�Ԫ�رȽ�
//		1�����keyС���м�Ԫ�أ�ֻ��Ҫ�������ǰһ��Ԫ���м�������
//		2�����key���м�Ԫ����ȣ�ƥ��ɹ������ҽ���
//		3�����key�����м�Ԫ�أ�ֻ��Ҫ������ĺ�һ��Ԫ���м�������key
		
		Scanner input = new Scanner(System.in);
		int[] array = {2, 5, 8, 10, 15, 35, 45, 55, 65, 75, 95};
		System.out.print("������Ҫ���ҵ����֣�");
		int searchNum = input.nextInt();
		int deleteIndex = -1;			//Ҫɾ��Ԫ�ص��±�
		int count = array.length;		//��ǰ����Ԫ�ص��ܸ���
		boolean isFind = false;			//�Ƿ��ҵ�
		int low = 0;					//�½��±�
		int high = array.length - 1;	//�Ͻ��±�
		//��֪��Ҫ���Ҷ��ٴΣ�
		while(high >= low){
			//�����е��±�
			int mid = (high + low) / 2;
			//���keyС���м�Ԫ�أ�ֻ��Ҫ�������ǰһ��Ԫ���м�������
			if(searchNum < array[mid]){
				high = mid - 1;
			}else if(searchNum > array[mid]){//���key�����м�Ԫ�أ�ֻ��Ҫ������ĺ�һ��Ԫ���м�������key
				low = mid + 1;
			}else{//���key���м�Ԫ����ȣ�ƥ��ɹ������ҽ���
				System.out.println("�ҵ������֣��±�Ϊ��" + mid);
				isFind = true;
				deleteIndex = mid;
				break;
			}
		}
		if(!isFind || deleteIndex == -1){
			System.out.println("û���ҵ�����������֣�");
			System.exit(0);
		}
//		1.�ҵ�Ҫɾ��Ԫ�ص��±� delIndex = 3
//		2.��Ҫɾ���±꿪ʼ������һ��Ԫ�ظ�ֵ��ǰ��һ��Ԫ��-����
//				  nums[i] = nums[i + 1]
//		3.�����ܳ���-1
		count--;
		for(int i = deleteIndex; i < count; i++){
			array[i] = array[i + 1];
		}
		
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);
		}
		
		
		
		
		
		
		
		
		

	}

}
