package com.itheima02;

import java.util.Scanner;

/**
 * ͳ���ַ����д�Сд��ĸ�ַ��������ַ��ĸ���
 * 
 * @author Ulric
 *
 */

public class StringClassDemo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// String string = "HelloWorld123";

		System.out.println("������һ���ַ�����");
		String string = scanner.nextLine();

		// #1 ����Character���ж�
		System.out.println("\n#1 ����Character���ж�");
		int numOfDigit1 = 0;
		int numOfUpperCase1 = 0;
		int numOfLowerCase1 = 0;
		int otherChar1 = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {// ����������ַ�
				numOfDigit1++;
			} else if (Character.isUpperCase(string.charAt(i))) {// ����Ǵ�д��ĸ�ַ�
				numOfUpperCase1++;
			} else if (Character.isLowerCase(string.charAt(i))) {// �����Сд��ĸ�ַ�
				numOfLowerCase1++;
			} else {
				otherChar1++;
			}
		}
		System.out.println("��д��ĸ�ַ�������" + numOfUpperCase1 + "\nСд��ĸ�ַ�������" + numOfLowerCase1 + "\n�����ַ�������" + numOfDigit1
				+ "\n�����ַ�������" + otherChar1);
		System.out.println("--------------------------");

		// #2 ����ASCII����ж�
		System.out.println("#2 ����ASCII����ж�");
		int numOfDigit2 = 0;
		int numOfUpperCase2 = 0;
		int numOfLowerCase2 = 0;
		int otherChar2 = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch > '0' && ch < '9') {// ����������ַ�
				numOfDigit2++;
			} else if (ch > 'A' && ch < 'Z') {// ����Ǵ�д��ĸ�ַ�
				numOfUpperCase2++;
			} else if (ch > 'a' && ch < 'z') {// �����Сд��ĸ�ַ�
				numOfLowerCase2++;
			} else {
				otherChar2++;
			}
		}
		System.out.println("��д��ĸ�ַ�������" + numOfUpperCase2 + "\nСд��ĸ�ַ�������" + numOfLowerCase2 + "\n�����ַ�������" + numOfDigit2
				+ "\n�����ַ�������" + otherChar2);
	}
}
