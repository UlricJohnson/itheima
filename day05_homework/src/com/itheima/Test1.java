package com.itheima;

public class Test1 {

	public static void main(String[] args) throws Exception {
//		System.out.println(charAt(null, 2));
//		System.out.println(charAt("", 1));
//		System.out.println(charAt("abc", 3));
		System.out.println(charAt("rehyt", 3));
	}

	public static char charAt(String str, int index) throws Exception {
		if (str == null) {
			throw new Exception("字符串不能为null");
		} else if (str.isEmpty()) {
			throw new Exception("字符串不能为空");
		} else if (index < 0 || index >= str.length()) {
			throw new Exception("索引越界");
		}
		return str.charAt(index);
	}

}
