package com.nexsoft.day4_Logic;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String teks1 = "nexsoft juara";
//		System.out.println(teks1.substring(12,15)); //gagal karena data tidak ada
//		System.out.println(teks1.substring(1,4));
//		System.out.println(teks1.substring(4,7));
		
//		String nim = "152015021";
//		System.out.println("Jurusan : "+nim.substring(0,2));
//		System.out.println("Tahun masuk : "+nim.substring(2,6));
//		System.out.println("Urut mahasiswa : "+nim.substring(7,9));
		
		/////////
		
//		System.out.println("Masukkan nomor mahasiswa : ");
//		String nim = sc.nextLine();
////		String nim = "20180102003";
//		String tahun = nim.substring(0,4);
//		String fakultas = nim.substring(4,6);
//		String prodi = nim.substring(6,8);
//		String noUrut = nim.substring(8,11);
//		
//		System.out.println("Tahun masuk: "+tahun);
//		System.out.println("Fakultas   : "+fakultas);
//		System.out.println("Prodi      : "+prodi);
//		System.out.println("No urut    : "+noUrut);
		
		//////////
		
//		System.out.println(teks1.contains("t j")); //case sensitive
		
//		String message = "Error: Username Password Invalid";
//		if(message.contains("Invalid")) {
//			System.out.println("Passed!");
//		}else {
//			System.out.println("Failed!");
//		}
		
		//////////
		
		//compare to
		String nama1 = "Dono";
		String nama2 = "Doyok";
		System.out.println(nama1.compareTo(nama2));
		
	}

}
