package com.xuetang9.javabase.chapter14.generic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class MyStackTest {

	public static void main(String[] args) {
		
		//JDKϵͳʵ�ֵ�ջ�ࣺ
		Stack<Integer> stack1 = new Stack<>();
		for(int i = 1; i <= 5; i++){
			stack1.push(i);
		}
		
		//ʹ�õ���������ջ��
		System.out.println("ʹ�õ��������б�����");
		Iterator<Integer> stackIt = stack1.iterator();
		while(stackIt.hasNext()){
			System.out.println(stackIt.next());
		}
		
		System.out.println("��ջ��");
		for (int i = 0; i < 5; i++) {
			System.out.println(stack1.pop());
		}
		
		System.out.println("ʹ�õ��������б�����");
		stackIt = stack1.iterator();
		while(stackIt.hasNext()){
			System.out.println(stackIt.next());
		}
		
//		//ʵ�����Զ����ջ���� 
//		MyStack<String> stack = new MyStack<String>();
//		stack.push("1");
//		stack.push("2");
//		stack.push("3");
//		stack.push("4");
//		stack.push("5");
//		System.out.println("��ջ��" + stack.pop());
//		System.out.println("��ջ��" + stack.pop());
//		System.out.println("��ջ��" + stack.pop());
//		System.out.println("��ջ��" + stack.pop());
//		System.out.println("��ջ��" + stack.pop());
//		System.out.println("��ջ��" + stack.pop());
//		
//		
//		System.out.println("size:" + stack.getSize());
//		System.out.println("������" + stack.capacity());
		
		
		//stack.add(123);		//�Զ�װ�� - Integer
		
		
//		//����
//		for(int i = 0; i < stack.elementCount; i++){
//			//��û��ʹ�÷��͵�����£�������Ҫ��ӡ�����ַ���Ԫ�ص�ǰ2���ַ�
//			//��Ĭ������£�û�г��ֱ������ --  ���ǣ�����������ʱ�쳣
//			//̸����ʱû���κ����⣬������󣬲����ϴ���������
//			//��Ϊһ������Ա������ϣ���쳣/��������ڱ����ڣ�����������ʱ
//			String str = (String)stack.get(i);
//			System.out.println(str.substring(0, 2));
//		}
		

	}

}
