package com.itheima02;

/**
 * ���ַ���������ĸ��д������Сд
 * 
 * @author Ulric
 *
 */

public class StringClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Hello, CJ-McColumn 684#%^*";

		String firstLetter = string.substring(0, 1);
		String remainder = string.substring(1);

		System.out.println("ת����" + firstLetter.toUpperCase() + remainder.toLowerCase());
	}

}
