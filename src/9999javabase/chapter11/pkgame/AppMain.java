package com.xuetang9.javabase.chapter11.pkgame;
/**
 * ����ģ����Ϸ����ҵ���߼���Ĵ���
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��5�� ����2:54:54
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class AppMain {

	public static void main(String[] args) {
		Hero hero1 = new Warrior(1, "�ܲ�", 0, 0);
		Castle castle = new Castle("��ɯ�ű�", 120, 120, 750);
		
		hero1.PK(castle);
		castle.attack(hero1);

	}

}
