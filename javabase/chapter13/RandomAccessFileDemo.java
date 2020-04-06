package com.xuetang9.javabase.chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ʾRandomAccessFile�Ļ����÷�
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��18�� ����11:46:17
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class RandomAccessFileDemo {
	private static final String FilePath1 = "src/com/xuetang9/javabase/chapter13/RandFile.txt";
	private static final String FilePath2 = "src/com/xuetang9/javabase/chapter13/163.html";
	
	/**
	 * ʹ��RandomAccessFileʵ���ļ��ĸ���
	 */
	private static void CopyFile(){
		try(
				RandomAccessFile srcFile = new RandomAccessFile(new File(FilePath2), "r");
				RandomAccessFile newFile = new RandomAccessFile(new File(FilePath1), "rw");
		){
			//����֮ǰ����Ҫ���newFile
			newFile.setLength(0);
			long fileLenth = srcFile.length();	//���Ҫ���Ƶ��ļ���С���ֽڣ�
			//�����ֽ����飬�Դ�Ÿ��Ƶ�����
			byte[] bytes = new byte[(int)fileLenth];
			srcFile.readFully(bytes);
			//���ֽ�����д�뵽���ļ��м���
			newFile.write(bytes);
			System.out.println("�ļ����Ƴɹ���");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		CopyFile();
//		File file = new File(FilePath1);
//		if(!file.exists()){
//			file.createNewFile();
//		}
//		try(RandomAccessFile randFile = new RandomAccessFile(file, "rw")) {
//			randFile.setLength(0);//ǿ�����ļ���С���� - �൱��ɾ���ļ��е���������
//			//д��2000����������
//			for(int i = 0; i < 2000; i++){
//				randFile.writeInt(i + 2000);
//			}
//			//��ȡ
//			System.out.println("��ǰ�ļ���С��" + randFile.length() + "�ֽ�");
//			//�ƶ��ļ�ָ��
//			randFile.seek(4 * 8);
//			System.out.println("�ƶ�8�����Ϳռ��(32���ֽ�)��ֵΪ��" + randFile.readInt());
//			randFile.seek(4 * 800);		//�ƶ�����800�����ʹ�
//			randFile.writeInt(8000);	//����800�������޸�Ϊ8000
//			randFile.seek(4 * 800);		//�ٴν��ļ�ָ���ƶ�����800�����ʹ����Ա��ӡ
//			System.out.println("�ƶ�800�����Ϳռ���ֵΪ��" + randFile.readInt());
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
