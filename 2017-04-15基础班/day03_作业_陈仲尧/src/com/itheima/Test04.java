package com.itheima;

import java.util.Scanner;

/**
 * (1).���ݹ���(����)��Ա���ǹ���(����),����ͻ�������ͨ������¼��

     (2).�ǹ��ʵ��������£�

               [10-15)     +5000

               [5-10)      +2500

               [3~5)       +1000

               [1~3)       +500

               [0~1)       +200

     (3).����û�����Ĺ���Ϊ10����������Ϊ3000���������к��ӡ��ʽ"��Ŀǰ������10�꣬��������Ϊ 3000Ԫ, Ӧ�ǹ��� 5000Ԫ,�Ǻ��� 8000Ԫ"
 * @author Ulric
 *
 */

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int lengthOfService;	// ����
		double basePay;		// ��������
		
		while(true){	// ��֤����Ϊ����
			System.out.print("���������Ĺ���(����):");
			lengthOfService = scanner.nextInt();
			if(lengthOfService >= 0){
				break;
			}
			System.out.println("��������������");
		}
		
		while(true){	 // ��֤��������Ϊ����
			System.out.print("���������Ļ������ʣ�");
			basePay = scanner.nextDouble();
			if(basePay >= 0){
				break;
			}
			System.out.println("��������������");
		}
		
		if(lengthOfService >= 0 && lengthOfService < 1){
			System.out.println("��Ŀǰ������" + lengthOfService + "�꣬��������Ϊ" + basePay + "Ԫ, Ӧ�ǹ��� 200Ԫ,�Ǻ���" + (basePay + 200) + "Ԫ");
		}else if(lengthOfService >= 1 && lengthOfService < 3){
			System.out.println("��Ŀǰ������" + lengthOfService + "�꣬��������Ϊ" + basePay + "Ԫ, Ӧ�ǹ��� 500Ԫ,�Ǻ���" + (basePay + 500) + "Ԫ");
		}else if(lengthOfService >= 3 && lengthOfService < 5){
			System.out.println("��Ŀǰ������" + lengthOfService + "�꣬��������Ϊ" + basePay + "Ԫ, Ӧ�ǹ��� 1000Ԫ,�Ǻ���" + (basePay + 1000) + "Ԫ");
		}else if(lengthOfService >= 5 && lengthOfService < 10){
			System.out.println("��Ŀǰ������" + lengthOfService + "�꣬��������Ϊ" + basePay + "Ԫ, Ӧ�ǹ��� 2500Ԫ,�Ǻ���" + (basePay + 2500) + "Ԫ");
		}else if(lengthOfService >= 10 && lengthOfService < 15){
			System.out.println("��Ŀǰ������" + lengthOfService + "�꣬��������Ϊ" + basePay + "Ԫ, Ӧ�ǹ��� 5000Ԫ,�Ǻ���" + (basePay + 5000) + "Ԫ");
		}else if(lengthOfService >= 15){
			System.out.println("�ֵܣ���ֱ����ϵ���ܣ�����������㣡");
		}
	}

}
