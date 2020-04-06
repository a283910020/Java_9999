package com.xuetang9.javabase.chapter14.generic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * ��ջ�� - �Ƚ� ���
 * ����Ԫ�أ���ջ - ����Ԫ��λ�ý��в���
 * ȡ��Ԫ�أ���ջ - ȡ����ɾ����Ԫ
 * ��ҵ1��ģ��MyStack��ʵ���Զ�����У�MyQueue - �Ƚ��ȳ�
 * boolean offer(T)			�����β����һ��Ԫ��					   -  ���			
 * E poll()					��ȡ��ɾ������ͷԪ�أ��������Ϊ�գ�����null  -  ����
 * E remove()				��ȡ��ɾ������ͷԪ�أ��������Ϊ�գ�����null
 * *Iterator<T> iterator()	���ص�����
 * 
 * ��ҵ2��ʵ��LinkedList - ����   ÿ��Ԫ�ر�����һ��Ԫ�ص��ڴ��ַ����������
 * ʵ�ֶ�����Ԫ�ص�������ɾ������������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��9��7�� ����8:09:52
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class MyStack<T> {//�ڱ����ڶ���ķ������ͣ�����ж�����ͣ�<T1, T2, E1, E2, V1, V2>
	/** ջ�ṹ����������Ԫ�صĶ������� */
	protected Object[] elementData;
	/** ��������ջ�ṹ��Ԫ�ص����� */
	protected int elementCount;
	/** ������������ - ���洢Ԫ�ص�����ռ䲻����ʱ������ռ��Զ�����capacityIncrement */
	protected int capacityIncrement;
	
	public MyStack(){
		//Ĭ��10��Ԫ�ؿռ��С
		this(10);
	}
	
	public MyStack(int initialCapacity){//��ʼ����
		this(initialCapacity, 10);
	}
	/**
	 * ͨ�������ĳ�ʼ��������������������һ��ջ����
	 * @param initialCapacity
	 * @param capacityIncrement
	 */
	public MyStack(int initialCapacity, int capacityIncrement){
		if(initialCapacity < 0){
			//return;//returnĿǰ�����ͱȽ�low��
			throw new IllegalArgumentException("��ʼ����������С���㣺" + initialCapacity);
		}
		elementData = new Object[initialCapacity];
		this.capacityIncrement = capacityIncrement;	
	}
	
	/**
	 * ��ջ�����һ��λ�����Ԫ�أ�������ջ����������ArrayList��add����
	 * @param t
	 */
	public void add(T t){
		grow();
		elementData[elementCount] = t;
		elementCount++;
	}
	
	/**
	 * ��������
	 */
	private void grow(){
		//��Ԫ������ �� Ԫ������Ĵ�С��ͬʱ������ҪΪ��������������
		if(elementCount == elementData.length){
			//ʹ��Arrays�ഴ��һ�������飬������elementCount + capacityIncrement�ռ䣬Ȼ��elementData�е����ݿ�����ȥ��
			elementData = Arrays.copyOf(elementData, elementCount + capacityIncrement);
		}
	}
	
	/**
	 * ��ջ����ջ�ĵ�һ��Ԫ��λ�ã�������Ԫ��t / ��ջ��������Ԫ��
	 * @param t
	 */
	public void push(T t){
		grow();
		//src:Ҫ���Ƶ�Դ����		srcPos:Ҫ���Ƶ�Դ�������ʼ�±�
		//dest:���Ƶ�Ŀ��/Ŀ������	destPost:���Ƶ�Ŀ�������destPos��
		//length:���Ƶĳ���
		System.arraycopy(elementData, 0, elementData, 1, elementCount);
		elementData[0] = t;
		elementCount++;
	}
	
	/**
	 * ��ջ������ջ��Ԫ�أ���ɾ��
	 * @return
	 */
	public T peek(){
		if(!isEmptry()){
			return (T)elementData[0];
		}
		return null;
	}
	/**
	 * ��ջ������ջ��Ԫ�أ���ɾ��ջ��Ԫ��
	 * @return
	 */
	public T pop(){
		if(isEmptry()) return null;//���׳��쳣
		//ɾ��������
		T t = peek();
		//ɾ��Ԫ�� - ���ǵ�����ɾ��Ҳ��װ��һ����������������ĵ���
		remove(0);//ɾ����Ԫ��
		return t;
	}
	
	/**
	 * ����ջ����ĵ�����
	 * @return
	 */
	public Iterator<T> iterator(){
		return new Iterator<T>() {//�������ķ�ʽʵ��Iterator�ӿ�
			int index = 0;
			@Override
			public boolean hasNext() {
				return index < elementCount;//�����ǰ���ʵ��±�С����Ԫ�ظ�����֤������һ��Ԫ��
			}

			@Override
			public T next() {
				if(index < elementCount){
					return (T)elementData[index++];
				}
				//return null;
				throw new NoSuchElementException("ľ��Ԫ��������Ҫ��������");
			}
			
		};
	}
	
	/**
	 * �����±�ɾ��
	 * @param index
	 */
	public void remove(int index){
		if(isEmptry()) return;
		
		if(index < 0 || index >= elementCount){//Ҫɾ�����±�Ϊ������ڵ���Ԫ���ܸ���
			//�����±�Խ��
			throw new ArrayIndexOutOfBoundsException(index);
		}
		int copyLength = elementCount - index - 1;
		System.arraycopy(elementData, index + 1, elementData, index, copyLength);
		//Ԫ������-1
		elementCount--;
		//�����һ��Ԫ����Ϊnull
		elementData[elementCount] = null;
	}
	
	public boolean isEmptry(){
		return elementCount == 0;
	}
	
	/**
	 * ���ջ�ռ���ʵ�ʵ�Ԫ�ظ���
	 * @return
	 */
	public int getSize(){
		//˼����elementData.length��ʲô��
		return elementCount;
	}
	
	/**
	 * ���ջ�ռ��ʵ������
	 */
	public int capacity(){
		return elementData.length;//�����ջ��ʵռ�õĿռ��С
	}
	
//	/**
//	 * ��Ӵ����elementԪ�ص���������elementData��
//	 * @param element
//	 */
//	public void add(Object element){
//		elementData[elementCount] = element;
//		elementCount++;
//	}
	
	@SuppressWarnings("unchecked")//���߱�����������Ҫ��⾯��
	public T get(int index){
		return (T)elementData[index];
	}
	
	/**
	 * �����±���indexλ�ô���Ԫ��
	 * @param index
	 */
//	public Object get(int index){
//		return elementData[index];
//	}
	
	
}
