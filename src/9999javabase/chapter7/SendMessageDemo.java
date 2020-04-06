package com.xuetang9.javabase.chapter7;

import java.util.concurrent.TimeUnit;

/**
 * ʹ�÷���ģ��ʵ��������Ϸ�е����纰������
	��ѡ�����������ߡ�Ƶ�����������ݡ�����������������ʱ������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��26�� ����11:48:36
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class SendMessageDemo {

	public static void main(String[] args) {
		//SendMessage("������", "����Ƶ��", "�������ԣ�40���ţ����пյ�++", 5, 1000);
		
		SendMessage("������");
	}

	/**
	 * ���صĺ�������
	 * @param nickName �ǳ�
	 * @param channalName ������Ƶ������
	 */
	public static void SendMessage(String nickName, String channalName){
		//SendMessage(nickName, channalName, "", 4, 54);
	}
	
	/**
	 * ���صĺ���������ֻ��Ҫ�û��ṩ�ǳƲ������ɽ���Ĭ�ϵĺ���
	 * @param nicName
	 */
	public static void SendMessage(String nicName){
		String[] contents = {
				"�������",
				"��������ģ��������ҵģ����������Ǻ����˵ģ�",
				"��ӭ����xxx��Ϸ���磡"
		};
		SendMessage(nicName, "Ĭ��Ƶ��", contents[(int)(Math.random() * 2)], 10, 1);
	}
	
	/**
	 * ʵ����Ϸ�еĺ�������
	 * @param name			�����ߵ��ǳ�
	 * @param channelName	������Ƶ������
	 * @param message		����������
	 * @param count			�����Ĵ���
	 * @param interval		������ʱ����(��λ����)
	 */
	public static void SendMessage(String name, String channelName, String message, int count, int interval){
		if(interval < 5) interval = 5;
		
		//�����������߼���ƴ���ַ����Ժ��ӡ����
		String value = String.format("��%s�� %s��%s", 
				channelName, name, message
		);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try {
				//Thread.sleep(interval * 1000);//���߶�����
				TimeUnit.SECONDS.sleep(interval);
				//TimeUnit.HOURS.sleep(interval);
				//TimeUnit.SECONDS.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		//Ԫ��-10
		
	}

}













