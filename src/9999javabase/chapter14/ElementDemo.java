package com.xuetang9.javabase.chapter14;
/**
 * ��ⷺ�͵Ļ�������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��29�� ����3:49:27
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class ElementDemo<E> {
	Object[] objs = new Object[999];
	
	public static void main(String[] args) {
		//����ʱ��������
		ElementDemo<Integer> demo = new ElementDemo<Integer>();
		demo.add(12);//ʹ�÷��ͺ����ʹ���ʱ�ͻ���������ڵ��쳣
		
		ElementDemo<String> demo1 = new ElementDemo<>();
		
		//
//		objs[0] = 1024;
//		objs[1] = "abc";
//		objs[2] = 19.9;
//		objs[3] = new Student();
//		
//		//�Ӷ���������ȡ��������в���
//		Integer value1 = (Integer)objs[0];
//		//java.lang.ClassCastException - ����ʱ�쳣���޷��ڱ����ڶž� - �п�����ɳ���ı���
//		Integer value2 = (Integer)objs[1]; 
//		
//		System.out.println(value1);
//		System.out.println(value2);
		
	}
	/**
	 * �������������Ӹ������͵�Ԫ�� - ����
	 * @param e
	 */
	public void add(E e){
		//��obj���������eԪ�ؼ���
		//����ʡ��
	}

}
class Student{
	
}
