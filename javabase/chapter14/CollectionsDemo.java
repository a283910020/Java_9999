package com.xuetang9.javabase.chapter14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> intCollection = new ArrayList<>();
		intCollection.add(123);
		intCollection.add(120);
		intCollection.add(124);
		intCollection.add(122);
		intCollection.add(127);
		intCollection.add(126);	
		
		intCollection.forEach(value -> System.out.print(value + ", "));
		Collections.shuffle(intCollection, new Random(20));
		System.out.println("\n�����");
		intCollection.forEach(value -> System.out.print(value + ", "));
		
		Collections.shuffle(intCollection, new Random(20));
		System.out.println("\n�����");
		intCollection.forEach(value -> System.out.print(value + ", "));
		
		System.out.println("���ϵĸ���");		
		List<Integer> longCollection = new ArrayList<>();
		longCollection.add(0);
		longCollection.add(0);
		longCollection.add(0);
		longCollection.add(0);
		longCollection.add(0);
		longCollection.add(0);
		Collections.copy(longCollection, intCollection);
		longCollection.forEach(value -> System.out.print(value + ", "));
		longCollection.add(126);
		//�Ա�����������û�й���Ԫ��
		System.out.println(Collections.disjoint(intCollection, longCollection));
		
		System.out.println("���ؼ�����ָ��Ԫ�س��ֵĴ���" + Collections.frequency(longCollection, 126));
		
		
		//���䣺ʹ��Arrays.asListת���ɵ�List�����У��޷�ִ��add����
		List<String> strList = Arrays.asList("abc", "123", "321");
		strList.add("111");
		
		
		

	}

}
