package com.itheima.addition2;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("����", "��ɫ", 6);
		car.run();

		Person person = new Person("���", 23);
		person.setAddress("�Ϸ�");
		person.setPhone("13866666666");
		person.drive(car);
	}

}
