package com.itheima;

/**
 * �����������󣬲��ô���ʵ��(ÿ��С������Ҫ��װ�ɷ���)
 * 
 * (1).����������֮��(������С��)
 * 
 * (2).�ж����������Ƿ����(������С��)
 * 
 * (3).��ȡ�������нϴ��ֵ(������С��)
 * 
 * (4).��ȡ�������н�С��ֵ(������С��)
 * 
 * (5).������һ������ʵ��3��4����������
 * 
 * @author Ulric
 *
 */

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// (1).����������֮��(������С��)
	public static int getSum(int a, int b) {
		return a + b;
	}

	public static double getSum(double a, double b) {
		return a + b;
	}

	// (2).�ж����������Ƿ����(������С��)
	public static boolean equals(int a, int b) {
		return a == b;
	}

	public static boolean equals(double a, double b) {
		return a == b;
	}

	// (3).��ȡ�������нϴ��ֵ(������С��)
	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}

	public static double getMax(double a, double b) {
		return a > b ? a : b;
	}

	// (4).��ȡ�������н�С��ֵ(������С��)
	public static int getMin(int a, int b) {
		return a < b ? a : b;
	}

	public static double getMin(double a, double b) {
		return a < b ? a : b;
	}

	// (5).�ܷ���һ������ʵ��3��4����������
	public static int getMaxOrMin(int a, int b, boolean getMax) {
		if (getMax) {
			return a > b ? a : b;
		} else {
			return a < b ? a : b;
		}
	}

	public static double getMaxOrMin(double a, double b, boolean getMax) {
		if (getMax) {
			return a > b ? a : b;
		} else {
			return a < b ? a : b;
		}
	}
}
