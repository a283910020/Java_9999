package com.xuetang9.javabase.chapter8;

/**
 * ��Ϸ�е�Ӣ����
 * 
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��4�� ����10:32:55
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Hero {
	/**
	 * ��ҵ����ƴ������ܸ���
		������1-999֮��
		���ÿ���������辭�鹫ʽ��
		((�ȼ�-1)^3 + 60) / 5 * ((�ȼ�-1) * 2 + 60)
	 */
	private long id;
	private String nickName;
	private int level;
	private long currExp;	//��ǰ�ľ���ֵ
	private long exp;		//��ǰ������������ľ���ֵ - �̶�ֵ���ÿ���������辭�鹫ʽ��((�ȼ�-1)^3 + 60) / 5 * ((�ȼ�-1) * 2 + 60)
	
	//��ʦ˵������һ���������������������pravite�ı������߷���
	//1.����һ�����У����޷����ʱ����е�˽�����Ի򷽷���
	//2.���ڲ������ֱ�ӷ���
	//3.����ͨ�����巽������ʽ�����ⲿ����ã��Ի�÷����ķ���ֵ
	public Hero() {
		super();
	}
	
	class Weapon{
		public void fight(){
			System.out.println(id);
		}
	}
	
	
	public Hero(String nickName){
		this.nickName = nickName;
	}

	public Hero(long id, String nickName, int level, long exp) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.level = level;
		this.exp = exp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if(id <= 0) id = 1;
		else
			this.id = id;
	}

	public String getNickName() {
		return nickName;
	}


	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level <1 || level > 999){
			this.level = 1;//������e���ޣ�������1���_ʼ
			//�������999����������Ӣ�۽�ɫת������+1 -- �й���ɫ
		}else{
			this.level = level;
		}
		
	}

	public long getCurrExp() {
		return currExp;
	}

	public void setCurrExp(long currExp) {
		this.currExp = currExp;
	}

	public long getExp() {
//		���ÿ���������辭�鹫ʽ��
//		((�ȼ�-1)^3 + 60) / 5 * ((�ȼ�-1) * 2 + 60)
		exp = ((long)Math.pow(level - 1, 3) + 60) / 5 * ((level - 1) * 2 + 60);
		return exp;
	}

	//��Ϊ���ÿ��������������ľ���ֵ�ǹ̶���ʽ����ģ����Բ���Ҫ�û��ֶ�����
//	public void setExp(long exp) {
//		this.exp = exp;
//	}

}
