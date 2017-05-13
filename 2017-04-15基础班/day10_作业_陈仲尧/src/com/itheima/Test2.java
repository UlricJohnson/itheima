package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现
     (1).项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
     (2). user.txt文件中初始存放的用户信息有如下：
           jack,123
           rose,123
           tom,123
     (3).要求完成如下功能：
           程序运行时：控制台提示用户输入注册的用户名和密码；
            验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
            是：控制台提示：用户名已存在
            否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功；
 */

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> aList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		BufferedReader bReader = new BufferedReader(new FileReader("user.txt"));
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("user.txt", true));

		// 把用户资料放到集合中
		String readLn;
		while ((readLn = bReader.readLine()) != null) {
			aList.add(readLn);
		}
		bReader.close();

		System.out.print("请输入用户名和密码：");
		String usrName = scanner.next();
		String usrPsw = scanner.next();

		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i).split(",")[0].equals(usrName)) {// 如果集合中的用户名有和输入的用户名一样的
				System.out.println("用户名已存在");
				return;// 直接退出程序
			}
		}

		// 否则就把信息写入文件
		bWriter.newLine();
		bWriter.write(usrName + "," + usrPsw);
		bWriter.close();
		System.out.println("注册成功");
	}

}
