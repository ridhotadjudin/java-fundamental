package nexsoft.advancedTest_1;

import java.util.Scanner;

public class AdvancedTest1_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		4;
//		7;
//		22;
		
		System.out.print("Masukkan angka: ");
		int input = sc.nextInt();

		if (input % 2 == 0) {
			System.out.println("Not Weird");
		} else {
			System.out.println("Weird");
		}

	}

}
