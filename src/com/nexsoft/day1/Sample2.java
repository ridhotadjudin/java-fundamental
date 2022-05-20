package com.nexsoft.day1;

public class Sample2 {
	public static void main(String[] args) {
		//implicit casting - kecil ke besar - data baru pasti muat dalam data baru
//		int i = 125;
//		long j = i;
//		
//		char huruf = 'W';
//		int angka = huruf;
//		
//		float data = 123.4f;
//		double data2 = data;
//		
//		System.out.println(j);
//		System.out.println(angka);
//		System.out.println(data2);
//		System.out.println(" ");
//		
//		float jarak = 10;
//		float waktu = 3;
//		float cepat = jarak/waktu;
//		double kecepatan = cepat;
//		System.out.println(kecepatan);
		
		
		//explicit casting - besar ke kecil - data lama belum tentu muat muat dalam data baru
		
		float saldoAkhir = 1000.99f;
		int saldoAkhirBulat = (int) saldoAkhir;
		System.out.println(saldoAkhirBulat);
		
	}
}
