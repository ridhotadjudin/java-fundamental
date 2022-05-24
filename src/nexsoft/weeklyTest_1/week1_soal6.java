package nexsoft.weeklyTest_1;

import java.util.Scanner;

//SOAL 6 - 16 Loops I

public class week1_soal6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		//input 2,5
		//input 3,6
		
		System.out.print("Masukkan angka perkalian : ");
		int input = scan.nextInt();
		System.out.print("Masukkan jumlah baris : ");
		int jumlah = scan.nextInt();
			
		int hasil = 0;
		for(int i=1;i<=jumlah;i++) {
			hasil = input * i;
			System.out.printf("%d x %d = %d \n",input,i,hasil);
		}

	}

}
