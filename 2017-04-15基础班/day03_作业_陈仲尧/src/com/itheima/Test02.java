package com.itheima;

/**
 * (1).���������߶�Ϊ8848�ף���һ���㹻���ֽ�����Ϊ0.0001�ס�

     (2).���ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�
 * @author Ulric
 *
 */

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double thickness = 0.0001;	// ֽ�ĺ��
		double heightOfQomolangma = 8848;	// ���ĸ߶�
		int count = 0;	// ͳ���۵�����
		
		while(thickness < heightOfQomolangma){
			thickness *= 2;
			count++;
		}
		System.out.println("��Ҫ�۵�" + count + "��");
	}

}
