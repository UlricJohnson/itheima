package com.itheima;

import java.util.Scanner;

/**
 * (1).����¼��һ������������x�������Ӧ�ı���y��ֵ

     (2).xֵ��yֵ�Ķ�Ӧ��ϵ���£�

               x<0 y=-1

               x=0 y=0

               x>0 y=1

     (3).����û������x��ֵΪ2���������к��ӡ��ʽ"x=2,y=1"
 * @author Ulric
 *
 */

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������x��ֵ��");
		int x = scanner.nextInt();
		if (x < 0) {
			System.out.println("x=" + x + ", y=-1");
		} else if(x == 0){
			System.out.println("x=" + x + ", y=0");
//		}else if(x > 0){
		}else{
			System.out.println("x=" + x + ", y=1");
		}
	}

}
