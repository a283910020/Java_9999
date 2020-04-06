package com.xuetang9.javabase.chapter14;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		TreeSet();
	}
	
	public static void TreeSet(){
		TreeSet<String> citySet = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.compareTo(o2) > 0) return -1;
				if(o1.compareTo(o2) < 0) return 1;
				return 0;
			}
		});
		citySet.add("London");
		citySet.add("Paris");
		citySet.add("New York");
		citySet.add("Bei Jing");
		citySet.add("Shang Hai");
		citySet.forEach(str -> System.out.print(str + ", "));
		System.out.println();
		System.out.println(citySet.higher("N"));
		System.out.println("New York֮ǰ��Ԫ�ؼ��ϣ�" + citySet.headSet("New York"));
		System.out.println("New York֮���Ԫ�ؼ��ϣ�" + citySet.tailSet("New York"));
		System.out.println("��Ԫ�أ�" + citySet.first());
		
		//citySet.pollFirst() ���ص�һ��Ԫ�أ���ɾ����һ��Ԫ��
		System.out.println("ɾ����һ��Ԫ�أ�" + citySet.pollFirst());
		citySet.forEach(str -> System.out.print(str + ", "));
		
	}
	
	public static void HashSetDemo(){
		//Set�����������ص�  1�����������ظ���Ԫ��    2������
		Set<String> citySet = new HashSet<>();
		citySet.add("London");
		citySet.add("Paris");
		citySet.add("New York");
		citySet.add("Bei Jing");
		citySet.add("Shang Hai");
		citySet.add("Shang Hai");
		citySet.forEach(str -> System.out.print(str + ", "));
	}
	
	public static void LinkedHashSetDemo(){
		//LinkedHashSet:����˳����ʵ�ʵ�˳��һ��
		Set<String> citySet = new LinkedHashSet<>();
		citySet.add("London");
		citySet.add("Paris");
		citySet.add("New York");
		citySet.add("Bei Jing");
		citySet.add("Shang Hai");
		citySet.forEach(str -> System.out.print(str + ", "));
	}

}
