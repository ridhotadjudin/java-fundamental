package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping10_NumberStarDecrement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nilai awal : ");
		int in1 = sc.nextInt();
		System.out.print("Nilai akhir : ");
		int in2 = sc.nextInt();

		for (int k = in2; k >= 0; k--) {
			for (int i = in1; i <= k; i++) {
				if (i % 2 == 1) {
					System.out.print("* ");
				} else {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

	}

}
