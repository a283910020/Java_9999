package com.xuetang9.javabase.chapter7;

public class ParamDemo {

	public static void main(String[] args) {
		
		paramTest("��������");
		
		//System.out.printf(format, args)

	}
	
	public static void paramTest(String str, int... nums){
		System.out.println("��һ��������" + str);
		
		System.out.println("��������ĳ��ȣ�" + nums.length);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
