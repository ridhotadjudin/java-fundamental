package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping7_ArrayInputOutput3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nilai[] = new int[4];
		System.out.print("Masukkan nilai : ");
		for (int i = 0; i < nilai.length; i++) {
			nilai[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i : nilai) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("Jumlah Nilai = " + sum);

	}

}
