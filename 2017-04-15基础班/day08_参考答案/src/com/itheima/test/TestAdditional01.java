package com.itheima.test;

import java.util.Scanner;

public class TestAdditional01 {
	/*
	1. �����������󣬲��ô���ʵ�֣�
	(1)�Ӽ���¼��һ���ַ���
	(2)���ַ����д�д��ĸ���Сд��ĸ��Сд��ĸ��ɴ�д��ĸ�������ַ���"*"����,��ͳ����ĸ�ĸ���
		����:
			����¼�룺Hello12345World
			��������hELLO*****wORLD
			�ܹ�10����ĸ
	 ˼·: 
	  һ��ֻҪ�Ǹı���ԭ�������ݵ�,ͨ�����ַ���ת��ΪStringBuilder�ٽ��д���
	 1. ��������¼�����
	 2. ����¼����ַ���
	 3. ���ַ���ת��ΪStringBuilder
	 4. ����StringBuilder���ַ�
	 5. ��ѭ��,�жϸ��ַ��Ǵ�д�ľ�ת��ΪСд,С�ľ�ת��Ϊ��д,������ת��*
	 6. Ȼ����ʹ��StringBuilder��setCharAt(int index,char ch)���û�ȥ
	 7. ��ѭ��������StringBuilderת��String����;Ȼ��������ַ���
     �����ص�: 
     ��д��ĸת��Сд��ĸ
     	ch = ch + ('a'-'A');
    Сд��ĸת��д��ĸ
  		ch = ch + ('A'-'a')
	 */
	public static void main(String[] args) {
//		 1. ��������¼�����
		Scanner sc = new Scanner(System.in);
//		 2. ����¼����ַ���
		System.out.println("��¼��һ���ַ���");
		String str = sc.nextLine();
//		 3. ���ַ���ת��ΪStringBuilder
		StringBuffer sb = new StringBuffer(str);
//		 4. ����StringBuilder���ַ�
		for(int i=0; i<sb.length(); i++){
//		 5. ��ѭ��,�жϸ��ַ��Ǵ�д�ľ�ת��ΪСд,С�ľ�ת��Ϊ��д,������ת��*
			char ch = sb.charAt(i);
//			ע��: 1. ������>= �� <= ���򲻲�����A��Z
//			     2. �����A��Z���Ǵ�д��ĸ;
//			����Ǵ�д��ĸ��ת��ΪСд��ĸ
			if(ch >= 'A' && ch <= 'Z'){
				ch += ('a'-'A');
			}else if(ch >= 'a' && ch <= 'z'){
//				�����Сд��ĸ��ת��Ϊ��д��ĸ
				ch += ('A'-'a');
			}else {
//				����������ַ�,��ת��Ϊ*
				ch = '*';
			}
//		 6. Ȼ����ʹ��StringBuilder��setCharAt(int index,char ch)���û�ȥ
			sb.setCharAt(i, ch);
		}
//		7. ��ѭ��������StringBuilderת��String����;Ȼ��������ַ���
		String newStr = sb.toString();
		System.out.println(newStr);
	}
}
