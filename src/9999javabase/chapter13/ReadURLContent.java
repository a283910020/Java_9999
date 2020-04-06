package com.xuetang9.javabase.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * �Ӹ�����url�϶�ȡ�ļ����� - ��ʱֻ֧��httpЭ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��18�� ����11:37:13
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class ReadURLContent {
	static final String FilePath = "src/com/xuetang9/javabase/chapter13/163.html";
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.163.com/index.html");
		//��InputStreamת����Reader����·��ʹ��װ������InputStreamReader
		StringBuffer content = new StringBuffer();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))){
			String line = null;
			while((line = reader.readLine()) != null){
				content.append(line);
				content.append(System.getProperty("line.separator"));
			}
			ReplaceLyriceDemo.WriteFileByPrintWriter(content.toString(), FilePath, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
