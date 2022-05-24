package nexsoft.day5_array;

public class SampleArray5_Matrix {

	public static void main(String[] args) {

		int matriksA[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int matriksB[][] = { { 7, 8, 9 }, { 10, 11, 12 } };

		int matriksC[][] = new int[2][3];

//		matriksC[0][0] = matriksA[0][0] + matriksB[0][0];
//		System.out.println(matriksC[0][0]);

		System.out.println("Hasil penjumlahan matriks");
		for (int i = 0; i < matriksC.length; i++) {
			for (int j = 0; j < matriksC[i].length; j++) {
				matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
				System.out.print(matriksC[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		int matriksAT[][] = new int[3][2];
		int matriksBT[][] = new int[3][2];
		int matriksCT[][] = new int[3][2];

		// 1 2 3
		// 4 5 6
		System.out.println("Hasil transpose matriks A");
		for (int i = 0; i < matriksAT.length; i++) {
			for (int j = 0; j < matriksAT[i].length; j++) {
				matriksAT[i][j] = matriksA[j][i];
				System.out.print(matriksAT[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// 7 8 9
		// 10 11 12
		System.out.println("Hasil transpose matriks B");
		for (int i = 0; i < matriksBT.length; i++) {
			for (int j = 0; j < matriksBT[i].length; j++) {
				matriksBT[i][j] = matriksB[j][i];
				System.out.print(matriksBT[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Hasil transpose matriks C");
		for (int i = 0; i < matriksCT.length; i++) {
			for (int j = 0; j < matriksCT[i].length; j++) {
				matriksCT[i][j] = matriksC[j][i];
				System.out.print(matriksCT[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
