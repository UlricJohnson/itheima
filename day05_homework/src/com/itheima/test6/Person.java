package com.itheima.test6;

public class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) /* throws NoAgeException */ {
		this.name = name;
		if (age < 0 || age > 200) {
			throw new NoAgeException("年龄数值非法");
		} else {
			this.age = age;
		}
	}

}
