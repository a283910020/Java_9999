package com.xuetang9.javabase.chapter14.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		Object[] objArray = {"abc", "33", "ddd", "444", "", ""};
		//�ڳ�ѧ�߽׶Σ�һ���Ƕ����������ɾ�Ĳ����crud
		System.out.println(objArray.length);
		objArray = Arrays.copyOf(objArray, objArray.length + 100);
		System.out.println(objArray.length);
		
		
		List<Object> list = new ArrayList<>();
		list.add("adfdsf");
		list.add("afds");
		list.add("afds");
		list.add("afds");
		list.add("afds");
		list.add("afds");list.add("afds");
		list.add("afds");
		list.remove(10);
	}

}
