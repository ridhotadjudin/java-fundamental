package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping11_KelipatanDuaTotal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nilai awal : ");
		int in1 = sc.nextInt();
		System.out.print("Nilai akhir : ");
		int in2 = sc.nextInt();
		int total = 0;

		for (int i = in1; i <= in2; i++) {
			if (i % 3 == 0) {
				total = total + i;
				System.out.print(i + " ");
			} else if (i % 5 == 0) {
				total = total + i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("Total = " + total);

	}

}
