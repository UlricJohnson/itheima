package com.itheima01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ʹ�á�\����Ҫת��
		FileWriter fWriter = new FileWriter("F:\\����java63���ļ�\\�������ļ��������ɽ\\�Ͽ���Ƶ����\\day10\\test.txt");

		// ���ļ�д������
		fWriter.write("��ã�IO��");// ��һ��ֻ�ǽ�����д���ڴ滺����

		fWriter.flush();// ��Ҫ���ô˷����ѻ������е�����д���ļ���

		// �ͷ���Դ
		fWriter.close();// ������滹�д�ִ�д��룬��û��ȡ��fWriter�������ļ��Ĺ��������ڳ������ǰ�����ܶ��ļ����в���

		// while (true) {
		// }

	}

}
