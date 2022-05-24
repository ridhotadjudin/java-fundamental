package com.nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping5_ArrayInputOutput1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String  motor[] = new String[3];
		for(int i=0;i<motor.length;i++) {
			int j = i+1;
			System.out.print("Masukkan motor ke-"+j+": ");	
			motor[i] = sc.nextLine();
		}
		for(int k=0;k<motor.length;k++) {
			int j = k+1;
			System.out.println("Cetak motor "+j+" = "+motor[k]);
		}

	}

}
