package com.xuetang9.javabase.chapter9.userdemo;

import java.util.Scanner;
/**
 * 1���û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
	2������6-18λ��ֻ�ܰ�����ĸ�����֡�������ţ��»��ߡ�@��#��$��!��
	�����֡�����ĸʱ������ǿ�ȶ����� ��������
	����+���롢����+���š�����+��ĸ��ǿ��Ϊ�У�������
	ͬʱ���������ַ���ǿ��Ϊǿ��������
	3���û�������ȷ��email
	�������@���ţ���ֻ�ܰ���һ��
	@��.  ���Ų����ڿ�ͷ��Ҳ�����ڽ�β
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��11�� ����11:31:39
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class UserMain {
	public static void main(String[] args) {
		//Javaֱ���ε���Ŀ���ӣ�
		//https://github.com/ljxt-ExtremeAcademy/JavaBase.git
		
		Scanner input = new Scanner(System.in);
		//���´���ʵ���û�ע��
//		System.out.println("�������û�����");
//		String userName = input.next();
		System.out.println("���������룺");
		String password = input.next();
		System.out.println(StringUtil.validatePassword(password));
		
		
//		String password = input.next();
//		System.out.println("��������������ַ��");
//		String email = input.next();
		
		
	}
}
