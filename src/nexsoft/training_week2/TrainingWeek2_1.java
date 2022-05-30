package nexsoft.training_week2;

import java.util.Scanner;

public class TrainingWeek2_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
		/*
		 * Java
		 * Sang
		 * Juara
		 * 
		 * Para 
		 * Juara
		 * Java
		 */
		
	    String arr[]=new String[3];
	    
	    for(int i=0;i<arr.length;i++){
	    	System.out.print("Masukkan kata: ");
	        arr[i]=scan.nextLine();
	    }
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	    }

	}

}
