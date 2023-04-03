package jh_project;

import java.util.Arrays;


public class Test04_배열의복사 {
	public static void main(String[] args) {
		int[] scores = new int[] {29,  45, 67, 84, 92};
				
		int[] newscores = new int[10];
		for(int i=0; i<5; i++) {
			newscores[i] = scores[i];
		}
		System.out.println(Arrays.toString(newscores));
		int[] newscores2 = Arrays.copyOf(scores,  10);
		System.out.println(Arrays.toString(newscores2));
	}
}
