package nexsoft.day9_exceptionhandling;

public class SuperPrinter extends Printer {
	
	private boolean enable;
	
	public SuperPrinter() {
	}
	
	public SuperPrinter(boolean enable) {
		this.enable=enable;
	}
	
	@Override
	public void print(String message) throws PrinterNotEnabledException{
		// TODO Auto-generated method stub
		if(enable) {
			super.print(message);
		}else {
			throw new PrinterNotEnabledException("Printer sedang offline");
		}
	}
}
