package com.itheima01;

/**
 * ������������
 * 
 * @author Ulric
 *
 */

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[20];

		//
		arr[0] = arr[1] = 1;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		System.out.println("��20���º����ӵĶ����ǣ�" + arr[19]);
	}

	// ������
	public static int getRabbit(int month) {
		int[] arr = new int[month];
		arr[0] = arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[month - 1];
	}

}
