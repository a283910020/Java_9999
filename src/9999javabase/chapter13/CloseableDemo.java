package com.xuetang9.javabase.chapter13;

import java.io.Closeable;
import java.io.IOException;

public class CloseableDemo {

	public static void main(String[] args) {
		try(SomeResrouce some = new SomeResrouce()){
			//throw new IOException("�ֶ��׳�");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
/***
 * �����Զ����ģ����Դ�ࣨ�п��������ӡ��ļ�����
 * ʵ��Closeable�ӿڣ��Ա���try()�Զ����йر���Դ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��18�� ����10:57:52
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
class SomeResrouce implements Closeable{

	@Override
	public void close() throws IOException {
		System.out.println("�򿪵�SomeResrouce��Դ�ѱ��رգ�");
		
	}
	
}