package nexsoft.day4_logic;

import java.util.Scanner;

public class SampleLogic7_Substring2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String nim = "20180102003";
		System.out.println("Masukkan nomor mahasiswa : ");
		String nim = sc.nextLine();

		String tahun = nim.substring(0,4);
		String fakultas = nim.substring(4,6);
		String prodi = nim.substring(6,8);
		String noUrut = nim.substring(8,11);
		
		System.out.println("Tahun masuk: "+tahun);
		System.out.println("Fakultas   : "+fakultas);
		System.out.println("Prodi      : "+prodi);
		System.out.println("No urut    : "+noUrut);

	}

}
