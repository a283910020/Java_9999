package com.xuetang9.javabase.chapter10.chunwan;

public class Dancer extends Actor{
	public Dancer() {
		super();
	}

	public Dancer(String name) {
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println("�赸��Ա" + getName() + "վ��չ��������ȶ��˵��赸");
	}
	
}
