package com.itheima03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * �����洢Student�ļ��ϣ�����¼�����ݺ���ӵ�������
 * 
 * @author Ulric
 *
 */

public class ArrayListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<>();

		addStudent(arrayList);
		addStudent(arrayList);
		addStudent(arrayList);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getName() + "----" + arrayList.get(i).getAge());
		}
	}

	public static void addStudent(ArrayList<Student> arrListStu) {
		System.out.println("������ѧ��������");
		String stuName = new Scanner(System.in).nextLine();

		System.out.println("������ѧ�����䣺");
		String stuAge = new Scanner(System.in).nextLine();

		arrListStu.add(new Student(stuName, stuAge));
	}

}
