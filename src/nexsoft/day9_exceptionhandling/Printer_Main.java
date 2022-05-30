package nexsoft.day9_exceptionhandling;

public class Printer_Main {

	public static void main(String[] args) {
		try {
			String message = "MSG";
			printMessage(message);
		} catch (PrinterNotEnabledException e) {
			System.err.println("Error: "+e.getMessage());
		}
		//koding selanjutnya
//		System.out.println();
//		System.out.println("Test");
		
		try {
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.err.println("Error: "+e);
		}
		
	}
	
	static void printMessage(String message) throws PrinterNotEnabledException{
//		Printer p1 = new Printer();
//		p1.print(message);
		
		SuperPrinter sp1 = new SuperPrinter(false);
		sp1.print(message);
		
//		SuperPrinter sp2 = new SuperPrinter();
//		sp2.print(message);
	}

}
