package com.itheima;

import java.util.Scanner;

/**
 * 2. ����¼��Բ�εİ뾶
   Ҫ��
    1. ����Բ�ε��ܳ�(2��r)
	2. ����Բ�ε����(��r��ƽ��)��
 * @author Ulric
 *
 */

public class Addition2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������뾶��");
		double r = scanner.nextDouble();
		System.out.println("�ܳ���" + 2 * Math.PI * r + "\n�����" + Math.PI * r * r);
	}
}
