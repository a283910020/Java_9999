package com.xuetang9.javabase.chapter10.chunwan;

public class CrossActor extends Actor{
	public CrossActor() {
		super();
	}

	public CrossActor(String name) {
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println(getName() + "��������������������ֻ��˵�����������ˣ�");
	}
	
}
