package com.itheima01;

import java.util.Scanner;

public class MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// ��������
		System.out.println("�������һ�����ݣ�");
		int a = scanner.nextInt();

		System.out.println("������ڶ������ݣ�");
		int b = scanner.nextInt();

		System.out.println("��������������ݣ�");
		int c = scanner.nextInt();

		// ���÷���
		int max = getMax(a, b, c);

		// ������
		System.out.println("max:" + max);
	}

	public static int getMax(int a, int b, int c) {
		if (a > b) {
			return a > c ? a : c;
		} else {
			return b > c ? b : c;
		}
	}

}
