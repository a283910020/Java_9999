package com.xuetang9.javabase.chapter10.chunwan;

/**
 * ��Ա����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��18�� ����11:20:39
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public abstract class Actor {//��һ�����ǳ������ʱ�򣬾Ͳ���ʹ��new��ʵ�����ˣ�--�������������ĸ��࣡
	private String name;
	
	public Actor(){
		
	}
	
	public Actor(String name){
		setName(name);
	}
	
	/**
	 * ��Ա�ı��ݷ���
	 */
	public void performs(){
		System.out.println("��Ա" + name + "���ڱ��ݾ��ʵĽ�Ŀ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
