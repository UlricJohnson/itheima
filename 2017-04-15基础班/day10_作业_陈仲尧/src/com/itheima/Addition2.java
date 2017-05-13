package com.itheima;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 2. 有一个数组 String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
	a. 创建一个ArrayList，将数组里面的元素添加进去，但元素不能重复 (该数组不变)
	b. 将数组里面的所有元素存入到项目根目录下的String.txt文件中
 */

public class Addition2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> aList = new ArrayList<>();
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("String.txt"));

		String arr[] = { "abc", "bad", "abc", "aab", "bad", "cef", "jhi" };

		for (int i = 0; i < arr.length; i++) {
			if (!aList.contains(arr[i])) {
				aList.add(arr[i]);
			}
			bWriter.write(arr[i]);
			bWriter.newLine();
			bWriter.flush();
		}
		bWriter.close();

	}

}
