package nexsoft.advancedTest_1;

import java.util.Scanner;

public class AdvancedTest1_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		12;
//		1234;

//		13;
//		1235;

//		14;
//		1237;
		
		System.out.print("Masukkan tanggal: ");
		int input1 = sc.nextInt();
		System.out.print("Masukkan plat nomor: ");
		int input2 = sc.nextInt();

		if (input1 % 2 == 0) {
			if (input2 % 2 == 0) {
				System.out.println("Tanggal genap dan plat nomor genap");
			} else {
				System.out.println("Tanggal genap dan plat nomor ganjil");
			}
		} else {
			if (input2 % 2 == 0) {
				System.out.println("Tanggal ganjil dan plat nomor genap");
			} else {
				System.out.println("Tanggal ganjil dan plat nomor ganjil");
			}
		}

	}

}
