package com.itheima01;

/**
 * ���5λ���е����л�����
 * 
 * @author Ulric
 *
 */

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10000; i < 100000; i++) {
			int digit = i % 10; // ��λ
			int tensDigit = i / 10 % 10;// ʮλ
			int thousandsDigit = i / 10 / 10 / 10 % 10;// ǧλ
			int tenThousandsDigit = i / 10 / 10 / 10 / 10 % 10;// ��λ
			
		}
	}

}
