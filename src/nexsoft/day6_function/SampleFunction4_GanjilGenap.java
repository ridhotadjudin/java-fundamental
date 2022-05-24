package nexsoft.day6_function;

import java.util.Scanner;

public class SampleFunction4_GanjilGenap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan angka : ");
		int input = sc.nextInt();
		System.out.println(input + " adalah bilangan " + ganjilGenap(input));

	}

	// beda static void dan static string
	static String ganjilGenap(int in) {
		String a;
		if (in % 2 == 0) {
			return a = "genap";
		} else {
			return a = "ganjil";
		}
	}

	static void ganjilGenapv(int in) {
		String a;
		if (in % 2 == 0) {
			System.out.println(in + " adalah bilangan genap");
		} else {
			System.out.println(in + " adalah bilangan ganjil");
		}
	}

}
