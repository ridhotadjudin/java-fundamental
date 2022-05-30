package nexsoft.training_week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TrainingWeek2_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
		/*
	     * Data
	     * Science
	     * Database
	     * Software
	     * Engineer
	     * Data
	     * 
	     * Python
	     * C++
	     * C#
	     * Java
	     * JavaScript
	     * Java
	     */
		
	    ArrayList<String> arskuy = new ArrayList<String>();
	    for(int i=0;i<5;i++){
	    	System.out.print("Masukkan kata: ");
	        arskuy.add(scan.nextLine());
	    }
	    System.out.println(arskuy);
	    
	    Collections.sort(arskuy);
	    System.out.println("Sort Asc: "+arskuy);
	    
	    Collections.sort(arskuy, Collections.reverseOrder());
	    System.out.println("Sort Desc: "+arskuy);
	    System.out.println("-------");
	    
	    String input = scan.nextLine();
	    System.out.println("Cari: "+input);
	    for (String c : arskuy){
	         if (c.contains(input)){
	               System.out.println(c);
	         }
	      }
	    

	}

}
