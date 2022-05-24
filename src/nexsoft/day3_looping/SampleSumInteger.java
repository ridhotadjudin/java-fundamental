package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleSumInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nilai pertama: ");
		int nilai1 = sc.nextInt();
		System.out.print("Nilai kedua  : ");
		int nilai2 = sc.nextInt();
		System.out.println("Sum = " + Integer.sum(nilai1, nilai2));

	}

}
