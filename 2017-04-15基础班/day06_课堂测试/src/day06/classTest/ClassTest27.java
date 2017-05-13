package day06.classTest;

/**
 * (1)����һ��int���͵�һά���飬����Ϊ{6,2,9,15,1,5,20,7,18}
 * 
 * (2)�Ƚ��������Ԫ�������һλԪ�ؽ��н���,�ٽ���СԪ�����һλԪ�ؽ��н���������ӡ����
 * 
 * @author Ulric
 *
 */

public class ClassTest27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 2, 9, 15, 1, 5, 20, 7, 18 };

		// ���������Ԫ�������һλԪ�ؽ��н���
		int max = getMax(arr);
		int maxIndex = getIndex(arr, max);
		int temp = arr[arr.length - 1];
		arr[arr.length - 1] = max;
		arr[maxIndex] = temp;

		// ����СԪ�����һλԪ�ؽ��н���
		int min = getMin(arr);
		int minIndex = getIndex(arr, min);
		temp = arr[0];
		arr[0] = min;
		arr[minIndex] = temp;
		
		//��ӡ����
		printArr(arr);
	}

	// ��ȡ�������ֵ
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// ��ȡ������Сֵ
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// �������
	public static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	// ��ȡԪ���������е�����������ʧ�ܷ���-1
	public static int getIndex(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		return -1;
	}

}
