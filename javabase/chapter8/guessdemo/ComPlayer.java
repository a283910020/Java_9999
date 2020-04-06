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
public class ComPlayer {
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
			"��ɱ��ҡҡ�λ���ȭ��",
			"������ô˧���˾Ϳ����ڴ���׬Ǯ��",
			"����һ����ȭ��",
			"�ҽ���һ����Ҵ�Ӧ��",
			"����������Ѳɽ����"
	};
	
	private String[] winWords = {
			"������Ի������Yͦ��LJYOYO��һ��ש������Y�ģ�����",
			"����ֻ��һ�������Ѿ�����!",
			"����һ��" + name + "����긽�壬������һ���ˣ�����",
			"�飬��һ�������������ҳ飬��һ������̬�ȣ���",
			"���պ����������壬������˧���ˡ�����������ʲô?������˧���ˡ�"
	};
	
	private String[] loseWords = {
			"����һ�����޳���������������Щ����ȫ����",
			"�������ı������ഺ����,�ഺ��ȴ����",
			"����� ���ٱ��Ҿ�װ�����㿴",
			"��ţ�ưٶ�զ������������?��ţ�����ܱ�ס����?",
			"�Һͳ��˵�Ψһ������ǣ��Ұ��ڿ㴩��������",
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
		//���Եĳ�ȭʵ���Ͼ���������1-3֮����������
		fist = ((int)(Math.random() * 30000)) % 3 + 1;
		return fist;
	}
//
//	public void setFist(int fist) {
//		this.fist = fist;
//	}
	
	
	
	//���������ú͵õ����ơ���������������Ч����˵���Ի�̨�ʡ���ȭ
	
	
}











