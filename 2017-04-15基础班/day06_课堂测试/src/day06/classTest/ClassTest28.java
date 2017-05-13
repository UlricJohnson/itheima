package day06.classTest;

import java.util.Scanner;

/**
 * (1).����¼��10��int���͵�����,����10�������洢��һ��int���͵�һά����arr�С�
 * 
 * (2).��arr�����е����ݷ�ת
 * 
 * (3).����һ�����������������Ԫ�صĺ�,�������������Ԫ��Ϊ�����ĸ���������ӡ������
 * 
 * ��ʽΪ������Ԫ�صĺ���100��������Ԫ��Ϊ�����ĸ�����3��
 * 
 * (4).����һ������������һ���������鿴�������Ƿ��������д��ڡ���������ڣ���������������������в����ڡ�������ڣ�������������������д��ڵĸ�����
 * 
 * @author Ulric
 *
 */

public class ClassTest28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// (1).����¼��10��int���͵�����,����10�������洢��һ��int���͵�һά����arr�С�
		System.out.print("������10��������");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		// (2).��arr�����е����ݷ�ת
		System.out.print("��תǰ�����飺");
		printArr(arr);
		reverse(arr);
		System.out.print("��ת������飺");
		printArr(arr);

		// (3)���������Ԫ�صĺ�,�������������Ԫ��Ϊ�����ĸ���������ӡ������
		System.out.println("����Ԫ�صĺ���" + getSum(arr) + ",������Ԫ��Ϊ�����ĸ�����" + getNumOfOdd(arr) + "��");

		// (4)����һ���������鿴�������Ƿ��������д���
		System.out.print("������һ��������");
		int input = scanner.nextInt();
		int count = whetherExist(arr, input);
		if (count > 0) { // ������ڸ�����
			System.out.println("�������������д��ڵĸ���Ϊ��" + count);
		} else {
			System.out.println("�������������в�����");
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

	// ��ת����
	public static void reverse(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	// �������
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// ������������Ԫ�ظ���
	public static int getNumOfOdd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	// ͳ��Ԫ���������г��ֵĴ���,�������򷵻�0
	public static int whetherExist(int[] arr, int val) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				count++;
			}
		}
		return count;
	}
}
