package com.itheima.q3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*
 * 3. 某商场举行抽奖活动,现场随机抽取20个,60-100的随机数字(随机数可以重复),已知根目录下有一个lucknum.txt文件,
 * 	请将尾数为8的幸运号码序放入文件中,并把幸运号码输出到控制台
 */

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("lucknum.txt"));
		BufferedReader bReader = new BufferedReader(new FileReader("lucknum.txt"));

		int[] nums = new int[20];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = new Random().nextInt(41) + 60;// 随机生成[60,100]的数字
			if (nums[i] % 10 == 8) {// 如果生成的数字个位数为8则写入文件
				bWriter.write(nums[i] + "");// 转为字符串
				bWriter.newLine();// 保证一行只有一个数字
			}
		}
		bWriter.close();
		/*
		 * 问题：如果将int类型写入文件中，就会先转为以该数字为ASCII码的字符，再写入
		 * 
		 * 解决：转为字符串后写入
		 */
		String readLn;
		while ((readLn = bReader.readLine()) != null) {
			System.out.println(readLn);
		}
		bReader.close();

	}

}
