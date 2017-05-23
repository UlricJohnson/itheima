package com.itheima;

public class Test7 {

	public static void main(String[] args) {
		print(9, 9);
	}

	public static void print(int row, int col) {// 9,9
		// i == 0-8
		for (int i = 0; i < col; i++) {
			// j == 8-1 -> 1-1 -> 0-1(不满足条件) --- 执行8次循环
			for (int j = row - i - 1; j > 0; j--) {// 控制打印前面的空格
				System.out.print(" ");
			}
			
			// j == 1-1 -> 1-9 --- 执行9次循环
			for (int j = 1; j <= i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
