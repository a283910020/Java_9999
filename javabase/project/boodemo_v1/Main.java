package com.xuetang9.javabase.project.boodemo_v1;

public class Main {

	public static void main(String[] args) {
		//new BookView();
		//AbstractBookView bookView = new BookViewConsoleImpl();
//		AbstractBookView bookView = new BookViewDialogImpl();	//ʹ�öԻ���ʵ�ֵ�ͼ�����ϵͳ����
//		bookView.doMainView();
		
		//System.out.println(Datas.BookStore.length);
		//FileUtil.SaveBooks(Datas.BookStore);
		
		Book[] bookArray = FileUtil.LoadBooks();
		for(int i = 0; i < bookArray.length; i++){
			if(bookArray[i] == null) break;
			System.out.println(bookArray[i].getBookId() + "--" + bookArray[i].getBookName());
		}
	}
	
//	public static void show(){
//		BookBiz bookBiz = new BookBiz();
//		if(bookBiz.getBookCount() == 0){
//			System.out.println("�ֿ�տ���Ҳ��");
//			return;
//		}
//		for(int i = 0; i < bookBiz.getBookCount(); i++){
//			System.out.println(Datas.BookStore[i].getBookId() + "\t" + Datas.BookStore[i].getBookName() + "\t" + Datas.BookStore[i].getCount());
//		}
//	}

}
