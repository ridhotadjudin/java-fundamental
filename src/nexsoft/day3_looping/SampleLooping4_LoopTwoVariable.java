package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping4_LoopTwoVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nilaiAwal, nilaiAkhir;
		System.out.print("Masukkan nilai awal  : ");
		nilaiAwal = sc.nextInt();
		System.out.print("Masukkan nilai akhir : ");
		nilaiAkhir = sc.nextInt();
		System.out.println("");
		for(int i=nilaiAwal;i<=nilaiAkhir;i++){
			System.out.println(i);
		}

	}

}
