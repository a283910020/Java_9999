package com.xuetang9.javabase.chapter11.pkgame;
/**
 * �ɹ����ӿ� - ֻҪʵ���˱��ӿڣ����൱�ھ߱��˿�ʵʩ��������Ļ�������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��5�� ����2:33:09
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public interface Assailable {
	String getName();
	int getX();
	void setX(int x);
	int getY();
	void setY(int y);
	int getHp();
	void setHp(int hp);
	
	/**
	 * ���ݾ����жϣ��Ƿ��ܹ��ɹ�������һ���߱����������Ķ���
	 * @param assa
	 * @return
	 */
	boolean canFightByDistance(Assailable assa);
	/**
	 * ������һ���߱����������Ķ���Ҳ�������ɾ��µ�λ��
	 * @param assa
	 */
	void fight(Assailable assa);
	
	
	
	
	
}
