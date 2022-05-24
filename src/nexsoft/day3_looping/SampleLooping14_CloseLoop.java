package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping14_CloseLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Close [ya/tidak] : ");
			String jawab = sc.nextLine();
			if (jawab.equalsIgnoreCase("ya")) {
				break;
			}
		}
		System.out.println("Terima kasih");
		
		System.out.println();
		System.out.println("///////////////////");
		//////////////
		
		while(true) {
			System.out.print("Masukkan angka : ");
			int jawab = sc.nextInt();
			if(jawab == 0) {
				break;
			}
		} 
		System.out.println("Terima kasih");

	}

}
