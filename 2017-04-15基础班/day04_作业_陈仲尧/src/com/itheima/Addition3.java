package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * �ڸ質�����У�����10λ��ί���д�֣��ڼ�����ֵ÷�ʱ��ȥ��һ����߷֣�ȥ��һ����ͷ֣�Ȼ��ʣ���8λ��ί�ķ�������ƽ�������Ǹ�ѡ�ֵ����յ÷֡���ĳѡ�ֵĵ÷�.10���������� {7,9,5,8,7,8,8,10,9,6}
   	��ʾ��1. ʹ������洢10λ��ί��ķ����� 
        2. ʹ�����������0-100֮��ķ���   
		3. �ҵ���߷ֺ���ͷ�, 
		4. ��10���˵ķ�����, �ڼ�ȥ��ߺ����, �ٳ���8�Ϳ��Եõ�������ֵ����֡�
 * @author Ulric
 *
 */

public class Addition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[] scores = new int[10];
		int max = 0;	// �ڱ�����max���Գ�ʼ��Ϊ0
		int sum = 0;
		
		System.out.println("��ѡ�ֻ�õ����ֱַ�Ϊ��");
		
		for (int i = 0; i < scores.length; i++) {	// �������[0,10]֮��ķ���
			scores[i] = random.nextInt(11);	
//			if(scores[i] < min){
//				min = scores[i];
//			}
			if(scores[i] > max){	// ѡ�����ֵ
				max = scores[i];
			}
			sum += scores[i];	// �ۼ�
			System.out.print(scores[i] + "  ");
		}
		
		// ѡ����Сֵ
		int min = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] < min){
				min = scores[i];
			}
		}
		
		System.out.println("\n�ܷ�Ϊ��" + sum + "\nȥ����߷� " + max + " ����ͷ� " + min + " �󣬸�ѡ�ֵ���������Ϊ��" + (sum-max-min) * 1.0 / (scores.length - 2));
		
		
		
	}

}
