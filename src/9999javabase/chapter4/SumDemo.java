package com.xuetang9.javabase.chapter4;
/**
 * ʹ��ѭ������1-100���ۼӺ�
	��Ҫѭ������ 
	��Ҫ�ۼӺͱ���
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��12�� ����10:23:58
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class SumDemo {
	public static void main(String[] args) {
		//д��ѭ�������ṹ
		int sum = 0;	//���������ۼӺ�
		int i = 0;
		while(i < 100){
			//sum = sum + (i + 1);//�ۼ�  i+1��ֵ
			sum += i + 1; //�ۼӵĺ��Ĵ��룡����
			//sum += i;	//�ۼ�0-99�ĺ�
			i++;
		}
		
//		i = 1;
//		while(i <= 100){
//			sum += i;
//			i++;
//			//�ȼ�д���� sum += i++;
//		}
		
		
		
		System.out.println("1-100���ۼӺ�Ϊ��" + sum);
	}

}
