package com.itheima01;

public class MethodDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.��������
//		sum(10, 20);	// ������
		
		// 2.�������
		System.out.println(sum(30, 40));
		
		// 3.��ֵ����
		int result = sum(50, 60);
		result +=10;	// ���ԶԷ��ؽ�����в���
		System.out.println(result);
		
	}

	public static int sum(int a, int b) {
		return a + b;
	}

}
