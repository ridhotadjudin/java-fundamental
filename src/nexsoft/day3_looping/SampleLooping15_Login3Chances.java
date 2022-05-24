package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping15_Login3Chances {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String password = "nexsoft";
		int maxInput = 3, hitung = 0;
		System.out.println("LOGIN");

//		while (true) {
//			System.out.print("Masukkan password : ");
//			String inputPassword = sc.nextLine();
//			if (inputPassword.equalsIgnoreCase(password)) {
//				System.out.println("Berhasil Login");
//				break;
//			} else if (!inputPassword.equalsIgnoreCase(password)) {
//				hitung += 1;
//				System.out.println("Password salah!");
//				if (hitung == maxInput) {
//					System.out.println("Percobaan telah gagal " + hitung + " kali");
//					break;
//				}
//			}
//		}

		while (true) {
			System.out.print("Masukkan password : ");
			String inputPassword = sc.nextLine();
			if (inputPassword.equals(password)) {
				System.out.println("Berhasil Login");
				break;
			} else if (!inputPassword.equals(password)) {
				hitung += 1;
				System.out.println("Percobaan login gagal!");
				if (hitung == maxInput) {
					System.out.println("Percobaan telah gagal " + hitung + " kali");
					break;
				}
			}
		}

	}

}
