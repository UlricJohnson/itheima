package com.itheima.demo2;

import java.util.Scanner;

/**
 * �����������������ж��Ƿ����
 * @author Ulric
 *
 */

public class ScannerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Equals? " + ((a == b) ? "Yes" : "No"));
	}

}
