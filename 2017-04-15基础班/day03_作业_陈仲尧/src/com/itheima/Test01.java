package com.itheima;

/**
 * (1).��ӡ1��100֮�ڵ��������������а���9��Ҫ����

 	(2).ÿ�����5����������������֮���ÿո�ָ�

 	(3).�磺1 2 3 4 5
 * @author Ulric
 *
 */

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;	// ͳ��ÿ������˶��ٸ�������������
		for (int i = 1; i <= 100; i++) {
			if((i >= 90 && i < 100) || (i % 10 == 9)){	// ʮλ��Ϊ9���߸�λ��Ϊ9������	
//				count--;	// ���ü��������������������ѱ���������û��ͳ��
				continue;
			}
			System.out.print(i + " ");
			count++;
			if(count % 5 == 0){	// ����ÿ���5�����ֻ���һ��
				System.out.println();
			}
		}
	}

}
