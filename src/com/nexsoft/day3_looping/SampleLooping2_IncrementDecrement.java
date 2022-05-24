package com.nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping2_IncrementDecrement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Berapa kali tampil : ");
		int input = sc.nextInt();

		// looping dengan inkremen
		for (int i = 1; i <= input; i++) {
			System.out.println(i + ". Nexsoft");
		}

		System.out.println();
		System.out.println("////////////////");
		//////////////

		// looping dengan inkremen custom
		for (int i = 1; i <= input; i += 2) {
			System.out.println(i + ". Nexsoft");
		}

		System.out.println();
		System.out.println("////////////////");
		//////////////

		// mengulang (decrement) hingga parameter yang ditentukan
		for (int i = 10; i > input; i--) {
			System.out.println(i + ". Nexsoft");
		}
		System.out.println();
		System.out.println("////////////////");
		//////////////

		String nama = "Nexsoft";
		for (int i = 1; i <= nama.length(); i++) {
			System.out.println(i + " ");
		}

	}

}
