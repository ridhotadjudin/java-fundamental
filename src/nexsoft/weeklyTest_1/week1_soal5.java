package nexsoft.weeklyTest_1;

import java.util.Scanner;

//SOAL 5 - 18 Loops II
//piramida

public class week1_soal5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//INPUT SOAL angka 5 dan 6
		
		System.out.print("Masukkan baris : ");
		int baris = sc.nextInt();
		int k=0;

		for (int i = 1; i <= baris; ++i, k = 0) {
			for (int j = 1; j <= baris - i; ++j) {
				System.out.print("  ");
			}

			while (k != 2 * i - 1) {
				System.out.print("* ");
				++k;
			}

			System.out.println();
		}

	}

}
