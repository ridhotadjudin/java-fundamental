package com.nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping3_StringSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String in;
		String motor[] = { "Suzuki", "Honda", "Yamaha" };

		System.out.print("Cari motor apa : ");
		in = sc.nextLine();
		System.out.println(motor[1]);
		for (String i : motor) {
			System.out.println(i.contentEquals("Honda"));
		}
		for (String i : motor) {
			if (i.contentEquals(in)) {
				System.out.println("Motor " + i + " ditemukan");
			}
		}

	}

}
