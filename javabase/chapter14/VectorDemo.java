package com.xuetang9.javabase.chapter14;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//Vector��Java1.0��ʹ����ˣ�ArrayList��Java1.2�ſ�ʼ����
		//Vector��ʹ�ó�����JavaMe��һЩ΢С�汾�ж�����ʹ�ã�����ArrayList������
		//��Java1.2֮ǰ��Vector�ͱ��㷺��Ӧ������Java����У���Ϊ������ʵ�ֿɱ��С������
		//�ر��Ǵ����Swing������ģ�Ͷ�ʹ����Vector
		//���ArrayList��Vector�еķ��������߳�ͬ��������Ч�ʱ�ArrayList��
		
		Vector<String> vec = new Vector<>();
		vec.add("�����˲�");			//�᷵��booleanֵ
		vec.addElement("�����Ų�");	//�޷���ֵ
		vec.add("aaa");
		vec.add("aaa");
		vec.add("aaa");
		vec.add("aaa");
		vec.add("aaa");
		vec.add("aaa");
		vec.add("aaa");
		vec.add("aaa");
		vec.add("aaa");
		System.out.println("size:" + vec.size());
		System.out.println("������" + vec.capacity());
		vec.trimToSize();
		System.out.println("trim���������" + vec.capacity());
		vec.ensureCapacity(3000);
		System.out.println("ensureCapacity���������" + vec.capacity());
		
		//Vector�ı���
		for(int i = 0; i < vec.size(); i++){
			System.out.print(vec.get(i) + ", ");
		}
		System.out.println();
		//vec.iterator()  ��������ʹ����List��ͬ
		
		//ʹ��ö�ٱ��� - ���ڰ汾�ķ�ʽ - �ѱ�Iteratorȡ��
		Enumeration<String> vecEnum = vec.elements();
		while(vecEnum.hasMoreElements()){
			System.out.print(vecEnum.nextElement() + ", ");
		}
		System.out.println();
		
		//Lambda���ʽ����
		System.out.println("ʹ��Lambda���ʽ����");
		vec.forEach(str -> System.out.print(str + ", "));
		
		//��ѯԪ��
		System.out.println("��һ��Ԫ�أ�" + vec.firstElement());
		System.out.println("���һ��Ԫ�أ�" + vec.lastElement());
		System.out.println("�±�Ϊ1��Ԫ�أ�" + vec.elementAt(1) + "\t" + vec.get(1));
		
		vec.removeElementAt(19);// java.lang.ArrayIndexOutOfBoundsException: 19 >= 11
		System.out.println("ɾ����");
		vec.forEach(str -> System.out.print(str + ", "));
		
	}
}







