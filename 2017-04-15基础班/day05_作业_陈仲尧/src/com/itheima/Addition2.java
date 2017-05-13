package com.itheima;

import java.util.Scanner;

/**
 * �����������󣬲��ô���ʵ�� ���鳣������(һά����): �Ӽ���¼��7���������뵽������(��װ�ɷ���) ��ʵ����������
 * ��1���������(������������е�ÿһ��Ԫ��)(��װ�ɷ���) ��2�������ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)(��װ�ɷ���)
 * ��3������Ԫ���������(���ǰ�Ԫ�ضԵ�)(��װ�ɷ���) ��4��������(���ݼ���¼������,���������ж�Ӧ�����֣������)(��װ�ɷ���)
 * ��5������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)(��װ�ɷ���)
 * 
 * @author Ulric
 *
 */

public class Addition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] arr = generateDatas(); // ��������

		// ��1���������(������������е�ÿһ��Ԫ��)
		printArray(arr);

		// ��2�������ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
		printMaxAndMin(arr);

		// ��3������Ԫ���������(���ǰ�Ԫ�ضԵ�)
		invertedSequencePrint(arr);

		// ��4��������(���ݼ���¼������,���������ж�Ӧ�����֣������)
		System.out.print("(4).������������(0-6)��");
		int index1 = scanner.nextInt();
		int data = getDataAt(arr, index1);
		while (data == -1) {
			data = getDataAt(arr, index1);
		}
		System.out.println("arr[" + index1 + "]=" + data);

		// ��5������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
		System.out.print("5.������һ������:");
		int input = scanner.nextInt();
		int index2 = getIndexOf(arr, input);
		if (index2 == -1) {
			System.out.println(input + "�������ڸ������У�");
		} else {
			System.out.println(input + "������arr�е�һ�γ��ֵ�����λ��Ϊ��" + index2);
		}
	}

	// �Ӽ���¼��7���������뵽������(��װ�ɷ���)
	public static int[] generateDatas() {
		System.out.print("������7��������");
		Scanner scanner = new Scanner(System.in);
		int[] datas = new int[7];
		for (int i = 0; i < datas.length; i++) {
			datas[i] = scanner.nextInt();
		}
		return datas;
	}

	// ��1���������(������������е�ÿһ��Ԫ��)(��װ�ɷ���)
	public static void printArray(int[] arr) {
		System.out.print("(1).������飺");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) { // �����һ��Ԫ�ص������ʽ
				System.out.print("[" + arr[i] + ", ");
			} else if (i == arr.length - 1) { // ���һ��Ԫ�ص������ʽ
				System.out.println(arr[i] + "]");
			} else { // �м�Ԫ�ص������ʽ
				System.out.print(arr[i] + ", ");
			}
		}
	}

	// ��2�������ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)(��װ�ɷ���)
	public static void printMaxAndMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("(2).���ֵ��" + max + "\t��Сֵ��" + min);
	}

	// ��3������Ԫ���������(���ǰ�Ԫ�ضԵ�)(��װ�ɷ���)
	public static void invertedSequencePrint(int[] arr) {
		System.out.print("(3).���������");
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i == arr.length - 1) {
				System.out.print("[" + arr[i] + ", ");
			} else if (i == 0) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	// ��4��������(���ݼ���¼������,���������ж�Ӧ�����֣������)(��װ�ɷ���)
	public static int getDataAt(int[] arr, int index) {
		if (index > arr.length - 1) {
			System.out.print("����Խ�磡\n���������룺");
			return -1;
		} else if (index < 0) {
			System.out.print("�Ƿ����룡\n���������룺");
			return -1;
		} else {
			return arr[index];
		}

	}

	// ��5������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)(��װ�ɷ���)
	public static int getIndexOf(int[] arr, int input) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input) {
				return i;
			}
		}
		return -1;

	}

}
