package com.itheima01;

/**
 * ����һ��4λ��
 * 
 * ����
 * 
 * 1.ÿλ���ּ���5��Ȼ��ģ10���������
 * 
 * 2.�����ַ�ת
 * 
 * @author Ulric
 *
 */

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int compress(int data) {
		int[] dataArr = new int[4];
		dataArr[0] = data % 10;
		dataArr[1] = data / 10 % 10;
		dataArr[2] = data / 10 / 10 % 10;
		dataArr[3] = data / 10 / 10 / 10 % 10;
		for (int i = 0; i < dataArr.length; i++) {
			dataArr[i] += 5;
			dataArr[i] %= 10;
		}
		for (int i = 0, j = dataArr.length - 1; i < j; i++, j--) {
			int temp = dataArr[i];
			dataArr[i] = dataArr[j];
			dataArr[j] = temp;
		}
		data = dataArr[0] * Math.pow(10, 3) + dataArr[0] * Math.pow(10, 2) + dataArr[0] * Math.pow(10, 1) + dataArr[3];
		return data;
	}

}
