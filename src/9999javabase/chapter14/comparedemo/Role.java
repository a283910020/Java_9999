package com.xuetang9.javabase.chapter14.comparedemo;

public class Role{ // implements Comparable<Role>{
	private String name;
	private String title;
	private int hp;
	private int attack;

	public Role(String name, String title, int hp, int attack) {
		this.name = name;
		this.title = title;
		this.hp = hp;
		this.attack = attack;
		
	}
	
//	@Override
//	public int compareTo(Role role) {
//		//Ϊ���ܹ�ʹ��Collections�������е�sort��������Ĭ�ϵ�����ʵ����Ҫʵ��Comparable�ӿ�
//		//Ϊ�˷���۲죬�����ڱȽ϶����ʱ��ʹ����Ѫ���Խ��жԱ�
//		if(hp > role.getHp()) return 1;
//		if(hp < role.getHp()) return -1;
//		return 0;
//	}
	
	//��дequals�������Ա��ڼ����п����Զ�ͨ������Ƚϵķ�ʽ����ɾ��Ԫ��
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Role)){
			return false;//����������Ͳ�ƥ�䣬ֱ�ӷ���false
		}
		Role role = (Role)obj;//ǿ��ת����������
		//������Ϊ�����������name������ͬʱ���ͱ�ʾ����������ͬ - ʵ�ʿ����е��߼������Զ���
		return name.equals(role.getName());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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

	
	
	
}
