package com.xuetang9.javabase.chapter12;

public class DivisionDemo {
	/**
	 * ���������ַ������ֵĳ�������Ҫ����ת����
	 * @param strNum1
	 * @param strNum2
	 */
	public static void division(String strNum1, String strNum2) throws ArithmeticException, NumberFormatException{
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 / num2;
		System.out.println("result = " + result);
	}
	
	public static void main(String[] args) {
		try {
			//˭���ã�˭����
			division("123", "0");
		} catch (ArithmeticException | NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("��������������");

	}

}
