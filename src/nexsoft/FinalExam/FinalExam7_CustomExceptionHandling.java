package nexsoft.FinalExam;

// CUSTOM EXCEPTION HANDLING

import java.util.Scanner;

public class FinalExam7_CustomExceptionHandling {

	public static void main(String[] args) throws ArithmeticException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Number: ");
		try {
			int num = scan.nextInt();
			if (num < 0)
				throw new ArithmeticException("");
			else
				throw new ArithmeticException("Nilai positif");
		} catch (ArithmeticException m) {
			System.out.println(m+"Input tidak boleh negatif");
		}
		System.out.println();
		System.out.println("Test");

	}

}

class ArithmeticException extends Exception {
	
	public ArithmeticException(String str){
		super(str);
	}
	
}
