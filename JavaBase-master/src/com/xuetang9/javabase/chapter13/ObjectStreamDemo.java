package com.xuetang9.javabase.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ��������л��ͷ����л�����
 * ǰ�᣺�������ʵ��Serializable�ӿڣ����л��ӿڣ�
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��18�� ����11:17:25
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class ObjectStreamDemo {
	private static final String FilePath = "src/com/xuetang9/javabase/chapter13/Object.dat";
	public static void main(String[] args) {
		Player player1 = new Player("�ҵ������㲻��", 99);
		
		//ʹ�ö����������л��Ķ���д�뵽�ļ���
		try(
				FileOutputStream fOutStream = new FileOutputStream(FilePath);
				ObjectOutputStream objOutStream = new ObjectOutputStream(fOutStream)
		){
			objOutStream.writeObject(player1);
			System.out.println("����д��ɹ���");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//���ļ��ж�ȡ�������ݣ�ת�������ǿɲ����Ķ���
		try(
				FileInputStream fInStream = new FileInputStream(FilePath);
				ObjectInputStream objInStream = new ObjectInputStream(fInStream)
		){
			Player player2 = (Player)objInStream.readObject();
			System.out.println("��ȡ���Ķ������ݣ�" + player2);
			System.out.println(player1 == player2);   //ע�⣺����Ƚϵ�����������ĵ�ַ
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}
class Player implements Serializable{
	private static final long serialVersionUID = 421569974961829571L;
	
	private String nickName;
	private int level;
	
	public Player(){}
	
	public Player(String nickName, int level){
		setNickName(nickName);
		setLevel(level);
	}
	
	@Override
	public String toString() {
		return nickName + "\t" + level;
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
