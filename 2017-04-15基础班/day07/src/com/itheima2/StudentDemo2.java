package com.itheima2;

/**
 * �������demo3
 * 
 * �������ݵķ�װ
 * 
 * private �ؼ���
 * 
 * @author Ulric
 *
 */

class StudentDemo2 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("���䲻��Ϊ������");
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public void showMsg() {
		System.out.println("name: " + this.name + "\tage: " + this.age);
	}
}
