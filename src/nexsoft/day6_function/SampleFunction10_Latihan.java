package nexsoft.day6_function;

import java.util.Scanner;

class Laptop{
	void spesifikasi(String proc,String ram, String hdd,int in) {
		System.out.println("SPESIFIKASI LAPTOP "+in);
		System.out.println("Processor   : "+proc);
		System.out.println("Memori RAM   : "+ram);
		System.out.println("Kapasitas HDD : "+hdd);
	}
}
public class SampleFunction10_Latihan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Jumlah data laptop : ");
		int jum = sc.nextInt();
		sc.nextLine();
		
		String arProc[] = new String[jum];
		String arRam[] = new String[jum];
		String arHdd[] = new String[jum];
		
		for (int i = 0; i < jum; i++) {
			System.out.println("DATA LAPTOP " + (i + 1));
			System.out.println("Masukkan processor : ");
			arProc[i] = sc.nextLine();
			System.out.println("Masukkan RAM : ");
			arRam[i] = sc.nextLine();
			System.out.println("Masukkan Harddisk : ");
			arHdd[i] = sc.nextLine();
		}
		System.out.println();
		Laptop l1 = new Laptop();
		for(int j=0;j<jum;j++) {
			l1.spesifikasi(arProc[j], arRam[j], arHdd[j],j+1);
		}
		
		
	}

}
