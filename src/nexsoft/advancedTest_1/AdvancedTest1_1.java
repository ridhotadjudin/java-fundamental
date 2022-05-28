package nexsoft.advancedTest_1;

public class AdvancedTest1_1 {

	public static void main(String[] args) {

		int in1 = 10;
		int in2 = 20;

//	    int in1 = 20;
//	    int in2 = 30;

		for (int i = 0; i <= in1; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		if (in2 % 4 == 0) {
			for (int i = in2; i >= 0; i -= 4) {
				System.out.print(i + " ");
			}
		} else {
			for (int k = in2 - 2; k >= 0; k -= 4) {
				System.out.print(k + " ");
			}
		}

	}

}
