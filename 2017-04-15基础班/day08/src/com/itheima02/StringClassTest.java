package com.itheima02;

import java.util.Scanner;

/**
 * ģ���û���¼
 * 
 * @author Ulric
 *
 */

public class StringClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String userName = "admin";
		String password = "admin";

		int chances = 3;
		for (int i = 0; i < chances; i++) {
			System.out.println("�������¼�������룺");
			String usrN = scanner.next();
			String pwd = scanner.next();
			if (usrN.equals(userName) && pwd.equals(password)) {
				System.out.println("��¼�ɹ���");
				break;
			} else {
				if (i == 2) {// ���һ�ε�½ʧ��
					System.out.println("�˺��ѱ��������������Ա��ϵ��");
				} else {
					System.out.println("�û������������������" + (2 - i) + "�λ���");
				}
			}
		}
	}

	// public static boolean isCorrect(String usrN, String pwd) {
	//
	// return false;
	// }

}
