package com.itheima.q3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 3.  创建文本  data.txt,
 * 		内容自己添加,不做要求
 *  	使用IO流,把 data.txt 中的字母写入text.txt中
 *    	如: data.txt 内容   a伍永超B天高云淡c
 *		写入  text.txt 中的是      aBc
 */

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("data.txt"));
		bWriter.write("data儿童浴巾.txt\r\nHello后端World!");
		bWriter.close();

		BufferedReader bReader = new BufferedReader(new FileReader("data.txt"));
		bWriter = new BufferedWriter(new FileWriter("text.txt"));

		// char ch;
		// while ((ch = (char) (bReader.read())) != -1){
		// 如果ch为char型的话，读取到最末尾会变为空，永远不会等于-1，陷入死循环
		int ch;
		while ((ch = bReader.read()) != -1) {
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				bWriter.write(ch);
			}
		}
		bReader.close();
		bWriter.close();

	}

}
