package com.itheima;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
	public static void main(String[] args) {
		Collection<String> list = new ArrayList<>();

		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");

		System.out.println(frequency(list, "a")); // 3
		System.out.println(frequency(list, "b")); // 2
		System.out.println(frequency(list, "c")); // 1
		System.out.println(frequency(list, "d")); // 5
		System.out.println(frequency(list, "xxx")); // 0
	}

	// 统计集合中指定元素出现的次数
	public static <T> int frequency(Collection<T> cl, T ele) {
		int count = 0;
		for (T t : cl) {
			if (t.equals(ele)) {
				count++;
			}
		}
		return count;
	}
}
