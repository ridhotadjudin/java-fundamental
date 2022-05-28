package nexsoft.advancedTest_1;

public class AdvancedTest1_9 {

	public static void main(String[] args) {

		int input = 2;
		int batas = 7;

//		int input = 3;
//		int batas = 10;

		int hasil = 0;
		for (int i = 3; i <= batas; i += 3) {
			hasil = input * i;
			System.out.printf("%d x %d = %d \n", input, i, hasil);
		}

	}

}
