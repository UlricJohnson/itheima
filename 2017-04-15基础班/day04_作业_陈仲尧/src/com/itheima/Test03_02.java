package com.itheima;

public class Test03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,6,7};
        int[] temp = arr1;

        System.out.println("ͨ��tempȡ��arr1�е�Ԫ��: ");

        for(int i = 0;i<temp.length;i++) {
             System.out.print(temp[i]+" ");	// 1 2 3 4 5 
        }
		System.out.println();
       
        temp = arr2;

        System.out.println("ͨ��tempȡ��arr2�е�Ԫ��: ");
       
        for(int i = 0;i<temp.length;i++) {
             System.out.print(temp[i]+" ");	// 5 6 7
        }
	}

}
