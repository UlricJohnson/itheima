package com.itheima.test7;

public class Test7 {

	public static void main(String[] args) {
		new Phone() {

			@Override
			public void sendMessage() {
				System.out.println("send a message");
			}

			@Override
			public void call() {
				System.out.println("call someone");
			}
//		}.call();
		}.sendMessage();
	}

}
