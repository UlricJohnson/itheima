package com.itheima;

import java.util.Scanner;

/**
 * ���鳣������(һά����):
     	�Ӽ���¼��7���������뵽�����в�ʵ����������
		��1���������(������������е�ÿһ��Ԫ��)
		��2�������ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
    	��3������Ԫ��������� (���ǰ�Ԫ�ضԵ�)
    	��4��������(���ݼ���¼������,���������ж�Ӧ�����֣������)
		��5������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
 * @author Ulric
 *
 */

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������7������");
		int[] arr = new int[7];
		
		for (int i = 0; i < arr.length; i++) {	// ѭ��¼������
			arr[i] = scanner.nextInt();
		}
		
		// (1)�������(������������е�ÿһ��Ԫ��)
		System.out.print("1.������飺");
		for (int i = 0; i < arr.length; i++) {
			if(i == 0){						// �����һ��Ԫ�ص������ʽ
				System.out.print("[" + arr[i] + ", ");
			}else if(i == arr.length - 1){	// ���һ��Ԫ�ص������ʽ
				System.out.println(arr[i]+ "]");
			}else{							// �м�Ԫ�ص������ʽ
				System.out.print(arr[i] + ", ");
			}
		}
		
		//��2�������ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("2.���ֵ��" + max + "\t��Сֵ��" + min);
		
    	//��3������Ԫ��������� (���ǰ�Ԫ�ضԵ�)
		System.out.print("3.���������");
		for (int i = arr.length - 1; i >= 0; i--) {
			if(i == arr.length - 1){						
				System.out.print("[" + arr[i] + ", ");
			}else if(i == 0){	
				System.out.println(arr[i]+ "]");
			}else{							
				System.out.print(arr[i] + ", ");
			}
		}
		
    	//��4��������(���ݼ���¼������,���������ж�Ӧ�����֣������)
		System.out.print("4.������������(0-6)��");
		int index = scanner.nextInt();
		while(true){
			if(index > arr.length - 1){	// �����������ִ���length-1
				System.out.print("����Խ�磡\n���������룺");
				index = scanner.nextInt();
			}else if(index < 0){		// ������������Ϊ����
				System.out.print("�Ƿ����룡\n���������룺");
				index = scanner.nextInt();
			}else{
				break;
			}
		}
		System.out.println("arr[" + index + "]=" + arr[index]);
		
		//��5������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
		System.out.print("5.������һ������:");
		int input = scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == input){
				System.out.println(input + "������arr�е�һ�γ��ֵ�����λ��Ϊ��" + i);
				break;
			}
			if(i == arr.length - 1){	// ����������˶�û�з��֣��������Ϣ
				System.out.println(input + "��������arr�����У�");
			}
		}
	}

}
