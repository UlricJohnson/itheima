package com.itheima;

import java.util.Scanner;

/**
 * 1. �����������󣬲��ô���ʵ��
    (1).����¼��һ����λ����������ֱ��ȡ����λ����ÿһλ����ֵ
    (2).���磺����¼�������123�ĸ�λ��ʮλ����λ���ֱ���3��2��1
    (3).��ӡ��ʽ:"����123�ĸ�λ�� 3, ʮλ�� 2, ��λ�� 1"
 * @author Ulric
 *
 */

public class Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// #1
		System.out.println("������һ����λ��: ");
		int num = scanner.nextInt();
		String str = "" + num;
		char[] chs = str.toCharArray();
		System.out.println("����" + num + "�ĸ�λ��" + chs[2]
				+ ", ʮλ��" + chs[1] + ", ��λ��" + chs[0]);
		
		// #2
//		System.out.println("������һ������(10λ������): ");
//		String str = scanner.nextLine();
//		char[] chs = str.toCharArray();
//		String[] strs = {"��", "ʮ", "��", "ǧ", "��", "ʮ��", "����", "ǧ��","��","ʮ��"};
//		System.out.println("����" + str + "�ĸ�λ��" + chs[2]
//				+ ", ʮλ��" + chs[1] + ", ��λ��" + chs[0]);
		
	}
}
