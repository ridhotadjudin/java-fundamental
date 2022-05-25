package nexsoft.sasaranOOP;

public class Senjata {
	private String tipeSenjata;
	private String tipePeluru;
	private double berat;
	private int jumlahPeluru;

	public Senjata() {
		this.tipeSenjata = "senjata ini belum punya tipe";
		this.berat = 0;
		this.tipePeluru = "Belum diketahui";
		this.jumlahPeluru = 0;
		cetak();
	}

	// overload = 2 atau lebih konstruktor namun beda parameternya
	public Senjata(String tipeSenjata) {
		this.tipeSenjata = tipeSenjata;
		this.berat = 0;
		this.tipePeluru = "Belum diketahui";
		this.jumlahPeluru = 0;
		cetak();
	}
	
	//masih overload juga
	public Senjata(String tipeSenjata, String tipePeluru, double berat, int jumlahPeluru) {
		this.tipeSenjata = tipeSenjata;
		this.berat = berat;
		this.tipePeluru = tipePeluru;
		this.jumlahPeluru = jumlahPeluru;
		cetak();
	}
	
	private void cetak() {
		System.out.println("Tipe Senjata : " + tipeSenjata);
		System.out.println("Tipe Peluru  : " + tipePeluru);
		System.out.println("Jumlah Peluru: " + jumlahPeluru);
		System.out.println("Berat : " + berat);
	}
	
	public String getTipeSenjata() {
		return tipeSenjata;
	}

	public void setTipeSenjata(String tipeSenjata) {
		this.tipeSenjata = tipeSenjata;
	}

	public String getTipePeluru() {
		return tipePeluru;
	}

	public void setTipePeluru(String tipePeluru) {
		this.tipePeluru = tipePeluru;
	}

	public double getBerat() {
		return berat;
	}

	public void setBerat(double berat) {
		this.berat = berat;
	}

	public int getJumlahPeluru() {
		return jumlahPeluru;
	}

	public void setJumlahPeluru(int jumlahPeluru) {
		this.jumlahPeluru = jumlahPeluru;
	}

}
