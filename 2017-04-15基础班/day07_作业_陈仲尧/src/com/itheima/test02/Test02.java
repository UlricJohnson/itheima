package com.itheima.test02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("��ɫ", "��˹è");
		cat.eat();
		cat.catchMouse();

		Dog dog = new Dog();
		dog.setColor("��ɫ");
		dog.setBreed("����");
		dog.eat();
		dog.lookHome();
	}

}
