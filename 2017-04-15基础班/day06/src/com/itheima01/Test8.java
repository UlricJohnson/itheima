package com.itheima01;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * ���ز���Ԫ���������е�����
 * 
 * @author Ulric
 *
 */

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 7, 3, 2, 5 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("������Ҫ��ѯ�����ݣ�");
		int index = getIndex(arr, scanner.nextInt());
		if (index == -1) {
			System.out.println("����ʧ�ܣ�");
		} else {
			System.out.println("index:" + index);
		}
	}

	// ��ȡԪ���������е�����������ʧ�ܷ���-1
	public static int getIndex(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		return -1;
	}

}
