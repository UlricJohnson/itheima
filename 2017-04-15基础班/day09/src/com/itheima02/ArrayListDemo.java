package com.itheima02;

import java.util.ArrayList;

/**
 * ������
 * 
 * ���Ԫ��
 * 
 * @author Ulric
 *
 */

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		System.out.println("list: " + list);// ����Ĳ��ǵ�ַ

		// add(E e)���Ԫ��
		list.add("Hello");
		list.add("World");

		// add(int index, E e)���Ԫ��
		list.add(1, "Java");

		System.out.println("list: " + list);
	}
}
