package nexsoft.day9_postTest10;

import java.util.Scanner;

import nexsoft.day9_lambda.Addable;

interface Karyawan {
	public void print();
}

public class PostTest10_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Masukkan Nama: ");
		String nama = sc.nextLine();
		System.out.print("Masukkan jabatan: ");
		String jabatan = sc.nextLine();
		System.out.print("Masukkan Gaji: ");
		int gaji = sc.nextInt();
		
		Karyawan kar = () -> {
				System.out.println("ID: "+id);
				System.out.println("Nama: "+nama);
				System.out.println("Jabatan: "+jabatan);
				System.out.println("Salary: "+gaji);
		};
		kar.print();


	}

}
