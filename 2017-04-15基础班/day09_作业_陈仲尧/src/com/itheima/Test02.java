package com.itheima;

import java.util.ArrayList;

/**
 * 2. 分析以下需求，并用代码实现
 * 
 * (1).定义ArrayList集合，存入多个字符串 如:"ab1" "123ad" "bca" "dadfadf" "dddaaa" "你好啊"
 * "我来啦" "别跑啊"
 * 
 * (2).遍历集合,删除长度大于5的字符串,打印删除后的集合对象
 * 提示:可以将原集合中所有长度大于5的字符串放入到新集合中,遍历新集合,新集合中的元素就是要删除的元素
 * 
 * (3).基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
 * 
 * 提示: a.定义public static boolean myContains(String str)方法
 * 
 * 功能: 判断str中是否包含0到9的数字
 * 
 * 包含:返回true 不包含:返回false
 * 
 * b.遍历原集合利用myContains方法将所有包含0-9的字符串放入新集合中
 * 
 * c.新集合中的元素就是要删除的元素
 * 
 * @author Ulric
 *
 */

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("ab1");
		arrayList.add("123ad");
		arrayList.add("bca");
		arrayList.add("dadfadf");
		arrayList.add("dddaaa");
		arrayList.add("你好啊");
		arrayList.add("我来啦");
		arrayList.add("别跑啊");

		// 删除长度大于5的字符串
		// arrayList = deleteLongerThan_1(arrayList, 5);
		deleteLongerThan_2(arrayList, 5);
		System.out.println(arrayList);

		// 删除集合中元素包含0-9数字的字符串
		ArrayList<String> listContainDigit = new ArrayList<String>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (myContains(arrayList.get(i))) {
				listContainDigit.add(arrayList.get(i));
			}
		}
		System.out.println(listContainDigit);

		// //删除集合中元素包含0-9数字的字符串
		// for (int i = 0; i < arrayList.size(); i++) {
		// if(listContainDigit.contains(arrayList.get(i))){
		//
		// }
		// }

	}

	// 遍历集合,删除长度大于maxLength的字符串
	// #1 创建并返回处理后的集合
	public static ArrayList<String> deleteLongerThan_1(ArrayList<String> arrayList, int maxLength) {

		ArrayList<String> newList = new ArrayList<>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).length() > maxLength) {
				continue;
			} else {
				newList.add(arrayList.get(i));
			}
		}
		return newList;
	}

	// #2 利用for循环在原集合上进行操作
	public static void deleteLongerThan_2(ArrayList<String> arrayList, int maxLength) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).length() > maxLength) {// "dadfadf", "dddaaa"
				arrayList.remove(arrayList.get(i));
				i--;
			}
		}
	}

	// 判断str中是否包含0到9的数字
	public static boolean myContains(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				return true;
			default:
				break;
			}
		}
		return false;
	}
}
