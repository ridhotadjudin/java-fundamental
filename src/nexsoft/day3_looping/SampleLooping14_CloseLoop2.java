package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping14_CloseLoop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String kata;
		boolean jawab = true;
		int hitung = 0;
		while(jawab){
			System.out.print("Keluar? [y/n]: ");
			kata = sc.nextLine();
			if(kata.equals("y")) {
				jawab = false;
				System.out.println("Program closed!");
			}
			hitung++;
		}
		System.out.println("Total perulangan = "+hitung);
		
		System.out.println();
		System.out.println("//////////////////");
		///////////////////////
		String kata2;
		do{
			System.out.print("Keluar? [y/n]: ");
			kata2 = sc.nextLine();
		}while(!kata2.equals("y"));
		System.out.println("Program closed!");

	}

}
