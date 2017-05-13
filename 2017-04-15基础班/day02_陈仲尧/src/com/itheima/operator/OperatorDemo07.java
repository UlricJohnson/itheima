package com.itheima.operator;

/**
 * �߼������
 * @author Ulric
 *
 */

public class OperatorDemo07 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		
		// ��λ�� &
		System.out.println((a > b) & (a > c));	
		System.out.println((a < b) & (a > c));
		System.out.println((a > b) & (a < c));
		System.out.println((a < b) & (a < c));
		System.out.println("-------------------");
		
		// ��λ�� |
		System.out.println((a > b) | (a > c));	
		System.out.println((a < b) | (a > c));
		System.out.println((a > b) | (a < c));
		System.out.println((a < b) | (a < c));
		System.out.println("-------------------");
		
		// ��� ^
		System.out.println((a > b) ^ (a > c));	
		System.out.println((a < b) ^ (a > c));
		System.out.println((a > b) ^ (a < c));
		System.out.println((a < b) ^ (a < c));
		System.out.println("-------------------");
		
		// �� !
		System.out.println(a > b);
		System.out.println(!(a > b));
		
	}
}
