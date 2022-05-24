package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping13_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i1 = 0, sum1 = 0;
		while(i1 < 5) {
			sum1 += i1;
			System.out.println(i1);
			if(sum1 >= 5) break;
			i1++;
		}
		System.out.println(sum1);
		
		//////////////
		
		int i2 = 0, sum2 = 0;
		while(i2 < 5) {
			i2++;
			if(i2 == 3) continue;
			sum2 += i2;
			System.out.println("item = "+i2);
		}
		System.out.println("sum = "+sum2);
		
		////////////
		
		int sum3 = 0;
		for(int i = 0; i < 10; i++) {
			if(i == 4) {
				continue;
			}
			sum3 += i;
			System.out.println("item = "+i);
		}
		System.out.println("sum = "+sum3);
		
		int angka = 0, sum = 0;
		System.out.println("Masukkan angka : ");
		angka = sc.nextInt();
		while(angka >= 0) {
			sum += angka;
			angka = sc.nextInt();
		}
		System.out.println("Jumlah = "+sum);
		

	}

}
