package com.itheima02;

import java.util.ArrayList;

/**
 * ��Ŀ:�򼯺�����������ĸ��ַ���,��������,���δ�ӡȡ�����ַ���
 * 
 * @author Ulric
 *
 */

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("��־��");
		arrayList.add("Megan Fox");
		arrayList.add("�����");
		arrayList.add("��ѩܽ");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

	}

}
