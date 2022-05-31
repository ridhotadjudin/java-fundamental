package nexsoft.FinalExam;

// SUBSTRING

import java.util.Scanner;

public class FinalExam9_SubString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * :T1:202112SOAL3
		 * :T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS
		 * SKILL TEST ESSAY .DT
		 * 
		 * :T1:202111SOAL3
		 * :T2:SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS
		 * SKILL TEST ESSAY .DT
		 * 
		 * :T1:202110SOAL3
		 * :T2:SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS
		 * SKILL TEST ESSAY .DT
		 */
		
		System.out.print("String 1: ");
		String T1 = scan.nextLine();
		System.out.print("String 2: ");
		String str = scan.nextLine();
	    
	    String tag = str.substring(0,4);
        String trailer1 = str.substring(4, 22);
    	String trailer2 = str.substring(22, 40);
    	String trailer3 = str.substring(40, 58);
    	String trailer4 = str.substring(58, 76);
    	String trailer5 = str.substring(76, 94);
    		
    	String out = tag+trailer3+trailer4+trailer5+trailer1+trailer2;
    	System.out.println(T1);
    	System.out.println(out);

	}

}
