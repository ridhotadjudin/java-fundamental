package nexsoft.advancedTest_1;

import java.text.NumberFormat;
import java.util.Locale;

public class AdvancedTest1_5 {

	public static void main(String[] args) {
		
		double input = 99;
//		double input = 149;
		System.out.println(input);
		
		NumberFormat formatDolar = NumberFormat.getCurrencyInstance(Locale.getDefault());
		System.out.println("US: "+formatDolar.format(input));
		
		System.out.printf("India: ₹%.2f\n",input);
		
		NumberFormat formatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("China: "+formatChina.format(input));
		
		NumberFormat formatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("France: "+formatFrance.format(input));
		
	}

}
