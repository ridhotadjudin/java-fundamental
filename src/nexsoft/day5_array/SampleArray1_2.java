package nexsoft.day5_array;

public class SampleArray1_2 {

	public static void main(String[] args) {

		String motor[] = new String[3];
		motor[0] = "Honda";
		motor[1] = "Suzuki";
		motor[2] = "Yamaha";

		// looping untuk menampilkan keseluruhan data dalam array
		for (int i = 0; i < 3; i++) {
			System.out.println(motor[i]);
		}

		String mobil[] = { "Toyota", "Honda", "Mistsubishi" };
		System.out.println(mobil[2]);

		for (int i = 0; i < mobil.length; i++) {
			System.out.println(mobil[i]);
		}

		// penulisan for each lebih mudah
		for (String i : mobil) {
			System.out.println(i);
		}

		int[] angka = { 1, 2, 3, 4, 5 };
		System.out.println(angka[2]);// hasil = 3

	}

}
