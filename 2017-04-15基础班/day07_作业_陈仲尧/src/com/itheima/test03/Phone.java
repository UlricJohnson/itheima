package com.itheima.test03;

class Phone {
	private String brand;
	private int price;

	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void call() {
		System.out.println("����ʹ�ü۸�Ϊ " + price + "Ԫ��" + brand + "Ʒ�Ƶ��ֻ���绰...");
	}

	public void sendMessage() {
		System.out.println("����ʹ�ü۸�Ϊ " + price + "Ԫ��" + brand + "Ʒ�Ƶ��ֻ�������...");
	}

	public void playGame() {
		System.out.println("����ʹ�ü۸�Ϊ " + price + "Ԫ��" + brand + "Ʒ�Ƶ��ֻ�����Ϸ...");
	}
}
