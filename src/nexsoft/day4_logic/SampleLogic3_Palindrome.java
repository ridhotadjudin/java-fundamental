package nexsoft.day4_logic;

import java.util.Scanner;

public class SampleLogic3_Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// palindrom kata
		String input, balik = ""; // Objects of String class
		System.out.println("Masukkan kata untuk mengecek palindrome");
		input = sc.nextLine();
		int panjang = input.length();
		for (int i = panjang - 1; i >= 0; i--)
			balik = balik + input.charAt(i);
		if (input.equals(balik))
			System.out.println("Kata Yang dimasukkan palindrome.");
		else
			System.out.println("Kata yang dimasukkan bukan palindrome.");

	}

}
