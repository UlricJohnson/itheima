package com.itheima_01;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������һ�����ݣ�");
		int a = scanner.nextInt();
		System.out.println("������ڶ������ݣ�");
		int b = scanner.nextInt();
		
		if(a > b){
			System.out.println("�ϴ�ֵ�ǣ�" + a);
		}else{
			System.out.println("�ϴ�ֵ�ǣ�" + b);
		}
	}
}
