package com.itheima02;

import java.util.ArrayList;

/**
 * 题目:数组中的元素添加到集合中，并把所有姓张的人员打印到控制台上
 * 
 * @author Ulric
 *
 */

public class ArrayListTest2 {
	public static void main(String[] args) {
		// 1. 定义字符串数组
		String[] strings = { "张三丰", "宋远桥", "张无忌", "殷梨亭", "张翠山", "莫声谷" };

		// 2. 创建集合对象
		ArrayList<String> arrayList = new ArrayList<>();

		// 3. 遍历字符串数组，获取到每一个字符串元素
		// 4. 把获取到的字符串元素添加到集合
		for (int i = 0; i < strings.length; i++) {
			arrayList.add(strings[i]);
		}

		// 5. 遍历集合 判断每一个字符串元素是否以"张"开头，使用startWith方法
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).startsWith("张")) {
				System.out.println(arrayList.get(i));
			}
		}
	}
}
