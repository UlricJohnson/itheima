package com.itheima.test01;

/**
 * (1).��Ŀ������Manager
 * 
 * ���ԣ�
 * 
 * ����name
 * 
 * ����id
 * 
 * ����salary
 * 
 * ����bonus
 * 
 * ��Ϊ��
 * 
 * ����work()
 * 
 * @author Ulric
 *
 */

public class Manager {
	private String name;
	private String id;
	private double salary;
	private double bonus;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String id, double salary, double bonus) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
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

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("����Ϊ" + id + "��������Ϊ" + salary + "����Ϊ" + bonus + "����Ŀ��������Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....");
	}

}
