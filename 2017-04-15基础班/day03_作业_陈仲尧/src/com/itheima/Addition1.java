package com.itheima;

import java.util.Scanner;

/**
 * �����������󣬲��ô���ʵ��(�ֱ�ʹ��if��switchʵ��)��                           

     (1).��������:����¼���·ݣ������Ӧ�ļ���

     (2).Ҫ��:

           a.����¼��һ������(�����·�,��Χ1-12)

           b.������·ݶ�Ӧ�ļ���

                3,4,5����

                6,7,8�ļ�

                9,10,11�＾

                12,1,2����

           c.��ʾ��ʽ����:

                        ������һ���·�:3

                        ����̨���:3�·��Ǵ���
 * @author Ulric
 *
 */

public class Addition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" ������һ���·�:");
		byte month = scanner.nextByte();
		
		// #1 ifʵ��
		if (month >= 3 && month <= 5) {
			System.out.println(month + "�·��Ǵ���");
		} else if(month >= 6 && month <= 8){
			System.out.println(month + "�·����ļ�");
		}else if(month >= 9 && month <= 11){
			System.out.println(month + "�·����＾");
		}else if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "�·��Ƕ���");
		}else{
			System.out.println("����Ƿ���");
		}
		
		System.out.println("----------------------");
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "�·��Ǵ���");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "�·����ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "�·����＾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "�·��Ƕ���");
			break;
		default:
			System.out.println("����Ƿ���");
			break;
		}
	}

}
