package project0403;

public class Test08_2차원배열연습 {
	public static void main(String[] args) {
		//1 2 3 4
		//5 6 7 8
		//9 10 11 12
		//13 14 15 16
		
		int[][] arr = new int[5][5];
		int cnt = 1;
		
		
		for(int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				arr[r][c] = cnt++;
			}
			
		}
		for(int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
	}
}
