package nexsoft.day2_decision;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class SampleDecision4 {

	public static void main(String[] args) {
		
		double total = 1000000;
		System.out.println(total);
		
		DecimalFormat formatRupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols simbolRupiah = new DecimalFormatSymbols();
		
		simbolRupiah.setCurrencySymbol("Rp. ");
		simbolRupiah.setMonetaryDecimalSeparator(',');
		simbolRupiah.setGroupingSeparator('.');
//		//akan ada masalah tampilan untuk format english 10,000,00
//		//ubah region ke indonesia sehingga menampilakn 10.000,00 
//		
		formatRupiah.setDecimalFormatSymbols(simbolRupiah);
		System.out.println("Total belanja = "+formatRupiah.format(total));
//		System.out.println(" ");
//		System.out.print("Anda ");
//		if(total>=10000000) {
//			System.out.println("mendapatkan kupon");
//		}else {
//			System.out.println("belum bisa mendapatkan kupon");
//		}
		
//		double konversiDolar = 14697.55;
//		double hasilDolar = total/konversiDolar;
//		NumberFormat formatDolar = NumberFormat.getCurrencyInstance(Locale.getDefault());
//		System.out.println(formatDolar.format(hasilDolar));
//		
//		double konversiYen = 113.69;
//		double hasilYen = total/konversiYen;
//		NumberFormat formatYen = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
//		System.out.println(formatYen.format(hasilYen));
		
		int x = 80;
		String a = "Nexsoft Juara", b = "Bootcamp";
		System.out.printf("%-15s%-15s%03d",a,b,x);
		
		
	}

}
