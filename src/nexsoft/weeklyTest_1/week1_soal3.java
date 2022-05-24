package nexsoft.weeklyTest_1;

import java.util.Scanner;

//SOAL 3 - 12.2 Substring

public class week1_soal3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		//input ParaJuara, 2 6
		//input SangJuara, 3 7
		
		System.out.print("Masukkan kata : ");
	    String input = scan.nextLine();
	    System.out.print("Masukkan batas 1 : ");
	    int a = scan.nextInt();
	    System.out.print("Masukkan batas 2 : ");
	    int b = scan.nextInt();
	    
	    System.out.println(input.substring(a,b));

	}

}
