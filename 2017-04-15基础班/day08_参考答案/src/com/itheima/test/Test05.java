package com.itheima.test;

import java.util.Random;

public class Test05 {
	/*
	 * 
		��5��: ������������,���ô���ʵ��
		1.����String getStr(char[] chs)����
			������������ȡ����Ϊ5������ַ������ַ����������4����дӢ����ĸ��1��0-9֮�䣨����0��9�����������
		2.����main��������������ɣ�
			(1)���峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
			(2)��������chs����getStr(char[] chs)��������ȡ����ֵ,���ڿ���̨��ӡ����ֵ
	 */
	public static void main(String[] args) {
		//���峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
		char[] arr = new char[26];
		//����������������
		int index = 0;
		//������д��ĸ��Χ��
		for(int i = 'A'; i <= 'Z';i++) {
			//����ĸ�洢������
			arr[index] = (char) i;
			index++;
		}
		
		//����getStr����������һ������Ϊ5������ַ���������4����д��ĸ��1��0-9֮�������
//		String str = getStr(arr);
		String str = getStr2(arr);
		System.out.println(str);
	}

	/*
	 *��ʽ1: ��ȡ�ַ�������
	 */
	public static String getStr(char[] arr) {
		//����Ҫ���ɵ��ַ���
		String line = "";
		//�����������������
		Random r = new Random();
		//����4�����������Χ�����鳤������
		for(int i = 1; i < 5; i ++) {
//			���������ķ�Χ 0-arr.length-1
//			���������0-arr.length(������);
			int num = r.nextInt(arr.length);
			line += arr[num];
		}
		//����1������
		line += r.nextInt(10);
		//���ַ�������
		return line;
	}
	
	/*
	 * ��ʽ2: ��ȡ�ַ�������
	 */
	public static String getStr2(char[] arr) {
		//����Ҫ���ɵ��ַ���
		StringBuilder sb = new StringBuilder();
		//�����������������
		Random r = new Random();
		
		//����4�����������Χ�����鳤������
		for(int i = 1; i < 5; i ++) {
			int num = r.nextInt(arr.length);
			sb.append(arr[num]);
		}
		//����1������
		int rd = r.nextInt(10);
		//���ַ�������
		sb.append(rd);
		
//		ABCD 5
//		������������ҲҪ���λ�û�,������һ���ַ���������
//		int rdIndex = r.nextInt(sb.length())+1;
//		sb.insert(rdIndex, rd);
		return sb.toString();
	}
	
	
	
}
