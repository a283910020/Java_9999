package com.xuetang9.javabase.chapter6.project;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

/**
 * ��ѡ��-�����ַ������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��18�� ����9:09:21
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class AppMain_V1 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		Scanner input = new Scanner(System.in);

    	AudioClip sound = Applet.newAudioClip(new File("sounds/��������.wav").toURL());

	    int count = 5;  	//��ŵ�ǰ���������
	    int currDay = 0;	//��Ϸ��ǰ���е��˵ڼ���
	    final int DAY_COUNT = 10;	//��Ϸһ��10��
	    int choice;     	//��������û���ѡ��
	    int tempCount;  	//��ʱ������������źøжȵ���60�ĸ���
	    int index = -1; 	//�������ɾ��������ʱ������
	    String name;   	//��������û����������
	    //�������飬�������6���ַ�����ÿ���ַ�������󳤶�Ϊ8���ַ���Ӣ�ģ�
	    String[] names = {"��ʩ", "����", "���Ѿ�", "����", "�Է���", ""};
	    //�������飬�������5���ַ�����ÿ���ַ�������󳤶�Ϊ8���ַ���Ӣ�ģ�
	    String[] levelNames = {"����", "����", "����", "�ʹ���", "�ʺ�", ""};
	    //�������ÿ�����ӵĵȼ�����levelNames���á�-1��ʾδ����
	    int level[] = {0, 2, 0, 0, 0, -1};
	    //�������ÿ�����ӵĺøжȣ�-1��ʾδ����
	    int loves[] = {100, 100, 100, 100, 100, -1};
	    do{
	    	sound.stop();
	        sound = Applet.newAudioClip(new File("sounds/��������.wav").toURL());
	        sound.play();
	        System.out.printf("��%d�죺\n", ++currDay);
	        String str = "1���ʵ���ּѡ����\t�����ӣ�\n";
	        str += "2�����Ƴ���\t���޸�״̬��\n";
	        str += "3�������乬��\t��ɾ����\n";
	        str += "4���޵İ����أ�\t�����ң�\n";
	        JOptionPane.showInputDialog(null, str);
	        for (int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i));
				Thread.sleep(20);//����20����
			}        
	        System.out.printf("������ѡ��");
	        choice = input.nextInt();
	        switch(choice){
	        case 1://�������ӣ������˺øж�-10
	            sound.stop();
	        	sound = Applet.newAudioClip(new File("sounds/ѡ��.wav").toURL());
	            sound.play();
	            //�����ж����鳤���Ƿ��������Ԫ��
	            if(count >= level.length)
	            {
	                System.out.printf("\n������Ϊ�������»����ٵȵȰɣ�\n\n");
	                break;
	            }
	            System.out.printf("����ɽ�������ˣ���ǧ����һ���~\n");
	            System.out.printf("�������䣺");
	            name = input.next();
	            //������Ԫ�ط���count��
	            names[count] = name;
	            level[count] = 0;
	            loves[count] = 100;
	            System.out.printf("\n�������ӣ������˺øж�-10\n\n");
	            for(int i = 0; i < count; i++){
	                loves[i] -= 10;
	            }
	            count++;
	            break;
	        case 2://���Ƴ��ң����ҵ����Ӻøж�+20��������-10
	        	sound.stop();
	        	sound = Applet.newAudioClip(new File("sounds/����.wav").toURL());
	            sound.play();
	            System.out.printf("����������Ҫ���ҵ�������");
	            name = input.next();
	            for(int i = 0; i < count; i++){
	            	if(name.equals(names[i])){
	                    index = i;
	                    continue;
	                }
	                loves[i] -= 10;
	            }
	            if(index == -1)//û���ҵ�
	            {
	                System.out.printf("\n�����δͳһ�����ܶ�Ů�鳤��\n\n");
	            }
	            else
	            {
	                loves[index] += 20;
	                //ÿ����һ�Σ���������1�������Ϊ4�����ʺ�
	                if(level[index] == 4){
	                	level[index] = 4;
	                }else{
	                	level[index]++;
	                }
	                System.out.printf("\n******************************\n");
	                System.out.printf("Duang~%s�����ȼ�Ϊ��%s\n", names[index], levelNames[level[index]]);
	                System.out.printf("******************************\n\n");
	                System.out.printf("���ݻ��ӶԴ������ȹ��������š�\n����ȴ�۹���������ʧ��ʱ��¶���� \n");
	                System.out.printf("��������øж�-10��\n\n");
	            }
	            index = -1;
	            break;
	        case 3://�����乬��ִ��ɾ���������������Ӻøж�ͳһ+10
	        	sound.stop();
	        	sound = Applet.newAudioClip(new File("sounds/�乬.wav").toURL());
	            sound.play();
	            System.out.printf("����Ҫ����λ��������乬�أ�");
	            name = input.next();
	            for(int i = 0; i < count; i++){
	            	if(name.equals(names[i])){
	                   index = i;
	                   break;
	                }
	            }
	            if(index == -1)//δ�ҵ�Ҫɾ��������
	            {
	                System.out.printf("\n�龪һ�������˴����乬���óԳԸúȺ�~\n\n");
	                break;
	            }
	            //ִ��ɾ������
	            for(int i = index; i < count - 1; i++)
	            {
	            	names[i] = names[i + 1];
	                level[i] = level[i + 1];
	                loves[i] = loves[i + 1];
	            }
	            count--;//������-1
	            index = -1;//������������Ϊ��ʼֵ�������´�ʹ��
	            System.out.printf("\n%s�ѱ������乬��������ů����������øж�+10��\n\n", name);
	            for(int i = 0; i < count; i++){
	                loves[i] += 10;
	            }
	            index = -1;
	            break;
	        case 4://�����������ң��øж�+10
	        	sound.stop();
	        	sound = Applet.newAudioClip(new File("sounds/һЦ���.wav").toURL());
	            sound.play();
	            System.out.printf("������Ҫ���ҵ�������");
	            name = input.next();
	            for(int i = 0; i < count; i++){
	                if(name.equals(names[i])){
	                    System.out.printf("\n΢΢һЦͦ��ǣ�%s�ĺøж�+10\n\n", name);
	                    loves[i] += 10;
	                    break;
	                }
	            }
	            break;
	        }// end of switch
	        System.out.printf("����\t�ȼ�\t�øж�\n");
	        System.out.printf("-----------------------\n");
	        for(int i = 0; i < count; i++){
	            System.out.printf("%s\t%s\t%d\n", names[i], levelNames[level[i]], loves[i]);
	        }
	        //ÿ�����øжȣ�һ�������������ϵ������øжȵ���60���������ң���Ϸ����
	        tempCount = 0;//��ʱ������������źøжȵ���60�ĸ���
	        for(int i = 0; i < count; i++){
	            if(loves[i] < 60)
	                tempCount++;
	        }
	        if(tempCount >= 3){
	            System.out.printf("���ѵ������������ǣ����ˢ����ȥ�ˣ�\n");
	            //ʱ�亯���Ĺ̶��÷�
	            Calendar cal = Calendar.getInstance();	 //������          
	            //Date today = new Date();
	            //today.getYear() + 1900;
	            //SimpleDateFormat  
	            System.out.printf("��Ԫ%d��%d��%d�գ��ʵ��䣡��ִ��%d��\n", 
	            		cal.get(Calendar.YEAR), 
	            		cal.get(Calendar.MONTH) + 1, 
	            		cal.get(Calendar.DATE), 
	            		currDay
	            );
	            System.exit(0);
	        }
	    }while(currDay < DAY_COUNT);

	    System.out.printf("�ʵ۵ǻ�10��������ȷ�ǡ������˳����檳�Ⱥ����������\n");
	    System.out.printf("û��û����������������š�������������\n");
	    System.out.printf("����\t�ȼ�\t�øж�\n");
	    System.out.printf("-----------------------\n");
	    for(int i = 0; i < count; i++){
	        System.out.printf("%s\t%s\t%d\n", names[i], levelNames[level[i]], loves[i]);

	    }

	}

}
