package com.itheima_02;

/**
 * ��ά����
 * �����ʽ��3�֣�
 * 	1. datatype[][] name;
 * 	2. datatype name[][];
 * 	3. datatype[] name[];
 * @author Ulric
 *
 */

public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dyadicArray = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		System.out.println(dyadicArray);	// [[I@15db9742	--- ǰ�������������ţ���ʾ�õ�ַ�洢���Ƕ�ά����
		System.out.println(dyadicArray[0]);	// [I@6d06d69c --- һά����ĵ�ַǰ����ֻ��һ��������
		System.out.println(dyadicArray[1]); // [I@7852e922
		System.out.println(dyadicArray[2]); // [I@4e25154f
	}

}
