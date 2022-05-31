package nexsoft.FinalExam;

// LOOPING

import java.util.Scanner;

public class FinalExam8_Looping {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 1 9
		 * 
		 * 3 11
		 * 
		 * 5 15
		 */
		
		System.out.print("Input x: ");
		int x = scan.nextInt();
		System.out.print("Input x: ");
		int y = scan.nextInt();
	    
	    int a=0;
		for(int i=x;i<y;i++) {
			for(int j=i;j<=y-a;j++) {
				if(j%2==0) {
					System.out.print("_");
				}else {
					System.out.print(j);
				}
			}
			a++;
			System.out.println();
		}

	}

}
