package com.xuetang9.javabase.chapter10.rpgdemo;
/**
 * սʿ�� - �̳��� Hero��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��15�� ����3:25:16
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Warrior extends Hero{
	/** սʿ��ľ�̬���ԣ�ÿʵ����һ���µ�չʾ����ID++ */
	public static int ID = 1;
	
	/** սʿ���������ԣ��������� */
	private int pysicalAttach;
	
	/**
	 * ����Ĺ���
	 */
	public Warrior(){
		super();	//���๹���У�Ĭ�Ͼͻ���ø��๹��
		//System.out.println("����Ĭ�Ϲ���");
		setNickName("Ĭ��սʿ" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setPysicalAttach(99);
		ID++;
	}
	
	public Warrior(String nickName, int pysicalAttach){
		this();
		setNickName(nickName);
		setPysicalAttach(pysicalAttach);
	}
	
	@Override //ע�⣺��д
	public void move() {
		System.out.println("սʿ���ƶ�����ͨ�������ߣ�");
	}
	
	
	
	/**
	 * ��дObject���equals�������Ա�Ƚ����������Ƿ����
	 */
	@Override
	public boolean equals(Object obj) {
		//��������obj����Warrior���ʵ��
		if(!(obj instanceof Warrior)){
			return false;
		}
		Warrior newWarrior = (Warrior)obj;
		//�Ƚ���������
		if(getNickName().equals(newWarrior.getNickName()) && getPysicalAttack() == newWarrior.getPysicalAttack()){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(getLevel());
		str.append("\t");
		str.append(getNickName());
		str.append("\t");
		str.append(getMaxLife());
		str.append("\t\t");
		str.append(getCurrLife());
		str.append("\t");
		str.append(getPysicalAttack());
		return str.toString();
	}

//	public void movee(){
//		System.out.println(getNickName() + ":�ƶ��������ȣ�");
//	}

	public int getPysicalAttack() {
		return pysicalAttach;
	}

	public void setPysicalAttach(int pysicalAttach) {
		this.pysicalAttach = pysicalAttach;
	}
	
	
}
