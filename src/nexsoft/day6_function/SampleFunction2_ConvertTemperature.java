package nexsoft.day6_function;

import java.util.Scanner;

public class SampleFunction2_ConvertTemperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan suhu celcius : ");
		float input = sc.nextFloat();
		System.out.println("hasil fahrenheit = " + celciusToFahrenheit(input));

		System.out.println();

		System.out.print("Masukkan suhu fahrenheit : ");
		float input2 = sc.nextFloat();
		System.out.println("hasil celcius = " + fahrenheitToCelcius(input2));

	}

	static float fahrenheitToCelcius(float tempF) {
		float convert = (tempF - 32.0f) * 5.0f / 9.0f;
		return convert;
	}

	static float celciusToFahrenheit(float tempC) {
		float convert = (tempC * 9.0f / 5.0f) + 32.0f;
		return convert;
	};

}
