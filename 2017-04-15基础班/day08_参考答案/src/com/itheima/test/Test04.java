package com.itheima.test;

import java.util.Scanner;

public class Test04 {
	/*
	 4.�����������󣬲��ô���ʵ��
         (1).����¼��һ�����ַ���,��¼��һ��С�ַ���
         (2).ͳ��С�ַ����ڴ��ַ����г��ֵĴ���
         (3).�������д�ӡ��ʽ:
                  ��������ַ���:javajavajava I love java l like jajavava I enjoy javajavajava
                  ������С�ַ���:java
                  ����̨���:С�ַ���java,�ڴ��ַ���javajavajava I love java l like jajavava I enjoy javajavajava�й�����8��*/
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ַ�����");
		String big = sc.nextLine();
		System.out.println("������С�ַ�����");
		String small = sc.nextLine();
		//����ͳ�ƴ����ķ���
		int count = getCount2(big,small);
		System.out.println("С�ַ���" + small + "���ڴ��ַ���" + big + "�г����ˣ�" + count + "��");
	}
/*
       ��������ַ���:javajavajava I love java l like jajavava I enjoy javajavajava
       ������С�ַ���:java 
 */
	
//	��ʽ1: ͳ�ƴ��ַ�����С�ַ������ֵĴ���.
/*
    ˼·: 
 	 1. ����ͳ�ƴ����ļ�����
 	 2. �����¼��������λ�õı���
 	 3. ʹ��while��ȡͳ���Ӵ���һ�γ�������,���!=-1�ͽ���ѭ����
 	 4. �ҵ�һ��,count++
 	 5. Ϊ�˱����ظ���,ʹ��subString(int start)������ȡԭ���е�һ�γ����Ӵ����Ժ���ַ���,Ȼ��ֵ��ԭ��.
 	 6. ��ѭ��������ʱ��,��ͳ�Ƴ���,ԭ�����Ӵ����ֵĴ���.
 	
 */
	public static int getCount(String big, String small) {
		//����ͳ�ƴ����ļ�����
		int count = 0;
		//�����¼��������λ�õı���
		int index = 0;
		//ֻҪ���Բ��ҵ�����һֱ����
		while((index = big.indexOf(small)) != -1) {
			//����������
			count++;
			//���ҵ��Ժ󣬽���һ�γ��ֵ�λ��֮ǰ�������������ݶ���ȡ����
			big = big.substring(index+small.length());
		}
		//���ش���
		return count;
	}
	
//	��ʽ2:ͳ�ƴ��ַ�����,С�ַ������ֵĴ���
/*
 	 1. �滻ԭ���г��ֵ������Ӵ�,��ȡһ���滻����ַ���replaced
 	 2. ʹ�� (ʹ��ԭ���ĳ���-���滻����ַ����ĳ���)/�Ӵ��ĳ��� == �Ӵ����ֵĴ���
 	 3. �����Ӵ����ֵĴ���.
 */
	public static int getCount2(String big, String small) {
//		ʹ�ÿ��滻������С��(small)
		String replaced = big.replace(small, "");
//	    (�󴮵ĳ���-�滻�󳤶�)/С���ĳ��ȣ� ����С���ڴ��г��ֵĴ���	
//        ��������ַ���:javajavajava I love java l like jajavava I enjoy javajavajava
//        ������С�ַ���:java
		int count = (big.length()-replaced.length()) / small.length();
		return count;
	}
	
}
