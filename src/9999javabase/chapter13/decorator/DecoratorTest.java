package com.xuetang9.javabase.chapter13.decorator;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * ʹ��װ����ģʽ�ĳ���
 * 1����������Ҫ�ڲ�Ӱ���������������£��Զ�̬��͸���ķ�ʽΪ������ӹ��ܣ���չ������ʵ�֣�
 * 2�������ʺ�ʹ�ü̳У�����������з�������չʱ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��15�� ����10:58:29
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class DecoratorTest {

	public static void main(String[] args) throws FileNotFoundException {
		//����Ҫ��װ�ε�ԭʼ����
		Component component = new  TrueComponent();
		//Ϊԭʼ����͸�������ӹ���
		ComponentImplA componentA = new ComponentImplA(component);
		ComponentImplB componentB = new ComponentImplB(componentA);
		componentB.read();
		
		
		InputStream inputSteam = new FileInputStream("");
		//ʹ�ô������������װ������������
		BufferedInputStream bInStream = new BufferedInputStream(inputSteam);

	}

}
