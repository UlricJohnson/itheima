package com.itheima;

import java.util.Scanner;

/**
 * (1).����������ģ����������ܣ��Լ���¼�������int���͵����ݽ��мӡ������ˡ��������㣬����ӡ������

     (2).Ҫ��

               a.����¼����������,����ǰ������������μ���������ݣ�

                        ����������ΪҪ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������)

               b.ʹ�ý�����ѧ֪ʶ��ɹ���

               c.��ʾ��ʽ����:

                        �������һ������:30

                        ������ڶ�������:40

                        ��������Ҫ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������):0

                        ����̨���:30+40=70
 * @author Ulric
 *
 */

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�������һ��������");
		int num1 = scanner.nextInt();
		
		System.out.print("������ڶ���������");
		int num2 = scanner.nextInt();
		
		System.out.print("��������Ҫ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������):");
		int operationInt = scanner.nextInt();
		
		switch (operationInt) {
		case 0:
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case 1:
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case 2:
			System.out.println(num1 + "��" + num2 + "=" + (num1 * num2));
			break;
		case 3:
			System.out.println(num1 + "��" + num2 + "=" + (num1 * 0.1 / num2));
			break;
		default:
			break;
		}
	}

}
