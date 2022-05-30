package nexsoft.training_week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TrainingWeek2_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	    /*
	     * 12
	     * 13
	     * 11
	     * 15
	     * 14
	     * 
	     * 200
	     * 250
	     * 199
	     * 180
	     * 177
	     */
		
	    ArrayList<Integer> angka = new ArrayList<Integer>();
	    for(int i=0;i<5;i++){
	    	System.out.print("Masukkan angka: ");
	        angka.add(scan.nextInt());
	    }
	    Collections.sort(angka);
	    for(int i=0;i<angka.size();i++){
	        System.out.println(angka.get(i));
	    }

	}

}
