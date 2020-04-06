package com.xuetang9.javabase.chapter14;
/**
 * ��������ʾ�ؼ���synchronized�����ã��ڶ��̵߳ĳ�����ʵ��ͬ��
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��9��1�� ����3:18:01
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class SynDemo {
	
	public static void main(String[] args) throws InterruptedException {
		Boss boss = new Boss(100000);
		//1w����ȥΧŹboss
		AttackThread[] threads = new AttackThread[10000];
		for(int i = 0; i < threads.length; i++){
			threads[i] = new AttackThread(boss);
			threads[i].start();
		}		
		Thread.sleep(3000);//�ȴ����е��߳�������Ϻ��ٴ�ӡboss��hp
		System.out.println("10����ÿ�˹���10�κ�Boss��HP��" + boss.hp);
		
	}

}
/**
 * ��Ϸ���boss
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��9��1�� ����3:35:37
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
class Boss{
	public int hp;	
	public Boss(int hp){
		this.hp = hp;
	}	
	/**
	 * bossÿ�α�����ʱ����1��Ѫ
	 */
	public synchronized void hited(){//����synchronized�ؼ���ʱ�����ս���п��ܻ������
		this.hp -= 1;
	}
}
/**
 * ����ģ�⹥��boss���߳�
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��9��1�� ����3:19:01
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
class AttackThread extends Thread{
	private Boss boss;
	public AttackThread(Boss boss) {
		this.boss = boss;
	}
	@Override
	public void run() {
		//��������ȭ.....��������10��
		for(int i = 0; i < 10; i++)
			boss.hited();
	}
}
