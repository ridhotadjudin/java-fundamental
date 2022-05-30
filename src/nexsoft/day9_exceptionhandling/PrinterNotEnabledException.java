package nexsoft.day9_exceptionhandling;

public class PrinterNotEnabledException extends RuntimeException {
	
	public PrinterNotEnabledException(String message) {
		super(message);
	}
	
}
