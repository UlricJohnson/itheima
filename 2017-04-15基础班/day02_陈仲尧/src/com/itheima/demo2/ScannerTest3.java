package com.itheima.demo2;

import java.util.Scanner;

/**
 * ��������3������������ֵ
 * @author Ulric
 *
 */

public class ScannerTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������3��������");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int temp = a > b ? a : b;
		int max = temp > c ? temp : c;
		System.out.println("the maximum: " + max);
	}
}
