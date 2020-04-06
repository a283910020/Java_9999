package com.xuetang9.javabase.chapter6;
/**
 * ģ��ʵ��ϴ�ƵĹ���
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��19�� ����11:49:04
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class ShuffleCardsDemo {
	public static void main(String[] args) {
		//�ƵĻ�ɫ����
		String[] cardColors = {"����", "����", "����", "÷��"};
		//��������
		String[] cardValues = {
			"A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"J", "Q", "K"
		};
		final int N = 52;
		//52����
		int[] cards = new int[N];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;//������ѭ��������ֵһ�£�0-51֮��
		}
		System.out.println("ϴ��ǰ��");
		for (int i = 0; i < cards.length; i++) {
			//System.out.print(cards[i]);
			System.out.printf("%s-%s", cardColors[cards[i] / 13], cardValues[cards[i] % 13]);
			if((i + 1) % 13 == 0){
				System.out.println();
			}else{
				System.out.print("\t");
			}
		}
		
		//ϴ�ƣ��������һ��0-51֮�������newIndex��cards[i]��cards[newIndex]Ԫ���ཻ��
		for (int i = 0; i < cards.length; i++) {
			int newIndex = (int)(Math.random() * N);//0-51֮����������
			int temp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = temp;		
		}

		System.out.println("ϴ�ƺ�");
		for (int i = 0; i < cards.length; i++) {
			//System.out.print(cards[i]);
			System.out.printf("%s-%s", cardColors[cards[i] / 13], cardValues[cards[i] % 13]);
			if((i + 1) % 13 == 0){
				System.out.println();
			}else{
				System.out.print("\t");
			}
		}
	}

}










