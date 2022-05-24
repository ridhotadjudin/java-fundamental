package nexsoft.day4_logic;

public class SampleLogic1_bitwise {

	public static void main(String[] args) {

		// perbedaan || dan | bitwise
		int a = 10, b = 5, c = 20;
		System.out.println(a > b || a < c);
		System.out.println(a > b | a < c);

		System.out.println(a > b || a++ < c);
		System.out.println(a);// 10
		System.out.println(a > b | a++ < c);
		System.out.println(a);// 11

	}

}
