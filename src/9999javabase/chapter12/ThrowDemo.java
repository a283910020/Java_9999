package com.xuetang9.javabase.chapter12;
/**
 * ��ʾ�ֶ����׳��쳣
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��8�� ����11:50:27
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class ThrowDemo {

	public static void main(String[] args) {
		Hero hero = new Hero("����");
		try {
			hero.setExp(1000);
			hero.setHealth(40);
			hero.rideHorse();
		} catch (Exception e) {
			e.printStackTrace();
//			System.err.print("�����þ���ֵʱ�����쳣��" + e.getMessage());
		}
		System.out.println("��ǰӢ�۵ľ���ֵ��" + hero.getExp());

	}

}
class Hero{
	private String name;
	private long exp;
	private int health;
	
	public Hero(String name){
		setName(name);
	}
	/**
	 * Ӣ�۵������� - ��Ӣ�۵Ľ���ֵ����50ʱ������������
	 * @throws LessThanZeroException 
	 */
	public void rideHorse() throws RideHorseException{
		if(health >= 50)
			System.out.println(name + "���ڿ��ֵ�����");
		else
			throw new RideHorseException(health);
	}
	
	
	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getExp() {
		return exp;
	}
	public void setExp(long exp) throws Exception {
		if(exp >= 0)
			this.exp = exp;
		else//��expΪ����ʱ��ǿ���׳��쳣
			throw new LessThanZeroException((int)exp);
			
	}
	
	
}
