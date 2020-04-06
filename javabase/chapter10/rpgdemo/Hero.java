package com.xuetang9.javabase.chapter10.rpgdemo;
/**
 * Ӣ���� - ����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��15�� ����3:22:49
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Hero {
	private String nickName;
	private int level;
	private int maxLife;
	private int currLife;

	/**
	 * ���췽����
	 * 1��������������һ��
	 * 2��û�з���ֵ
	 */
	public Hero() {
		//System.out.println("����Ĭ�Ϲ��죡");
	}
	
	public Hero(String nickName, int level, int maxLife, int currLife) {
		super();
		this.nickName = nickName;
		this.level = level;
		this.maxLife = maxLife;
		this.currLife = currLife;
	}
	
	public int compareToByName(Hero hero){
		return getNickName().compareTo(hero.getNickName());
	}
	
	/**
	 * �Ƚϵ�ǰӢ�۶���ʹ����Ӣ�۶���Ĵ�С���
	 * @param hero Ҫ�Ƚϵ�Ӣ�۶���
	 * @return
	 */
	public int compareTo(Hero hero){
		//ֻ�Ƚϼ���
		if(this.level > hero.getLevel()) 
			return 1;
		else if(this.level == hero.getLevel()) 
			return 0;
		else 
			return -1;
	}
	
	/**
	 * ���෽����Ӣ�۵��ƶ�
	 */
	public void move(){
		System.out.println("Hero���move����");
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurrLife() {
		return currLife;
	}
	public void setCurrLife(int currLife) {
		this.currLife = currLife;
	}
	
	
}
