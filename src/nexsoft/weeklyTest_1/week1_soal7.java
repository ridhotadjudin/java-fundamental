package nexsoft.weeklyTest_1;

import java.util.Scanner;

//SOAL 7 - 17 Loops I

public class week1_soal7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		//input 2,5
		//input 3,6
		
		System.out.print("Masukkan angka awal : ");
	    double input1 = scan.nextDouble();
	    System.out.print("sebanyak : ");
	    double input2 = scan.nextDouble();
	    
	    for(int i = 1;i<=input2;i++){
	        System.out.print(Math.pow(input1, i)+" ");
	    }

	}

}
