package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
分析以下需求，并用代码实现
项目根路径下有text.txt文件，内容如下：
我爱黑马
123456
利用IO流的知识读取text.txt文件的内容反转后写入text.txt文件中
写入后文件的内容为:
654321
马黑爱我
 */

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> aList = new ArrayList<>();
		BufferedReader bReader = new BufferedReader(new FileReader("text.txt"));

		String readLn;
		while ((readLn = bReader.readLine()) != null) {
			// sBuilder = new StringBuilder(readLn);
			// bWriter.write(sBuilder.reverse().toString());
			// bWriter.newLine();
			// bWriter.flush();
//			System.out.println(readLn);
			aList.add(readLn);
		}
		// System.out.println(bReader.readLine());
		// System.out.println(bReader.readLine());
		// System.out.println(bReader.readLine());
		bReader.close();

		BufferedWriter bWriter = new BufferedWriter(new FileWriter("text.txt"));
		for (int i = 0; i < aList.size(); i++) {
			bWriter.write(new StringBuilder(aList.get(i)).reverse().toString());
			bWriter.newLine();
			bWriter.flush();
		}

		bWriter.close();
	}

}
