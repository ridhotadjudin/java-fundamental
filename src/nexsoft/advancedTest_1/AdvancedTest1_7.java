package nexsoft.advancedTest_1;

public class AdvancedTest1_7 {

	public static void main(String[] args) {

		String input = "Weekday";
//		String input = "Weekend";
//		String input = "111";

		switch (input) {
		case "Weekday":
			System.out.println("Senin Selasa Rabu Kamis Jum'at");
			break;
		case "Weekend":
			System.out.println("Sabtu Minggu");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

	}

}
