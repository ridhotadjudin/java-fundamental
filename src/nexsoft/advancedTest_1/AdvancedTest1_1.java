package nexsoft.advancedTest_1;

public class AdvancedTest1_1 {

	public static void main(String[] args) {

		int in1 = 10;
		int in2 = 20;

//	    int in1 = 20;
//	    int in2 = 30;

		//buat yang suka pakai for
//		for (int i = 0; i <= in1; i += 2) {
//			System.out.print(i + " ");
//		}
		
		//buat yang suka pakai while
		int i=0;
		do {
			System.out.print(i + " ");
			i += 2;
		}while(i <= in1);
		System.out.println();

		if (in2 % 4 == 0) {
			for (int j = in2; j >= 0; j -= 4) {
				System.out.print(j + " ");
			}
		} else {
			for (int k = in2 - 2; k >= 0; k -= 4) {
				System.out.print(k + " ");
			}
		}

	}

}
