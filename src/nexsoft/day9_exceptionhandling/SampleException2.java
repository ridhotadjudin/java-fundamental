package nexsoft.day9_exceptionhandling;

public class SampleException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(13);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("Test");
		
		try {
			throw new AgeNotValid("Pesan error");
		} catch (AgeNotValid anv) {
			System.out.println(anv.getMessage());
		}
	}
	
	static void validate(int age) throws AgeNotValid{
		if(age<14) {
			throw new AgeNotValid("Umur tidak valid");
		}else {
			System.out.println("Umur valid");
		}
	}
}
