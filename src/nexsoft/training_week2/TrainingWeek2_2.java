package nexsoft.training_week2;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainingWeek2_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*
		 * 1 2 3 4 5
		 * 
		 * 6 7 8 9 10
		 */

		ArrayList<Integer> angka = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			System.out.print("Masukkan angka: ");
			angka.add(scan.nextInt());
		}
		System.out.println(angka);
		System.out.println(angka.get(2));

	}

}
