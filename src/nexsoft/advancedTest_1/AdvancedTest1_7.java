package nexsoft.advancedTest_1;

import java.util.Scanner;

public class AdvancedTest1_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		"Weekday";
//		"Weekend";
//		"111";
		
		System.out.print("Weekday/Weekend? : ");
		String input = sc.nextLine();
		
		switch (input) {
		case "Weekday":
			System.out.println("Senin Selasa Rabu Kamis Jum'at");
			break;
		case "Weekend":
			System.out.println("Sabtu Minggu");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

	}

}
