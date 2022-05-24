package nexsoft.day5_array;

import java.util.Scanner;

public class tugasDay5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nama[] = { "Dewabrata", "Ahmad Aqil", "Hanif", "Koswara", "Paulus" };

		System.out.print("Cari murid : "); // cari Ahmad Aqil
		String input = sc.nextLine();

		for (int i = 0; i < nama.length; i++) {
			if (nama[i].equals(input)) {
				System.out.println(nama[i]);
			}
		}

	}

}
