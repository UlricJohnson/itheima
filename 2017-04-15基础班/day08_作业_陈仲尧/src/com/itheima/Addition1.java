package com.itheima;

import java.util.Scanner;

/**
 * 1. �����������󣬲��ô���ʵ�֣�
 * 
 * (1)�Ӽ���¼��һ���ַ���
 * 
 * (2)���ַ����д�д��ĸ���Сд��ĸ��Сд��ĸ��ɴ�д��ĸ�������ַ���"*"����,��ͳ����ĸ�ĸ���
 * 
 * ����: ����¼�룺Hello12345World
 * 
 * ��������hELLO*****wORLD �ܹ�10����ĸ
 * 
 * @author Ulric
 *
 */

public class Addition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String string = scanner.nextLine();

		String newStr = "";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isUpperCase(ch)) {// ���Ϊ��д��ĸ��תΪСд
				newStr += (char) (ch + 32);
				count++;
			} else if (Character.isLowerCase(ch)) {// ���ΪСд��ĸ��תΪ��д
				newStr += (char) (ch - 32);
				count++;
			} else {// �����һ��"*"��newStr��
				newStr += "*";
			}
		}
		System.out.println(newStr + "�ܹ�" + count + "����ĸ");
	}

	// #1 StringBuilder
//	public static int changeAndCount(StringBuilder stringBuilder) {
//		// StringBuilder stringBuilder = new
//		// StringBuilder(stringBuilder.toString());
//		String strData = stringBuilder.toString();
//		int count = 0;
//		for (int i = 0; i < strData.length(); i++) {
//			char ch = strData.charAt(i);
//			if (Character.isUpperCase(ch)) {// ���Ϊ��д��ĸ��תΪСд֮��ӵ�stringBuilder��
//				stringBuilder.append(ch + 32);
//				count++;
//			} else if (Character.isLowerCase(ch)) {// ���ΪСд��ĸ��תΪ��д
//				stringBuilder.append(ch - 32);
//				count++;
//			} else {// �����һ��"*"��stringBuilder��
//				stringBuilder.append("*");
//			}
//		}
//		// str = stringBuilder.toString();
//		return count;
//	}

	// #2 String
	// public static int changeAndCount(String str){
	// int count = 0;
	// for (int i = 0; i < str.length(); i++) {
	//
	// }
	// return count;
	//
	// }

}
