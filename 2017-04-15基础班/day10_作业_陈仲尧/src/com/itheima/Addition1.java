package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 1. 
分析以下需求，并用代码实现
         项目根路径下有个questions.txt文件内容如下：
5+5
150-25
155*155
2555/5
         要求：读取内容计算出结果，将结果写入到results.txt文件中
       5+5=10
   //....
        提示: 
		1. 使用+,-,*,/切割字符串;需要加转义符;举例:  String[] strs = "5+5".split("\\+");
		2. 把字符串数字,转换为int类型的数字,需要使用 int num = Integer.parseInt("5");
			
		思考:如果说读取questions.txt文件的内容,算出计算结果,再写入questions.txt文件,即读和写的操作时针对同一个文件,应该如何操作
 */

public class Addition1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> answsList = new ArrayList<>();
		BufferedReader bReader = new BufferedReader(new FileReader("questions.txt"));

		// #1 获取字符串后逐个字符扫描
		// String readLn;
		// while ((readLn = bReader.readLine()) != null) {
		// String firstNum;
		// String secNum;
		// int flag;// 0表示+ 1表示- 2表示* 3表示/
		// // for (int i = 0; i < readLn.length(); i++) {
		// //
		// if(Character.isDigit(readLn.charAt(i))){//如果识别到为数字，则加入firstNum或者secNum
		// //
		// // }
		// // }
		// int i = 0;
		// while (Character.isDigit(readLn.charAt(i))) {//
		// 第一轮扫描，如果识别到为数字，则加入firstNum
		//
		// }
		// }

		// #2 使用+,-,*,/切割字符串
		String readLn;
		while ((readLn = bReader.readLine()) != null) {
			String[] strings;
			if (readLn.contains("+")) {
				strings = readLn.split("\\+");
				answsList.add(readLn + "=" + (Integer.parseInt(strings[0]) + Integer.parseInt(strings[1])));
			} else if (readLn.contains("-")) {
				strings = readLn.split("\\-");
				answsList.add(readLn + "=" + (Integer.parseInt(strings[0]) - Integer.parseInt(strings[1])));
			} else if (readLn.contains("*")) {
				strings = readLn.split("\\*");
				answsList.add(readLn + "=" + (Integer.parseInt(strings[0]) * Integer.parseInt(strings[1])));
			} else {
				strings = readLn.split("\\/");
				answsList.add(readLn + "=" + (Integer.parseInt(strings[0]) / Integer.parseInt(strings[1])));
			}

		}
		bReader.close();

		BufferedWriter bWriter = new BufferedWriter(new FileWriter("questions.txt"));
		for (int i = 0; i < answsList.size(); i++) {
			bWriter.write(answsList.get(i));
			bWriter.newLine();
			bWriter.flush();
		}
		bWriter.close();
	}

}
