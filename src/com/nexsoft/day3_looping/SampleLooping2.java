package com.nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=10;
		System.out.print("Nilai awal : ");
		int in1 = sc.nextInt();
		System.out.print("Nilai akhir : ");
		int in2 = sc.nextInt();
		for(int i=in1;i<=in2;i++) {
			if(i%2==0) {
				System.out.print("* ");
			}else {
				System.out.print(i+" ");
			}
		}
		
		///////////////
		
//		int input;
//		System.out.print("Berapa panjang : ");
//		input = sc.nextInt();
//		for(int i=0; i<=input; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int k=input; k>=0; k--) {
//			for(int l=0; l<=k; l++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//////////////
		
//		System.out.print("Nilai awal : ");
//		int in1 = sc.nextInt();
//		System.out.print("Nilai akhir : ");
//		int in2 = sc.nextInt();
//		
//		for(int k=in2; k>=0; k--) {
//			for(int i=in1;i<=k;i++) {
//				if(i%2==1) {
//					System.out.print("* ");
//				}else {
//					System.out.print(i+" ");
//				}
//			}
//			System.out.println();
//		}
		
		/////////////
		
//		System.out.print("Nilai awal : ");
//		int in1 = sc.nextInt();
//		System.out.print("Nilai akhir : ");
//		int in2 = sc.nextInt();
//		int total = 0;
//		
//		for(int i =in1; i<=in2; i++) {
//			if(i%3==0) {
//				total = total + i;
//				System.out.print(i+" ");
//			}else if (i%5==0) {
//				total = total + i;
//				System.out.print(i+" ");
//			}
//		}
//		System.out.println();
//		System.out.println("Total = "+total);
		
		
		//////////////
		
//		String uname, pass;
//		String dbUname[] = {"ridho","dori","dodo"};
//		String dbPass[] = {"1","2","3"};
//		
//		System.out.println("LOGIN");
//		System.out.print("Username : ");
//		uname = sc.nextLine();
//		System.out.print("Password : ");
//		pass = sc.nextLine();
//		System.out.println("");
//		
//		for(int i=0;i<dbUname.length;i++) {
//			if(uname.equalsIgnoreCase(dbUname[i])) {
//				for(int j=0;j<dbPass.length;j++) {
//					if(pass.equalsIgnoreCase(dbPass[j])) {
//						System.out.print("Cocok! User:"+uname);
//					}else {
//						System.out.println("Nama dan password salah!");
//						break;
//					}
//				}
//				break;
//			}else {
//				System.out.println("Nama salah!");
//			}
//			
//		}
		
	}

}
