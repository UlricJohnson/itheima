package com.itheima;

import java.util.Scanner;

/**
 * 3�� ������������,���ô���ʵ��
 * 
 * (1).����¼��һ��Դ�ַ������ַ�������scrStr����
 * 
 * (2).����¼��һ��Ҫɾ�����ַ������ַ�������delStr����
 * 
 * (3).Ҫ��:ɾ������scrStr�����е�����delStr�ַ��������յ��ַ����в��ܰ���delStr����Ҫ���ӡɾ����Ľ���Լ�ɾ���˼���delStr�ַ���
 * 
 * (4).�������д�ӡ��ʽ: ������Դ�ַ���:java woaijava,i like jajavava i enjoy java
 * 
 * ������Ҫɾ�����ַ���:java
 * 
 * ����̨������:Դ�ַ������ܹ�����:5 �� java ɾ��java����ַ���Ϊ: woai,i like i enjoy
 * 
 * ��ʾ��ɾ���ַ������Խ�����String��replaceFirst(String oldStr,String
 * newStr)��StringBuilder��StringBuilder delete(int start, int end) ����
 * 
 * @author Ulric
 *
 */

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// (1).����¼��һ��Դ�ַ������ַ�������scrStr����
		System.out.print("������Դ�ַ���: ");
		String scrStr = scanner.nextLine();

		// (2).����¼��һ��Ҫɾ�����ַ������ַ�������delStr����
		System.out.print("������Ҫɾ�����ַ���: ");
		String delStr = scanner.nextLine();

		System.out.println("ɾ��\"" + delStr + "\"����ַ���Ϊ:" + delSubStr(scrStr, delStr));
	}

	// #1 ʹ��StringBuilder delete(int start, int end) ����
	public static StringBuilder delSubStr(String scrStr, String delStr) {
		StringBuilder strBuilder = new StringBuilder(scrStr);
		int numOfDelStr = 0;
		int indexOfDelStr = strBuilder.indexOf(delStr);// delStr��scrStr�е�����
		while (indexOfDelStr != -1) {// ֻҪscrStr�ַ����д���delStr���ַ���
			strBuilder.delete(indexOfDelStr, indexOfDelStr + delStr.length());
			indexOfDelStr = strBuilder.indexOf(delStr);
			numOfDelStr++;
		}
		System.out.println("Դ�ַ������ܹ�����:" + numOfDelStr + "��\"" + delStr + "\"");
		return strBuilder;
	}

}
