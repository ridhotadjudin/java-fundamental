package nexsoft.day5_array;

import java.util.Scanner;

public class tugasDay5_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
		//Buatlah sebuah program untuk mengetahui ada berapa isi dari sebuah array di bawah ini dan panggil murid yang bernama Koswara
		//diketahui sebuah kelas mempunyai murid dengan data berikut 
		//Dewabrata, Ahmad Aqil, Hanif, Koswara, Paulus, Yudha, Dewi, Desi
		//Output :
		//Jumlah Murid : 8 Dan yang di panggil : Koswara
		
		String nama[] = { "Dewabrata", "Ahmad Aqil", "Hanif", "Koswara", "Paulus", "Yudha", "Dewi", "Desi" };
		int jumlah = nama.length;
		System.out.println("Jumlah Murid : " + jumlah + " Dan yang di panggil : " + nama[3]);

	}

}
