package com.xuetang9.javabase.chapter3;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = -1;	//���������û���ѡ��
		System.out.print("������");
		String name = input.next();
		switch (name) {
		case "�ϵ�":
			System.out.println("�۸���ã�");
			break;
		case "06����":
			System.out.println("��ɩ��ȥ����");
			break;
		default:
			break;
		}
		
		
//		System.out.println("1����¼��Ϸ");
//		System.out.println("2���˳���Ϸ");
//		choice = input.nextInt();
//		if(choice == 1){//�������˵�
//			System.out.println("1����������");
//			System.out.println("2����Ŀ����");
//			System.out.println("3���������");
//			System.out.println("4����������");
//			System.out.println("5���۲����");
//			System.out.println("6������һ��");
//			System.out.print("������ѡ��");
//			choice = input.nextInt();
//			switch (choice) {
//			case 1:			
//				break;
//			case 2:
//				break;
//			case 3:
//				System.out.println("Ц������ > �������");
//				System.out.println("1����ʾ���к�����Ϣ");
//				System.out.println("2����Ӻ���");
//				System.out.println("...........");
//				break;
//			case 4: 
//				break;
//			case 5:
//				break;
//			case 6:
//				break;
//			default:
//				System.out.println("������󣬱�������1-6֮���������");
//				System.exit(0);
//				//break;
//			}
//		}else if(choice == 2){//�˳���Ϸ
//			System.exit(0);//�����˳�JavaӦ�ó���(Java Application)
//		}else{
//			System.out.println("���������Ϸ���˳���");
//		}
	}

}
