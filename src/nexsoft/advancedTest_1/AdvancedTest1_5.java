package nexsoft.advancedTest_1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AdvancedTest1_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		99;
//		149;
		
		System.out.print("Masukkan nominal: ");
		double input = sc.nextDouble();
		
		System.out.println(input);

		NumberFormat formatDolar = NumberFormat.getCurrencyInstance(Locale.getDefault());
		System.out.println("US: " + formatDolar.format(input));
		
		NumberFormat formatIndia = NumberFormat.getCurrencyInstance(new Locale("hi","IN"));
		System.out.println("India: "+ formatIndia.format(input));

		NumberFormat formatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("China: " + formatChina.format(input));

		NumberFormat formatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("France: " + formatFrance.format(input));

	}

}
