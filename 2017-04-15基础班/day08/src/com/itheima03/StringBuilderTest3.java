package com.itheima03;

import java.util.Scanner;

/**
 * ����StringBuilder���Զ��巽��ʵ�ַ�ת�ַ���
 * 
 * @author Ulric
 *
 */

public class StringBuilderTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String string = scanner.nextLine();
		System.out.println("��תǰ��" + string);
		System.out.println("��ת��" + myReverse(string));
	}

	public static String myReverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
