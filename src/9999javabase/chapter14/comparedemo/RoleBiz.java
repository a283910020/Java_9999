package com.xuetang9.javabase.chapter14.comparedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/**
 * ��ɫ��ҵ����
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��29�� ����5:05:10
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class RoleBiz {
	//Role[] roleArray = new Role[999];
	ArrayList<Role> roleList = null;
	
	public RoleBiz(){
		roleList = new ArrayList<Role>();
	}
	
	public void add(Role role){
		if(role != null){
			roleList.add(role);
		}
	}
	
	public void delete(Role role){
		roleList.remove(role);
	}
	
	/**
	 * ������Ľ�ɫ�����ڼ����н����޸�
	 * @param role
	 */
	public void update(Role role){
		//1.�ڼ������ҵ��������
		//2.�޸Ķ���
		int index = roleList.indexOf(role);
		if(index != -1){
			roleList.set(index, role);    
		}
	}
	
	public void sort(){
		//1���Լ�ʵ�������㷨��ð�ݡ����롢����
		//2��ʹ�����õĹ������������ - ǰ�᣺����ʵ�ֱȽ����ӿ�
		//2-1:ʵ����ʵ��Compareble�ӿ�
//		Collections.sort(roleList);
//		Collections.reverse(roleList);//����
		//2-2:�Զ���һ���Ƚ����ӿ�
		//Collections.sort(roleList, new RoleComparator_Attack());
		//���ڱȽ���RoleComparator_Attack������
		Collections.sort(roleList, Collections.reverseOrder(new RoleComparator_Attack()));
		
		//����
		//Collections.shuffle(roleList);
	}
	
	public void show(){
		System.out.println("��ɫ\t\t�ƺ�\t\t\t��Ѫ\t������");
		System.out.println("--------------------------------");
		Iterator<Role> roleIt = roleList.iterator();
		while(roleIt.hasNext()){
			Role role = roleIt.next();
			System.out.println(role.getName() + "\t" + role.getTitle() + "\t\t" + role.getHp() + "\t" + role.getAttack());
		}
	}
	
	
}
/**
 * ��ɫ���й������ıȽ���
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��29�� ����5:36:14
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
class RoleComparator_Attack implements Comparator<Role>{

	@Override
	public int compare(Role role1, Role role2) {
		if(role1.getAttack() > role2.getAttack()) return 1;
		if(role1.getAttack() < role2.getAttack()) return -1;
		return 0;
	}
	
}













