package com.itheima01;

/**
 * ��������
 * 
 * @author Ulric
 *
 */

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];

		// for (int i = 0; i < students.length; i++) {
		// students[i] = new Student();
		// }

		students[0] = new Student("�ܲ�", 40);
		students[1] = new Student("����", 35);
		students[2] = new Student("��Ȩ", 30);

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName() + "---" + students[i].getAge());
		}
	}

}
