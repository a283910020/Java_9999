package com.xuetang9.javabase.chapter4;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Scanner;

import javax.swing.plaf.ComboBoxUI;

/**
 * ʹ��ѭ��ʵ�ּ򵥵�ȭ�ʶ�ս
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��12�� ����11:37:51
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class KingOfFighter {
	
	
	//������֣�
	//Math.random()   //[0.0, 1.0)
	//(int)(Math.random() * 10000) % 10		 [0-9]
	//(int)(Math.random() * 10000) % 10 + 5  [5-14]
	//(int)(Math.random() * 10000) % 11 + 5  [5-15]
	//�Ƶ���������ֹ�ʽ�� a - b
	// (int)(Math.random() * 12345) % (b - a + 1) + a
//	//�������ִ���
//	File sound1 = new File("sounds/ȭ��98ѡ�˻���.wav");
//	AudioClip sound_choose = Applet.newAudioClip(sound1.toURL());
//	sound_choose.play();//��������
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		Scanner input = new Scanner(System.in);
		File sound1 = new File("sounds/ȭ��98ѡ�˻���.wav");
		AudioClip sound_choose = Applet.newAudioClip(sound1.toURL());
		sound_choose.play();//��������
		//1.��˫��ѡ���֣���ֻ��Ҫ���û�ѡ�񼴿ɣ�
		System.out.print("������������ƣ�");
		String userName = input.next();
		String comName = "����";//��������
		System.out.println(userName + " VS " + comName);
		
		sound_choose.stop();
		sound1 = new File("sounds/ȭ��98�񶷿�ʼ.wav");
		sound_choose = Applet.newAudioClip(sound1.toURL());
		sound_choose.play();//��������
		
		//2.��ʼ��˫�������ݣ�����ֵĬ��100��
		int hp1 = 100, hp2 = 100;		//˫����HP
		int attack1 = 0, attack2 = 0;	//˫���Ĺ�����
		//3.ʹ��ѭ��ģ���ս����
		while(hp1 > 0 && hp2 >= 0){
			//����˫�������������
			attack1 = (int)(Math.random() * 10000) % 11 + 5;
			attack2 = (int)(Math.random() * 10000) % 11 + 5;
			
			//������ȹ���
			hp2 -= attack1; //��ҹ��������Ե�Ѫ
			System.out.println(userName + "�����һ��-��ٰ�ʽ �˾Ʊ���" + comName + "��Ѫ" + attack2 + "����");
			if(attack1 >= 0 && attack1 <= 5){
				System.out.println(comName + "�����صĴ���һȭ��");
			}else if(attack1 >= 6 && attack1 <= 10){
				System.out.println(comName + "����������Ҫ�����֣�����1���Ӳ���������");
			}
			sound_choose.stop();
			sound1 = new File("sounds/���ɾ�--��ʮ��ʽ ��ҧ.wav");
			sound_choose = Applet.newAudioClip(sound1.toURL());
			sound_choose.play();//��������
			Thread.sleep(3000);	//�ӳ�3��ִ������Ĵ���

			hp1 -= attack2;
			System.out.println(comName + "�����һ��-��ٰ�ʽ �˾Ʊ���" + userName + "��Ѫ" + attack1 + "����");
			sound_choose.stop();
			sound1 = new File("sounds/������Ч.wav");
			sound_choose = Applet.newAudioClip(sound1.toURL());
			sound_choose.play();//��������
			Thread.sleep(500);	//�ӳ�500����ִ������Ĵ���
		}
		//4.��ӡ���ս��
		System.out.println("KO!");
		System.out.println("�������\tѪ��");
		System.out.println(userName + "\t" + hp1);
		System.out.println(comName + "\t" + hp2);
		
		
		
		//��Ҫ�ó�����ͣ�£��Ա㲥������		
		System.out.println("�����������������");
		input.nextLine();
		

	}

}
