package nexsoft.weeklyTest_1;

import java.util.Scanner;

//SOAL 1 - 07 Casting

public class week1_soal1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		//input	100,77
		//		200,88
		
		//input	200,77
		//		300,88
		
		System.out.print("Input 1 :");
	    double input1 = sc.nextDouble();
	    System.out.print("Input 2 :");
	    double input2 = sc.nextDouble();
		
		int hasil1 = (int) input1;
		int hasil2 = (int) input2;
		
		System.out.println("Harga 1: "+hasil1);
		System.out.println("Harga 2: "+hasil2);

	}

}
