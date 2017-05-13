package com.itheima.test;

public class Test02 {

	/*
	 * �ڶ��⣺�����������󣬲��ô���ʵ��
	1.�������·���public static String getPropertyGetMethodName(String property)
		��������: name->getName age->getAge  price->getPrice   helloWorld->getHelloWorld
			(1)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��get����������
			(2)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"getName"
	2.�������·���public static String getPropertySetMethodName(String property)
		��������:
			(1)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��set����������
			(2)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"setName"
	 */
	public static void main(String[] args) {
		String getMethod = getPropertyGetMethodName("name");
		System.out.println(getMethod);
		
		String setMethod = getPropertySetMethodName("name");
		System.out.println(setMethod);
	}
	
	//��ȡ���ط�������
	public static String getPropertyGetMethodName(String property) {
		//ʹ��get��ƴ�ӣ����ϴ����ַ����ĵ�һ����ĸ��ɴ�д�����ϴ����ַ����Ĵӵڶ�����ʼ���е�����
		String str = "get" + property.substring(0, 1).toUpperCase() + property.substring(1);
		return str;
	}
	
	//��ȡ���÷�������
	public static String getPropertySetMethodName(String property) {
		//ʹ��set��ƴ�ӣ����ϴ����ַ����ĵ�һ����ĸ��ɴ�д�����ϴ����ַ����Ĵӵڶ�����ʼ���е�����
		String str = "set" + property.substring(0, 1).toUpperCase() + property.substring(1);
		return str;
	}
}
