package nexsoft.day8_OOP;

public class Product {
	
	String id;
	String nama;
	double harga;

	public Product(String id,String nama,double harga) {
		this.id = id;
		this.nama = nama;
		this.harga = harga;
	}

	public Product() {

	}
	
	public void print() {
		System.out.println("====CETAKAN DATA=====");
		System.out.printf("ID: %s, Nama Produk: %s, Harga: Rp. %.2f",id,nama,harga);
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

	public double getHarga() {
		return harga;
	}

	public void setHarga(double harga) {
		if(harga < 0) {
			System.out.println("Ada kesalahan harga: "+harga);
		}else {
			this.harga = harga;
		}
	}
	

}
