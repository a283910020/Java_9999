package com.xuetang9.javabase.chapter11.printdemo;

import com.xuetang9.javabase.chapter11.printdemo.impl.A4PaperImpl;
import com.xuetang9.javabase.chapter11.printdemo.impl.ColorInkBoxImpl;

public class PrinterTest {
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		//Ϊ��ӡ����װֽ�ź�ī��
		printer.setInkbox(new ColorInkBoxImpl());
		printer.setPaper(new B5PaperImpl());
		
		printer.print("��������");
	}
}
