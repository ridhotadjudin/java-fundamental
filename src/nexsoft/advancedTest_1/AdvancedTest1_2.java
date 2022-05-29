package nexsoft.advancedTest_1;

import java.util.Scanner;

public class AdvancedTest1_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		100;
//		80;
//		40;
//		27;
		
		System.out.print("Masukkan angka: ");
		int angka = sc.nextInt();
		
		for (int i = 1; i <= angka; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("BIZZBUZZ");
			} else if (i % 5 == 0) {
				System.out.println("BUZZ");
			} else if (i % 3 == 0) {
				System.out.println("BIZZ");
			}
		}

	}

}
