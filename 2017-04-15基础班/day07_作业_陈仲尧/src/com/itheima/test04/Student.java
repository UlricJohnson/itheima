package com.itheima.test04;

public class Student {
	private String name;
	private int age;
	private int score;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

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
		if (age < 1 || age > 120) {
			System.out.println("��¼�����������");
		} else {
			this.age = age;
		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score < 0 || score > 100) {
			System.out.println("��¼��ĳɼ�����");
		} else {
			this.score = score;
		}
	}

	public void eat() {
		System.out.println(name + "���ڳԷ�");
	}

	public void study() {
		System.out.println(name + "����ѧϰ�����Է���Ϊ" + score);
	}

}
