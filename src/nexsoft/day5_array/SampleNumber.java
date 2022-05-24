package nexsoft.day5_array;

public class SampleNumber {

	public static void main(String[] args) {
		int angka = 20;
		String text = String.valueOf(angka);
		String text2 = Integer.toString(angka);
		System.out.println(angka + 100);
		System.out.println(text + 100);
		System.out.println(text2 + 100);

		System.out.println("=================");
		String suhu = "31";
		int angkaSuhu = Integer.valueOf(suhu);

		if (angkaSuhu > 18) {
			System.out.println("cuaca panas");
		}

	}

}
