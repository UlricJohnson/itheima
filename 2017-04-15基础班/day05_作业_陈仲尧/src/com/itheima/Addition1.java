package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * �����������󣬲��ô���ʵ��
 * 
 * (1). �����������󣬲��ô���ʵ��
 * 
 * 1.����¼��༶����
 * 
 * 2.����¼��İ༶������������
 * 
 * 3.�������������0-100�ĳɼ�(����0��100)(��װ�ɷ���)
 * 
 * 4.Ҫ��:
 * 
 * (1)��ӡ�ð༶�Ĳ���������(��װ�ɷ���)
 * 
 * (2)��ӡ�ð༶��ƽ����(��װ�ɷ���)
 * 
 * (3)��ʾ��ʽ����:
 * 
 * ������༶����:
 * 
 * ����¼��:100
 * 
 * ����̨���: ����������:19
 * 
 * �༶ƽ����:87
 * 
 * @author Ulric
 *
 */

public class Addition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("������༶����:");

		int numOfStu = scanner.nextInt();
		int[] stuScores = new int[numOfStu]; // ��������

		// ѭ����������ɼ�
		for (int i = 0; i < stuScores.length; i++) {
			stuScores[i] = getRandomScore();
		}
		
		System.out.println("������������" + getNumOfFail(stuScores) + "\n�༶ƽ���֣�" +  getAvrgScore(stuScores, numOfStu));

	}

	// ��ȡ����ɼ�
	public static int getRandomScore() {
		Random random = new Random();
		return random.nextInt(101);
	}

	// (1)����༶�Ĳ���������(��װ�ɷ���)
	public static int getNumOfFail(int[] scores) {
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < 60) {
				count++;
			}
		}
		return count;
	}

	// (2)����༶��ƽ����(��װ�ɷ���)
	public static double getAvrgScore(int[] scores, int numOfStu) {
		double totalScore = 0.0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return totalScore / numOfStu;
	}

}
