package jh_project;

import java.util.Scanner;

public class Test05_do_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1을 입력받으면 계속 반복
		// 그  외의 값이면 종료(반복안함)
		int num = sc.nextInt();
		do {
			System.out.println("블록을 실행합니다.(단 첫번째에 한해서는 무조건 실행)");
			num = sc.nextInt();
		} while(num ==1);
	}

}
