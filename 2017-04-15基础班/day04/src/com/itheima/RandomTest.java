package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * ������С��Ϸ
 * @author Ulric
 *
 */

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int rand = random.nextInt(100) + 1;
		
		System.out.println("��������Ҫ�µ�����(1-100)��");
		
		int guess = scanner.nextInt();
		
		while(guess != rand){	// ����²�����ѭ������
			if(guess > rand){
				System.out.println("���µ����ִ��ˣ�");
			}else if(guess < rand){
				System.out.println("���µ�����С�ˣ�");
			}
			guess = scanner.nextInt();
		}
		
		System.out.println("��ϲ���������ˣ�");
		 
		
	}

}
