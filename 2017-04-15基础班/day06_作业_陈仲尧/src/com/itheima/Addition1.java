package com.itheima;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * �����������󣬲��ô���ʵ��
 * 
 * (1).����¼��10����������������
 * 
 * (2).����һ������������������������,ż������������Ҳ�
 * 
 * (3).����һ��������ӡԭ����ʹ���������
 * 
 * (4).����һ����������һ��int�������飬������������ֻ����һ�ε����ּ�����
 * 
 * @author Ulric
 *
 */

public class Addition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// (1).����¼��10����������������
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������10������:");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		// (2).������������������,ż������������Ҳ�
		// (3).��ӡԭ����ʹ���������
		System.out.println("��������ǰ��");
		printArr(arr);
		// arr = reorganizeArr1(arr);//#1
		reorganizeArr2(arr);// #2
		System.out.println("���������");
		printArr(arr);

	}

	// (2)������������������,ż������������Ҳ�
	// #1(�Լ��뵽��) ����һ�������飬����ԭ���飬�������ŵ����������ߣ�ż���ŵ��ұߣ�����������
	public static int[] reorganizeArr1(int[] arr) {
		int[] newArr = new int[arr.length];
		int pointer = 0; // ָ��newArr���飬��Ԫ�طŵ���ָ��ָ���λ��
		for (int i = 0; i < arr.length; i++) { // �Ȱ����������ŵ�������
			if (arr[i] % 2 == 1) {
				newArr[pointer] = arr[i];
				pointer++;
			}
		}
		for (int i = 0; i < arr.length; i++) { // �ٰ�����ż���ŵ�������
			if (arr[i] % 2 == 0) {
				newArr[pointer] = arr[i];
				pointer++;
			}
		}
		return newArr;
	}

	/*
	 * #2 (��ʦ����)��������ָ��p1��p2��p1ָ���1��Ԫ�أ�p2ָ�����һ��Ԫ��
	 * 
	 * p1����ƶ�,p2��������p1ָ���Ԫ��Ϊż��ʱ���ж�p2ָ���Ԫ���Ƿ�Ϊ������
	 * 
	 * �����򻥻�����Ԫ�أ�����p2��ǰ�ƶ���p1������ֱ��p2ָ���Ԫ��Ϊ������Ȼ����л���
	 * 
	 * ���������p1����ƶ���p2������ѭ��������ѭ������Ϊp1<p2
	 */
	public static void reorganizeArr2(int[] arr) {
		// ����ָ��
		int pre = 0;
		int latter = arr.length - 1;
		for (pre = 0; pre < latter; pre++) {// preָ���0��ʼ�������
			if (arr[pre] % 2 == 0) {// ��preָ���Ԫ��Ϊż��
				// while (true) {// ѭ���ж�latterָ���Ԫ���Ƿ�Ϊ����
				// if (arr[latter] % 2 != 0) {// ���latterָ���Ԫ��Ϊ�������preָ���Ԫ�ػ���
				// int temp = arr[latter];
				// arr[latter] = arr[pre];
				// arr[pre] = temp;
				// latter--;
				// break;// ����latterѭ��
				// }
				// latter--;
				// }
				/*
				 * ��forѭ�����ܿ���pre<latter
				 */
				for (; pre < latter; latter--) {
					if (arr[latter] % 2 != 0) {// ���latterָ���Ԫ��Ϊ�������preָ���Ԫ�ػ���
						int temp = arr[latter];
						arr[latter] = arr[pre];
						arr[pre] = temp;
						break;// ����latterѭ��
					}
				}
			}
		}
	}

	// #3

	// (3)��ӡ����
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
