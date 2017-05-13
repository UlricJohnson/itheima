package com.itheima02;

import java.util.ArrayList;

/**
 * 1.��ȡԪ��
 * 
 * public E get(int index)`:��ȡָ����������Ԫ��
 * 
 * 2.��ȡԪ�ظ���
 * 
 * public int size()`:��ȡ������Ԫ�ظ���
 * 
 * 3.ɾ��Ԫ��
 * 
 * public boolean remove(Object o)`:ɾ��ָ��Ԫ�أ�ɾ���ɹ��ͷ���true�����򷵻�false
 * 
 * public E remove(int index)`:ɾ������ȡ��ָ����������Ԫ�أ����ر�ɾ������ȡ��Ԫ��
 * 
 * 4.�޸�Ԫ��
 * 
 * public E set(int index,E element)
 * 
 * 5.�ж��Ƿ����ĳԪ��
 * 
 * boolean contains(Object o)
 * 
 * @author Ulric
 *
 */

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("Java");
		System.out.println("arrayList: " + arrayList);

		// 1.��ȡԪ��
		System.out.println("arrayList.get(0): " + arrayList.get(0));
		System.out.println("arrayList.get(1): " + arrayList.get(1));
		System.out.println("arrayList.get(2): " + arrayList.get(2));
		System.out.println("arrayList: " + arrayList);

		// 2.��ȡԪ�ظ���
		System.out.println("arrayList.size(): " + arrayList.size());
		System.out.println("arrayList: " + arrayList);

		// 3.ɾ��Ԫ��
		System.out.println("arrayList.remove(\"world\"): " + arrayList.remove("world"));
		System.out.println("arrayList: " + arrayList);
		System.out.println("arrayList.remove(\"world\"): " + arrayList.remove("world"));
		System.out.println("arrayList: " + arrayList);

		System.out.println("arrayList.remove(0): " + arrayList.remove(0));
		System.out.println("arrayList: " + arrayList);

		// 4.�޸�Ԫ��
		System.out.println("arrayList.set(1, \"Android\"): " + arrayList.set(1, "Android"));
		System.out.println("arrayList: " + arrayList);

		// 5.�ж��Ƿ����ĳԪ��
		System.out.println("arrayList.contains(\"Java\"): " + arrayList.contains("Java"));
		System.out.println("arrayList.contains(\"Love\"): " + arrayList.contains("Love"));
		System.out.println("arrayList: " + arrayList);
	}
}
