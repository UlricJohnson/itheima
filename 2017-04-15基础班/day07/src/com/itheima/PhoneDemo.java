package com.itheima;

/**
 * �������demo2
 * 
 * @author Ulric
 *
 */

public class PhoneDemo {
	String brand;
	int price;
	String color;

	public void call(String name) {
		System.out.println("call " + name);
	}

	public void sendMsg(String name) {
		System.out.println("send a message to " + name);
	}

	public void sendMsg() {
		System.out.println("send messages to all my friends");
	}
}
