package nexsoft.day6_function;

import java.util.Scanner;

public class SampleFunction1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String teks = "Ini Method";
		ucapan(teks);
		ucapan("Ini Fungsi");
		System.out.println();

	}

	static void ucapan(String text) {
		System.out.println(text);
	}

}
