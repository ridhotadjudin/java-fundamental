package nexsoft.day6_function;

import java.util.Scanner;

public class tugasDay6_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String in1 = scan.nextLine();
		String in2 = scan.nextLine();
		int in3 = scan.nextInt();

		karyawan(in1, in2, in3);
	}

	static void karyawan(String in1, String in2, int in3) {
		System.out.println("Nama: " + in1.toUpperCase());
		System.out.println("Profesi: " + in2.toUpperCase());
		System.out.println("Salary: " + in1);
	}

}
