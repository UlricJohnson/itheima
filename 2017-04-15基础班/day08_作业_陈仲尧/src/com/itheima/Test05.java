package com.itheima;

import java.util.Random;

/**
 * 5�� ������������,���ô���ʵ��
 * 
 * (1).����String getStr(char[] chs)����
 * 
 * ������������ȡ����Ϊ5������ַ������ַ����������4����дӢ����ĸ��1��0-9֮�䣨����0��9�����������
 * 
 * (2).����main��������������ɣ�
 * 
 * a.���峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
 * 
 * b.��������chs����getStr(char[] chs)��������ȡ����ֵ,���ڿ���̨��ӡ����ֵ
 * 
 * @author Ulric
 *
 */

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a.���峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
		char[] chs = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		System.out.println(getStr(chs));
	}

	public static String getStr(char[] chs) {
		StringBuilder stringBuilder = new StringBuilder();
		Random random = new Random();
		// int randInt = random.nextInt(10);// �����ȡ0-9
		for (int i = 0; i < 4; i++) {// �����chs������ȡ��4��Ԫ��ѹ��stringBuilder��
			stringBuilder.append(chs[random.nextInt(chs.length)]);
		}
		stringBuilder.append(random.nextInt(10));// �������0-9׷�ӵ�stringBuilder��
		return stringBuilder.toString();
	}
}
