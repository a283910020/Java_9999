package com.xuetang9.javabase.project.boodemo_v1;

import java.util.Scanner;
/**
 * ͼ��ϵͳ����ͼ - ơ����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��22�� ����12:05:00
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class BookView {
	private Scanner input = null;
	private BookBiz bookBiz = null;
	
	public BookView(){
		input = new Scanner(System.in);
		bookBiz = new BookBiz();
		
		System.out.println("*********************************");
		System.out.println("\t��ӭʹ��X9ͼ�����ϵͳ");
		System.out.println("\t1����¼\t\t2���˳�ϵͳ");
		System.out.println("*********************************");
		System.out.print("��ѡ��");
		String choice = input.next();
		if("1".equals(choice)){
			//ִ�е�¼����
			//�����֤�ɹ�������ʾ���˵�
			System.out.println("��¼������δʵ�֣�Ĭ���ѵ�¼\n");
			//while(showMainView()){}
			showMainView();
		}
		System.out.println("X9ͼ��ϵͳ�ѳɹ��˳�����ӭ�ٴ�ʹ�ã�");
		
	}
	
	/**
	 * ��ʾ���˵�
	 * @return ����true����ʾ����ִ�����˵�������false����ʾ�û�ѡ�����˳����ص���һ���˵�
	 */
	public void showMainView(){
		System.out.println("\nX9ͼ�����ϵͳ >> ���˵�");
		System.out.println("1������ͼ��\t2��ɾ��ͼ��\t3���鿴����ͼ��\t4������Ų�ѯ\t5�����\t6������\t7���˳�");
		System.out.print("��ѡ��");
		String choice = input.next();
		switch (choice) {
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
		//return true;
		showMainView();//�ٴ���ʾ������
	}
	
	public void showOutStore(){
		System.out.println("\nX9ͼ�����ϵͳ >> ͼ�����");
		System.out.print("�����ͼ���ţ�");
		String bookId = input.next();
		System.out.print("�����������");
		int bookCount = input.nextInt();
		if(bookBiz.outStore(bookId, bookCount)){
			System.out.println("����ɹ���");
			showBooks(null);
		}else{
			System.out.println("����ʧ�ܣ����������ͼ���Ż���������Ƿ��ޣ�");
		}
	}
	
	public void showInStore(){
		//�����Ҫ����������ͼ��id����������
		System.out.println("\nX9ͼ�����ϵͳ >> ͼ�����");
		System.out.print("����ͼ���ţ�");
		String bookId = input.next();
		System.out.print("����������");
		int bookCount = input.nextInt();
		if(bookBiz.inStore(bookId, bookCount)){
			System.out.println("���ɹ���");
			showBooks(null);
		}else{
			System.out.println("���ʧ�ܣ����������ͼ���ţ�");
		}
	}
	
	public void showFindById(){
		System.out.println("\nX9ͼ�����ϵͳ >> ����Ų�ѯ");
		System.out.println("������Ҫ��ѯ��ͼ���ţ�");
		String bookId = input.next();	
		Book book = bookBiz.findById(bookId);
		if(book == null){
			System.out.println("û���ҵ��κε�ͼ����Ϣ��");
			return;
		}
		showBooks(book);
	}
	
	/**
	 * ɾ��ͼ�����
	 */
	public void showDelBookView(){
		System.out.println("\nX9ͼ�����ϵͳ >> ɾ��ͼ��");
		//��ʱֻʵ�ָ���idɾ��
		System.out.print("������Ҫɾ����ͼ���ţ�");
		String delId = input.next();
		Book delBook = new Book();
		delBook.setBookId(delId);
		if(bookBiz.delBook(delBook)){//���ɾ���ɹ�
			System.out.println("ɾ���ɹ���");
			showBooks(null);	//��ӡĬ�ϵ�ͼ��ֿ⣬�൱��ˢ����ʾ��ǰͼ��ֿ��е�����
		}else{//ɾ��ʧ��
			System.out.println("ɾ��ʧ�ܣ�");
		}
	}
	
	/**
	 * ����ͼ��Ľ���
	 */
	public Book showAddNewBookView(){
		System.out.println("\nX9ͼ�����ϵͳ >> ����ͼ��");
		System.out.print("�ڲ���ţ�");
		String bookId = input.next();
		//������Ҫ��֤�û�����ı���Ƿ����
		Book newBook = bookBiz.findById(bookId);
		if(newBook == null){//�������ͼ��
			newBook = new Book();
			newBook.setBookId(bookId);
			System.out.print("���ƣ�");
			newBook.setBookName(input.next());
			System.out.print("��棺");
			newBook.setCount(input.nextInt());
			//...........
			bookBiz.addBook(newBook);//����ͼ��ҵ����󣬽�������ͼ�������ӵ�ͼ��ֿ���
		}else{//ͼ���Ѵ���
			System.out.println("���ڲ�����Ѵ��ڣ�������¼�룡");
			newBook = showAddNewBookView();	//���µ��ñ����������û��ٴ����� - �ݹ����
		}
		return newBook;
	}
	
	/**
	 * ��ʾ���е�ͼ����Ϣ
	 * ����������null��Ĭ����ʾͼ��ֿ��е����飺Datas.BookStroe
	 * @param bookArray
	 */
	public void showBooks(Book ... bookArray){
		System.out.println("�ڲ����\t����\t\t\t���");
		if(bookArray == null){
			bookArray = Datas.BookStore;
		}
		int bookCount = bookBiz.getBookCount(bookArray);
		for(int i = 0; i < bookCount; i++){
			System.out.printf("%s\t\t%s\t%d\n", 
					bookArray[i].getBookId(), bookArray[i].getBookName(), bookArray[i].getCount());
		}
	}
	
}











