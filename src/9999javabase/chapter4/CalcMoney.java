package com.xuetang9.javabase.chapter4;
/**
 * ĳ��˫ʮһ2015��Ľ��׶�Ϊ800�ڣ�ÿ�����25%
	�ʣ������ٶ����꽻�׶�ﵽ2000�ڣ�
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��12�� ����11:02:51
 * @copyright �Ͼ�ѧ��
 * @remarks bug������
 *
 */
public class CalcMoney {
	public static void main(String[] args) {
		//1�����öϵ� break point
		//2����������/��������
		//3���۲�����ı仯
		double item = 1;
		double sum = 0;
		while(item != 0){//��ѭ��
	        sum += item;
	        item -= 0.1;
		    System.out.println(item);
		}
		System.out.println(sum);

		
		
		
		
		
		
		
		
		
//		//ȷ��ѭ������
//		int year = 2015;		//���
//		double money = 800;		//���׶�
//		while(money <= 2000){
//			year++;
//			money = money * (1 + 0.25);
//			//money *= 1.25;
//		}
//		String str = String.format("%d�꣬���׶�ﵽ2000��(%.2f��Ԫ)", year, money);
//		System.out.println(str);

	}

}
