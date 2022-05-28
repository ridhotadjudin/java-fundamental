package nexsoft.advancedTest_1;

public class AdvancedTest1_4 {

	public static void main(String[] args) {

		String input = "Para Juara";
//		String input = "Java";

		int i = 1;
		do {
			i++;
		} while (i < input.length());

		String upper = input.toUpperCase();
		String lower = input.toLowerCase();
		System.out.println(i);
		System.out.println(upper);
		System.out.println(lower);
	}

}
