package com.itheima.addition1;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.1 创建4个Phone对象
		Phone phone1 = new Phone("MeiZu", 800);
		Phone phone2 = new Phone("Mi", 750);
		Phone phone3 = new Phone("iPhone", 5000);
		Phone phone4 = new Phone("HuaWei", 1000);

		// 2.2 创建一个ArrayList 集合, 将上面的4个对象添加入该集合里;
		ArrayList<Phone> arrayList = new ArrayList<>();
		arrayList.add(phone1);
		arrayList.add(phone2);
		arrayList.add(phone3);
		arrayList.add(phone4);

		// 2.3 获取集合中元素品牌为 ”M” 开头的所有手机价格总和, 并在控制台打印输出;
		System.out.println("品牌为 ”M” 开头的所有手机有:");
		int sumOfPrice = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			Phone phone = arrayList.get(i);
			if (phone.getBrand().startsWith("M")) {
				System.out.println("品牌是：" + phone.getBrand() + "\t价格为：" + phone.getPrice());
				sumOfPrice += phone.getPrice();
			}
		}
		System.out.println("品牌为 ”M” 开头的所有手机价格总和是" + sumOfPrice);

		// 2.4 提示键盘录入一个数,将 “Mi”的价格修改为这个数,再把小于这个数的手机价格删除,
		// 统计删除的个数,在控制台打印修改后的所有对象的属性值及删除的元素个数.
		System.out.println("请输入一个整数(价格): ");
		int price = new java.util.Scanner(System.in).nextInt();
		phone2.setPrice(price);
		int count = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getPrice() < price) {
				arrayList.remove(i);
				i--;
				count++;
			}
		}
		System.out.println("删除的元素的个数: " + count);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getBrand() + ": " + arrayList.get(i).getPrice());
		}
	}

}
