package com.itheima;

/**
 * 2�� �����������󣬲��ô���ʵ��
 * 
 * (1).�������·���public static String getPropertyGetMethodName(String property)
 * 
 * ��������:
 * 
 * a.�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��get����������
 * 
 * b.�磺�û����ô˷���ʱ �������ʵ����"name",�÷����ķ���ֵΪ"getName"���������ʵ��Ϊ"age"���÷����ķ���ֵΪ"getAge"
 * 
 * (2).�������·���public static String getPropertySetMethodName(String property)
 * 
 * ��������:
 * 
 * a.�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��set����������
 * 
 * b.�磺�û����ô˷���ʱ,�������Ĳ���Ϊ"name",��ô�÷����ķ���ֵΪ"setName"���������Ĳ���Ϊ"age"����ô�����ķ���ֵΪ��"setAge"
 * 
 * @author Ulric
 *
 */

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPropertyGetMethodName("name"));
		System.out.println(getPropertySetMethodName("age"));
	}

	// �磺�û����ô˷���ʱ �������ʵ����"name",�÷����ķ���ֵΪ"getName"���������ʵ��Ϊ"age"���÷����ķ���ֵΪ"getAge"
	public static String getPropertyGetMethodName(String property) {
		return "get" + property.substring(0, 1).toUpperCase() + property.substring(1);
	}

	public static String getPropertySetMethodName(String property) {
		return "set" + property.substring(0, 1).toUpperCase() + property.substring(1);
	}
}
