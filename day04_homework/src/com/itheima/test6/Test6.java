package com.itheima.test6;

public class Test6 {

	public static void main(String[] args) {
		Employee emp = new Employee() {

			@Override
			public void work() {
				System.out.println("员工工作");
			}

			@Override
			public void meet() {
				System.out.println("员工开会");
			}
		};
		// }.work();
		// }.meet();
		
		emp.work();
		emp.meet();

	}

}
