package com.itheima;

import java.util.Scanner;

/**
 * 1. ����¼��һ�������εĳ��Ϳ� 
   Ҫ��
	1. ���㳤���������(��*��)
    2. ���㳤���ε��ܳ�((��+��)*2)��
 * @author Ulric
 *
 */

public class Addition1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������볤�Ϳ�");
		int length = scanner.nextInt();
		int width = scanner.nextInt();
		System.out.println("�����" + length * width + "\n�ܳ���" + (length + width)*2);
	}
}
