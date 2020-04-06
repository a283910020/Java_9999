package com.xuetang9.javabase.chapter13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * �޸ĸ���е����� - ʵ������һ���ļ���д����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��18�� ����10:23:45
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class ReplaceLyriceDemo {
	//ע�⣺�����sav��׺���������ģ�
	static final String FilePath = "src/com/xuetang9/javabase/chapter13/lyrice.sav";
	
	/**
	 * �ַ���
	 * ����ȡ�ļ��Ĳ�����װ�ڷ����У������Ժ��ʹ��
	 * @param filePath
	 * @return
	 */
	public static String ReadFileByReader(String filePath){
		StringBuffer content = new StringBuffer();
		Reader reader = null;
		BufferedReader bReader = null;
		try {
			reader = new FileReader(filePath);
			bReader = new BufferedReader(reader);
			String line = null;
			while((line = bReader.readLine()) != null){
				content.append(line);
				content.append(System.getProperty("line.separator"));//ƴ��һ��ϵͳĬ�ϵķָ��� win-\r\n
			}
			//ɾ������ϵͳ�ָ���
			content.delete(content.toString().lastIndexOf(System.getProperty("line.separator")), content.toString().length());		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bReader.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return content.toString();
		
	}

	/**
	 * ʹ��PrintWriter����ʵ��д���ļ�
	 * Scanner��PrintWriter��һ��
	 * �ŵ㣺������
	 * @param filePaht
	 * @param isAppend
	 */
	public static void WriteFileByPrintWriter(String content, String filePath, boolean isAppend){
		try(//JDK1.7�Ժ��д���������Զ��رմ򿪵���Դ��
				FileOutputStream outStream = new FileOutputStream(filePath, isAppend);
				PrintWriter writer = new PrintWriter(outStream);
			){
			writer.print(content);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//���÷�������ļ��е���������
		String content = ReadFileByReader(FilePath);
		//���÷�������content�ַ���д�뵽�ļ��� - ���������
		WriteFileByPrintWriter(content, FilePath, true);
		
	}
	
//	public static void main(String[] args) {
//		//ʹ���ַ������в���
//		Reader reader = null;
//		BufferedReader bReader = null;
//		Writer writer = null;
//		BufferedWriter bWriter = null;
//		StringBuffer lyrice = new StringBuffer();
//		try {
//			reader = new FileReader(FilePath);
//			bReader = new BufferedReader(reader);
//			
//			String line = null;
//			while((line = bReader.readLine()) != null){
//				lyrice.append(line);
//				lyrice.append(System.getProperty("line.separator"));//ƴ��һ��ϵͳĬ�ϵķָ��� win-\r\n
//			}
//			String newLyrice = lyrice.toString().replaceAll("��Ů��", "Ů��").replaceAll("���У�", "�У�");
//			//�����д���ļ�
//			writer = new FileWriter(FilePath);
//			bWriter = new BufferedWriter(writer);
//			bWriter.write(newLyrice);
//			System.out.println("���滻�ɹ���");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bReader.close();
//				reader.close();
//				bWriter.flush();
//				bWriter.close();
//				writer.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//
//	}

}





