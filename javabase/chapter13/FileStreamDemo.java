package com.xuetang9.javabase.chapter13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * ��ʾ�ļ����롢������Ļ����÷�
 * ע�⣺Ŀǰ���x����ʽ߀���^ԭʼ�����h���@�e��ϤInputStream/OutputStream��һЩ���÷�������
 * ���m����һЩ���A����x�������M�������͔Uչ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��11�� ����11:36:00
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class FileStreamDemo {
	private static final String FilePath = "src/com/xuetang9/javabase/chapter13/FileDemo.java";
	public static void main(String[] args) throws IOException {
		
//		//ReadFile();
		writeFile();
	}
	
	public static void writeFile() throws IOException{
		//ע�⣺���ļ�Ĭ�ϲ�����
		final String FilePath1 = "src/com/xuetang9/javabase/chapter13/FileDemo1.java";
		OutputStream outStream = new FileOutputStream(FilePath1, false);//�ڶ����������Ƿ�׷��д��
		String content = "package com.xuetang9.javabase.chapter13;\n";
		content += "//�����ɴ����Զ�����\n";
		content += "public class FileDemo1{\n";
		content += "\tpublic static void main(String[] args){\n";
		content += "\t\tSystem.out.println(\"Hello World!\");\n\t}\n}";
		outStream.write(content.getBytes());//������䣺���ַ���ת�����ֽ����飬д�뵽�ļ���
		//д����Ϻ�һ���ǵùرմ򿪵���Դ
		outStream.close();
		System.out.println("�����ѳɹ�д�뵽�ļ��У����飺");
		System.out.println(FilePath1);
	}
	
	public static void ReadFile() throws IOException{
		File file = new File(FilePath);//ʡ���ж�
		InputStream inputStream = new FileInputStream(file);
		//inputStream.available() ��ȡ���������Զ�ȡ���ļ���С���ֽڣ�
		//��ȡ�ļ��Ļ������� - ��ԱȽϹ̶�
		byte[] bytes = new byte[20000];
		inputStream.read(bytes);
//		int count = 0;
//		while((bytes[count] = (byte)inputStream.read()) != -1){
//			count++;
//		}
		String content = new String(bytes);	//����ȡ�����ֽ�����ת�����ַ������Ա��ӡ
		System.out.println(content);
		inputStream.close();
	}

}







