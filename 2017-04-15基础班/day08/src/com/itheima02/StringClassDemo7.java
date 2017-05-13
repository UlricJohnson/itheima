package com.itheima02;

/**
 * String trim()------ȥ���ַ������˿ո�
 * 
 * String[] split(String str)------����ָ�����ŷָ��ַ���
 * 
 * @author Ulric
 *
 */

public class StringClassDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// #1 String trim()
		String str1 = "helloworld";
		String str2 = "  helloworld  ";
		String str3 = "  hello  world  ";
		System.out.println("str1: " + str1);
		System.out.println("str1.trim(): " + str1.trim());
		System.out.println("str2: " + str2);
		System.out.println("str2.trim(): " + str2.trim());
		System.out.println("str3: " + str3);
		System.out.println("str3.trim(): " + str3.trim());
		System.out.println("--------------------------");

		// #2 String[] split(String str)
		// String string = "Ulric.Chan.Johnson";
		String string = "Ulric,Chan,Johnson";
		System.out.println("string: " + string);
		System.out.println("after split: ");
		/*
		 * split()����������Ӣ�ľ��Ϊ�ָ������ΪӢ�ľ����������ʽ�������⺬��
		 * 
		 * ��һ��Ҫ��Ӣ�ľ�����ָ���������Ҫת��
		 */
		// String[] stringArr = string.split("\\.");
		String[] stringArr = string.split(",");
		System.out.print("[");
		for (int i = 0; i < stringArr.length; i++) {
			if (i == stringArr.length - 1) {
				System.out.println(stringArr[i] + "]");
			} else {
				System.out.print(stringArr[i] + ", ");
			}
		}
	}

}
