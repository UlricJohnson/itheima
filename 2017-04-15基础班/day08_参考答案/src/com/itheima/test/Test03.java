package com.itheima.test;

import java.util.Scanner;

public class Test03 {
	/*
	 * ��3��: ������������,���ô���ʵ��
	1.����¼��һ��Դ�ַ������ַ�������scrStr����
	2.����¼��һ��Ҫɾ�����ַ������ַ�������delStr����
	3.Ҫ��
		ɾ������scrStr�����е�����delStr�ַ��������յ��ַ����в��ܰ���delStr����Ҫ���ӡɾ����Ľ���Լ�ɾ���˼���delStr�ַ���
	4.�������д�ӡ��ʽ:
		������Դ�ַ���:java woaijava,i like jajavava i enjoy java
		������Ҫɾ�����ַ���:java
		����̨������:Դ�ַ������ܹ�����:5 �� java ɾ��java����ַ���Ϊ: woai,i like  i enjoy
  
     ˼·:
      
      1. ����������¼�����
      2. ʹ�ü���¼������ȡ�û�¼��ԭ����Ҫɾ�������ַ���
      3. ɾ��ԭ���е�Ҫɾ�����Ӵ�
      4. ͳ��ɾ�������Ӵ�����
      
      ����ɾ��ԭ���е��Ӵ�,��ͳ�Ƹ���; ��һ������,Ϊ����߳�������; ����дһ������
      ������ȷ:
      	��ȷ�����б�: ԭ�ַ���,Ҫɾ�����Ӵ�
      	����ֵ����: ɾ���Ӵ��ĸ���
      
	 */
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��¼��Դ�ַ�����");
		String srcStr = sc.nextLine();
		System.out.println("��¼��Ҫɾ�����ַ�����");
		String delStr = sc.nextLine();
		//����ɾ������ӡ��Ϣ����
//		deleteStr(srcStr,delStr);
		deleteStr2(srcStr,delStr);
	}

//  ��ʽ1: ɾ�����ַ���,��ͳ�ƴ���
/*
	 ˼·: 
	 	1. ����һ������������
	 	2. ʹ��whileѭ��,�ж����ԭ����Ҫɾ�����Ӵ������ѭ��
	 	3. ��ѭ������,ʹ��replaceFirst����,�滻��ԭ���е�һ�γ��ֵ�Ҫɾ���Ӵ�
	 	4. ����������++
	 	5. ��ѭ��������,��ɾ����ԭ�������е�Ҫɾ���Ӵ�,����ͳ�Ƴ�����ɾ���ĸ���
	 	7. ���ر�ɾ���Ӵ��ĸ���.
	 
*/
	public static void deleteStr(String srcStr, String delStr) {
		//����ͳ��ɾ�������ļ�����
		int count = 0;
		//ѭ��ɾ����
//	    contains: ���src�а���delStr�ͷ���true,����������ͷ���false
		while(srcStr.contains(delStr)) {
			//�����滻��һ�γ��ֵķ���
//		    ʹ��""�滻delStr��һ�γ��ֵ�λ��
			srcStr = srcStr.replaceFirst(delStr, "");
			//����������
			count++;
		}
		System.out.println("Դ�ַ����й�������" + count + "��" + delStr + ".ɾ������ַ���Ϊ��" + srcStr);
	}
	
//	�ڶ��ַ�ʽ: ɾ�����ַ���,��ͳ�����ַ������ֵĴ���.
/*
 	��˼·:
 		1. �Ȱ�Stringת��ΪStringBuilder 
 		2. ʹ��StringBuilder��delete(int start,int end)����ɾ���Ӵ�
 	 ���岽��:
 	 	1. �������������
 	 	2. ��Stringת��ΪStringBuilder
 	 	3. ����������ڼ�¼delStr��һ�γ��ֵ�����
 	 	4. ʹ��whileѭ��,���ж����������,ʹ��indeOf������ȡҪɾ�����Ӵ���ԭ���е�һ�γ��ֵ�����,����ֵ��index,���!=-1,��˵�������Ӵ�����
 	 	5. ��ѭ������
 	 	   1. ����Ҫɾ�����Ӵ��Ľ������� = ��ʼ����+Ҫɾ���Ӵ��ĳ���
 	 	   2. ����StringBuilder��delete(int start,int end)����ɾ���Ӵ�
 	 	   3. ����������++
 	 	6. ����ɾ���Ӵ��ĸ���.
 		
 */	
	public static void deleteStr2(String srcStr, String delStr) {
//		����һ��ͳ�Ʊ���
		int count = 0;
//		���ַ���ת��ΪStringBuilder����
		StringBuilder sb = new StringBuilder(srcStr);
//		����������ڼ�¼delStr��һ�γ��ֵ�����
		int index = 0;
		
//		������Դ�ַ���:java woaijava,i like jajavava i enjoy java
//		������Ҫɾ�����ַ���:java
//		sb.delete(0, 4);
//		��ʼ����:index
//		��������: index+java.length();
//		ѭ��ɾ��
		while((index = sb.indexOf(delStr)) !=-1){
//			sb��ΪdelStr���ַ�
			sb.delete(index,index+delStr.length());
			count++;
		}
		System.out.println("Դ�ַ����й�������" + count + "��" + delStr + ".ɾ������ַ���Ϊ��" + sb.toString());
	}
		
}
