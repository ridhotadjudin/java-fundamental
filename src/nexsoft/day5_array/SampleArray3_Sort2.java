package nexsoft.day5_array;

public class SampleArray3_Sort2 {

	public static void main(String[] args) {

		int data[] = { 95, 100, 80, 90, 85 };

		System.out.println("Before sort");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.println("After sort");
		for (int i = 0; i < data.length; i++) {
			int index = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] > data[index]) { // if 95>100
					index = j;
				}
			}
			int temp = data[index];
			data[index] = data[i];
			data[i] = temp;

		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

	}

}
