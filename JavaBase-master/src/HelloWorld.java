import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * ʹ��Java��ӡ��ɫ��Ϣ
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��6��5�� ����10:28:56
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */

public class HelloWorld {
	/*
	 * ����ע��
	 */
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		//int i = input.nextInt();
		
		String str1 = input.next();
		input.reset();
		String str2 = input.next();
		
		System.out.println(str1);
		System.out.println(str2);
	}
}

