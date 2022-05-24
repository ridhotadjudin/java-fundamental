package nexsoft.day4_logic;

import java.util.Scanner;

public class SampleLogic8_ContainsCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String teks1 = "nexsoft juara";
		System.out.println(teks1.contains("t j")); // case sensitive

		System.out.println();
		System.out.println("/////////////////////");
		///////////////

		String message = "Error: Username Password Invalid";
		if (message.contains("Invalid")) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}

		System.out.println();
		System.out.println("/////////////////////");
		//////////

		// compare to
		String nama1 = "Dono";
		String nama2 = "Doyok";
		System.out.println(nama1.compareTo(nama2));

	}

}
