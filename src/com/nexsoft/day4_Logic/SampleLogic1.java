package com.nexsoft.day4_Logic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SampleLogic1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//perbedaan || dan | bitwise
//		int a=10, b=5,c=20;
//		System.out.println(a>b || a<c);
//		System.out.println(a>b | a<c);
//		
//		System.out.println(a>b || a++<c);
//		System.out.println(a);//10
//		System.out.println(a>b | a++<c);
//		System.out.println(a);//11
		
		////////////
		
		//program segitiga
//		System.out.println("LUAS SEGITIGA");
//		System.out.print("Masukkan tinggi: ");
//		int tinggi = sc.nextInt();
//		System.out.print("Masukkan alas  : ");
//		int alas = sc.nextInt();
//		
//		double luas = 0.5*alas*tinggi;
//		System.out.println("Luas segitiga = "+luas);
		
		/////////////
		
		//selain equals ada compare
//		String nama1 = "Doyok", nama2 = "Sudarmaji";
//		System.out.println(nama1.compareTo(nama2));
		
		/////////////
		
		//palindrom kata
//		String input, balik = ""; // Objects of String class
//		System.out.println("Masukkan kata untuk mengecek palindrome");
//		input = sc.nextLine();
//		int panjang = input.length();
//		for (int i = panjang - 1; i >= 0; i--)
//			balik = balik + input.charAt(i);
//		if (input.equals(balik))
//			System.out.println("Kata Yang dimasukkan palindrome.");
//		else
//			System.out.println("Kata yang dimasukkan bukan palindrome.");
	
		/////////////
        
		//hitung pajak
//		double pajak;
//		System.out.println("HITUNG PAJAK");
//		System.out.println("Masukkan jenis kelamin :");
//		String inKel = sc.nextLine();
//		System.out.println("Masukkan status pernikahan : ");
//		String inStatus = sc.nextLine();
//		System.out.println("Masukkan jumlah penghasilan: ");
//		double inPenghasilan = sc.nextInt();
//		
//		if (inPenghasilan >= 7000000) {
//			if (inStatus.equalsIgnoreCase("menikah")) {
//				if (inKel.equalsIgnoreCase("pria")) {
//					pajak = inPenghasilan * 5 / 100;
//					System.out.printf("Jumlah Pajak = %.0f", pajak);
//				} else if (inKel.equalsIgnoreCase("wanita")) {
//					pajak = inPenghasilan * 4 / 100;
//					System.out.printf("Jumlah Pajak = %.0f", pajak);
//				} else {
//					System.out.println("Jenis kelamin tidak terdeteksi");
//				}
//			} else if (inStatus.equalsIgnoreCase("belum menikah")) {
//				if (inKel.equalsIgnoreCase("pria")) {
//					pajak = inPenghasilan * 10 / 100;
//					System.out.printf("Jumlah Pajak = %.0f", pajak);
//				} else if (inKel.equalsIgnoreCase("wanita")) {
//					pajak = inPenghasilan * 7 / 100;
//					System.out.printf("Jumlah Pajak = %.0f", pajak);
//				} else {
//					System.out.println("Jenis kelamin tidak terdeteksi");
//				}
//			} else {
//				System.out.println("Status pernikahan tidak terdeteksi");
//			}
//		} else {
//			System.out.println("Anda bukan wajib pajak");
//		}
		
	}
}
