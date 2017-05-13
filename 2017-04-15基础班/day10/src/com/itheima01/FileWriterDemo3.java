package com.itheima01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 1.void write(String str):д��str�ַ�������
 * 2.void write(String str,int index,int len):д��str�ַ����д�index������ʼ��len���ַ�
 * 3.void write(int ch):д��ch�ַ�
 * 4.void write(char[] chs):���д��chs�ַ�����Ԫ��
 * 5.void write(char[] chs,int index,int len):д��chs�ַ������д�index������ʼ��len���ַ�
 */

public class FileWriterDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fWriter = new FileWriter("test2.txt");// д����Ŀ��Ŀ¼

		// 1.void write(String str)
		fWriter.write("HelloWorld!");
		fWriter.write("\r\n-----------------\r\n");// windows�л���

		// 2.void write(String str,int index,int len)
		fWriter.write("HelloWorld!", 0, 11);
		fWriter.write("\r\n");
		fWriter.write("HelloWorld!", 0, 5);
		fWriter.write("\r\n-----------------\r\n");

		// 3.void write(int ch)
		fWriter.write('A');
		fWriter.write("\r\n");
		fWriter.write(97);
		fWriter.write("\r\n-----------------\r\n");

		// 4.void write(char[] chs)
		char[] chs = { 'c', 'h', 'a', 'r', 's', 'b', 'u', 'f' };
		fWriter.write(chs);
		fWriter.write("\r\n-----------------\r\n");

		// 5.void write(char[] chs,int index,int len)
		fWriter.write(chs, 0, 5);
		fWriter.write("\r\n");
		fWriter.write(chs, 1, 3);

		fWriter.close();
	}

}
