package com.nexsoft.day1;

import java.util.Calendar;
import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		// BIODATA
		//nama, umur, alamat
		
		Scanner sc = new Scanner(System.in);
		
//		int a = 10;
//		int b = 5;
//		int hasil = a/b;
//		System.out.printf("&.2f",hasil);
		
		///////////////////
		
//		String nama;
//		int tahunKerja, tahunTotal;
//		
//		Calendar kalender = Calendar.getInstance();
//		int tahunsekarang = kalender.get(Calendar.YEAR);
//		
//		System.out.print("Masukkan Nama : ");
//		nama = sc.nextLine();
//		System.out.print("Masukkan tahun mulai bekerja : ");
//		tahunKerja = sc.nextInt();
//		
//		tahunTotal = tahunsekarang - tahunKerja;
//		
//		System.out.println(" ");
//		System.out.println("Nama karyawan : "+nama);
//		System.out.println("Lama bekerja  : "+tahunTotal+" tahun");
		
		/////////////////
		
		int nilai;
		String predikat;
		
		System.out.print("Masukkan nilai : ");
		nilai = sc.nextInt();
		sc.nextLine();
		System.out.print("Masukkan predikat : ");
		predikat = sc.nextLine();
		
		if(nilai>90) {
			System.out.print("Indek nilai : "+predikat);
		}
	
		/////////////////
		
//		String nama, alamat;
//		int umur;
//		
//		System.out.print("Masukkan Nama   : ");
//		nama = sc.next();
//		System.out.print("Masukkan Umur   : ");
//		umur = sc.nextInt();
//		sc.nextLine(); 
//		System.out.print("Masukkan Alamat : ");
//		alamat = sc.nextLine();
//		
//		System.out.println(" ");
//		System.out.println("BIODATA");
//		System.out.println("Nama   = "+nama);
//		System.out.println("Umur   = "+umur);
//		System.out.println("Alamat = "+alamat);
	}

}
