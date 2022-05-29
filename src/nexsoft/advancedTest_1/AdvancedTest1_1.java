package nexsoft.advancedTest_1;

import java.util.Scanner;

public class AdvancedTest1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//input 1			input 2
		//10				20
		//20				30

		System.out.print("Masukkan angka ke-1: ");
		int in1 = sc.nextInt();
		System.out.print("Masukkan angka ke-2: ");
		int in2 = sc.nextInt();

		// buat yang suka pakai for
//		for (int i = 0; i <= in1; i += 2) {
//			System.out.print(i + " ");
//		}

		// buat yang suka pakai while
		int i = 0;
		do {
			System.out.print(i + " ");
			i += 2;
		}while(i <= in1);
		System.out.println();

		if (in2 % 4 == 0) {
			for (int j = in2; j >= 0; j -= 4) {
				System.out.print(j + " ");
			}
		} else {
			for (int k = in2 - 2; k >= 0; k -= 4) {
				System.out.print(k + " ");
			}
		}

	}

}
