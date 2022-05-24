package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping17_Raraban {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Perkalian : ");
		int input = sc.nextInt();
		System.out.print("Jumlah tampil : ");
		int jumlah = sc.nextInt();
		
		int hasil = 0;
		for(int i=1;i<=jumlah;i++) {
			hasil = input * i;
//			System.out.println(input+" x "+i+" = "+hasil);
			System.out.printf("%d x %d = %d \n",input,i,hasil);
		}
		
	}

}
