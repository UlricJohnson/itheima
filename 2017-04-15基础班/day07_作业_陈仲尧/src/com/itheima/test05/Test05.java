package com.itheima.test05;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		teacher.setName("��־��");
		teacher.setAge(30);
		teacher.setContent("Java�������������");
		teacher.eat();
		teacher.teach();

		Student student = new Student("����", 18, "�������");
		student.eat();
		student.study();
	}

}
