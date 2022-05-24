package nexsoft.day6_function;

import java.util.Scanner;

class Mahasiswa1 {
	static void tampilkan(String in1, String in2) {
		System.out.println("Nama: " + in1.toUpperCase());
		System.out.println("NIM: " + in2);
		System.out.println("Tahun Masuk: " + in2.substring(0, 4));
	}
}

public class tugasDay6_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// yongki
		// 20190101112
		
		System.out.println("Masukkan nama : ");
		String in1 = scan.nextLine();
		System.out.println("Masukkan NIM  :");
		String in2 = scan.nextLine();

		Mahasiswa1 mahasiswa = new Mahasiswa1();
		mahasiswa.tampilkan(in1, in2);

	}

}
