package com.xuetang9.javabase.chapter13.decorator;
/**
 * װ�������࣬����Ϊ���������ʵ�ֹ��ܵ���չ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��15�� ����10:43:36
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Decorator extends Component{
	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void read() {
		//ע�⣺�۲�˭����ʵ����read����
		//������ת����component����ת���󣬾Ϳ���ִ��һЩ��չ������
		component.read();
	}
	
}
