package com.itheima.test4;

public class Test4 {

	public static void main(String[] args) throws Exception {
//		System.out.println(charAt(null, 2));
//		System.out.println(charAt("", 1));
		System.out.println(charAt("abc", 3));
//		System.out.println(charAt("rehyt", 3));
	}
	
	public static char charAt(String str, int index) throws Exception {
		if (str == null) {
			throw new StringCanNotNullException("str不可为null");
		} else if (str.isEmpty()) {
			throw new StringCanNotEmptyException("str不能为空串");
		} else if (index < 0 || index >= str.length()) {
			throw new IndexOutOfStringBoundException(index + " 插入了字符串:" + str + "的范围");
		}
		return str.charAt(index);
	}

}
