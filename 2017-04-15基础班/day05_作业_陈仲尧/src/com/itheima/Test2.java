package com.itheima;

import java.util.Scanner;

/**
 * �����������󣬲��ô���ʵ��
 * 
 * (1).����¼�볤���εĳ��Ϳ� ���巽������ó����ε��ܳ�,����main�����д�ӡ�ܳ�
 * 
 * (2).����¼�볤���εĳ��Ϳ� ���巽������ó����ε����,����main�����д�ӡ���
 * 
 * (3).����¼��Բ�İ뾶 ���巽�������Բ���ܳ�,����main�����д�ӡ�ܳ�
 * 
 * (4).����¼��Բ�İ뾶 ���巽�������Բ�����,����main�����д�ӡ���
 * 
 * @author Ulric
 *
 */

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("�����볤���εĳ��Ϳ�");
		double length = scanner.nextDouble();
		double width = scanner.nextDouble();
		System.out.println("�����ε����Ϊ��" + getArea(length, width) + "  �ܳ�Ϊ��" + getPerimeter(length, width));

		System.out.print("������Բ�İ뾶��");
		double radius = scanner.nextDouble();
		System.out.println("Բ�����Ϊ��" + getArea(radius) + "  �ܳ�Ϊ��" + getPerimeter(radius));
	}

	// �����ܳ�
	public static double getPerimeter(double length, double width) {
		return (length + width) * 2;
	}

	public static double getPerimeter(double radius) {
		return 2 * Math.PI * radius;
	}

	// �������
	public static double getArea(double length, double width) {
		return length * width;
	}

	public static double getArea(double radius) {
		return Math.pow(radius, 2) * Math.PI;
	}

}
