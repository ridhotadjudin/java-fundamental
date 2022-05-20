package com.nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int i = 0, sum = 0;
//		while(i < 5) {
//			sum += i;
//			System.out.println(i);
//			if(sum >= 5) break;
//			i++;
//		}
//		System.out.println(sum);
		
		////////////
		
//		int i = 0, sum = 0;
//		while(i < 5) {
//			i++;
//			if(i == 3) continue;
//			sum += i;
//			System.out.println("item = "+i);
//		}
//		System.out.println("sum = "+sum);
		
		////////////
		
//		int sum = 0;
//		for(int i = 0; i < 10; i++) {
//			if(i == 4) {
//				continue;
//			}
//			sum += i;
//			System.out.println("item = "+i);
//		}
//		System.out.println("sum = "+sum);
		
		////////////

//		while(true) {
//			System.out.print("Close [ya/tidak] : ");
//			String jawab = sc.nextLine();
//			if(jawab.equalsIgnoreCase("ya")) {
//				break;
//			}
//		} 
//		System.out.println("Terima kasih");
		
		//////////////
		
//		while(true) {
//			System.out.print("Masukkan angka : ");
//			int jawab = sc.nextInt();
//			if(jawab == 0) {
//				break;
//			}
//		} 
//		System.out.println("Terima kasih");
		
		/////////////////
		
//		String password = "nexsoft";
//		int maxInput = 3, hitung = 0;
//		System.out.println("LOGIN");
		
//		while(true) {
//			System.out.print("Masukkan password : ");
//			String inputPassword = sc.nextLine();
//			if(inputPassword.equalsIgnoreCase(password)) {
//				System.out.println("Berhasil Login");
//				break;
//			}else if(!inputPassword.equalsIgnoreCase(password)) {
//				hitung += 1;
//				System.out.println("Password salah!");
//				if(hitung == maxInput) {
//					System.out.println("Percobaan telah gagal "+hitung+" kali");
//					break;
//				}
//			}
//		}
		
//		while(true) {
//			System.out.print("Masukkan password : ");
//			String inputPassword = sc.nextLine();
//			if(inputPassword.equals(password)) {
//				System.out.println("Berhasil Login");
//				break;
//			}else if(!inputPassword.equals(password)) {
//				hitung += 1;
//				System.out.println("Percobaan login gagal!");
//				if(hitung == maxInput) {
//					System.out.println("Percobaan telah gagal "+hitung+" kali");
//					break;
//				}
//			}
//		}
		
		//////////////
		
//		int n1 = 0, n2 = 1;
//		System.out.print("Jumah deret angka : ");
//		int jumlah = sc.nextInt();
		
//		for(int i=0;i<=jumlah;i++) {
//			System.out.print(n1+" ");
//			int total=n1+n2;
//			n1 = n2;
//			n2 = total;
//		}
		
//		int i=0, total=0;
//		while(i<=jumlah) {
//			System.out.print(n1+" ");
//			total=n1+n2;
//			n1 = n2;
//			n2 = total;
//			i++;
//		}
		
		/////////////////
		
//		System.out.print("Nilai : ");
//		int input = sc.nextInt();
//		System.out.print("Jumlah loop : ");
//		int jumlah = sc.nextInt();
//		
//		int hasil = 0;
//		for(int i=1;i<=jumlah;i++) {
//			hasil = input * i;
////			System.out.println(input+" x "+i+" = "+hasil);
//			System.out.printf("%d x %d = %d \n",input,i,hasil);
//		}
		
		for(int i = 1; i <= 21; i += 2){

			System.out.print( i + " ");

		}
		
	}

}
