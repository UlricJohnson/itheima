package com.itheima;

import java.util.Scanner;

/**
 * 4�� �����������󣬲��ô���ʵ��
 * 
 * (1).����¼��һ�����ַ���,��¼��һ��С�ַ���
 * 
 * (2).ͳ��С�ַ����ڴ��ַ����г��ֵĴ���
 * 
 * (3).�������д�ӡ��ʽ:
 * 
 * ��������ַ���:javajavajava I love java l like jajavava I enjoy javajavajava
 * 
 * ������С�ַ���:java
 * 
 * ����̨���:С�ַ���java,�ڴ��ַ���javajavajava I love java l like jajavava I enjoy
 * javajavajava�й�����8��
 * 
 * ��ʾ: ���Խ�����String�� String replace(CharSequence target, CharSequence
 * replacement) ��: String��int indexOf(int ch) �� String substring(int beginIndex)
 * 
 * @author Ulric
 *
 */

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// (1).����¼��һ�����ַ���,��¼��һ��С�ַ���
		System.out.print("��������ַ���: ");
		String scrStr = scanner.nextLine();
		System.out.print("������С�ַ���:");
		String subStr = scanner.nextLine();

		// System.out.println("javajavajava I love java l like jajavava I enjoy
		// javajavajava".replace("java", ""));

		System.out.println("С�ַ���\"" + subStr + "\"�ڴ��ַ���\"" + scrStr + "\"�й�����" + numOfSubStrs2(scrStr, subStr) + "��");

	}

	// #1 ʹ��String replace(CharSequence target, CharSequence replacement)
	// public static int numOfSubStrs(String scrStr, String subStr) {
	// int count = 0;
	//
	// return count;
	// }

	// #2 ʹ��String��int indexOf(int ch) �� String substring(int beginIndex)
	public static int numOfSubStrs2(String scrStr, String subStr) {
		int count = 0;
		int index = scrStr.indexOf(subStr);
		while (index != -1) {
			scrStr = scrStr.substring(index + subStr.length());// Ҫ�ǵü���subStr�ĳ���
			count++;
			index = scrStr.indexOf(subStr);
		}
		return count;
	}
}
