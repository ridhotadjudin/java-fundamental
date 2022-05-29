package nexsoft.advancedTest_1;

import java.util.Scanner;

public class AdvancedTest1_4 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
//		"Para Juara";
//		"Java";
		
		System.out.print("Masukkan kalimat: ");
		String input = sc.nextLine();

		int i = 1;
		do {
			i++;
		} while (i < input.length());

		String upper = input.toUpperCase();
		String lower = input.toLowerCase();
		System.out.println("Jumlah karakter adalah "+i);
		System.out.println(upper);
		System.out.println(lower);
	}

}
