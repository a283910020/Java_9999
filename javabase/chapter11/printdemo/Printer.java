package com.xuetang9.javabase.chapter11.printdemo;
/**
 * ��ӡ���� - ʹ�ñ�׼��ī�к�ֽ�Ž��д�ӡ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��5�� ����3:29:50
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */

import com.xuetang9.javabase.chapter11.printdemo.iface.IInkBox;
import com.xuetang9.javabase.chapter11.printdemo.iface.IPaper;

public class Printer {
	private IInkBox inkbox = null;	//��ӡ���е�ī��
	private IPaper paper = null;	//��ӡ���е�ֽ��
	
	/**
	 * ��ӡ���Ĵ�ӡ���� - ʹ��ī�к�ֽ��
	 * @param content ���ݸ���ӡ����ӡ���ַ�������
	 */
	public void print(String content){
		if(null == inkbox || null == paper){
			System.out.println("ī�к�ֽ�ų��ִ����밲װ��ȷ�����ԣ�");
			return;
		}
		//��ӡ����
		String color = inkbox.getColor();
		String type = paper.getSize();
		System.out.println("����������" + color + "��ɫ�ģ�");
		System.out.println("ʹ��ֽ�ţ�" + type);
		System.out.println("��ӡ���ݣ�" + content);
	}
	
	public IInkBox getInkbox() {
		return inkbox;
	}
	public void setInkbox(IInkBox inkbox) {
		this.inkbox = inkbox;
	}
	public IPaper getPaper() {
		return paper;
	}
	public void setPaper(IPaper paper) {
		this.paper = paper;
	}
	
	
}
