package nexsoft.day6_function;

import java.util.Scanner;

public class SampleFunction7 {
	
	//var global
	static int usia = 50;
	static String jenisKelamin = "Laki-laki";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//var lokal
		int usia = 60;
		
		System.out.println("Masukkan usia : "+usia); //var lokal
		System.out.println("Masukkan usia : "+SampleFunction7.usia); //var global
		System.out.println("Masukkan jenis kelamin : "+jenisKelamin); //var global
		
		System.out.println("Method");
		identitas(); //memanggil static
		new SampleFunction7().identitas1();//memanggil non static
		
		System.out.println();
		System.out.print("Masukkan panjang sisi : ");
		double input = sc.nextDouble();
		double a = 5;
		SampleFunction7 tes = new SampleFunction7();
		System.out.println(tes.luasPersegi(input));
		
		System.out.println(tes.luasPersegi(a));
		
	}
	
	//fungsi identitas mengakses variabel global
	static void identitas() {
		System.out.println();
		System.out.println("Usia = "+usia);	//var global
		System.out.println("Jenis kelamin = "+jenisKelamin);//var global
	}
	//non static
	void identitas1() {
		System.out.println();
		System.out.println("Usia = "+usia);	//var global
		System.out.println("Jenis kelamin = "+jenisKelamin);//var global
	}
	
	double luasPersegi(double sisi){
		return sisi*sisi;
	}

}
