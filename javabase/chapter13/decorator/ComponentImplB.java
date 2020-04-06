package com.xuetang9.javabase.chapter13.decorator;
/**
 * װ������ʵ����B
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��15�� ����10:47:11
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class ComponentImplB extends Decorator{
	
	public ComponentImplB(Component component) {
		super(component);
	}
	
	@Override
	public void read() {
		//ע�⣺��ԭʼ��read����ǰ�󣬷ֱ�������Զ���ķ���
		//��ʵ���˶�ԭread�����Ĺ�����չ��
		this.extendsReadA();
		super.read();	//ԭʼ��read����
		this.extendsReadB();
	}
	
	private void extendsReadA(){
		System.out.println("ComponentImplBʵ�ֵ���չ������extendsReadA");
	}
	
	private void extendsReadB(){
		System.out.println("ComponentImplBʵ�ֵ���չ������extendsReadB");
	}
}
