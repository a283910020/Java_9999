package com.xuetang9.javabase.chapter11.modeldemo;
/**
 * Զ�̹���Ӣ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��5�� ����2:05:59
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public abstract class LongRangeHero extends Hero{
	private int attackRange;	//��������
	
	public LongRangeHero(){
		super();
	}
	
	public LongRangeHero(long id, String name, int attackRange, int x, int y){
		super(id, name);
		setAttackRange(attackRange);
		setX(x);
		setY(y);
	}

	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	
	
}
