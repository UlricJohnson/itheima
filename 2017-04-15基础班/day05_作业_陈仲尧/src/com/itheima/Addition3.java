package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * �����������󣬲��ô���ʵ�� (1). �����������󣬲��ô���ʵ��
 * 
 * 1.�����࿼��Ҫ���з���,����¼��ð༶�ܹ�������?�Լ�ÿ���ѧ������?
 * 
 * 2.����¼���������ÿ��ѧԱ������������ά����
 * 
 * 3.�������������0-100�ĳɼ�(����0��100)(��װ�ɷ���)
 * 
 * 4.Ҫ��:
 * 
 * (1)��ӡ�༶�еĲ���������(��װ�ɷ���)
 * 
 * (2)��ӡ�༶ƽ����(��װ�ɷ���)
 * 
 * (3)��ʾ��ʽ����:
 * 
 * ������༶������:3
 * 
 * ������༶��ÿ�������:10
 * 
 * ����̨���:
 * 
 * �༶�в���������Ϊ: 16 ��
 * 
 * �༶��ƽ����Ϊ: 56
 * 
 * @author Ulric
 *
 */

public class Addition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("������༶������:");
		int row = scanner.nextInt();
		System.out.print("������༶��ÿ�������:");
		int col = scanner.nextInt();
		int[][] stus = new int[row][col]; // ��������

		// ���ɳɼ�
		for (int i = 0; i < stus.length; i++) {
			for (int j = 0; j < stus[i].length; j++) {
				stus[i][j] = getRandomScore();
			}

		}

		// (1)��ӡ�༶�еĲ���������
		System.out.println("�༶�в���������Ϊ: " + numOfFail(stus));

		// (2)��ӡ�༶ƽ����
		System.out.println("�༶ƽ����Ϊ��" + getAvrgScore(stus));
	}

	// �������������0-100�ĳɼ�(����0��100)(��װ�ɷ���)
	public static int getRandomScore() {
		Random random = new Random();
		return random.nextInt(101);
	}

	// (1)ͳ�ư༶�еĲ���������(��װ�ɷ���)
	public static int numOfFail(int[][] arr) {
		int count = 0; // ͳ�Ʋ���������
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 60) { // �����������ֵС��60
					count++;
				}
			}

		}
		return count;
	}

	// (2)��ӡ�༶ƽ����(��װ�ɷ���)
	public static double getAvrgScore(int[][] arr) {
		double sum = 0; // �ۼ��ܷ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}

		}
		return sum / (arr.length * arr[0].length); // �ܷ��� / ( ���� * ���� )
	}
}
