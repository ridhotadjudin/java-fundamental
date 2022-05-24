package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping16_DeretFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = 0, n2 = 1;
		System.out.print("Jumah deret angka : ");
		int jumlah = sc.nextInt();

		for (int i = 0; i <= jumlah; i++) {
			System.out.print(n1 + " ");
			int total = n1 + n2;
			n1 = n2;
			n2 = total;
		}

		int i = 0, total = 0;
		while (i <= jumlah) {
			System.out.print(n1 + " ");
			total = n1 + n2;
			n1 = n2;
			n2 = total;
			i++;
		}

	}

}
