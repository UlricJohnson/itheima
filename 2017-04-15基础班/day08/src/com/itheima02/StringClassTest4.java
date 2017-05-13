package com.itheima02;

/**
 * ���ַ�����ת�ַ���
 * 
 * @author Ulric
 *
 */

public class StringClassTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "HelloWorld";
		System.out.println("ԭ���� " + string);
		System.out.println("---------------------------------");
		System.out.println("length() + charAt() ������ת�ַ����� " + stringReverse1(string));
		System.out.println("---------------------------------");
		System.out.println("toCharArray() + String(char[] chs) ������ת�ַ����� " + stringReverse2(string));
	}

	// #1 length() + charAt()
	public static String stringReverse1(String str) {
		String string = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			string += str.charAt(i);
		}
		return string;
	}

	// #2 toCharArray() + String(char[] chs)
	public static String stringReverse2(String str) {
		char[] chs = str.toCharArray();
		for (int i = 0, j = chs.length - 1; i < j; i++, j--) {
			char temp = chs[i];
			chs[i] = chs[j];
			chs[j] = temp;
		}
		return new String(chs);
	}
}
