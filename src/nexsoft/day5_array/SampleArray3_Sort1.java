package nexsoft.day5_array;

public class SampleArray3_Sort1 {

	public static void main(String[] args) {

		// selection sort
		int data[] = { 95, 100, 80, 90, 85 };
		int max = data[0];
		int min = data[0];

		// mencari nilai maks
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];

			}
		}
		System.out.println("nilai maks" + max);

		// mencari nilai min
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];

			}
		}
		System.out.println("nilai min" + min);

	}

}
