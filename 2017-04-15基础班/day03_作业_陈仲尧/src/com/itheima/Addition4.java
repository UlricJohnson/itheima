package com.itheima;

import java.util.Scanner;

/**
 * ���������ֵ���ж������ڼ���(�ֱ���if����switch���ʵ��)
	���룺1	 
	���������1	
 * @author Ulric
 *
 */

public class Addition4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������һ������(1-7)��");
		byte num = scanner.nextByte();
		
		// #1 if���ʵ��
		if (num == 1) {
			System.out.println("����һ");
		} else if(num == 2){
			System.out.println("���ڶ�");
		}else if(num == 3){
			System.out.println("������");
		}else if(num == 4){
			System.out.println("������");
		}else if(num == 5){
			System.out.println("������");
		}else if(num == 6){
			System.out.println("������");
		}else if(num == 7){
			System.out.println("������");
		}else{
			System.out.println("�Ƿ����룡");
		}
		
		System.out.println("------------------------");
		
		// #2 switch���ʵ��
		switch (num) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("�Ƿ����룡");
			break;
		}
	}

}
