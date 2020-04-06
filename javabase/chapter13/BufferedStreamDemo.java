package com.xuetang9.javabase.chapter13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ʹ�ô�����������Ӷ�дЧ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��15�� ����10:09:47
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class BufferedStreamDemo {
	/**
	 * ע�⣺���ļ�·�������Ͼž��ĵ�����
	 * ����Ǳ��ز��ԣ�һ���ǵý��ļ�·���޸ĳ��Լ������е�·����
	 */
	private static final String FilePath1 = "C:/Users/��ͷ/Videos/Recordings/Javaֱ��֮�ʵ�ѡ����Ŀ����¼��.mp3";
	private static final String FilePath2 = "C:/Users/��ͷ/Videos/Recordings/�Ѹ����ļ�.mp3";
	
	
	public static void main(String[] args) throws IOException {
		//ʹ�û�����װ��ϵͳ������������
//		BufferedInputStream inStream = new BufferedInputStream(System.in);
//		byte[] bytes = new byte[200];
//		System.out.println("�������ַ�����");
//		inStream.read(bytes);
//		System.out.println("�û�������ַ����ǣ�" + new String(bytes));
		
		long time = CopyFileByBufferedStream();
		System.out.println("������ʱ��" + time + "����");
		
		//С��ҵ�����λС�������ʹ��FileInputStreamʵ���ļ��ĸ���
		//ͨ���������õ�ʱ�䣬�Ա�ʹ�û���ĺô�
		//ͨ�����ò�ͬ�Ļ����С�����Ч�ʵ�����
	}
	/**
	 * ʹ�û����������ļ�
	 * @return �������̵���ʱ�����룩
	 */
	private static long CopyFileByBufferedStream(){
		File file = new File(FilePath1);//Ҫ���Ƶ��ļ�����
		if(!file.exists()){
			System.out.println("�ļ������ڣ�����ʧ�ܣ�");
			return 0;
		}
		long starTime = System.currentTimeMillis();
		InputStream inStream = null;
		BufferedInputStream bInStream = null;
		OutputStream outStream = null;
		BufferedOutputStream bOutStream = null;
		try {
			inStream = new FileInputStream(file);
			bInStream = new BufferedInputStream(inStream);
			outStream = new FileOutputStream(FilePath2);
			bOutStream = new BufferedOutputStream(outStream);
			int i = -1;//��ȡ������ʱ����
			while((i = bInStream.read()) != -1){
				bOutStream.write(i);
				//ע�⣺��ȡһ���ֽڣ���д�뵽�˻����У���Ҫ����󣬽������е�����д�뵽�ļ��У�.
				//������Ҫ��ջ���������������������д���ļ��� - flush()
			}
			System.out.println("�ļ����Ƴɹ���");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//bOutStream.flush();
				bOutStream.close();//����ֱ�ӵ���close�������ڲ��Ѿ��������Զ�������flush����
				outStream.close();
				bInStream.close();
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		return endTime - starTime;
	}
	
	
	
	
//	static final String FilePath1 = "src/com/xuetang9/javabase/chapter13/FileStreamDemo.java";
//	static final String FilePath2 = "src/com/xuetang9/javabase/chapter13/BufferTest.txt";
	
//	public static void main(String[] args) {
//		FileInputStream fInputStream = null;
//		BufferedInputStream bInputStream = null;
//		try {
//			fInputStream = new FileInputStream(FilePath1);
//			bInputStream = new BufferedInputStream(fInputStream);
//			byte[] bytes = new byte[bInputStream.available()]; 
//			bInputStream.read(bytes);
//			System.out.println(new String(bytes));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bInputStream.close();
//				fInputStream.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		BufferedOutputStream bOutStream = null;
//		try {
//			bOutStream = new BufferedOutputStream(new FileOutputStream(FilePath2), 10240);
//			bOutStream.write("���������ܺã�".getBytes());
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bOutStream.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//
//	}

}
