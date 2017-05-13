package com.itheima;

import java.util.Random;

/**
 * һ���༶��60��,���Գɼ���0-100֮�� Ϊÿһλͬѧ�������һ���ɼ�; Ҫ��: 1. дһ������,��ȡ�༶����ѧ���ɼ� 2. дһ����������༶�ܳɼ�
 * 3. дһ����������༶ƽ���ɼ� 4. дһ������ͳ�ư༶�Ĳ���������
 * 
 * @author Ulric
 *
 */

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = getAllScores();// ��ȡȫ��ɼ�

		// ��ӡȫ��ɼ���ÿ6��һ��
		System.out.print("ȫ��ͬѧ�ɼ����£�\n");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "  ");
			if (i > 0 && (i + 1) % 6 == 0) {
				System.out.println();
			}
		}

		// ��ӡ�ܳɼ�
		System.out.print("ȫ���ܳɼ�Ϊ��" + getTotalScore(scores) + "\n");

		// ��ӡƽ���ɼ�
		System.out.print("ƽ���ɼ�Ϊ��" + getAvrgScore(scores, 60) + "\n");

		// ��ӡ����������
		System.out.print("����������Ϊ��" + getNumOfFail(scores) + "\n");
	}

	// 1.��ȡ�༶����ѧ���ɼ�
	public static int[] getAllScores() {
		Random random = new Random();
		int[] scores = new int[60];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = random.nextInt(101);// �������[0,100]֮��ĳɼ�
		}
		return scores;
	}

	// 2.����༶�ܳɼ�
	public static int getTotalScore(int[] scores) {
		int totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return totalScore;
	}

	// 3.����༶ƽ���ɼ�
	public static double getAvrgScore(int[] scores, int numOfStu) {
		return getTotalScore(scores) / numOfStu;
	}

	// 4.ͳ�ư༶�Ĳ���������
	public static int getNumOfFail(int[] scores) {
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < 60) {
				count++;
			}
		}
		return count;
	}
}
