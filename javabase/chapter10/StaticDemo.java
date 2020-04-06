package com.xuetang9.javabase.chapter10;
/**
 * ʹ�þ�̬�ؼ���ʵ���˵���ģʽ��ֻ�ܻ��ĳ�����Ψһһ��ʵ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��18�� ����11:58:46
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class StaticDemo {
	private static StaticDemo me = null;
	
	/**
	 * �����췽��˽�У��Ա�ʵ���ⲿ�޷�ʹ��new����ʵ������Ч��
	 */
	private StaticDemo(){
		//�����췽������Ϊ˽�е�
		me = this;
	}
	
	/**
	 * Ҫ��õ�ǰ������ʵ����ֻ�ܵ��ñ�����
	 * @return
	 */
	public static StaticDemo getInstance(){
		if(me == null){
			me = new StaticDemo();//Ψһ��һ��ʵ����
		}
		return me;
	}
	
	//��̬����/�������������ʵ�����ڵ�
	public static int static_number = 1;
	
	
	
	public int normal_number = 1;
	
	/**
	 * ��̬������ֻ�ܵ��þ�̬���Ժ;�̬����
	 */
	public static void test(){
		static_number++;
		//normal_number++;
	}
	
//	public static void main(String[] args) {
//		StaticDemo staticDemo1 = new StaticDemo();
//		staticDemo1.test();
//		
//		System.out.println(StaticDemo.static_number);
//		System.out.println(staticDemo1.normal_number);
//		
//		StaticDemo staticDemo2 = new StaticDemo();
//		staticDemo2.test();
//		
//		System.out.println(StaticDemo.static_number);
//		System.out.println(staticDemo1.normal_number);
//		
//		staticDemo2.test();
//		
//		System.out.println(StaticDemo.static_number);
//		
//		
//	}
}
