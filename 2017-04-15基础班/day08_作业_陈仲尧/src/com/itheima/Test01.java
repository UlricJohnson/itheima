package com.itheima;

import java.util.Scanner;

/**
 * 1. ������������,���ô���ʵ��
 * 
 * (1).����¼��һ���ַ���
 * 
 * (2).�����ַ�������ַ�����(����ʹ��toCharArray()����)
 * 
 * (3).���ַ������е����д�д��ĸ���Сд��ĸ(����ʹ��toLowerCase()����)
 * 
 * (4).�����һλ�����һλ�����ݲ���ͬ,�򽻻�
 * 
 * (5).���ַ�����������Ϊż����Ԫ�ر��'~'
 * 
 * (6).��ӡ����Ԫ�ص�����
 * 
 * @author Ulric
 *
 */

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1).����¼��һ���ַ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String string = scanner.nextLine();

		// (2).���ַ�������ַ�����
		char[] chs = strToCharArr(string);

		// (3).���ַ������е����д�д��ĸ���Сд��ĸ
		chArrToLowerCase(chs);

		// (4).�����һλ�����һλ�����ݲ���ͬ,�򽻻�
//		print(chs);
		exchange(chs);
//		print(chs);

		// (5).���ַ�����������Ϊż����Ԫ�ر��'~'
		changeEven(chs);

		// (6).��ӡ����Ԫ�ص�����
		print(chs);

	}

	// (2).���ַ�������ַ�����
	public static char[] strToCharArr(String str) {
		char[] chs = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			chs[i] = str.charAt(i);
		}
		return chs;
	}

	// (3).���ַ������е����д�д��ĸ���Сд��ĸ
	public static void chArrToLowerCase(char[] chs) {
		for (int i = 0; i < chs.length; i++) {
			if (chs[i] > 'A' && chs[i] < 'Z') {
				chs[i] += 32;// ��д��ĸASCII��ֵ+32תΪСд��ĸ
			}
		}
	}

	// (4).�����һλ�����һλ�����ݲ���ͬ,�򽻻�
	public static void exchange(char[] chs) {
		if (chs[0] != chs[chs.length - 1]) {
			char temp = chs[0];
			chs[0] = chs[chs.length - 1];
			chs[chs.length - 1] = temp;
		}
	}

	// (5).���ַ�����������Ϊż����Ԫ�ر��'~'
	public static void changeEven(char[] chs) {
		for (int i = 0; i < chs.length; i += 2) {
			chs[i] = '~';
		}
	}

	// (6).��ӡ����Ԫ�ص�����
	public static void print(char[] chs) {
		System.out.print("[");
		for (int i = 0; i < chs.length; i++) {
			if (i == chs.length - 1) {
				System.out.println(chs[i] + "]");
			} else {
				System.out.print(chs[i] + ", ");
			}
		}
	}

}
