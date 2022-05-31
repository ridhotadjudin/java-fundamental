package nexsoft.FinalExam;

// SORTING ARRAY

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FinalExam2_SortingArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
		symbols.setGroupingSeparator('.');
		DecimalFormat formatter = new DecimalFormat("###,###.##", symbols);

		/*
		 * 100000 90000 150000 95000
		 * 
		 * 20000 15000 50000 40000
		 */

		ArrayList<Integer> angka = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			System.out.print("Nominal: ");
			angka.add(scan.nextInt());
		}
		Collections.sort(angka);

		for (int i = 0; i < angka.size(); i++) {
			System.out.println("Rp. " + formatter.format(angka.get(i)) + ",-");
		}

	}

}
