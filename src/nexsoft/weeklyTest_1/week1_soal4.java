package nexsoft.weeklyTest_1;

import java.util.Scanner;

//SOAL 4 - 18 Loops

public class week1_soal4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//input 5
		//input 6
		
		System.out.print("masukan angka : ");
		int input = scan.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = input; j >= i; j--) {
				if (j % 3 == 0) {
					System.out.print("*");
				} else {					
					System.out.print(j);					
				}
			}
			System.out.println();
		}

	}

}
