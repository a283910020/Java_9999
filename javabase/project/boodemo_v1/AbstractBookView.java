package com.xuetang9.javabase.project.boodemo_v1;

import java.util.Scanner;

public abstract class AbstractBookView {

	public AbstractBookView(){
		
	}
	
	/**
	 * �����������涨�̶��ĳ����߼�
	 */
	public void doMainView(){
		String result = showMainView();
		switch (result) {
		case "1"://���ͼ��
			showAddNewBookView();
			showBooks(Datas.BookStore);
			break;
		case "2"://ɾ��ͼ��
			showDelBookView();
			break;
		case "3"://�鿴����ͼ��
			showBooks(null);
			break;
		case "4"://����Ų�ѯ
			showFindById();
			break;
		case "5"://���
			showInStore();
			break;
		case "6":
			showOutStore();
			break;
		case "7":
			//System.exit(0);//�˳�ϵͳ
			return;
		default:
			break;
		}
		doMainView();
	}
	
	/**
	 * ��ʾ���˵�
	 * @return �����û�ѡ��Ĳ˵���(1-7֮��)
	 */
	public abstract String showMainView();
	
	public abstract void showOutStore();
	
	public abstract void showInStore();
	
	public abstract void showFindById();
	
	/**
	 * ɾ��ͼ�����
	 */
	public abstract void showDelBookView();
	
	/**
	 * ����ͼ��Ľ���
	 */
	public abstract Book showAddNewBookView();
	
	/**
	 * ��ʾ���е�ͼ����Ϣ
	 * ����������null��Ĭ����ʾͼ��ֿ��е����飺Datas.BookStroe
	 * @param bookArray
	 */
	public abstract void showBooks(Book ... bookArray);
}
