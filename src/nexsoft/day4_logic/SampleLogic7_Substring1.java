package nexsoft.day4_logic;

public class SampleLogic7_Substring1 {

	public static void main(String[] args) {

		String teks1 = "nexsoft juara";
//		System.out.println(teks1.substring(12,15)); //gagal karena data tidak ada
		System.out.println(teks1.substring(1, 4));
		System.out.println(teks1.substring(4, 7));

		String nim = "152015021";
		System.out.println("Jurusan : " + nim.substring(0, 2));
		System.out.println("Tahun masuk : " + nim.substring(2, 6));
		System.out.println("Urut mahasiswa : " + nim.substring(7, 9));

	}

}
