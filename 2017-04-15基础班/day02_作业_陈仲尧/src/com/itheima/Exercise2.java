package com.itheima;

import java.util.Scanner;

/**
 * 2�������������󣬲��ô���ʵ��

         (1).����¼������int���͵�����

         (2).Ҫ��

                   a.����������е���Сֵ����ӡ

                   b.����������ĺͲ���ӡ
 * @author Ulric
 *
 */

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������3��int���͵�����: ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int temp = a < b ? a : b;		// ����Сֵ
		int min = temp < c ? temp : c;
		
		System.out.println("��СֵΪ��" + min + "\n��Ϊ��" + (a+b+c));
	}
}
