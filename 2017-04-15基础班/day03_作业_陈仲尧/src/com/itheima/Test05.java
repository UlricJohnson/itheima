package com.itheima;

import java.util.Scanner;

/**
 * (1).����¼��ѧ���ɼ�(��������),���¼��ĳɼ�Ϊ-1 ��ʾ¼�����

     (2).��ӡ���¼���ѧ���ɼ���ƽ��ֵ
 * @author Ulric
 *
 */

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��������ĳɼ�(����-1��ʾ�˳�)��");
		int score;
		int sum = 0;
		int count = 0;
		
		while(true){
			score = scanner.nextInt();
//			System.out.println("������");
			if(score == -1){
				break;
			}
			count++;
			sum += score;
		}
		
		// �޸�bug�����countΪ0
		if(count == 0){
			
		}else{
			System.out.println("��¼����" + count + "���ɼ���" + "ƽ���ɼ�Ϊ��" + sum * 1.0 / count);
		}
		
		
	}

}
