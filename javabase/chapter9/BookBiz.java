package com.xuetang9.javabase.chapter9;
/**
 * ͼ���ҵ���࣬��װ�˶�ͼ���������ɾ�Ĳ鷽��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��8�� ����2:26:02
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class BookBiz {
	
	public void test(int num){
		num++;
	}
	
	
	/**
	 * �����鼮
	 * @param book Ҫ���۵�ͼ�����
	 * @return ������۳ɹ����������۵�����������ʧ�ܣ�����-1
	 */
	public int sellBook(Book book){
		//1.�ж�ͼ��Ŀ���Ƿ����1
		//2.ͼ��Ŀ��-1
		//3.�������۵�����
		if(!(book.getCount() > 1)){
			return -1;
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}
}








