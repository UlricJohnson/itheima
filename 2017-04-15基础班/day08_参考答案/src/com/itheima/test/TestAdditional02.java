package com.itheima.test;

public class TestAdditional02 {
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
		demo5();
	}
	private static void demo5() {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";//����s3��һ���¶���,
							 // s1��һ������,���������ܶԱ��������Ż�����,����ƴ���ǳ�������ʱ���е�,���Ի�����´�.
		System.out.println(s3 == s2);       //false: 
		System.out.println(s3.equals(s2));  //true		
	}
	private static void demo4() {
		//byte b = 3 + 4;						
		String s1 = "a" + "b" + "c";//����"a","b","c"���ǳ���������������Ż�,�����ͱ����"abc"����
		String s2 = "abc";
		System.out.println(s1 == s2); 	   //true		
		System.out.println(s1.equals(s2)); //true 		
	}
	private static void demo3() {
		String s1 = new String("abc");				
		String s2 = "abc";						
		System.out.println(s1 == s2); 	   //false		
		System.out.println(s1.equals(s2)); //true		
	}
	private static void demo2() {
			
		String s1 = new String("abc");	// ��仰�����˼������� 	
		System.out.println(s1);		    // 2������
		
	}
	private static void demo1() {				
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); 		//true			
		System.out.println(s1.equals(s2)); 	//true	
	}
}
