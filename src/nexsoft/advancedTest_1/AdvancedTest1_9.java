package nexsoft.advancedTest_1;

import java.util.Scanner;

public class AdvancedTest1_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		2;
//		7;

//		3;
//		10;
		
		System.out.print("Masukkan perkalian: ");
		int input = sc.nextInt();
		System.out.print("Masukkan batas: ");
		int batas = sc.nextInt();

		int hasil = 0;
		for (int i = 3; i <= batas; i += 3) {
			hasil = input * i;
			System.out.printf("%d x %d = %d \n", input, i, hasil);
		}

	}

}
