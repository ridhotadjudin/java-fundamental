package nexsoft.day6_function;

class Mahasiswa{
	void identitas(String nama, String nim) {
		System.out.println("Nama : "+nama);
		System.out.println("NIM  : "+nim);
	}
}

public class SampleFunction9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mahasiswa mhs1 = new Mahasiswa();  //buat objek
		mhs1.identitas("Aaaaa","20220101111");
		
		Mahasiswa mhs2 = new Mahasiswa();  //buat objek
		mhs2.identitas("Bbbbb","20210202222");

	}
	
	

}
