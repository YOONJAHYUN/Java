package project0403;

public class Test04_최대값최소값구하기 {
	public static void main(String[] args) {
		int[] arr = {21, 3, 45,  67, 99, 11,24, 105};
		
		// 최소값
		int min = arr[0]; // 첫번째 원소를 최소값이라고 가정.
		// 최대값
		int max = arr[0]; // 임시 최대값
		
		for (int i=1; i<arr.length; i++) {
			if(arr[i]<min) min = arr[i];
			if(arr[i]>max) max = arr[i];
		}
		System.out.println(min);
		System.out.println(max);
	}
}
