package com.itheima;

import java.util.Random;

/**
 * 3. ��ȡС�������С�Ԫ��ƽ��������Ԫ��,Ҫ������:
 * 
 * 1.����String getNums(int[] arr)��̬����,������Ҫ����� :
 * 
 * ��ȡָ������arr������Ԫ�ص�ƽ����avg,����ӡ������̨, ����Ԫ��ΪС�ڵ���avg ������Ԫ��(Ԫ�ؼ��ö�������);
 * 
 * 2.����main����,���������:
 * 
 * (1)�����ȡ6��1~89֮��(��1,89)����,����������;
 * 
 * (2)����arr����getNums����,��ȡ����ֵ���ڿ���̨��ӡ,Ҫ�󷵻�ֵ���Զ��Ž�β.
 * 
 * ���ո�ʽ: ƽ��ֵΪ: 62 ����Ԫ����: 1 29 68 95 93 88
 * 
 * С�ڵ���avg������Ԫ�طֱ���1,29
 * 
 * @author Ulric
 *
 */

public class Addition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

		// (1)�����ȡ6��1~89֮��(��1,89)����,����������;
		int[] arr = new int[6];
		System.out.print("����Ԫ���У�");
		for (int i = 0; i < arr.length; i++) {//
			arr[i] = random.nextInt(89) + 1;
			System.out.print(arr[i] + " ");
		}

		// (2)����arr����getNums����,��ȡ����ֵ���ڿ���̨��ӡ,Ҫ�󷵻�ֵ���Զ��Ž�β.
		System.out.println("С�ڵ���avg������Ԫ�طֱ���" + getNums(arr));

	}

	// ��ȡָ������arr������Ԫ�ص�ƽ����avg,����ӡ������̨, ����Ԫ��ΪС�ڵ���avg ������Ԫ��(Ԫ�ؼ��ö�������);
	public static String getNums(int[] arr) {
		// int avg;
		int sum = 0;
		String string = "";
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println("ƽ��ֵΪ��" + avg);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < avg) {
				string += (arr[i] + ",");
			}
		}
		System.out.println(string);
		return string.substring(0, string.length() - 1);// ȥ�����һ������֮�󷵻�
	}

}
