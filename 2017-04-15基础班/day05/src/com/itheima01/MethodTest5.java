package com.itheima01;

/**
 * ����һ����������ӡˮ�ɻ�����ͳ�Ƹ���
 * 
 * @author Ulric
 *
 */

public class MethodTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		daffodil();
	}

	public static void daffodil() {
		int count = 0;
		for (int i = 100; i < 1000; i++) {
			int digit = i % 10;
			int tensDigit = i / 10 % 10;
			int hundredsDigit = i / 10 / 10 % 10;
			if (Math.pow(digit, 3) + Math.pow(tensDigit, 3) + Math.pow(hundredsDigit, 3) == i) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("ˮ�ɻ���������" + count);
	}

}
