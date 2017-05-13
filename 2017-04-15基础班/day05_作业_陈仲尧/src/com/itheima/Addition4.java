package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * �����������󣬲��ô���ʵ��
 * 
 * 1.�����࿼��Ҫ���з���,����¼��ð༶�ܹ�������?�Լ�ÿ���ѧ������?
 * 
 * 2.����¼���������ÿ��ѧԱ������������ά����
 * 
 * 3.�������������0-100�ĳɼ�(����0��100)(��װ�ɷ���)
 * 
 * 4.Ҫ��:
 * 
 * (1)��ӡ�ð༶��ÿ��Ĳ���������(��װ�ɷ���)
 * 
 * (2)��ӡ�ð༶��ÿ���ƽ����(��װ�ɷ���)
 * 
 * (3)��ӡ������ƽ���� (��װ�ɷ���)
 * 
 * (4)��ʾ��ʽ����:
 * 
 * ������༶������:3
 * 
 * ������༶��ÿ�������:10
 * 
 * ����̨���:
 * 
 * ��1�鲻��������Ϊ: 6 ��
 * 
 * ��2�鲻��������Ϊ: 7 ��
 * 
 * ��3�鲻��������Ϊ: 3 ��
 * 
 * ��1��ƽ����Ϊ: 52
 * 
 * ��2��ƽ����Ϊ: 46
 * 
 * ��3��ƽ����Ϊ: 69
 * 
 * �༶�е������ƽ����Ϊ:69
 * 
 * @author Ulric
 *
 */

public class Addition4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("������༶������:");
		int row = scanner.nextInt();
		System.out.print("������༶��ÿ�������:");
		int col = scanner.nextInt();
		int[][] stus = new int[row][col]; // ��������
		
		for (int i = 0; i < stus.length; i++) {
			for (int j = 0; j < stus[i].length; j++) {
				stus[i][j]=getRandomScore();
			}
		}

		// (1)��ӡ�ð༶��ÿ��Ĳ���������
		printFailsOfEachGroup(stus);

		// (2)��ӡ�ð༶��ÿ���ƽ����
		printAvrgScoreOfEachGroup(stus);

		// (3)��ӡ������ƽ����
		System.out.println("�༶�е������ƽ����Ϊ:" + getHighestAvrgScore(stus));
	}

	// �������������0-100�ĳɼ�(����0��100)(��װ�ɷ���)
	public static int getRandomScore() {
		Random random = new Random();
		return random.nextInt(101);
	}

	// (1)��ӡ�ð༶��ÿ��Ĳ���������(��װ�ɷ���)
	public static void printFailsOfEachGroup(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0; // ͳ�Ʋ���������
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 60) {
					count++;
				}
			}
			System.out.println("��" + (i + 1) + "���в���������Ϊ:" + count + "��");
		}
	}

	// (2)��ӡ�ð༶��ÿ���ƽ����(��װ�ɷ���)
	public static void printAvrgScoreOfEachGroup(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0; // �ۼ��ܷ���
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("��" + (i + 1) + "��ƽ����Ϊ: " + (sum * 1.0) / arr[i].length);
		}
	}

	// (3)��ӡ������ƽ���� (��װ�ɷ���)
	public static double getHighestAvrgScore(int[][] arr) {
		double highestAvrgScore = 0; // ������ƽ����
		for (int i = 0; i < arr.length; i++) {
			int sum = 0; // �ۼ��ܷ���
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			if ((sum * 1.0) / arr[i].length > highestAvrgScore) {// �����ǰ���ƽ���ָ��������ƽ����
				highestAvrgScore = (sum * 1.0) / arr[i].length;
			}
		}
		return highestAvrgScore;
	}
}
