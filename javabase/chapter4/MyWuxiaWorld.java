package com.xuetang9.javabase.chapter4;

import java.util.Scanner;

/**
 * ģ���ҵ���������ѡ�����﹦��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��14�� ����10:38:22
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class MyWuxiaWorld {
	public static void main(String[] args) {
//		String str = String.format("%d%s", 123, "abc");
//		System.out.println(str);
		
		Scanner input = new Scanner(System.in);
		String answer = "y";	//�û�������Ƿ����
		String name = null;		//��һ����ֵ
		do{
			System.out.println("��ӭ�����Ͼ��������磬���������쵱�������Ŵ��������ɣ�");
			name = input.nextLine();
			System.out.println("ͷ�Σ������뽭����");
			System.out.println("�������ţ�" + name);
			System.out.println(name + "�������������Ľ���������(y/n)");
			answer = input.nextLine();
		//}while(answer.equals("y"));	//�ַ����Ƚ�ʱ��������ʹ�� ==
		//}while(answer.equalsIgnoreCase("y"));	//���Դ�Сд�Ƚ�
		}while(!"y".equalsIgnoreCase(answer));	//�����д��
		System.out.printf("��%s���������뽭������С֮�������˱ܣ�\n", name);
		//input.close();
	}

}






