package nexsoft.advancedTest_1;

import java.util.Scanner;

public class AdvancedTest1_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		input 1			input 2
//		2				3
//		5				6
		
		System.out.print("Masukkan angka kelipatan: ");
		double input = sc.nextDouble();
		System.out.print("Ulang sebanyak: ");
		int loop = sc.nextInt();

		if (input % 2 == 0) {
			double ulang = input;
			int i = 0;
			do {
				System.out.print(ulang + " ");
				ulang += ulang;
				i++;
			} while (i < loop);
		} else {
			double ulang = input;
			int j = 0;
			do {
				System.out.print(ulang + " ");
				ulang = ulang * 3;
				j++;
			} while (j < loop);
		}

	}

}
