package com.itheima01;

import java.util.Scanner;

/**
 * ��ת����
 * 
 * @author Ulric
 *
 */

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������Ԫ�ظ�����");
		int numOfEles = scanner.nextInt();
		int[] arr = new int[numOfEles];

		System.out.println("����������" + numOfEles + "��Ԫ��");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.print("��ת����ǰ��");
		printArr(arr);

		reverse(arr);

		System.out.print("��ת�����");
		printArr(arr);

	}

	// ��ת����
	public static void reverse(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	// �������
	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

}
