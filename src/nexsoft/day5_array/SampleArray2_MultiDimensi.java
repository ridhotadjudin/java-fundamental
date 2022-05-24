package nexsoft.day5_array;

public class SampleArray2_MultiDimensi {

	public static void main(String[] args) {

		int data[][] = new int[3][2];
		// format int[jml. baris][jml. kolom]

		data[0][0] = 1;
		data[0][1] = 2;
		data[1][0] = 3;
		data[1][1] = 4;
		data[2][0] = 5;
		data[2][1] = 6;

		int angka[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(angka[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("/////////////////");
		////////////////////

		int angkaKu[][] = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		System.out.println(angkaKu[1][2]);// baris kedua kolom ketiga
		System.out.println(angkaKu[0][3]);// baris pertama kolom keempat

	}

}
