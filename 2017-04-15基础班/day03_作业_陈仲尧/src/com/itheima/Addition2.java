package com.itheima;

/**
 * �����������󣬲��ô���ʵ�֣�

 (1).���մӴ�С��˳�������λ���еĸ�λ+��λ=ʮλ+ǧλ(3553,2332,1166,8228,3773)�����ּ�����

 (2).ÿ�����5����������������֮���ÿո�ָ�

 (3).�磺9999 9988 9977 9966 9955    
 * @author Ulric
 *
 */

public class Addition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for (int i = 9999; i >= 1000; i--) {
			
			int digit = i % 10;	// ��λ
			int tensDigit = i / 10 % 10;	// ʮλ
			int hundredsDigit = i / 10 / 10 % 10;	// ��λ
			int thousandsDigit = i / 10 / 10 / 10 % 10;	// ǧλ
			
			if(digit + hundredsDigit == tensDigit + thousandsDigit){	// �����������
				count++;
				System.out.print(i + " ");
				
				if(count != 0 && count % 5 == 0){	// ����Ѿ����5��������������������һ��
					System.out.println();
				}// ��if��䲻Ӧ������if�������
			}
			
			
		}
		System.out.println("\n���������ĸ���Ϊ��" + count + "��");
	}

}
