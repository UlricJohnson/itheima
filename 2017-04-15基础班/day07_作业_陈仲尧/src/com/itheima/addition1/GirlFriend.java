package com.itheima.addition1;

public class GirlFriend {
	private String name;
	private double height;
	private String feature;// ����

	public GirlFriend() {
		// TODO Auto-generated constructor stub
	}

	public GirlFriend(String name, double height, String feature) {
		super();
		this.name = name;
		this.height = height;
		this.feature = feature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public void cook() {
		System.out.println(name + "  " + feature + "  ���" + height + "  �᳴��");
	}

	public void wash(Clothes clothes) {
		System.out.println(name + "ϴ" + clothes.getBrand() + "����  " + clothes.getColor() + "�·�");
	}

}
