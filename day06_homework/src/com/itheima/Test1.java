package com.itheima;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String phoneNumRegex = "1[34578]\\d{9}";
		String qqNumRegex = "[^0]\\d{5,11}";

		System.out.println("请输入手机号码：");
		String phoneNumber = scanner.nextLine();
		System.out.println(phoneNumber.matches(phoneNumRegex) ? "该手机号码合法" : "手机号码非法");
		
		System.out.println("请输入QQ号码：");
		String qqNumber=scanner.nextLine();
		System.out.println(qqNumber.matches(qqNumRegex) ? "该QQ号码合法" : "QQ号码非法");
	}

}
