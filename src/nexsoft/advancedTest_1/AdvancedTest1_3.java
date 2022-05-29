package nexsoft.advancedTest_1;

import java.util.Scanner;

public class AdvancedTest1_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		4;
//		6;
		
		System.out.print("Masukkan angka: ");
		int input = sc.nextInt();
		
		int tambah = input + 3;
		System.out.println(tambah);

		int kali = tambah * 3;
		System.out.println(kali);
	}

}
