package com.xuetang9.javabase.chapter8;
/**
 * ��Ϸ�Ľ�ɫ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��30�� ����10:45:52
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Role {
//	���ƣ�����
//	�ȼ���25
//	ְҵ������ѧ��
//	���ܣ�˫ǹ
	/** ��Ϸ��ɫ���������� */
	public String name;
	/** �ȼ� */
	public int level;
	/** ְҵ */
	public String job;
	
	//Ĭ�Ϲ���
	public Role(){}
	
	/**
	 * ���췽��/������
	 * 1��û�з���ֵ
	 * 2��������������һ��
	 */
	public Role(String name1, int level1, String job1){
		name = name1;
		level = level1;
		job = job1;		
	}
	
	public void show(){
		System.out.println(name + "\t" + level + "\t" + job);
	}
	
	/**
	 * �ͷż���
	 */
	public void doSkill(){
		if(name.equals("����")){
			System.out.println("�����ľ��似�ܣ�˫ǹ��̫��");
		}else if(name.equals("�����")){
			System.out.println("�԰�����һ����");
		}else{
			System.out.println(name + ":������һ�Ǳ�ɱ��");
		}
		
	}
	
	
	
	
	
	
	
	
	
	

}
