package nexsoft.day4_logic;

import java.util.Scanner;

public class SampleLogic4_HitungPajak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// selain equals ada compare
		String nama1 = "Doyok", nama2 = "Sudarmaji";
		System.out.println(nama1.compareTo(nama2));

		System.out.println("//////////////////////");
		///////////////

		// hitung pajak
		double pajak;
		System.out.println("HITUNG PAJAK");
		System.out.println("Masukkan jenis kelamin :");
		String inKel = sc.nextLine();
		System.out.println("Masukkan status pernikahan : ");
		String inStatus = sc.nextLine();
		System.out.println("Masukkan jumlah penghasilan: ");
		double inPenghasilan = sc.nextInt();

		if (inPenghasilan >= 7000000) {
			if (inStatus.equalsIgnoreCase("menikah")) {
				if (inKel.equalsIgnoreCase("pria")) {
					pajak = inPenghasilan * 5 / 100;
					System.out.printf("Jumlah Pajak = %.0f", pajak);
				} else if (inKel.equalsIgnoreCase("wanita")) {
					pajak = inPenghasilan * 4 / 100;
					System.out.printf("Jumlah Pajak = %.0f", pajak);
				} else {
					System.out.println("Jenis kelamin tidak terdeteksi");
				}
			} else if (inStatus.equalsIgnoreCase("belum menikah")) {
				if (inKel.equalsIgnoreCase("pria")) {
					pajak = inPenghasilan * 10 / 100;
					System.out.printf("Jumlah Pajak = %.0f", pajak);
				} else if (inKel.equalsIgnoreCase("wanita")) {
					pajak = inPenghasilan * 7 / 100;
					System.out.printf("Jumlah Pajak = %.0f", pajak);
				} else {
					System.out.println("Jenis kelamin tidak terdeteksi");
				}
			} else {
				System.out.println("Status pernikahan tidak terdeteksi");
			}
		} else {
			System.out.println("Anda bukan wajib pajak");
		}

	}
}
