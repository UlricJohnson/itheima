package com.itheima01;

import java.util.Scanner;

/**
 * ��ί��֣�ȥ����߷ֺ���ͷֺ����ƽ����
 * 
 * @author Ulric
 *
 */

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ֱ�����10����ί������(0-10)��");
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("ȥ����߷ֺ���ͷֺ��ƽ������Ϊ��" + ((getSum(arr) - getMax(arr) - getMin(arr)) / (arr.length - 2)));

	}

	// ���
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// �����ֵ
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// ����Сֵ
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
