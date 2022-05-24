package nexsoft.day5_array;

import java.util.Scanner;

public class tugasDay5_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
		//input:
		//Java
		//Sang
		//Juara
		
		//input:
		//Para
		//Juara
		//Java

		String nama[] = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("kata ke " + (i + 1) + " : ");
			nama[i] = scan.nextLine();
		}
		for (int j = 0; j < nama.length; j++) {
			System.out.print(nama[j] + " ");
		}

	}

}
