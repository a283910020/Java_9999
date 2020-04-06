package com.xuetang9.javabase.chapter13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ���ַ������ļ����л����Ķ�д����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��15�� ����11:35:36
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class ReaderAndWriterDemo {
	private static final String FilePath1 = "src/com/xuetang9/javabase/chapter13/FileDemo1.java";
	private static final String FilePath2 = "src/com/xuetang9/javabase/chapter13/FileDemo1.java";
	
	public static void main(String[] args) {
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(FilePath1));
			//�̶��Ķ�ȡ��ʽ��
			String line = null;
			while((line = bReader.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Ҫд����ַ���
		String content = "package com.xuetang9.javabase.chapter13;\n";
		content += "//�����ɴ����Զ�����1111111111\n";
		content += "public class FileDemo1{\n";
		content += "\tpublic static void main(String[] args){\n";
		content += "\t\tSystem.out.println(\"Hello World!\");\n\t}\n}";
		try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(FilePath2))) {
			//ʹ����jdk7�Ժ��������Զ��ر���Դ��д��
			//ʹ��ǰ�᣺��Դ�����ʵ��Closeable�ӿ�
			bWriter.write(content);	//���ַ���д�뵽������
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			//ע�⣺����bWriter.close���׳�IOException��������쳣�ͱ��½ṹ������
			//���µĴ��������鿴�����Ƶ��쳣��Ϣ
			if(e.getSuppressed() != null){
				Throwable[] throwables = e.getSuppressed();
				for(Throwable t : throwables){
					System.err.println(t.getMessage() + "cased by " + t.getClass().getSimpleName());
				}
			}
		}

	}

}
