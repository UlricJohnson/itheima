package com.itheima.test02;

/**
 * (1).è��Cat
 * 
 * ����:
 * 
 * ë����ɫcolor
 * 
 * Ʒ��breed
 * 
 * ��Ϊ:
 * 
 * �Է�eat()
 * 
 * ץ����catchMouse()
 * 
 * @author Ulric
 *
 */

public class Cat {
	private String color;
	private String breed;

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String color, String breed) {
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
		System.out.println(color + "��" + breed + "���ڳ���");
	}

	public void catchMouse() {
		System.out.println(color + "��" + breed + "���ڴ�����");
	}

}
