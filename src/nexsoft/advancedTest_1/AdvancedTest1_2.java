package nexsoft.advancedTest_1;

public class AdvancedTest1_2 {

	public static void main(String[] args) {

		int angka = 100;
//		int angka = 80;
//		int angka = 40;
//		int angka = 27;

		for (int i = 1; i <= angka; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("BIZZBUZZ");
			} else if (i % 5 == 0) {
				System.out.println("BUZZ");
			} else if (i % 3 == 0) {
				System.out.println("BIZZ");
			}
		}

	}

}
