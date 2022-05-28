package nexsoft.day8_OOP;

public class User {
	String id;
	String nama;
	String kota;
	
	public User() {
	}
	
	public User(String id, String nama, String kota) {
		this.id = id;
		this.nama = nama;
		this.kota = kota;
	}
	
	public void print() {
		System.out.println("====CETAKAN DATA USER=====");
		System.out.printf("ID: %s, Nama User: %s, Kota: %s",id,nama,kota);
		System.out.println();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKota() {
		return kota;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}
	
	
	
	
}	
