package nexsoft.day6_function;

import java.util.Scanner;

public class SampleFunction5_MethodCallMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan panjang sisi : ");
		double input = sc.nextDouble();

		System.out.println("Luas kotak = " + luasKotak(input));
		System.out.println("Luas kubus = " + luasKubus(input));
	}

	static double luasKotak(double sisi) {
		double luas = sisi * sisi;
		return luas;
	}

	static double luasKubus(double sisi) {
		return 6 * luasKotak(sisi);
	}

}
