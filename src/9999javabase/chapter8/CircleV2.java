package com.xuetang9.javabase.chapter8;

import java.util.Scanner;

/**
 * ʹ���������ķ�ʽ����һ��Բ�࣬�ֱ�����ܳ������
	1�������ࣺCircle
	2����ȡ����
	3�����巽��
	4�����÷�������ӡ���
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��30�� ����11:33:38
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class CircleV2 {
	/** Բ�İ뾶 */
	public double radius;
	/** Բ���ܳ� */
	public double perimeter;
	/** Բ����� */
	public double area;
	
	public CircleV2(){
		inputRaius();
	}
	
	public CircleV2(double radius1){
		if(radius1 > 0){
			radius = radius1;
		}else{
			inputRaius();
		}
	}
	
	private void inputRaius(){
		Scanner input = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		radius = input.nextDouble();
		input.close();
	}
	
	public void showPerimeter(){
		if(radius <= 0){
			inputRaius();//����û�û������뾶����ôǿ�����û�����뾶
		}
		perimeter = 2 * Math.PI * radius;
		System.out.println("�ܳ�Ϊ��" + perimeter);
	}
	
	public void showArea(){
		if(radius <= 0){
			inputRaius();//����û�û������뾶����ôǿ�����û�����뾶
		}
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("���Ϊ��" + area);
	}
}


















