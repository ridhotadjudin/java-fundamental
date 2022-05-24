package nexsoft.day4_logic;

import java.util.Scanner;

public class SampleLogic2_LuasSegitiga {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// program segitiga
		System.out.println("LUAS SEGITIGA");
		System.out.print("Masukkan tinggi: ");
		int tinggi = sc.nextInt();
		System.out.print("Masukkan alas  : ");
		int alas = sc.nextInt();

		double luas = 0.5 * alas * tinggi;
		System.out.println("Luas segitiga = " + luas);

	}

}
