package com.xuetang9.javabase.chapter5;

import java.util.Scanner;

/**
 * ��������Ϸ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��16�� ����10:27:16
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class GuessDemo {
	public static void main(String[] args) {
		//�û�Ҫ�µ�����
		//�û��µĴ���
		final int price = (((int)(Math.random() * 1000)) % 9 + 1) * 1000;	//���� 1000-9000
		//System.out.println(price);
		int guessPrice = -1;	//�û��²�ĵ���
		int count = 0;			//�û��µ��ܴ���
		String prizeName = null;//��Ʒ������
		for (int i = 0; i < 5; i++) {
			System.out.println("������������Ʒ�ĵ��ۣ�(" + ++count + "��)");
			guessPrice = new Scanner(System.in).nextInt();
			if(guessPrice == price){//�ڲ²���ȷ������£����жϲ²�Ĵ���
				if(count == 1){
					System.out.println("ţ���ˣ�һ�ξͲ¶���");
					prizeName = "iPhone8S Plus Plus ������";
					//System.out.println("��Ʒ��iPhone8S Plus Plus ������");
				}else if(count >= 2 && count <= 3){
					//System.out.println("��Ʒ����Ϊ��ҫ�ֻ�Zero");
					prizeName = "��Ϊ��ҫ�ֻ�Zero";
				}else{
					//System.out.println("��Ʒ��С�����������ഺ��");
					prizeName = "С�����������ഺ��";
				}
				break;
			}else if(guessPrice < price){
				System.out.println("С�ˣ��������");
			}else if(guessPrice > price){
				System.out.println("���ˣ��������");
			}
		}
		if(null == prizeName){
			System.out.println("���ź�����λ��������꣬�ڴ��´ΰɣ�");
		}else{
			System.out.println("��ϲ�����н��ˣ���Ʒ�ǣ�");
			System.out.println(prizeName);
		}
		
	}
}




