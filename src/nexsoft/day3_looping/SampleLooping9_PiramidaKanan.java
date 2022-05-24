package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping9_PiramidaKanan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input;
		System.out.print("Berapa panjang : ");
		input = sc.nextInt();
		for (int i = 0; i <= input; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int k = input; k >= 0; k--) {
			for (int l = 0; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
