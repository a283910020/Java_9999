package com.xuetang9.javabase.chapter8.guessdemo;
/**
 * �������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��4�� ����10:56:42
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class HumanPlayer {
	/** ��̬��������ȭ����Ϣ */
	public static final int MessageTypeFist = 1;
	/** ��̬������Ӯ�ñ���ʱ����Ϣ */
	public static final int MessageTypeWin = 2;
	/** ��̬�������������ʱ����Ϣ */
	public static final int MessageTypeLose = 3;

	//���ԣ����ơ�������������ȭ������ɫ��Ӧ����Ч������ɫ�ĸ��Ի�̨��
	private String name;
	private int score;
	private int fist;
	//..............
	/** ��ɫ�ڳ�ȭ��ʱ����˵�ĸ��Ի�̨�� */
	private String[] fistWords = {
		"���йⲨ~biubiubiu~~~",
		"���������ı���Ϊʲô��ô��~~",
		"��ɱ��¶PP������~~~",
		"������ϲ�����ཷ��",
		"�ز�����ŷ��ɣ������һȭ~"
	};
	
	private String[] winWords = {
		"����˭~~",
		"��ȭ���е���˼~~",
		"~~~��~~~~��~~~",
		"ȫ������~~~������",
		"���Ż�����Ÿ裬Ȼ���������~"
	};
	
	private String[] loseWords = {
		"ͨ���ɹ���·����ʩ���С�����",
		"�ȵ���ˮ��ȥ����֪��˭����Ӿ�ˡ�����",
		"������ǲ��ã����ʱ�����������綼û�úȡ�����",
		"���������ˡ���QQ���ϣ�����̡��ú�����һ���������ô�̫����QQ������",
		"���˽����Ҷ��ѣ����������Ҷ��塣����"
	};
	
	/**
	 * ���ݴ������Ϣ���ͣ������ӡ��Ӧ���͵���Ϣ
	 * @param msgType ��ӦHumanPlayer���ж���ľ�̬����
	 */
	public void sendMessage(int msgType){
		//����һ��0-4֮����������
		int index = ((int)(Math.random() * 1000)) % 5;
		String message = null;	//Ҫ��ӡ����Ϣ
		switch (msgType) {
		case MessageTypeFist:
			message = fistWords[index];
			break;
		case MessageTypeWin:
			message = winWords[index];
			break;
		case MessageTypeLose:
			message = loseWords[index];
			break;
		}
		System.out.println(message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFist() {
		return fist;
	}

	public void setFist(int fist) {
		this.fist = fist;
	}
	
	
	
	//���������ú͵õ����ơ���������������Ч����˵���Ի�̨�ʡ���ȭ
	
	
}











