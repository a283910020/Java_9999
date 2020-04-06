package com.xuetang9.javabase.chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * PrintWriter��PrintStream
 * printWriter���������ַ�����һ��д��2���ֽڣ�PrintStream���������ֽ�����һ��д��1���ֽ�
 * ���飺�ڴ����ı��ļ�ʱ��ʹ��PrintWriter
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��15�� ����11:51:07
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class PrintWriterDemo {
	static final String FilePath = "src/com/xuetang9/javabase/chapter13/FileDemo1.java";
	public static void main(String[] args) {
		
		PrintWriter writer1 = new PrintWriter(System.out);
		writer1.println("ʹ��PrintWriter��ӡ�������ݣ�");
		writer1.flush();
		writer1.close();
//		//���䣺����Java�еķָ���  windows - \r\n   
//		String separator = System.getProperty("line.separator");//���ϵͳĬ�ϵķָ��� - �̶�д��
//		String content = "package com.xuetang9.javabase.chapter13;" + separator;
//		content += "public class FileDemo1{" + separator;
//		content += "\tpublic static void main(String[] args){" + separator;
//		content += "\t\tSystem.out.println(\"HelloWorld!\");" + separator;
//		content += "\t}" + separator;
//		content += "}";
//		
//		
//		
//		try(PrintWriter writer = new PrintWriter(new File(FilePath))){
//			writer.write(content);
//			System.out.println("д��ɹ���");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try(Scanner input = new Scanner(new File(FilePath))){
//			StringBuffer value = new StringBuffer();
//			while(input.hasNextLine()){
//				value.append(input.nextLine());
//				value.append(separator);
//			}
//			System.out.println("�����Ǵ��ļ��ж�ȡ�������ݣ�");
//			System.out.println(value.toString());
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}

	}

}
