package nexsoft.weeklyTest_1;

import java.util.Scanner;

//SOAL 2 - 09 Assignment Operator

public class week1_soal2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		//input 4 hasil 7, 21
		//input 6 hasil 9, 27
		
	    int nilaiTambah, nilaiKali;
	    System.out.print("Masukkan angka : ");
	    int nilai = scan.nextInt();
	    
	    nilaiTambah = nilai + 3;
	    nilaiKali = nilaiTambah * 3;
	    
		System.out.println(nilaiTambah);
		System.out.println(nilaiKali);
		

	}

}
