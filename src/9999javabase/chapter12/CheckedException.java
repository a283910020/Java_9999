package com.xuetang9.javabase.chapter12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ؼ��쳣 - ����RunTimeExcetion��Error�������������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��8�� ����10:36:40
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class CheckedException {
	public static void main(String[] args) {//arguments
		
		
		
		File file = new File("c:/test.txt");
		try {
			FileWriter writer = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//�ļ���д����������������д�뵽�ļ���
		//�ж�����ļ��Ƿ����
		System.out.println(file.exists());
	}
}
