package com.xuetang9.javabase.chapter11.modeldemo;
/**
 * ��ʦ�� - �̳���Զ�̹���Ӣ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��10�� ����5:28:22
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Magical extends LongRangeHero{
	public Magical() {
		super();
	}
	
	public Magical(long id, String name, int attackRange, int x, int y){
		super(id, name, attackRange, x, y);
	}
	
	@Override
	public boolean canFightByDistance(Hero hero) {
		double distance = getDistance(this.getX(), this.getY(), hero.getX(), hero.getY());
		if(Math.abs(distance) <= getAttackRange()){//����ڹ�����Χ��
			return true;
		}
		System.out.println("Ŀ������Զ���޷�������");
		return false;
	}

	@Override
	public void fight(Hero hero) {
		// ��ʦ�Ĺ��������Զ��ÿ�εĹ������õ�Щ��5-10
		setAttack((int)Math.round(Math.random() * 5) + 5);
		hero.setHp(hero.getHp() - getAttack());
		System.out.println(getName() + "�ɹ�ʵʩ��һ��Զ�̹�����");
	}

}
