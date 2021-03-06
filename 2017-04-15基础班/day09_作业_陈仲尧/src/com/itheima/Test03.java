package com.itheima;

import java.util.ArrayList;

/**
 * 分析以下需求，并用代码实现
 * 
 * 1. 定义ArrayList集合，存入多个字符串"abc" "def" "efg" "def" "def" "qwe" "def" "def" "swd"
 * "wwe" "def" "def"
 * 
 * 2. 使用普通for循环获取集合中索引为3的元素并打印
 * 
 * 3. 定义方法public static boolean myContains(ArrayList<String> list,String str)
 * 
 * (1)参数
 * 
 * a.ArrayList list: 表示存储多个String数据的集合
 * 
 * b.String str: 表示一个字符串
 * 
 * (2)返回值
 * 
 * true: 表示list集合中包含字符串str
 * 
 * false: 表示list集合中不包含字符串str
 * 
 * 4. 定义的public static int getCount(ArrayList<String> list,String
 * str)方法统计str在集合list中出现的次数
 * 
 * 5. 删除集合中的所有字符串"def"(思路:循环判断集合中是否包含"def"字符串,包含就删除)
 * 
 * 6. 将集合中每个元素中的小写字母变成大写字母
 * 
 * 7. 遍历打印最终的集合中的元素
 * 
 * @author Ulric
 *
 */

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 定义ArrayList集合，存入多个字符串"abc" "def" "efg" "def" "def" "qwe" "def"
		// "def" "swd" "wwe" "def" "def"
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("abc");
		arrayList.add("def");
		arrayList.add("efg");
		arrayList.add("def");
		arrayList.add("def");
		arrayList.add("qwe");
		arrayList.add("def");
		arrayList.add("def");
		arrayList.add("swd");
		arrayList.add("wwe");
		arrayList.add("def");
		arrayList.add("def");

		// 2. 使用普通for循环获取集合中索引为3的元素并打印
		System.out.println(arrayList.get(3));

		// 5. 删除集合中的所有字符串"def"
		// int count = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			String string = arrayList.get(i);
			if (string.equals("def")) {
				arrayList.remove(string);
				// count++;
				i--;
			}
		}

		// 6. 将集合中每个元素中的小写字母变成大写字母
		arrayList = myToUpperCase(arrayList);

		// 7. 遍历打印最终的集合中的元素
		System.out.println(arrayList);
	}

	public static boolean myContains(ArrayList<String> list, String str) {
		return list.contains(str);
	}

	// 4. 统计str在集合list中出现的次数
	public static int getCount(ArrayList<String> list, String str) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(str)) {
				count++;
			}
		}
		return count;
	}

	// 6. 将集合中每个元素中的小写字母变成大写字母
	public static ArrayList<String> myToUpperCase(ArrayList<String> arrayList) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < arrayList.size(); i++) {
			list.add(arrayList.get(i).toUpperCase());
		}
		return list;
	}

}
