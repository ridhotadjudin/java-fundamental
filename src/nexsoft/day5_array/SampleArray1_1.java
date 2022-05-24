package nexsoft.day5_array;

import java.util.Scanner;

public class SampleArray1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String motor1 = "Honda";
		String motor2 = "Suzuki";
		String motor3 = "Yamaha";
		System.out.println(motor1);
		System.out.println("================================");

		///////////////

		String motor[] = new String[3];
		motor[0] = "Honda";
		motor[1] = "Suzuki";
		motor[2] = "Yamaha";
		System.out.print("1. Honda | 2. Suzuki | 3. Yamaha : ");
		int n = sc.nextInt();
		System.out.println(motor[n - 1]);

	}

}
