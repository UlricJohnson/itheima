package com.itheima03;

/**
 * ���巽����ȡ�����е����ֵ
 * @author Ulric
 *
 */

public class MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 24, 36, 90, 75, 81 };
		System.out.println("max:" + getMax(arr));
	}
	
	//��ȡ�����е����ֵ
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
