package com.itheima;

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
 */

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/* 程序启动时把文件内容读到集合中，退出时再把集合中的数据写到文件中，这样效率较高，改动的代码也少 */

		// 从文件读数据
		ArrayList<Student> studentsList = new ArrayList<>();
		String fileName = ".\\src\\com\\itheima\\data.txt";
		readData(fileName, studentsList);

		while (true) {
			System.out.println("----------欢迎登录学生管理系统----------");
			System.out.println("1.查看所有学生");
			System.out.println("2.添加学生信息");
			System.out.println("3.删除学生信息");
			System.out.println("4.修改学生信息");
			System.out.println("5.退出");
			System.out.print("请选择操作：");

			String choiceStr = new Scanner(System.in).nextLine();
			switch (choiceStr) {
			case "1":
				// 查看所有学生
				checkAll(studentsList);
				break;
			case "2":
				// 添加学生信息
				addStudent(studentsList);
				break;
			case "3":
				// 删除学生信息
				removeStudent(studentsList);
				break;
			case "4":
				// 修改学生信息
				alterStudent(studentsList);
				break;
			case "5":
				// 退出
			default:
				// 把数据写入文件
				writerData(studentsList, fileName);
				System.out.println("谢谢您的使用！");
				System.exit(0);
				// break;
			}
		}
	}

	// 从文件读入数据
	public static void readData(String fileName, ArrayList<Student> stuList) throws IOException {
		BufferedReader bReader = new BufferedReader(new FileReader(fileName));
		String readLn;
		while ((readLn = bReader.readLine()) != null) {
			String[] datas = readLn.split(",");
			Student student = new Student();
			student.setId(datas[0]);
			student.setName(datas[1]);
			student.setAge(datas[2]);
			student.setAddress(datas[3]);
			stuList.add(student);
		}
		bReader.close();
	}

	// 把数据写入文件
	public static void writerData(ArrayList<Student> stuList, String fileName) throws IOException {
		BufferedWriter bWriter = new BufferedWriter(new FileWriter(fileName));
		for (int i = 0; i < stuList.size(); i++) {
			StringBuilder sBuilder = new StringBuilder();
			Student student = stuList.get(i);
			sBuilder.append(student.getId()).append(",").append(student.getName()).append(",").append(student.getAge())
					.append(",").append(student.getAddress());
			bWriter.write(sBuilder.toString());
			bWriter.newLine();
			bWriter.flush();
		}
		bWriter.close();
	}

	// 1.查看所有学生
	public static void checkAll(ArrayList<Student> stuList) {
		if (stuList.size() == 0) {// 如果集合长度为0,则退出方法
			System.out.println("对不起，目前系统没有学生信息可供查询，请重新选择操作：");
			return;
		}

		// 否则循环输出
		System.out.println("学号\t姓名\t年龄\t居住地址");
		for (int i = 0; i < stuList.size(); i++) {
			Student student = stuList.get(i);
			System.out.println(
					student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());

		}
	}

	// 2.添加学生信息
	public static void addStudent(ArrayList<Student> stuList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学号：");
		String id;
		// boolean isExist = false;//学号是否已存在
		while (true) {
			boolean isExist = false;// 应该把判断变量放在循环里面
			id = scanner.nextLine();
			for (int i = 0; i < stuList.size(); i++) {
				if (stuList.get(i).getId().equals(id)) {// 如果学号已经存在，则更改标志变量并退出遍历循环
					// System.out.println("学号已存在，请重新输入：");
					isExist = true;
					break;// 跳出遍历集合的循环
				}
			}
			if (isExist) {
				System.out.println("学号已存在，请重新输入：");
			} else {
				break;// 跳出外层输入的循环
			}
		}

		System.out.println("请输入姓名：");
		String name = scanner.nextLine();
		System.out.println("请输入年龄：");
		String age = scanner.nextLine();
		System.out.println("请输入居住地址：");
		String address = scanner.nextLine();

		stuList.add(new Student(id, name, age, address));
		System.out.println("添加成功！");
	}

	// 3.删除学生信息
	public static void removeStudent(ArrayList<Student> stuList) {
		Scanner scanner = new Scanner(System.in);
		if (stuList.size() == 0) {// 判断集合中是否有元素
			System.out.println("对不起，当前系统没有学生信息，请重新选择操作：");
			return;
		}

		System.out.println("请输入学号：");
		String idString = scanner.nextLine();

		// int index=-1;//集合中的索引
		for (int i = 0; i < stuList.size(); i++) {
			if (stuList.get(i).getId().equals(idString)) {// 如果找到该学号则删除并退出方法
				stuList.remove(stuList.get(i));
				System.out.println("删除成功！");
				return;
			}
		}
		// 如果没有找到学号，则提示
		System.out.println("对不起，没有找到该学号！");

	}

	// 4.修改学生信息
	public static void alterStudent(ArrayList<Student> stuList) {
		Scanner scanner = new Scanner(System.in);
		if (stuList.size() == 0) {// 判断集合中是否有元素
			System.out.println("对不起，当前系统没有学生信息，请重新选择操作：");
			return;
		}

		System.out.println("请输入学号：");
		String idString = scanner.nextLine();

		int index = -1;
		for (int i = 0; i < stuList.size(); i++) {
			if (stuList.get(i).getId().equals(idString)) {// 如果找到该学号则删除并退出方法
				index = i;
			}
		}

		if (index == -1) {// 找不到相应学号
			System.out.println("对不起，没有找到该学号！");
		} else {
			System.out.println("请输入新的名字：");
			String newName = scanner.nextLine();
			System.out.println("请输入新的年龄：");
			String newAge = scanner.nextLine();
			System.out.println("请输入新的居住地址：");
			String newAddress = scanner.nextLine();

			// 替换元素
			stuList.set(index, new Student(idString, newName, newAge, newAddress));
			System.out.println("信息更改成功！");
		}

	}

}
