package com.itheima;

import java.util.Random;

/**
 * Random�ࣺ�����ʵ����������α�������
 * @author Ulric
 *
 */

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			int number = random.nextInt(10);	// ����[0,10)�����
			System.out.println("number:" + number);
		}
		System.out.println("---------------");
		
		// �����ȡ1-100֮�������
		System.out.println(random.nextInt(100) + 1);
	}

}
