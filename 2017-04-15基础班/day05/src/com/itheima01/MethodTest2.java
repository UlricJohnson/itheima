package com.itheima01;

import java.util.Scanner;

public class MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// ��������
		System.out.println("�������һ�����ݣ�");
		int x = scanner.nextInt();

		System.out.println("������ڶ������ݣ�");
		int y = scanner.nextInt();

		// ���÷���
		boolean result = compare(x, y);

		// ������
		System.out.println("result:" + result);

	}

	public static boolean compare(int a, int b) {
		return a == b ? true : false;
	}

}
