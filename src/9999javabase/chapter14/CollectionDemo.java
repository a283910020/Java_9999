package com.xuetang9.javabase.chapter14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * TODO
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��29�� ����6:00:53
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class CollectionDemo {
	/**
	 * ����ʹ�ý��飺
	 * ArrayList/LinkedList/ArrayDeque/HashSet/LinkedHashSet/TreeSet
	 * 1�����Ҫ����List��ϣ�����ArrayList��Vector��˵��ʹ���������get)Ч�ʸ��ߣ�����LinkedList/LinkHashSet��˵��ʹ�õ�����Ч�ʸ���
	 * 2�������Ҫ����ִ�в��롢ɾ���������ı�����������ݵļ��ϴ�С������ʹ��LinkedList����ArrayList��Vector������Ҫ���·����ڲ�����Ĵ�С���Ӷ�Ӱ��Ч�ʣ�
	 * 3������ж���߳���Ҫͬʱ���ʼ����е�Ԫ�أ����Կ���ʹ��Collectons�����ϰ�װ���̰߳�ȫ�ļ���
	 * @param args
	 */
	public static void main(String[] args) {
		//��̬��ʹ��List�ӿڵ�һ������ArrayList����ʵ��
		List<String> list1 = new ArrayList<>();
		list1.add("�ܲ�");
		list1.add("�ܳ�");
		list1.add("��ֲ");
		list1.add("����");
		list1.add("����");	
		System.out.println(list1);
		list1.add(1, "��诵�");
		System.out.println(list1);
		list1.set(1, "���Ƴ�");
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("�����");
		list2.add("�ŷ���");
		
		list1.addAll(list2);
		System.out.println(list1);
		
		System.out.println("���ϵı���");
		//1��List�ı���
		for(int i = 0; i < list1.size(); i++){
			System.out.print(list1.get(i) + ",  ");
		}
		System.out.println();
		//2��ʹ��foreachѭ��
		for(String str : list1){
			System.out.print(str + ",  ");
		}
		System.out.println();
		//3��ʹ�õ���������
		Iterator<String> it = list1.iterator();
		//ʹ�õ������ķ�����ԱȽϹ̶�
		while(it.hasNext()){
			System.out.print(it.next() + ",  ");
		}
		System.out.println();
		//4��ʹ��ListIterator������
		ListIterator<String> listIt = list1.listIterator();
		while(listIt.hasNext()){
			System.out.print(listIt.next() + ",  ");
		}
		System.out.println();
		//ʹ��ListIterator�봫ͳ������������
		//1��ListIterator��ֹ���������ʣ�Ҳ������ǰ����
		//2��ListIterator�����޸ļ����е�Ԫ��
		System.out.println("ʹ��ListIterator�Ӻ���ǰ��������Ԫ�أ�����");
		ListIterator<String> listIt2 = list1.listIterator(list1.size());
		while(listIt2.hasPrevious()){//���������е�Ԫ�ش�����һ��ʱ
			System.out.print(listIt2.previous() + ",  ");
		}
		System.out.println("\n");
		ListIterator<String> listIt3 = list1.listIterator(3);
		if(listIt3.hasPrevious()){
			listIt3.previous();
			listIt3.set("������");//ʹ�õ������޸�Ԫ��
		}
		System.out.println(list1);
		
		
		System.out.println("ɾ���±�Ϊ4��Ԫ�أ�");
		//list1.remove(4);
		list1.remove("����");
		System.out.println(list1);
		
		System.out.println("subList(3, 5) : " + list1.subList(3, 5));
	}
	
	/**
	 * ʹ�õ������ĺô����ڱ�������ʱ��������ĳ�����ʵ��
	 * @param it
	 */
	public void show(Iterator<? extends Employee> it){
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
//	public void show(List<Student> stuList){
//		
//	}
//	
//	public void show(List<Teacher> teacherList){
//		
//	}
}
class Employee{
	
}




