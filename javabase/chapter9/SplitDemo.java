package com.xuetang9.javabase.chapter9;
/**
 * �ַ����ָ�
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��15�� ����2:04:34
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class SplitDemo {

	public static void main(String[] args) {
		String lyrics = 
				"̫������գ�۾�,������������.����һ��Ŭ���ɻ��|����ճ�˵�С����,"
		        + "�����Ҵ�������,Ҳ�����ҵ�����ȥ,��Ҫժ�������Ļ���,�׸��ҵ�С����,"
		        + "����������Ѳɽ,�Ұ��˼�תһת,�����ҵĹ������ҵ���,������������";
		String keywords = "����,��x��;��X��";//���д�
		String[] keywordArray = keywords.split(",|;");
		
		String[] newArray = lyrics.split(",|\\.|\\|");
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
		String newStr = String.join(";", newArray);
		System.out.println(newStr);

	}

}
