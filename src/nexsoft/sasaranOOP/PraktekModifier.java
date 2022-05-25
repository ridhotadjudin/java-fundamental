package nexsoft.sasaranOOP;

public class PraktekModifier {
	private String nama;
	private String alamat;
	private int umur;
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNama() {
		return nama;
	}
	
//	private void printNama(String nama, String alamat, int umur) {
//		this.nama = nama;
//		this.alamat = alamat;
//		this.umur = umur;
//		System.out.println(this.nama);
//	}
	
	public void printTest() {
		System.out.println("print test");
		asik();
	}
	private void asik() {
		System.out.println("mantap");

	}
}
