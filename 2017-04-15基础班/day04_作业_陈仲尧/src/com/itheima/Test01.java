package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * �����������󣬲��ô���ʵ��

     1.����¼��༶����

     2.����¼��İ༶������������

     3.�������������0-100�ĳɼ�(����0��100)

     4.Ҫ��:

       (1)��ӡ�ð༶�Ĳ���������

       (2)��ӡ�ð༶��ƽ����

       (3)��ʾ��ʽ����:

                        ������༶����:

                        ����¼��:100

                        ����̨���:
                                 ����������:19

                                 �༶ƽ����:87
 * @author Ulric
 *
 */

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������༶����:");
		
		int numOfStu = scanner.nextInt();
		int[] stus = new int[numOfStu];	// ��������
		int count = 0;	// ͳ�Ʋ���������
		int sum = 0;	// �ۼ��ܷ���
		
		for (int i = 0; i < stus.length; i++) {
			stus[i] = random.nextInt(101);	// �������[0,100]����ֵ���浽������
			sum += stus[i];		// �ۼӵ��ܷ�����
			if(stus[i] < 60){	// �����������ֵС��60
				count++;
			}
		}
		
		System.out.println("������������" + count + "\n�༶ƽ���֣�" + sum * 1.0 / numOfStu);
		
	}

}
