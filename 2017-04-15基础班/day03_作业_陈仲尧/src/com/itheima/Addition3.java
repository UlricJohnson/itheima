package com.itheima;

import java.util.Scanner;

/**
 * �����������󣬲��ô���ʵ�֣�

 (1).����¼���������������մ�С�����˳�����

 (2).����û��������3 2 1���������к��ӡ��ʽ"���մ�С����������˳��Ϊ��1 2 3"
 * @author Ulric
 *
 */

public class Addition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * ���������������Ļ����ܻ�����ף����ǻ���˷ѿռ�
		 * �������ܲ������ܹ�ʵ�ֵ�ǰ���£������ٵ���������
		 */
		// #1 (�Լ�д)
		int lesser;	
		int more;
		int temp;
		
		System.out.print("������3��������");
		
		lesser = scanner.nextInt();		// ������������ֵ
		more = scanner.nextInt();
		
		if(lesser > more){	// ���lesser��ֵ��more�������
			temp = lesser;
			lesser = more;
			more = temp;
		}
		
		temp = scanner.nextInt();	// ��֤lesser��ֵ��moreС�������3����ֵ
		
		if(temp < lesser){	// ��3������С
			System.out.println("���մ�С����������˳��Ϊ��" + temp + " " + lesser + " " + more);
		}else if(temp > lesser && temp < more){	// ��3����Ϊ�м�ֵ
			System.out.println("���մ�С����������˳��Ϊ��" + lesser + " " + temp + " " + more);
		}else if(temp > more){	// ��3����Ϊ���ֵ
			System.out.println("���մ�С����������˳��Ϊ��" + lesser + " " + more + " " + temp);
		}
		
		// #2 ��ȫ������һ�������룬��������(ð�ݻ�ֱ�ӱȽϽ���)
		
		
		
	}
}
