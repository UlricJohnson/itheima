package com.itheima_02;

/**
 * �����ȡ���ֵ
 * @author Ulric
 *
 */

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������
		int[] arr = {12, 45, 67, 15, 38};
		
		// ���������
		int max = arr[0];
		
		// �������飬��ȡ����0����֮���Ԫ�ؽ��бȽ�
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		// ���max
		System.out.println("max: " + max);
	}

}
