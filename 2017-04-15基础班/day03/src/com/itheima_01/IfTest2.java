package com.itheima_01;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������ĳɼ���0-100����");
		short score = scanner.nextShort();
		if(score < 0 || score > 100){
			System.out.print("�������");
		}else if(score >= 90){
			System.out.println("���㣡");
		}else if(score >= 80){
			System.out.println("�ã�");
		}else if(score >= 70){
			System.out.println("����");
		}else if(score >= 60){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
	}
}
