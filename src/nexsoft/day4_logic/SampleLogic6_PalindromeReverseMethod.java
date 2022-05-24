package nexsoft.day4_logic;

import java.util.Scanner;

public class SampleLogic6_PalindromeReverseMethod {

	public void palindrome(String teks) {
		String balik = "";
		for (int i = teks.length(); i > 0; i--) {
			String huruf = teks.substring(i - 1, i);
			balik += huruf;
		}
		System.out.print("Hasil manual : ");
		if (teks.equals(balik)) {
			System.out.println(teks.toUpperCase() + " adalah palindrome.");
		} else {
			System.out.println(teks.toUpperCase() + " bukan palindrome.");
		}
	}

	public void palindromeReverse(String teks2) {
		StringBuffer balik = new StringBuffer(teks2);
		balik.reverse();
		System.out.print("Hasil function reverse : ");
		if (teks2.equals(balik.toString())) {
			System.out.println(teks2.toUpperCase() + " adalah palindrome.");
		} else {
			System.out.println(teks2.toUpperCase() + " bukan palindrome.");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan kata : ");
		String input = sc.nextLine();
		new SampleLogic6_PalindromeReverseMethod().palindrome(input);
		new SampleLogic6_PalindromeReverseMethod().palindromeReverse(input);
	}

}
