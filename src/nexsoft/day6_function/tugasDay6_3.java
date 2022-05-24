package nexsoft.day6_function;

import java.util.Scanner;

public class tugasDay6_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double in1 = scan.nextDouble();
		double in2 = scan.nextDouble();
		double in3 = scan.nextDouble();
		System.out.printf("Volume Balok: %.0f meter kubik", volumeBalok(in1, in2, in3));

	}

	static double volumeBalok(double in1, double in2, double in3) {
		return in1 * in2 * in3;
	}
}
