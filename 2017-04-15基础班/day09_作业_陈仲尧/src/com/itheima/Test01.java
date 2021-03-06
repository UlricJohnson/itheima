package com.itheima;

import java.util.ArrayList;

/**
 * 1. String[] strs =
 * {"12345","67891","12347809933","98765432102","67891","12347809933","2345","12345678998765432"}
 * 
 * a.将该数组里面的所有qq号(QQ号码最长为11位,最短为5位)都存放在list中
 * 
 * b.将list中重复元素删除
 * 
 * c.将list中所有元素打印出来
 * 
 * @author Ulric
 *
 */

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "12345", "67891", "12347809933", "98765432102", "67891", "12347809933", "2345",
				"12345678998765432" };

		ArrayList<String> arrayList = new ArrayList<>();

		// a.将该数组里面的所有qq号(QQ号码最长为11位,最短为5位)都存放在list中
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() <= 11 && strs[i].length() >= 5) {
				arrayList.add(strs[i]);
			}
		} // "12345", "67891", "12347809933", "98765432102", "67891",
			// "12347809933"

		// 将list中重复元素删除
		arrayList = deleteRepeatElement(arrayList);// "12345", "67891",
													// "12347809933",
													// "98765432102"

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

	}

	// 将list中重复元素删除
	public static ArrayList<String> deleteRepeatElement(ArrayList<String> arrayList) {
		ArrayList<String> newList = new ArrayList<String>();
		/*
		 * for (int i = 0; i < arrayList.size(); i++) { for (int j = 0; j <
		 * arrayList.size(); j++) { if
		 * ((arrayList.get(i)).equals(arrayList.get(j))) {
		 * 
		 * } } }
		 */

		// 遍历arrayList中的元素，如果newList中存在则跳过，否则加入newList中
		for (int i = 0; i < arrayList.size(); i++) {
			String string = arrayList.get(i);
			if (newList.contains(string)) {
				continue;
			}
			newList.add(string);
		}
		return newList;
	}

}
