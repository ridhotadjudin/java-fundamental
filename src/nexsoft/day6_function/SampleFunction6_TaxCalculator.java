package nexsoft.day6_function;

import java.util.Scanner;

public class SampleFunction6_TaxCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Penghasilan : ");
		double input = sc.nextDouble();

		if (persenPajak(input) == 0) {
			System.out.println("Bukan wajib pajak!");
		} else {
			System.out.printf("Persentase pajak = %.0f%%\n", persenPajak(input));
			System.out.printf("Total pajak tahunan = %.2f\n", pajakTahun(input));
			System.out.printf("Gaji bersih = %.2f\n", gajiBersih(input));
		}
	}
	
	static double persenPajak(double in) {
		double persen = 0;
		if (in >= 7000000) {
			persen = 10;
		} else {
			persen = 0;
		}
		return persen;
	}
	
	static double gajiTahun(double in) {
		double total = in * 12;
		return total;
	}

	static double pajakTahun(double in) {
		double pajak = gajiTahun(in) * persenPajak(in) / 100;
		return pajak;
	}
	
	static double gajiBersih(double in) {
		double gaji = gajiTahun(in) - pajakTahun(in);
		return gaji;
	}

}