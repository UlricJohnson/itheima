package com.itheima03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ����ַ���ȡд�룬�����ļ�
 */

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("FileWriterDemo.java");
		FileWriter fWriter = new FileWriter("Copy.java");

		int ch;
		while ((ch = fReader.read()) != -1) {
			fWriter.write(ch);
		}

		fReader.close();
		fWriter.close();
	}

}
