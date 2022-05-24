package nexsoft.day5_array;

import java.util.Scanner;

public class tugasDay5_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
		//input: 1 2 3 4 5		hasil 3
		//input: 6 7 8 9 10		hasil 8

		int angka[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("angka ke " + (i + 1) + " : ");
			angka[i] = scan.nextInt();
		}
		System.out.print(angka[2]);

	}

}
