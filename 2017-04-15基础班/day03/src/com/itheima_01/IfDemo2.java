package com.itheima_01;

import java.util.Scanner;

public class IfDemo2 {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		
		Scanner scanner = new Scanner(System.in);
		
		// ��������
		System.out.print("������һ��������");
		int a = scanner.nextInt();
		
		if(a % 2 == 0){
			System.out.println("ż��");
		}else{
			System.out.println("����");
		}
		
		System.out.println("����");
	}
}
