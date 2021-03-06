package com.itheima.q3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 3. 获取数组中满足条件的元素和个数,用io 流写入文本,具体要求如下:
 * 	  1.定义一个数组,包含元素 { 1,3,7,10,35,45,60 };
 *    2.获取数组中数组角标和对应元素都为奇数的元素与个数,存储在项目根目录下的test.txt  文 本 中,格式如下:
 *       数组中数组角标和对应元素都为奇数的数是:  3,45.
 *       符合条件的个数有: 2个
 *    3.再将存到test.txt中的内容用IO流读取到控制台.
 *    4.注意:格式与存入test.txt文本的格式要一致
 *       数组中数组角标和对应元素都为偶数的数是:  3,45.
 *       符合条件的个数有: 2个
 */

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("test.txt"));
		BufferedReader bReader = new BufferedReader(new FileReader("test.txt"));
		int[] arr = { 1, 3, 7, 10, 35, 45, 60 };

		// 2.获取数组中数组角标和对应元素都为奇数的元素与个数
		String string = "";
		int count = 0;
		for (int i = 1; i < arr.length; i += 2) {// 控制索引为奇数
			if (arr[i] % 2 != 0) {// 如果元素为奇数
				if (string == "") {
					string += arr[i];
				} else {
					string += "," + arr[i];
				}
				count++;
			}
		}
		string += ".";

		// 写入文本
		bWriter.write("数组中数组角标和对应元素都为奇数的数是:  " + string + "\r\n");
		bWriter.write("符合条件的个数有: " + count + "个");

		bWriter.close();

		// 读取文本到控制台
		String bReaderStrLn;
		while ((bReaderStrLn = bReader.readLine()) != null) {
			System.out.println(bReaderStrLn);
		}

		bReader.close();

	}

}
