package com.xuetang9.javabase.chapter13.decorator;
/**
 * �������ɻ�ġ������
 * ʵ���˻�����read����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��15�� ����10:42:31
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class TrueComponent extends Component{

	@Override
	public void read() {
		System.out.println("TrueComponentʵ�ֵ�read����");
	}

}
