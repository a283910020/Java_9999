package com.xuetang9.javabase.project.boodemo_v1;

import javax.swing.JOptionPane;

/**
 * ʹ�öԻ���������ͼ��ϵͳ����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��25�� ����11:22:19
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class BookViewDialogImpl extends AbstractBookView {
	private BookBiz bookBiz = null;
	public BookViewDialogImpl(){
		bookBiz = new BookBiz();
	}
	@Override
	public String showMainView() {
		String strMenu = "\nX9ͼ�����ϵͳ >> ���˵�\n";
		strMenu += "1������ͼ��\t2��ɾ��ͼ��\t3���鿴����ͼ��\t4������Ų�ѯ\t5�����\t6������\t7���˳�\n";
		strMenu += "��ѡ��";
		String result = JOptionPane.showInputDialog(strMenu);//��ʾ����Ի���
		if(result == null) result = "7";//�û������ȡ����ť
		return result;
	}
	@Override
	public void showOutStore() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showInStore() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showFindById() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showDelBookView() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Book showAddNewBookView() {
		Book newBook = new Book();
		String bookId = null;
		String bookName = null;
		int count = -1;
		//ע�⣺�����������������ʱ��Ҫ��֤�û��������ݵĺϷ���
		bookId = JOptionPane.showInputDialog("������ͼ���ţ�");
		bookName = JOptionPane.showInputDialog("ͼ�����ƣ�");
		count = Integer.parseInt(JOptionPane.showInputDialog("�������"));
		
		newBook.setBookId(bookId);
		newBook.setBookName(bookName);
		newBook.setCount(count);
		if(bookBiz.addBook(newBook)){
			JOptionPane.showMessageDialog(null, "��ӳɹ���");
		}else{
			JOptionPane.showMessageDialog(null, "���ʧ�ܣ�");
		}
		
		return newBook;
	}
	@Override
	public void showBooks(Book... bookArray) {
		// TODO Auto-generated method stub
		
	}
	
	
}
