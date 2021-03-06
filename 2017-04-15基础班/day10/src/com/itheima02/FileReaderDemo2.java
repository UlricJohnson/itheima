package com.itheima02;

import java.io.FileReader;
import java.io.IOException;

/*
 * public int read(char[] cbuf)
 * 字符数组形式读取文件"myFr2.txt"
 */

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("myFr2.txt");

		char[] chs = new char[1024];
		int lenth;
		while ((lenth = fReader.read(chs)) != -1) {
			// 每次都应该限制输出的长度为读取到的字符数组长度，因为可能上一次读取的字符数组长度更长，多余的没被覆盖的字符会再次输出
			System.out.print(new String(chs, 0, lenth));
		}
	}

}
