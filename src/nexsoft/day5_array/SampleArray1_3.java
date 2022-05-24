package nexsoft.day5_array;

import java.util.Scanner;

public class SampleArray1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan jumlah data buah : ");
		int batas = sc.nextInt();
		String title[] = { "Nama", "Harga" };
		String[] arrayBuah = new String[batas];
		Double[] arrayHarga = new Double[batas];

		for (int i = 0; i < batas; i++) {
			System.out.printf("Nama buah  ke %d: ", i + 1);
			arrayBuah[i] = sc.next();
			System.out.printf("Harga buah ke %d: ", i + 1);
			arrayHarga[i] = sc.nextDouble();
		}
		System.out.println();
		System.out.printf("%-13s%s\n", title[0], title[1]);
		System.out.println("========================");
		for (int j = 0; j < batas; j++) {
			System.out.printf("%-12s Rp. %.2f\n", arrayBuah[j], arrayHarga[j]);
		}

	}

}
