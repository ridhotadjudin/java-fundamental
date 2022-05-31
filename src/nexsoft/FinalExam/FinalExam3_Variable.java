package nexsoft.FinalExam;

import java.util.Scanner;

public class FinalExam3_Variable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
		/*
		 * 2
		 * 10,08
		 * 
		 * 3
		 * 11,05
		 */
		
		System.out.print("Input Quantity: ");
	    int in1 = scan.nextInt();
	    System.out.print("Input Price: ");
	    double in2 = scan.nextDouble();
	    
	    System.out.printf("Qty: %d\n",in1);
		System.out.printf("Harga: %.2f\n",in2);
		System.out.printf("Jumlah: %.2f\n",in1*in2);

	}

}
