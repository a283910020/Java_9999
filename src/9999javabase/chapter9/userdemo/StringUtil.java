package com.xuetang9.javabase.chapter9.userdemo;

/**
 * �ַ����Ĺ����࣬��װ�˳����ַ������жϷ���
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��11�� ����11:32:27
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class StringUtil {
	/**
	 * �жϴ�����û����ַ����Ƿ��ǺϷ����û���
	 * �û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
	 * @param userName
	 * @return
	 */
	public static boolean isCorrectUserName(String userName){
		boolean isCorrect = true;
		String sql = "select * from users where id='%s' and password='' or '1'='1'";
		//sql��ע��©��
		//password = "' or '1'='1";
		if(userName == null) return false;
		if(userName.length() > 25) return false;
		//�Ƿ��ַ�����
		char[] unValidChar = {' ', '\'', '"', '?', '<', '>', ','};
		for(char ch : unValidChar){
			if(userName.contains(Character.toString(ch))){
				isCorrect = false;
				break;
			}
		}
		return isCorrect;
	}

	/**
	 * ����6-18λ��ֻ�ܰ�����ĸ�����֡�������ţ��»��ߡ�@��#��$��!��
	 * �����֡�����ĸʱ������ǿ�ȶ����� ��������
	 * ����+���롢����+���š�����+��ĸ��ǿ��Ϊ�У�������
	 * ͬʱ���������ַ���ǿ��Ϊǿ��������
	 * @param password
	 * @return �������ֵΪ"",��ô�������֤ʧ�ܣ���֤�ɹ����򷵻��Ǻű�ʾ�����ǿ��
	 */
	public static String validatePassword(String password){
		String power = "";//�����ǿ��,
		if(password == null) return power;
		if(password.length() < 6 || password.length() > 18) return power;
		//�����кϷ�����ɲ���
		//String[] correctPart = {"_", "@", "#", "$", "!"};
		String part = "_@#$!";
		for (int i = 0; i < password.length(); i++) {
			if(!Character.isLetterOrDigit(password.charAt(i))){
				//���������ĸ�����֣�����Ҳ���ǺϷ���������ţ���֤���ǷǷ��ĸ�ʽ
				if(!part.contains(Character.toString(password.charAt(i)))){
					return power;
				}
			}
		}
		//���濪ʼ�ж������ǿ��
		if(isDigit(password) || isLetter(password)){
			power = "�������";
		}else if(isDigitAndLetter(password)){
			power = "�������";
		}else if(isContainsSymble(password)){
			power = "�������";
		}
		
		return power;
	}

	
	/**
	 * �ַ����а����Ϸ�����ĸ������
	 * @param value
	 * @return
	 */
	private static boolean isDigitAndLetter(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isLetterOrDigit(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * �ж�һ���ַ����ǲ���һ��������
	 * @param value
	 * @return
	 */
	private static boolean isDigit(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	/**
	 * �ж�һ���ַ����ǲ��Ǵ���ĸ��ɵ�
	 * @param value
	 * @return
	 */
	private static boolean isLetter(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isLetter(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	/**
	 * �ж��ַ������Ƿ�����Ϸ����������
	 * @param value
	 * @return
	 */
	private static boolean isContainsSymble(String value){
		String part = "_@#$!";
		for (int i = 0; i < value.length(); i++) {
			if(part.contains(Character.toString(value.charAt(i)))){
				return true;
			}
		}
		return false;
	}
	
	
//	3���û�������ȷ��email
//	�������@���ţ���ֻ�ܰ���һ��
//	@��.  ���Ų����ڿ�ͷ��Ҳ�����ڽ�β
}
