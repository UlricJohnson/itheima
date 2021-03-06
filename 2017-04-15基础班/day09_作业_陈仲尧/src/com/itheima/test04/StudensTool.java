package com.itheima.test04;

public class StudensTool {

	public StudensTool() {
		// TODO Auto-generated constructor stub
	}

	// 遍历打印学生信息
	public void listStudents(Student[] arr) {
		System.out.println("Students list: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("#" + (i + 1) + " name: " + arr[i].getName() + "\tage: " + arr[i].getAge() + "\tscore: "
					+ arr[i].getScore());
		}
	}

	// 获取学生成绩的最高分
	public int getMaxScore(Student[] arr) {
		int highestScore = arr[0].getScore();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getScore() > highestScore) {
				highestScore = arr[i].getScore();
			}
		}
		return highestScore;
	}

	// 获取成绩最高的学员
	public Student getMaxStudent(Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getScore() == getMaxScore(arr)) {
				return arr[i];
			}
		}
		return arr[0];// 否则返回第1个
	}

	// 获取学生成绩的平均值
	public int getAverageScore(Student[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].getScore();
		}
		return sum / arr.length;
	}

	// 获取不及格的学员数量
	public int getCount(Student[] arr) {
		int numOfFailed = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getScore() < 60) {
				numOfFailed++;
			}
		}
		return numOfFailed;
	}

}
