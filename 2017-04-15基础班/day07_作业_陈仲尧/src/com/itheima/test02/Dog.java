package com.itheima.test02;

/**
 * (2).����Dog
 * 
 * ����:
 * 
 * ë����ɫcolor
 * 
 * Ʒ��breed
 * 
 * ��Ϊ:
 * 
 * �Է�()
 * 
 * ����lookHome()
 * 
 * @author Ulric
 *
 */

public class Dog {
	private String color;
	private String breed;

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String color, String breed) {
		this.color = color;
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void eat() {
		System.out.println(color + "��" + breed + "���ڿй�ͷ");
	}

	public void lookHome() {
		System.out.println(color + "��" + breed + "���ڿ���");
	}

}
