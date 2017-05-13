package com.itheima03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符数组形式读写复制文件
 */

public class CopyFileDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("FileWriterDemo.java");
		FileWriter fWriter = new FileWriter("Copy2.java");

		char[] chs = new char[1024];
		int length;
		while ((length = fReader.read(chs)) != -1) {
			// fWriter.write(new String(chs, 0, length));
			fWriter.write(chs);
		}
		fWriter.close();
		fReader.close();

	}

}
