package com.itheima03;

import java.util.Scanner;

/**
 * �ж�һ���ַ����Ƿ�Գ�
 * 
 * @author Ulric
 *
 */

public class StringBuilderTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("������һ���ַ�����");
		String string = scanner.nextLine();
		System.out.println("�Ƿ�Գƣ�" + isSymmetrical(string));
	}

	public static boolean isSymmetrical(String str) {
		return new StringBuilder(str).reverse().toString().equals(str);
	}

}
