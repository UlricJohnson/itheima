package com.itheima01;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// ��������
		System.out.println("�������һ�����ݣ�");
		int a = scanner.nextInt();

		System.out.println("������ڶ������ݣ�");
		int b = scanner.nextInt();

		// ���÷���
		int max = getMax(a, b);

		// ������
		System.out.println("max:" + max);
	}

	public static int getMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
