package com.nexsoft.day4_Logic;

import java.util.Scanner;

public class SampleLogic2 {

	public static void main(String[] args) {
//		new SampleLogic2().luasSegitiga(2,4);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan kata : ");
		String input = sc.nextLine();
		new SampleLogic2().palindrome(input);
		new SampleLogic2().palindromeReverse(input);
	}	
	
	public void palindrome(String teks) {
		String balik = "";
		for(int i=teks.length();i>0;i--) {
			String huruf = teks.substring(i-1,i); 
			balik += huruf;
		}
		System.out.print("Hasil manual : ");
		if(teks.equals(balik)) {
			System.out.println(teks.toUpperCase()+" adalah palindrome.");
		}else {
			System.out.println(teks.toUpperCase()+" bukan palindrome.");
		}
	}
	
	public void palindromeReverse(String teks2) {
		StringBuffer balik = new StringBuffer(teks2);
		balik.reverse();
		System.out.print("Hasil function reverse : ");
		if(teks2.equals(balik.toString())) {
			System.out.println(teks2.toUpperCase()+" adalah palindrome.");
		}else {
			System.out.println(teks2.toUpperCase()+" bukan palindrome.");

		}
	}
	
	//////////////
	
//	public static void luasSegitiga(int alas, int tinggi) {
//		double luas = 0.5*alas*tinggi;
//		System.out.printf("%.0f",luas);
//	}

}
