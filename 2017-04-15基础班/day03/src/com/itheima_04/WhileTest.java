package com.itheima_04;

/**
 * while�ṹʵ��1-100���ۼ�
 * @author Ulric
 *
 */

public class WhileTest {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i <= 100){
			sum += i;
			i++;
		}
		System.out.println("1+2+3+...+100=" + sum);
	}
}
