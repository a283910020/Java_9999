package com.xuetang9.javabase.chapter13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 1����HTTPЭ�������ļ����ļ����������ļ����Ի������ķ�ʽ��ȡ���ڴ���
 * 		InputStream -> BufferedInputStream
 * 2�������������ݷֿ�д�뵽Ӳ���ϣ�ʹ��RandomAccessFile��ʵ�֣�
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��8��22�� ����10:12:01
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class Downloader_RandomAccessFile {
	/** Ҫ���ص���ַ���Ͼ�ѧ�õ�����Ƭ��146M��������ʾ */
	private static final String StrUrl = "http://www.xuetang9.com/video/xuetang9_intro.mp4";
	/** ��������ʱ��Ĭ�ϻ����С - 10M��С/10240K��С*/
	private static final int MAX_BUFFER_SIZE = 1024*10240;
	
	public static void main1(String[] args) throws MalformedURLException {
		URL url = new URL(StrUrl);
		System.out.println(url.getFile());
	}
	
	public static void main2(String[] args) {
		//1����http���ӣ�����������ݵĳ��ȣ��������ݣ����Ǹ�ʽ��Թ̶���
		//2������RandomAccessFile����
		//3�������ص����ݻ��浽�ֽ�������
		//4���������ֽ�����ͨ��RandomAccessFile����д�뵽�ļ��У��漰��һ���ļ�ָ��Ĳ�����
		HttpURLConnection connection = null;
		BufferedInputStream bInStream = null;
		try {
			URL url = new URL(StrUrl);	//����url�����Ա����ļ���
			connection = (HttpURLConnection)url.openConnection();
			//������������-Rangeָ�ӷ��������������ļ����ֽ�����Χ��0-   ��ʾ��ָ����ֹ�ֽ���
			connection.setRequestProperty("Range", "bytes=0-");
			connection.connect();	//���ӵ��˷�����
			//�ж������Ƿ�ɹ� - һ�����ӳɹ��󣬷��صĴ���Ӧ����200�ķ�Χ��
//			1xx��ָʾ��Ϣ����ʾ�����ѱ����գ�����������
//			2xx���ɹ�����ʾ�����ѱ��ɹ����գ���⣬������
//			3xx���ض���Ҫ��������������н�һ���Ĳ�����
//			4xx���ͻ��˴����������﷨����������޷�ʵ�֡�
//			5xx�����������󣬷�����δ��ʵ�ֺϷ�����    by  ���� С���
			if(connection.getResponseCode() / 100 != 2){
				System.err.println("���ӵ���Ӧ״̬����200��Χ�ڣ����Ӵ��������ԣ�");
				return;
			}
			int fileSize = connection.getContentLength();	//���Ҫ�����ļ��Ĵ�С���ֽ�����
			bInStream = new BufferedInputStream(connection.getInputStream(), MAX_BUFFER_SIZE);
			int downloaded = 0;	//�����ص��ֽ��� - �������㵱ǰ���صİٷֱ�
			String fileName = url.getFile();//������ص��ļ��� - /video/xuetang9_intro.mp4
			//��ȡ�ַ����������һ��б��+1��λ�ÿ�ʼ��ȡ
			fileName = fileName.substring(fileName.lastIndexOf("/") + 1);
			RandomAccessFile file = new RandomAccessFile(fileName, "rw");
			file.setLength(0);	//�ļ����
			file.seek(0);		//���ļ�ָ������
			while(downloaded < fileSize){//��ǰ�����ص��ֽ���С���ļ��ܴ�Сʱ����������
				byte[] buffer = null;	//���ػ����ֽ�����
				//�ж�δ���صĴ�С�Ƿ񳬹���󻺴���
				if(fileSize - downloaded > MAX_BUFFER_SIZE){
					buffer = new byte[MAX_BUFFER_SIZE];
				}else{
					buffer = new byte[fileSize - downloaded];
				}
				//�������е����ݶ�ȡ����
				int read = bInStream.read(buffer);
				if(read == -1) break;	//�������
				//����ǰ���صĻ���д�뵽�ļ���
				file.seek(downloaded);	//�����ļ�ָ��
				file.write(buffer, 0, read);
				downloaded += read;
				//System.out.println("��ǰ���ؽ��ȣ�" + downloaded * 1.0 / fileSize * 10000 / 100 + "%");
				System.out.printf("%d\t%d\t��ǰ���ؽ��ȣ�%.1f%%\n", read, buffer.length, downloaded * 1.0 / fileSize * 10000 / 100);
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
			try {
				bInStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	public static void main(String[] args) {
		HttpURLConnection connection = null;
		InputStream inStream = null;
		
		try {
			URL url = new URL(StrUrl);	//����url�����Ա����ļ���
			connection = (HttpURLConnection)url.openConnection();
			//������������-Rangeָ�ӷ��������������ļ����ֽ�����Χ��0-   ��ʾ��ָ����ֹ�ֽ���
			connection.setRequestProperty("Range", "bytes=0-");
			connection.connect();	//���ӵ��˷�����
			if(connection.getResponseCode() / 100 != 2){
				System.err.println("���ӵ���Ӧ״̬����200��Χ�ڣ����Ӵ��������ԣ�");
				return;
			}
			int fileSize = connection.getContentLength();	//���Ҫ�����ļ��Ĵ�С���ֽ�����
			inStream = connection.getInputStream();
			int downloaded = 0;	//�����ص��ֽ��� - �������㵱ǰ���صİٷֱ�
			String fileName = url.getFile();//������ص��ļ��� - /video/xuetang9_intro.mp4
			//��ȡ�ַ����������һ��б��+1��λ�ÿ�ʼ��ȡ
			fileName = fileName.substring(fileName.lastIndexOf("/") + 1);
			RandomAccessFile file = new RandomAccessFile(fileName, "rw");
			file.setLength(0);	//�ļ����
			file.seek(0);		//���ļ�ָ������
			while(downloaded < fileSize){//��ǰ�����ص��ֽ���С���ļ��ܴ�Сʱ����������
				byte[] buffer = null;	//���ػ����ֽ�����
				//�ж�δ���صĴ�С�Ƿ񳬹���󻺴���
				if(fileSize - downloaded > MAX_BUFFER_SIZE){
					buffer = new byte[MAX_BUFFER_SIZE];
				}else{
					buffer = new byte[fileSize - downloaded];
				}
				//�������е����ݶ�ȡ����
				int currDownloaded = 0;
				int read = -1;		//ʵ�����ص��ֽ���
				long starTime = System.currentTimeMillis();
				while(currDownloaded < buffer.length){
					read = inStream.read();	//һ���ֽ�һ���ֽڵĶ�ȡ
					if(read == -1) break;	//�Ѿ��������
					buffer[currDownloaded] = (byte)read;	//����ǰ���ص��ֽ����ŵ�������
					currDownloaded++;
				}
				long endTime = System.currentTimeMillis();
				
				if(read == -1) break;	//�������
				double speed = 0;
				if(endTime - starTime > 0)
					speed = currDownloaded / 1024.0 / ((double)(endTime - starTime) / 1000);
				
				//����ǰ���صĻ���д�뵽�ļ���
				file.seek(downloaded);	//�����ļ�ָ��
				file.write(buffer);	
				downloaded += currDownloaded;
				//System.out.println("��ǰ���ؽ��ȣ�" + downloaded * 1.0 / fileSize * 10000 / 100 + "%");
				System.out.printf("��ǰ�����ٶȣ�%.1f K/s(%.1f M/s)\t��ǰ���ؽ��ȣ�%.1f%%\n", speed, speed / 1024, downloaded * 1.0 / fileSize * 10000 / 100);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
			try {
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�������");

	}

}






