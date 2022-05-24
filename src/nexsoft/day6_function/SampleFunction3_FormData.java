package nexsoft.day6_function;

import java.util.Scanner;

public class SampleFunction3_FormData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		formData("Ridho","Jawa Barat");

		System.out.print("Masukkan nama : ");
		String in1 = sc.nextLine();
		System.out.print("Masukkan alamat : ");
		String in2 = sc.nextLine();

		System.out.println();
		formData(in1, in2);
	}

	static void formData(String nama, String alamat) {
		System.out.println("===CETAK FORM DATA===");
		System.out.printf("Nama  : %s\n", nama);
		System.out.printf("Alamat: %s\n", alamat);
	}

}
