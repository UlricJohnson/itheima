package com.itheima;

/**
 * 3. AB֮�����5km��A�ٶ�Ϊ1.2km/h��B�ٶ�Ϊ2km/h����B����ܸ���A��
 * @author Ulric
 *
 */

public class Addition3 {
	public static void main(String[] args) {
		int distant = 5;
		float speedA = 1.2F;
		float speedB = 2F;
		double time = distant / (speedB - speedA);	// С����ʽ����СʱΪ��λ
		System.out.println("B׷��A�軨ʱ��" + (int)(time) + "Сʱ" + (int)((time - (int)(time))*60) + "����");
	}
}
