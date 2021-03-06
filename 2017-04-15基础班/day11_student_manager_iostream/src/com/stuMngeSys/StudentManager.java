package com.stuMngeSys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 主界面:
 * --------欢迎来到学生管理系统--------
		1 查看所有学生
		2 添加学生
		3 删除学生
		4 修改学生
		5 退出
		请输入你的选择：
 * 
 * 将数据保存到本包的stuData.txt下
 * 
 */

public class StudentManager {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ArrayList<Student> studentsList = new ArrayList<>();

		while (true) {
			System.out.println("----------欢迎登录学生管理系统----------");
			System.out.println("1.查看所有学生");
			System.out.println("2.添加学生信息");
			System.out.println("3.删除学生信息");
			System.out.println("4.修改学生信息");
			System.out.println("5.退出");
			System.out.print("请选择操作：");

			String choiceStr = new Scanner(System.in).next();
			switch (choiceStr) {
			case "1":
				// 查看所有学生
				checkAll();
				break;
			case "2":
				// 添加学生信息
				addStudent();
				break;
			case "3":
				// 删除学生信息
				removeStudent();
				break;
			case "4":
				// 修改学生信息
				alterStudent();
				break;
			case "5":
				// 退出
			default:
				System.out.println("谢谢您的使用！");
				System.exit(0);
				// break;
			}
		}
	}

	// 1.查看所有学生
	public static void checkAll() throws IOException {
		BufferedReader bReader = new BufferedReader(new FileReader(".\\src\\com\\itheima\\bymyself\\stuData.txt"));
		ArrayList<String> stuList = new ArrayList<>();
		String readLn;
		if ((readLn = bReader.readLine()) == null) {// 如果文件中没有内容,则输出提示信息并退出方法
			System.out.println("对不起，目前系统没有学生信息可供查询，请重新选择操作：");
			return;
		}

		// 否则循环输出(此处要用do...while，因为上面已经获取了第1行数据了，如果只有一行数据，则接下来就会读到null)
		System.out.println("学号\t姓名\t年龄\t居住地址");
		// while ((readLn = bReader.readLine()) != null)
		// {//此处要用do...while，因为上面已经获取了第1行数据了，如果只有一行数据，则接下来就会读到null
		// String[] datas = readLn.split(", ");
		// for (int i = 0; i < datas.length; i++) {
		// System.out.print(datas[i] + "\t");
		// }
		// System.out.println();
		// }

		do {
			String[] datas = readLn.split(", ");
			for (int i = 0; i < datas.length; i++) {
				System.out.print(datas[i] + "\t");
			}
			System.out.println();
		} while ((readLn = bReader.readLine()) != null);

		bReader.close();
	}

	// 2.添加学生信息
	public static void addStudent() throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedReader bReader = new BufferedReader(new FileReader(".\\src\\com\\itheima\\bymyself\\stuData.txt"));
		System.out.println("请输入学号：");
		String id;

		// 判断学号是否已存在
		while (true) {
			boolean isExist = false;// 应该把判断变量放在循环里面
			id = scanner.next();
			String readLn;
			while ((readLn = bReader.readLine()) != null) {// 搜索文件中的学号
				if (readLn.split(",")[0].equals(id)) {// 如果已存在
					isExist = true;
				}
			}
			if (isExist) {
				System.out.println("学号已存在，请重新输入：");
			} else {
				break;// 跳出外层输入的循环
			}
		}
		bReader.close();

		System.out.println("请输入姓名：");
		String name = scanner.next();
		System.out.println("请输入年龄：");
		String age = scanner.next();
		System.out.println("请输入居住地址：");
		String address = scanner.next();

		// stuList.add(new Student(id, name, age, address));
		BufferedWriter bWriter = new BufferedWriter(
				new FileWriter(".\\src\\com\\itheima\\bymyself\\stuData.txt", true));
		bWriter.newLine();
		bWriter.write(new StringBuilder().append(id).append(", ").append(name).append(", ").append(age).append(", ")
				.append(address).toString());
		bWriter.close();
		System.out.println("添加成功！");
	}

	// 3.删除学生信息
	public static void removeStudent() throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedReader bReader = new BufferedReader(new FileReader(".\\src\\com\\itheima\\bymyself\\stuData.txt"));
		ArrayList<String> stuList = new ArrayList<>();

		String readLn;
		if ((readLn = bReader.readLine()) == null) {// 如果文件中没有内容,则输出提示信息并退出方法
			System.out.println("对不起，目前系统没有学生信息，请重新选择操作：");
			return;
		}

		System.out.println("请输入学号：");
		String idString = scanner.next();

		// 把读到的每一行数据存进集合中，如果学号相同就跳过，最后把集合中的数据重新写入文件
		boolean isFind = false;// 是否找到该学号
		/*
		 * 跟查看函数一样，需要用do...while
		 */
		// while ((readLn = bReader.readLine()) != null) {
		// if (readLn.split(", ")[0].equals(idString)) {
		// isFind = true;
		// continue;
		// } else {
		// stuList.add(readLn);
		// }
		// }
		do {
			if (readLn.split(", ")[0].equals(idString)) {
				isFind = true;
				continue;
			} else {
				stuList.add(readLn);
			}
		} while ((readLn = bReader.readLine()) != null);
		bReader.close();

		// 把集合中的数据写入文件
		BufferedWriter bWriter = new BufferedWriter(new FileWriter(".\\src\\com\\itheima\\bymyself\\stuData.txt"));
		for (int i = 0; i < stuList.size(); i++) {
			bWriter.write(stuList.get(i));
			if (i < stuList.size() - 1) {
				bWriter.newLine();
			}
			bWriter.flush();
		}
		bWriter.close();

		// 提示
		if (isFind) {
			System.out.println("删除成功！");
		} else {
			System.out.println("对不起，没有找到该学号！");
		}

	}

	// 4.修改学生信息
	public static void alterStudent() throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedReader bReader = new BufferedReader(new FileReader(".\\src\\com\\itheima\\bymyself\\stuData.txt"));
		ArrayList<String> stuList = new ArrayList<>();

		String readLn;
		if ((readLn = bReader.readLine()) == null) {// 如果文件中没有内容,则输出提示信息并退出方法
			System.out.println("对不起，目前系统没有学生信息，请重新选择操作：");
			return;
		}

		System.out.println("请输入学号：");
		String idString = scanner.next();

		// int index = -1;
		// for (int i = 0; i < stuList.size(); i++) {
		// if (stuList.get(i).getId().equals(idString)) {// 如果找到该学号则删除并退出方法
		// index = i;
		// }
		// }

		// if (index == -1) {// 找不到相应学号
		// System.out.println("对不起，没有找到该学号！");
		// } else {
		// System.out.println("请输入新的名字：");
		// String newName = scanner.nextLine();
		// System.out.println("请输入新的年龄：");
		// String newAge = scanner.nextLine();
		// System.out.println("请输入新的居住地址：");
		// String newAddress = scanner.nextLine();
		//
		// // 替换元素
		//// stuList.set(index, new Student(idString, newName, newAge,
		// newAddress));
		// System.out.println("信息更改成功！");
		// }

		// 查找对应学号的信息并修改，其余的数据直接存入集合
		boolean isFind = false;
		do {
			if (readLn.split(", ")[0].equals(idString)) {// 如果找到了要修改的学生学号，就把输入的新的数据添加到集合，并进行下一次循环
				System.out.println("请输入新的名字：");
				String newName = scanner.next();
				System.out.println("请输入新的年龄：");
				String newAge = scanner.next();
				System.out.println("请输入新的居住地址：");
				String newAddress = scanner.next();
				stuList.add(new StringBuilder().append(idString).append(", ").append(newName).append(", ")
						.append(newAge).append(", ").append(newAddress).toString());
				isFind = true;
				continue;
			} else {// 否则直接把数据存入集合
				stuList.add(readLn);
			}
		} while ((readLn = bReader.readLine()) != null);
		bReader.close();

		// 把集合中的数据写入文件
		BufferedWriter bWriter = new BufferedWriter(new FileWriter(".\\src\\com\\itheima\\bymyself\\stuData.txt"));
		for (int i = 0; i < stuList.size(); i++) {
			bWriter.write(stuList.get(i));
			if (i < stuList.size() - 1) {
				bWriter.newLine();
			}
			bWriter.flush();
		}
		bWriter.close();

		if (isFind) {
			System.out.println("修改成功！");
		} else {
			System.out.println("找不到该数据！");
		}
	}

}
