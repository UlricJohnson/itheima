package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * �����������󣬲��ô���ʵ��
         1.�����࿼��Ҫ���з���,����¼��ð༶�ܹ�������?�Լ�ÿ���ѧ������?
         2.����¼���������ÿ��ѧԱ������������ά����
         3.�������������0-100�ĳɼ�(����0��100)
         4.Ҫ��:
           (1)��ӡ�ð༶��ÿ��Ĳ���������
           (2)��ӡ�ð༶��ÿ���ƽ����
           (3)��ӡ������ƽ����
           (4)��ʾ��ʽ����:
                            ������༶������:3
                            ������༶��ÿ�������:10
                            ����̨���:
                                     ��1�鲻��������Ϊ: 6 ��
                                     ��1��ƽ����Ϊ: 52
                                     ��2�鲻��������Ϊ: 7 ��
                                     ��2��ƽ����Ϊ: 46
                                     ��3�鲻��������Ϊ: 3 ��
                                     ��3��ƽ����Ϊ: 69
                                     �༶�е������ƽ����Ϊ:69
 * @author Ulric
 *
 */

public class Addition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������༶������:");
		int row = scanner.nextInt();
		System.out.print("������༶��ÿ�������:");
		int col = scanner.nextInt();
		int[][] stus = new int[row][col];	// ��������
		
		for (int i = 0; i < stus.length; i++) {
			int count = 0;	// ͳ�Ʋ���������
			int sum = 0;	// �ۼ��ܷ���
			for (int j = 0; j < stus[i].length; j++) {
				stus[i][j] = random.nextInt(101);	// �������[0,100]����ֵ���浽������
				sum += stus[i][j];		// �ۼӵ��ܷ�����
				if(stus[i][j] < 60){	// �����������ֵС��60
					count++;
				}
			}
			System.out.println("��"+ (i + 1) +"���в���������Ϊ:" + count + "��\n��" + (i + 1) + "��ƽ����Ϊ: " + (sum * 1.0) / stus[i].length);
			
		}
		
//		System.out.println(" �༶�в���������Ϊ:" + count + "\n�༶��ƽ����Ϊ: " + (sum * 1.0) / (row * col));
	}

}
