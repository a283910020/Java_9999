package com.xuetang9.javabase.chapter10.chunwan;
/**
 * �質��Ա
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��18�� ����11:22:57
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Singer extends Actor {
	public Singer() {
		super();
	}

	public Singer(String name) {
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println("�質��Ա" + getName() + "���ڱ��ݸ質��Ŀ�������һ�ʢ���ĵط���");
	}
	
}
