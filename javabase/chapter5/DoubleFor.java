package com.xuetang9.javabase.chapter5;
/**
 * ˫ѭ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��16�� ����11:09:04
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class DoubleFor {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {//��ӡ10��
			//�ڲ�ѭ�������� ���������������д�ӡ�ķ���
			for (int j = 0; j <= 2 - i; j++) {//ÿ�д�ӡ19������
				System.out.print(" ");	//ֻ�ܴ�ӡ���ţ���Ҫ���У�
			}
			//��ӡ�꾮�ź��ٴ�ӡ�Ǻţ�
			
			for (int j = 0; j <= 2 * i; j++) {
				if(j == 0 || j == 2 * i)//j�����ֵ����Сֵ��ʱ�򣬴�ӡ�Ǻ�
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();//�����ѭ�����ƵĻ���
		}
		for (int i = 0; i < 3; i++) {//��ӡ10��
			//�ڲ�ѭ�������� ���������������д�ӡ�ķ���
			for (int j = 0; j <= i; j++) {//ÿ�д�ӡ19������
				System.out.print(" ");	//ֻ�ܴ�ӡ���ţ���Ҫ���У�
			}
			//��ӡ�꾮�ź��ٴ�ӡ�Ǻţ�
			
			for (int j = 0; j <= 4 - 2 * i; j++) {
				if(j == 0 || j == 4 - 2 * i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();//�����ѭ�����ƵĻ���
		}
		
		
		//�С��� - ˫ѭ��
		char ch = 'A';
		//���ѭ�������� �������������ƻ���
//		for (int i = 0; i < 4; i++) {//��ӡ10��
//			//�ڲ�ѭ�������� ���������������д�ӡ�ķ���
//			for (int j = 0; j <= 2 - i; j++) {//ÿ�д�ӡ19������
//				System.out.print(" ");	//ֻ�ܴ�ӡ���ţ���Ҫ���У�
//			}
//			//��ӡ�꾮�ź��ٴ�ӡ�Ǻţ�
//			
//			for (int j = 0; j <= 2 * i; j++) {
//				System.out.print((char)ch);
//			}
//			ch++;
//			System.out.println();//�����ѭ�����ƵĻ���
//		}
//		for (int i = 0; i < 3; i++) {//��ӡ10��
//			//�ڲ�ѭ�������� ���������������д�ӡ�ķ���
//			for (int j = 0; j <= i; j++) {//ÿ�д�ӡ19������
//				System.out.print(" ");	//ֻ�ܴ�ӡ���ţ���Ҫ���У�
//			}
//			//��ӡ�꾮�ź��ٴ�ӡ�Ǻţ�
//			
//			for (int j = 0; j <= 4 - 2 * i; j++) {
//				System.out.print((char)ch);
//			}
//			ch++;
//			System.out.println();//�����ѭ�����ƵĻ���
//		}
		
		
		
//		for (int i = 0; i < 5; i++) {		//���ѭ�� - ��������
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
////				if(j == 4){
////					System.out.println();
////				}
//			}
//			System.out.println();
//		}

	}

}





