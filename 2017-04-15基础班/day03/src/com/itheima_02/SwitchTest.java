package com.itheima_02;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������һ�����֣�1-7����");
		int weekday = scanner.nextInt();
		
		switch (weekday) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("������");
			break;
		case 6:
		case 7:
			System.out.println("��Ϣ��");
			break;
		default:
			System.out.println("���������������");
			break;
		}
	}

}
