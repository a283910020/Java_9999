package com.xuetang9.javabase.chapter14.comparedemo;

public class RoleTest {

	public static void main(String[] args) {
		RoleBiz biz = new RoleBiz();
		biz.add(new Role("÷����", "�������1", 50, 450));
		biz.add(new Role("÷����", "�������2", 150, 350));
		biz.add(new Role("÷����", "�������3", 250, 250));
		biz.add(new Role("÷����", "�������4", 350, 150));
		biz.add(new Role("÷����", "�������5", 450, 50));		
		biz.show();   
		System.out.println();
//		Role role4 = new Role("÷����", "�������4", 350, 150);
//		biz.delete(role4);
		
		//Role role4 = new Role("÷����", "4���������", 350, 150);
		//biz.update(role4);
		//biz.show();
		
		System.out.println("����");
		biz.sort();
		biz.show();
		
		
	}

}
