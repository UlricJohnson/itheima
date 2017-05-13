package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 1. 分析以下需求，并用代码实现

     (1).将e:\\a.txt复制到d:\\根目录下

     (2).用多种方式实现复制

       a.使用字符流单字符循环复制

       b.使用字符流利用字符数组实现复制

       c.使用高效字符缓冲流实现复制
 */

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("e:\\a.txt");
		FileWriter fWriter = new FileWriter("d:\\a.txt");

		// a.使用字符流单字符循环复制
		// int ch;
		// while ((ch = fReader.read()) != -1) {
		// fWriter.write((char) ch);
		// }

		// b.使用字符流利用字符数组实现复制
		// char[] chs = new char[1024];
		// int len;
		// while ((len = fReader.read(chs)) != -1) {
		// fWriter.write(chs, 0, len);
		// }

		fReader.close();
		fWriter.close();

		// c.使用高效字符缓冲流实现复制
		BufferedReader bReader = new BufferedReader(new FileReader("e:\\a.txt"));
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("d:\\a.txt"));

		String readLn;
		while ((readLn = bReader.readLine()) != null) {
			bWriter.write(readLn);
			bWriter.newLine();
			bWriter.flush();
		}
		bReader.close();
		bWriter.close();

	}

}
