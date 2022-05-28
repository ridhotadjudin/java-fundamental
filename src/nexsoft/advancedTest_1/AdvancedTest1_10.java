package nexsoft.advancedTest_1;

public class AdvancedTest1_10 {

	public static void main(String[] args) {

		double input = 2;
		int loop = 5;

//		double input = 3;
//		int loop = 6;

		if (input % 2 == 0) {
			double ulang = input;
			int i = 0;
			do {
				System.out.print(ulang + " ");
				ulang += ulang;
				i++;
			} while (i < loop);
		} else {
			double ulang = input;
			int j = 0;
			do {
				System.out.print(ulang + " ");
				ulang = ulang * 3;
				j++;
			} while (j < loop);
		}

	}

}
