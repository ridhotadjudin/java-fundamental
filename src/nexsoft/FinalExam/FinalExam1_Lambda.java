package nexsoft.FinalExam;

// LAMBDA

import java.util.Scanner;

interface Karyawan {
	public void print();
}

public class FinalExam1_Lambda {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * 1
		 * Angga
		 * CEO
		 * 5000
		 * 
		 * 2
		 * Cika
		 * Admin
		 * 2000
		 */

		System.out.print("Masukkan ID: ");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.print("Masukkan Nama: ");
		String nama = scan.nextLine();
		System.out.print("Masukkan Jabatan: ");
		String jabatan = scan.nextLine();
		System.out.print("Masukkan Gaji: ");
		int gaji = scan.nextInt();

		Karyawan kar = () -> System.out.printf("ID: %d, Nama: %s, Jabatan: %s, Salary: %d\n", id, nama, jabatan, gaji);
		kar.print();

	}

}
