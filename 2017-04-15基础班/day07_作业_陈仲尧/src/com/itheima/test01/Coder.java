package com.itheima.test01;

/**
 * (2).����Ա��Coder
 * 
 * ���ԣ�
 * 
 * ����name
 * 
 * ����id
 * 
 * ����salary
 * 
 * ��Ϊ��
 * 
 * ����work()
 * 
 * @author Ulric
 *
 */

public class Coder {
	private String name;
	private String id;
	private double salary;

	public Coder() {
		// TODO Auto-generated constructor stub
	}

	public Coder(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void work() {
		System.out.println("����Ϊ" + id + "��������Ϊ" + salary + "�ĳ���Ա����Ŭ����д�Ŵ���......");
	}

}
