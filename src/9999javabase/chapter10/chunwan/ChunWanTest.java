package com.xuetang9.javabase.chapter10.chunwan;

import java.io.IOException;
import java.util.Properties;

public class ChunWanTest {

	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Director ����ı = new Director();	
//		Singer ����Ӣ = new Singer("����Ӣ");
//		Dancer ����Ƽ = new Dancer("����Ƽ");
//		����ı.action(����Ӣ);	
//		����ı.action(����Ƽ);
		
//		
//		//1��ģ������������Ҫ�����������Ա������ҵ�����벻��
//		CrossActor �빮 = new CrossActor("�빮");
//		Actor ���¸� = new CrossActorV1("���¸�");
//		����ı.action(���¸�);
////		
//		//2��Ҫ��ʵ��main�����еĴ���Ҳ���޸ĵ�����£�ʵ��ĳ����ɫ������
//		//���������ʹ�÷���+��̬����ʵ���޷�����
		Properties props = new Properties();//��ӦJava�����ļ�
		//��ȡ�����ļ��е�����
		props.load(ChunWanTest.class.getResourceAsStream("ActorConfig.properties"));
//		//ͨ������ʵ���������ļ������õ���
		Actor actor = (Actor)Class.forName(props.getProperty("crossactor")).newInstance();
		actor.setName("���¸�");
		����ı.action(actor);
//		
	}

}







