package com.itheima;

import java.util.Scanner;

/**
 * 4��
�����������󣬲��ô���ʵ��

         (1).����¼��һ��ѧ���ɼ�(int����)

         (2).�жϸ�ѧ���ɼ��Ƿ񼰸�

         (3).��ӡ��ʽ��

                   �ɼ�>=60:��ӡ"�ϸ�"

                   �ɼ�<60:��ӡ"���ϸ�"
 * @author Ulric
 *
 */

public class Exercise4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ɼ���");
		int score = scanner.nextInt();
		System.out.println(score >= 60 ? "�ϸ�" : "���ϸ�");
	}
}
