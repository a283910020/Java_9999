package com.xuetang9.javabase.project.boodemo_v1;
/**
 * ͼ���ҵ���� - ҵ����
 * ������ͼ���Լ�ͼ������Ļ�������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��22�� ����11:20:05
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class BookBiz {
	
	//���¿�ʼ��д������ҵ�񷽷� - ���˽�ս
	//����ͼ�顢���⡢��⡢��ѯ������
	
	/**
	 * ���ͼ��ֿ���Datas.BookStore������ͼ�����ĸ���
	 * @return
	 */
	public int getBookCount(){
		int count = 0;
		for(Book book : Datas.BookStore){
			if(book == null) break;
			count++;
		}
		return count;
	}
	
	public int getBookCount(Book ...books){
		int count = 0;
		for(Book book : books){
			if(book == null) break;
			count++;
		}
		return count;
	}
	
	/**
	 * �������ͼ�������õ�ͼ��ֿ⣨���飩��ȥ
	 * @param book
	 * @return �Ƿ���óɹ� - ����ͼ��ֿ�Ŀռ�����������false
	 */
	public boolean addBook(Book book){
		int bookCount = getBookCount();
		if(Datas.BookStore.length == bookCount){
			return false;
		}
		//����ֿⲻ�����ͽ������ͼ������������������һ��λ�ã���һ����nullλ�ã�
		Datas.BookStore[bookCount] = book;
		return true;
	}
	
	/**
	 * ɾ�������ͼ�����
	 * @param book
	 * @return �Ƿ�ɾ���ɹ�
	 */
	public boolean delBook(Book book){
		int bookCount = getBookCount();
		int delIndex = -1;	//Ҫɾ��Ԫ�ص��±�
		for(int i = 0; i < bookCount; i++){
			//if(book.getBookId().equals(Datas.BookStore[i].getBookId())){
			if(book.equals(Datas.BookStore[i])){
				delIndex = i;
				break;
			}
		}
		if(delIndex == -1){
			return false;//û���ҵ�Ҫɾ����Ԫ��ʱ��ֱ�ӽ�������������false
		}
		//ִ������ɾ������·
		for(int i = delIndex; i < bookCount - 1; i++){
			Datas.BookStore[i] = Datas.BookStore[i + 1];
		}
		//�����һ��Ԫ����Ϊnull
		Datas.BookStore[bookCount - 1] = null;
		return true;		
	}
	
	/**
	 * ͨ��ͼ��id���Ҷ�Ӧ��ͼ�����
	 * @param bookId
	 * @return û���ҵ�������null
	 */
	public Book findById(String bookId){
		int bookCount = getBookCount();
		for(int i = 0; i < bookCount; i++){
			if(bookId.equals(Datas.BookStore[i].getBookId())){
				return Datas.BookStore[i];
			}
		}
		return null;
	}
	
	/**
	 * ��⣺Ϊ�ֿ������е�ͼ�����ӿ��
	 * @param bookId Ҫ����ͼ��id
	 * @param count  ��������
	 * @return �������bookId�����ڣ����ʧ��
	 */
	public boolean inStore(String bookId, int count){
		Book book = findById(bookId);
		if(null == book){//�������bookId������
			return false;//������ҵ�����в�Ҫʹ�ô�ӡ���
		}
		//���ӿ�� - ע�⣬���������ô���
		book.setCount(book.getCount() + count);
		return true;
	}
	
	/**
	 * ���⣺���ֿ����п�����
	 * @param bookId
	 * @param count
	 * @return ���п��С��countʱ������ʧ��
	 */
	public boolean outStore(String bookId, int count){
		Book book = findById(bookId);
		if(null == book){
			return false;
		}
		if(book.getCount() < count){
			return false;
		}
		book.setCount(book.getCount() - count);
		return true;
	}
	
	
}








