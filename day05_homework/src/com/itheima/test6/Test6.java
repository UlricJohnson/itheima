package com.itheima.test6;

public class Test6 {

	public static void main(String[] args) {
		Person p;
		try {
			p = new Person("张三", -5);
			// p = new Person("李四", 205);

		} catch (NoAgeException nae) {
			nae.printStackTrace();
			p = new Person("张三", 0);
		}
	}

}
