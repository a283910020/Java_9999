package com.xuetang9.javabase.chapter14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		//��ȡproperties�ļ��ĳ�������
		Properties props = new Properties();
		//���������ļ� - �̶���д��
		props.load(PropertiesDemo.class.getResourceAsStream("Config.properties"));
		//��ȡ����
		String value = props.getProperty("user1", "abc");//ͨ��key���value
		System.out.println(value);
		//�������ļ���д������
		props.setProperty("name", "Monkey��D��Luffy");
		props.setProperty("����", "�л����ǹ��͹�");
		FileOutputStream outStream = new FileOutputStream("bin/com/xuetang9/javabase/chapter14/Config.properties");
		props.store(outStream, "д��ʱ��ע�� - Comments");
		
		props.load(PropertiesDemo.class.getResourceAsStream("Config.properties"));
		System.out.println("�������еļ�ֵ��");
		for(Entry<Object, Object> entry : props.entrySet()){
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
	}

}
