package com.xuetang9.javabase.chapter4;

import java.util.Scanner;

/**
 * ʹ��ѭ��ʵ������������������˳�ϵͳ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��12�� ����10:43:02
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class PasswordDemo {
	public static void main(String[] args) {
		final String PASSWORD = "123456";//����
		//PASSWORD = "abc";
		Scanner input = new Scanner(System.in);
		String password = null;	//����
		//System.out.println(password.length());
		String userName = "";   //NULL  nullptr
		//1.д��ѭ���ṹ
		int i = 0;
		while(i < 3){
			System.out.print("���������룺");
			password = input.next();
			//Java�е��ַ��������������жϣ� if(password == "123456"){
			//if(password.equals("123456")){//�ж��ַ�����ȵĹ̶���ʽ����
			i++;
			if(!PASSWORD.equals(password)){
				System.out.println("��������������������룡��ʣ��" + (3 - i) + "�Σ�");
				if(i == 3){
					System.out.println("������������Ѵ����Σ�ǿ���˳�ϵͳ��");
					System.exit(0);
				}
			}else{//����������ȵ����
				//��취�˳����ѭ���ṹ
				//i = 9;//��θĽ���
				i = Integer.MAX_VALUE;//��i��ֵΪ����������ֵ��
			}
		}
		System.out.println("������ȷ���ɹ���½��ϵͳ��");
		//2.����ѭ���Ĵ���
		//3.���벢��֤�û���������
		

	}

}
