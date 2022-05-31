package nexsoft.FinalExam;

//SORTING COLLECTION

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FinalExam5_SortingCollection {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*
		 * Data
		 * Science
		 * Database
		 * Software
		 * Engineer
		 * 0
		 * 
		 * Python
		 * C++
		 * C#
		 * Java
		 * JavaScript
		 * 1
		 */
		
		ArrayList<String> arskuy = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			System.out.print("Input String: ");
			arskuy.add(scan.nextLine());
		}
		System.out.println(arskuy);

		Collections.sort(arskuy, Collections.reverseOrder());
		System.out.println("Sort Desc: " + arskuy);
		
		System.out.print("Delete Index: ");
		int in = scan.nextInt();
		arskuy.remove(in);
		System.out.println("Delete Item Index ke-" + in + ": " + arskuy);
	}

}
