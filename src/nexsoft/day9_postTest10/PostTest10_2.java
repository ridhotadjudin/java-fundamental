package nexsoft.day9_postTest10;

import java.util.Scanner;

interface BangunDatar{
	public void hitungAngka(int a, int b);
}

public class PostTest10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 2
		 * 5
		 */
		
		System.out.print("Masukkan angka pertama: ");
		int in1 = sc.nextInt();
		System.out.print("Masukkan angka kedua: ");
	    int in2 = sc.nextInt();
	    
		BangunDatar geometry = (a,b) -> {
				System.out.printf("Luas Persegi Panjang = %d x %d = %d\n",a,b,(a*b));
				System.out.printf("Luas Segitiga = 0.5 x %d x %d = %d\n",a,b,(a*b/2));
		};
		geometry.hitungAngka(in1, in2);
	}

}
