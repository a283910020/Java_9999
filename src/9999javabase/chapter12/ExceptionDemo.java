package com.xuetang9.javabase.chapter12;

public class ExceptionDemo {
	/**
	 * �������������������
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int division(int num1, int num2){
		System.out.println("�������ǰ");
		int result = Integer.MAX_VALUE;
		try {
			result = num1 / num2;
		} catch (Exception e) {
			System.err.println("�쳣��Ϣ��" + e.getMessage());
			//��־��¼
		}
		System.out.println("���������");
		return result;
	}
	
	public static void main(String[] args) {
//		int result = division(5, 0);
//		System.out.println("result = " + result);
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
