package com.xuetang9.javabase.chapter9;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;


/**
 * �ַ���ʾ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��8�� ����3:57:36
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class StringDemo {
	
	/**
	 * �жϴ�����ַ����Ƿ���һ����ȷ��ʽ��С��
	 * �ַ�����ֻ����һ��С���㣬С���㲻���ڵ�һλ��Ҳ���������һλ
	 * @param str
	 * @return
	 */
	public static boolean isDecimal(String str){
		boolean isDecimal = true;
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))){
				if(str.charAt(i) == '.'){
					if(i == 0 || i == str.length() - 1){//���С�����ڵ�һλ�����һλ����Ȼ�ǷǷ��ģ�����false
						isDecimal = false;
						break;
					}
				}else{//�����ǰ�ַ��������ֲ���Ҳ����С���㣬��ô֤���ǷǷ��ַ���ֱ�ӷ���false
					isDecimal = false;
					break;
				}
			}
		}
		//�ж��ַ�����ֻ����һ��С����
		//1.����С����	2.��ǰ�������±�ʹӺ���ǰ�������±�պ����
		if(!(str.contains(".") && str.indexOf(".") == str.lastIndexOf("."))){
			return false;
		}
		//1.�ж��ַ����е�ÿ��Ԫ�ر��������ֻ�С����
		//2.�����С���㣬��ôС���㲻���ڵ�һλ�����һλ������ֻ����һ��С����
//		if(str.indexOf('.') == 0 || str.indexOf(".") == str.length() - 1){
//			
//		}
		
		return isDecimal;
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner input = new Scanner(System.in);
		//indexOf����
		String password = "ab3456abc";
		//System.out.println(password.indexOf("aaa"));
		//���⣺�ж��ַ�����ֻ����һ��С���㣬С���㲻���ڵ�һλ��Ҳ���������һλ
		
		//substring [beginIndex, endIndex)   [1, 3)
		System.out.println(password.substring(1, 3));
		System.out.println(password.substring(3));
		
		
		
		//trim����:ȥ���ַ�����������Ŀո�
		//���飺���û������û�����ʹ��
//		System.out.println("�������û�����");
//		String uName = input.nextLine().trim();
//		System.out.println("--" + uName + "--");

//		System.out.println("abc".equals("abc"));
//		System.out.println("abcf".compareTo("abcd"));
		
//		System.out.println("abc".startsWith("b"));
//		System.out.println("abcdefg".endsWith("fg"));
//		System.out.println("abcdefg".contains("de"));
		
		
		//��ʾ���õļ���String����Ĺ�����ʽ
//		String str1 = "��ã����磡";
//		String str2 = new String();	//ʹ��Ĭ�Ϲ���  String str2 = "";
//		String str3 = new String(str1);
//		
//		char[] chArray = {'a', 'b', 'c'};	//C�У��ַ�������ַ�����������������һ��Ԫ���Ƿ���\0
//		//���ַ�����ת����String����
//		String str4 = new String(chArray);
//		chArray = str4.toCharArray();
//		
//		//�ֽ��������ַ�����ת��  byte�������ͣ�-128 �� 127֮��
//		byte[] byteArray = {104, 101, 108, 108, 111};
//		String str5 = new String(byteArray);
//		System.out.println(str5);
//		
//		//�ַ���ת�룺
//		String str6 = new String(str1.getBytes(), "UTF-8");
//		System.out.println(str6);
		
		
//		String ��ǿ������ = "��С��";	//��С������ַ����ͱ���������ַ�������
//		��ǿ������ = "�̲�����";			//�̲����� Ҳ�����ַ������еģ�
//		//new String("�̲�����@Сǿ��")
//		��ǿ������ = ��ǿ������.concat("@Сǿ��");	//ע�⣺��ǿ���������Ѿ�����ԭ���ڳ������е��̲������ˣ�
//		//˼�����̲�����@Сǿ�� �Ƿ��ڳ������У�������
//		System.out.println(��ǿ������);
//		
//		String ��ǿ��ǰ�� = "��С��";
//		
		
//		String value = "Hello World";
//		String value1 = value;
//		value += "Good";	//�൱�ڵ�����value.concat()��������ֱ�ӷ���һ���µ��ַ�������ռ�
//		String value2 = "Hello WorldGood";//���ַ������еĵ�ַ����value2
//		
//		System.out.println(value);
//		System.out.println(value1);
		
//		String value = "�й������ž�";
//		//value += "��ţ�����ˣ�";
//		value = value.concat("��ţ�����ˣ�");
//		
//		
//		System.out.println(value);
		
	}
}
