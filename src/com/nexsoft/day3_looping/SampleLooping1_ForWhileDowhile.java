package com.nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping1_ForWhileDowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Berapa kali tampil : ");
		int input = sc.nextInt();

		// for umum
		System.out.print("for umum : ");
		for (int ulang = 0; ulang < input; ulang++) {
			System.out.print(ulang);
		}

		// nested for
		for (int a = 0; a < 0; a++) {
			for (int b = input; b > 0; b--) {
				if (b % 3 == 0) {
					System.out.print("*");
				} else {
					System.out.print(b);
				}

			}
		}
		System.out.println();

		// while
		int ulang = 0;
		while (ulang <= input) {
			System.out.println(ulang);
			ulang++;
		}

		// do while
		do {
			System.out.println(ulang);
			++ulang;
		} while (ulang < input);

	}

}
