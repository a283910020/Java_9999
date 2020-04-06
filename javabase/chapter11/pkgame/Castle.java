package com.xuetang9.javabase.chapter11.pkgame;
/**
 * �Ǳ��� - �Ǳ�����Ӣ�ۣ�
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��5�� ����2:45:07
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Castle implements Assailable{
	private String name;
	private int x;
	private int y;
	private int maxHp;
	private int hp;
	private int attackRange;
	
	public Castle(String name, int x, int y, int attackRange){
		setName(name);
		setX(x);
		setY(y);
		setAttackRange(attackRange);
		setMaxHp(100);
		setHp(100);
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttackRange() {
		return attackRange;
	}
	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	
	/**
	 * ����������֮��ľ���
	 * �ڸ��ӽӽ�ʵ�ʵ�Ӧ���У����ǿ��԰Ѽ������ķ��������ڹ������У�����ʹ��
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	protected double getDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	/**
	 * �Ǳ��Ĺ�������������ʹ���������ƣ���������Ӣ���ࣩ
	 * @param assa
	 */
	public void attack(Assailable assa){
		if(canFightByDistance(assa) && getHp() > 0 && assa.getHp() > 0){
			fight(assa);
		}else{
			System.out.println("����ʧ�ܣ�");
		}
		
	}
	
	@Override
	public boolean canFightByDistance(Assailable assa) {
		//1.��������һ���ɹ�������֮��ľ���
		//2.�����������Ϸ����ͽ��й���
		double distance = getDistance(getX(), getY(), assa.getX(), assa.getY());
		//����Ǳ��Ĺ�������Ĭ��Ϊ500
		//�Ǳ��Ĺ����ٶ���δʵ��
		return distance <= 500;
	}
	@Override
	public void fight(Assailable assa) {
		//����Ǳ��Ĺ������̶�
		int attack = 15;
		assa.setHp(assa.getHp() - attack);
		System.out.println(getName() + "������" + assa.getName() + "!");
	}
}
