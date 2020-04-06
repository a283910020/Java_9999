package com.xuetang9.javabase.chapter11.pkgame;

/**
 * ʵ���˿ɹ����ӿڵ�Ӣ���� - ��֮ǰ���ƣ�Ҳ�ǳ�����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��5�� ����2:38:31
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public abstract class Hero implements Assailable {
	private long id;
	private String name;
	private int level;
	private int maxHp;
	private int hp;
	private int attack;
	private int x;
	private int y;
	
	public Hero(){
		setMaxHp(100);
		setHp(100);
	}
	
	public Hero(long id, String name){
		this();
		setId(id);
		setName(name);
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
	 * Ӣ��֮���pk��
	 * 1���ж����ߵľ���
	 * 2������������㣬�ͽ��й���
	 * @param assa
	 */
	public void PK(Assailable assa){
		if(canFightByDistance(assa) && hp > 0 && assa.getHp() > 0){
			fight(assa);
		}else{
			System.out.println("���ڹ������������ԭ�򣬹���ʧ�ܣ�");
		}
		//3.�ڿ���̨��ӡ��ս��Ľ��������̨����ר�ã�
		System.out.println("��λӢ�۵ĵ�ǰ״̬");
		System.out.println("�ǳ�\tHP\tX����\tY����");
		System.out.println(name + "\t" + hp + "\t" + x + "\t" + y);
		System.out.printf("%s\t%d\t%d\t%d\n", 
				assa.getName(), assa.getHp(), assa.getX(), assa.getY()
		);
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
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
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
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
}
