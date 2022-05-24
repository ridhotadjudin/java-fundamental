package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping8_NumberStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nilai awal : ");
		int in1 = sc.nextInt();
		System.out.print("Nilai akhir : ");
		int in2 = sc.nextInt();
		for (int i = in1; i <= in2; i++) {
			if (i % 2 == 0) {
				System.out.print("* ");
			} else {
				System.out.print(i + " ");
			}
		}

	}

}
