package com.xuetang9.javabase.chapter9.userdemo;
/**
 * ʵ���û�ע�Ṧ��
	1���û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
	2������6-18λ��ֻ�ܰ�����ĸ�����֡�������ţ��»��ߡ�@��#��$��!��
	�����֡�����ĸʱ������ǿ�ȶ����� ��������
	����+���롢����+���š�����+��ĸ��ǿ��Ϊ�У�������
	ͬʱ���������ַ���ǿ��Ϊǿ��������
	3���û�������ȷ��email
	�������@���ţ���ֻ�ܰ���һ��
	@��.  ���Ų����ڿ�ͷ��Ҳ�����ڽ�β
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��11�� ����11:27:39
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class User {
	private String userName;
	private String password;
	private String email;

	public User() {
		super();
	}
	
	public User(String userName, String password, String email){
		setUserName(userName);
		setPassword(password);
		setEmail(email);
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}













