package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping6_ArrayInputOutput2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//nilai = 70,80,75,90
		int  nilai[] = new int[4];
		for(int i=0;i<nilai.length;i++) {
			int j = i+1;
			System.out.print("Masukkan nilai ke-"+j+": ");	
			nilai[i] = sc.nextInt();
		}
		for(int k=0;k<nilai.length;k++) {
			int j = k+1;
			System.out.println("Cetak nilai ke-"+j+" = "+nilai[k]);
		}
		

	}

}
